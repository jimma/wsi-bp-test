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
package org.jboss.test.ws.jaxws.bp20.wsa.test1189.anon;

import java.io.File;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.apache.cxf.ws.addressing.AddressingProperties;
import org.apache.cxf.ws.addressing.AttributedURIType;
import org.apache.cxf.ws.addressing.EndpointReferenceType;
import org.apache.cxf.ws.addressing.JAXWSAConstants;
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
public class Test1189AnonTestCase extends BP20Test
{
   @ArquillianResource
   private URL baseURL;

   @Deployment(testable = false)
   public static WebArchive createDeployment()
   {
      WebArchive archive = ShrinkWrap.create(WebArchive.class, "jaxws-bp20test1189-anon.war");
      archive.setManifest(new StringAsset("Manifest-Version: 1.0\n" + "Dependencies: org.apache.cxf\n"))
            .addPackages(false, Filters.exclude(Test1189AnonTestCase.class), Test1189AnonTestCase.class.getPackage().getName())
            .setWebXML(new File(JBossWSTestHelper.getTestResourcesDir() + "/jaxws/bp20/wsa/test1189-anon/WEB-INF/web.xml"));
      addResroucesToWebInf(JBossWSTestHelper.getTestResourcesDir() + "/jaxws/bp20/wsa/test1189-anon/WEB-INF", archive, "wsdl", "xsd");
      return archive;
   }

   @Test
   @RunAsClient
   public void testWSA() throws Exception
   {
      // construct proxy
      QName serviceName = new QName("http://tempuri.org/", "wsaTestService");
      URL wsdlURL = new URL(baseURL + "/Test1189Anon" + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);
      WsaTestPortType port = (WsaTestPortType)service.getPort(WsaTestPortType.class);
      // invoke method
      ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, getProxyAddress(baseURL) + "/Test1189Anon");

      EndpointReferenceType wsaTo = new EndpointReferenceType();
      AddressingProperties addrProperties = new AddressingProperties();
      AttributedURIType epr = new AttributedURIType();
      epr.setValue(baseURL + "/Test1189Anon");
      wsaTo.setAddress(epr);
      addrProperties.setReplyTo(wsaTo);
      ((BindingProvider)port).getRequestContext().put(JAXWSAConstants.CLIENT_ADDRESSING_PROPERTIES, addrProperties);

      try
      {
         port.echo("input string");
         fail("only anonymous supported fault is expected");
      }
      catch (Exception e)
      {
         assertTrue("only anonymous supported error message is expected", e.getMessage().contains("Found non-anonymous address but only anonymous supported"));
      }

   }
}