/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.test.ws.jaxws.bp20.mtom;

import java.io.File;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.Filters;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.test.ws.jaxws.bp20.common.BP20Test;
import org.jboss.wsf.test.JBossWSTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class MtomTestCase extends BP20Test
{
   @ArquillianResource
   private URL baseURL;

   @Deployment(testable = false)
   public static WebArchive createDeployment()
   {
      WebArchive archive = ShrinkWrap.create(WebArchive.class, "jaxws-bp20mtom.war");
      archive.setManifest(new StringAsset("Manifest-Version: 1.0\n" + "Dependencies: org.apache.cxf\n"))
            .addPackages(false, Filters.exclude(MtomTestCase.class), MtomTestCase.class.getPackage().getName())
            .setWebXML(new File(JBossWSTestHelper.getTestResourcesDir() + "/jaxws/bp20/mtom/WEB-INF/web.xml"));
      addResroucesToWebInf(JBossWSTestHelper.getTestResourcesDir() + "/jaxws/bp20/mtom/WEB-INF", archive, "wsdl", "xsd");
      return archive;
   }

   @Test
   @RunAsClient
   public void testAll() throws Exception
   {
      // construct proxy

      String request1 = "wsi-bp20-test-mtom-testcase-request1";
      String request2 = "wsi-bp20-test-mtom-testcase-request2";
      String request3 = "wsi-bp20-test-mtom-testcase-request2";
      String request4 = "wsi-bp20-test-mtom-testcase-request2";
      String request5 = "wsi-bp20-test-mtom-testcase-request2";

      QName serviceName = new QName("http://tempuri.org/", "MtomExtendedService");
      URL wsdlURL = new URL(baseURL + "/Mtom" + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);
      IMtomExtendedContract port = (IMtomExtendedContract)service.getPort(IMtomExtendedContract.class);
      ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, getProxyAddress(baseURL) + "/Mtom");

      String result = port.echoBinaryAsString(request1.getBytes());
      assertEquals(request1, result);

      byte[] res = port.echoStringAsBinary(request1);
      assertEquals(request1, new String(res));

      Base64BinaryArray binaryArray = new Base64BinaryArray();
      binaryArray.getBase64Binary().add(request1.getBytes());
      StringArray stringArray = port.echoBinaryArrayAsStringArray(binaryArray);
      assertEquals(request1, stringArray.getString().get(0));

      MtomTestStruct input = new MtomTestStruct();
      input.setName(new ObjectFactory().createMtomTestStructName(request1));
      input.setArray(new ObjectFactory().createMtomTestStructArray(request2.getBytes()));
      String fieldString = port.echoBinaryFieldAsString(input);
      assertEquals(request1 + request2, fieldString);

      EchoBinaryHeaderRequest headerRequest = new EchoBinaryHeaderRequest();
      headerRequest.setBodyData(new ObjectFactory().createEchoBinaryHeaderRequestBodyData(request1));
      javax.xml.ws.Holder<byte[]> headerData = new javax.xml.ws.Holder<byte[]>(request2.getBytes());
      EchoBinaryHeaderResponse headerResponse = port.echoBinaryHeader(headerRequest, headerData);
      assertEquals(request1, headerResponse.getBodyData().getValue());

      StringArray binInput = new StringArray();
      binInput.getString().add(request1);
      binInput.getString().add(request2);
      binInput.getString().add(request3);
      binInput.getString().add(request4);
      binInput.getString().add(request5);
      MtomTestStructWithMultipleBinaryFields multiRes = port.echoStringArrayAsBinaryFields(binInput);
      assertEquals(request1, new String(multiRes.getName().getValue()));
      assertEquals(request2, new String(multiRes.getFirstBinaryValue().getValue()));
      assertEquals(request3, new String(multiRes.getSecondBinaryValue().getValue()));
      assertEquals(request4, new String(multiRes.getThirdBinaryValue().getValue()));
      assertEquals(request5, new String(multiRes.getFourthBinaryValue().getValue()));

      StringArray strInput = new StringArray();
      strInput.getString().add(request1);
      Base64BinaryArray resArray = port.echoStringArrayAsBinaryArray(strInput);
      assertEquals(request1, new String(resArray.getBase64Binary().get(0)));
   }
}