/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.test.ws.jaxws.bp12.baserpc;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
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
import org.jboss.test.ws.jaxws.bp12.common.BP12Test;
import org.jboss.wsf.test.JBossWSTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(Arquillian.class)
public class BaseTypesRPCTestCase extends BP12Test
{
   
   @ArquillianResource
   private URL baseURL;

   @Deployment(testable = false)
   public static WebArchive createDeployment()
   {
      WebArchive archive = ShrinkWrap.create(WebArchive.class, "jaxws-bp12baserpc.war");
      archive.setManifest(new StringAsset("Manifest-Version: 1.0\n" + "Dependencies: org.apache.cxf\n"))
            .addPackages(false, Filters.exclude(BaseTypesRPCTestCase.class), BaseTypesRPCTestCase.class.getPackage().getName())
            .setWebXML(new File(JBossWSTestHelper.getTestResourcesDir() + "/jaxws/bp12/baserpc/WEB-INF/web.xml"));
      addResroucesToWebInf(JBossWSTestHelper.getTestResourcesDir() + "/jaxws/bp12/baserpc/WEB-INF", archive, "wsdl", "xsd");
      return archive;
   }
   @Test
   @RunAsClient
   public void testAllTypes() throws Exception
   {
      // construct proxy
      QName serviceName = new QName("http://tempuri.org/", "BaseDataTypesRpcLitService");
      URL wsdlURL = new URL(baseURL + "/BPBaseRPC" + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);
      IBaseDataTypesRpcLit port = (IBaseDataTypesRpcLit) service.getPort(IBaseDataTypesRpcLit.class);
      // invoke method
      ((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, getProxyAddress(baseURL) + "/BPBaseRPC");
      System.out.println("Invoking retInt...");
      int _retInt_inInt = 10;
      int _retInt__return = port.retInt(_retInt_inInt);
      System.out.println("retInt.result=" + _retInt__return);

      System.out.println("Invoking retDateTime...");
      GregorianCalendar calendar = new GregorianCalendar();
      calendar.setTimeInMillis(System.currentTimeMillis());
      javax.xml.datatype.XMLGregorianCalendar _retDateTime_inDateTime =  DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
      javax.xml.datatype.XMLGregorianCalendar _retDateTime__return = port.retDateTime(_retDateTime_inDateTime);
      System.out.println("retDateTime.result=" + _retDateTime__return);

      System.out.println("Invoking retUnsignedInt...");
      long _retUnsignedInt_inUInt = 10;
      long _retUnsignedInt__return = port.retUnsignedInt(_retUnsignedInt_inUInt);
      System.out.println("retUnsignedInt.result=" + _retUnsignedInt__return);

      System.out.println("Invoking retDuration...");
      Duration _retDuration_inTimeSpan = DatatypeFactory.newInstance().newDuration(10000);
      Duration _retDuration__return = port.retDuration(_retDuration_inTimeSpan);
      System.out.println("retDuration.result=" + _retDuration__return);

      System.out.println("Invoking retDecimal...");
      BigDecimal _retDecimal_inDecimal = new java.math.BigDecimal("100");
      BigDecimal _retDecimal__return = port.retDecimal(_retDecimal_inDecimal);
      System.out.println("retDecimal.result=" + _retDecimal__return);

      System.out.println("Invoking retDouble...");
      double _retDouble_inDouble = 0.1;
      double _retDouble__return = port.retDouble(_retDouble_inDouble);
      System.out.println("retDouble.result=" + _retDouble__return);

      System.out.println("Invoking retFloat...");
      float _retFloat_inFloat = 0.01f;
      float _retFloat__return = port.retFloat(_retFloat_inFloat);
      System.out.println("retFloat.result=" + _retFloat__return);

      System.out.println("Invoking retLong...");
      long _retLong_inLong = 1000;
      long _retLong__return = port.retLong(_retLong_inLong);
      System.out.println("retLong.result=" + _retLong__return);

      System.out.println("Invoking retBase64Binary...");
      byte[] _retBase64Binary_inByteArray = "ByteArray".getBytes();
      byte[] _retBase64Binary__return = port.retBase64Binary(_retBase64Binary_inByteArray);
      System.out.println("retBase64Binary.result=" + _retBase64Binary__return);

      System.out.println("Invoking retString...");
      java.lang.String _retString_inString = "return";
      java.lang.String _retString__return = port.retString(_retString_inString);
      System.out.println("retString.result=" + _retString__return);

      System.out.println("Invoking retShort...");
      short _retShort_inShort = Short.parseShort("10");
      short _retShort__return = port.retShort(_retShort_inShort);
      System.out.println("retShort.result=" + _retShort__return);

      System.out.println("Invoking retByte...");
      byte _retByte_inSByte = Byte.parseByte("1");
      byte _retByte__return = port.retByte(_retByte_inSByte);
      System.out.println("retByte.result=" + _retByte__return);

      System.out.println("Invoking retAnyType...");
      Object _retAnyType_inObject = new QName("http://foo","bar");
      Object _retAnyType__return = port.retAnyType(_retAnyType_inObject);
      System.out.println("retAnyType.result=" + _retAnyType__return);

      System.out.println("Invoking retUnsignedByte...");
      short _retUnsignedByte_inByte = Short.parseShort("0");
      short _retUnsignedByte__return = port.retUnsignedByte(_retUnsignedByte_inByte);
      System.out.println("retUnsignedByte.result=" + _retUnsignedByte__return);

      System.out.println("Invoking retUnsignedLong...");
      BigInteger _retUnsignedLong_inULong = new java.math.BigInteger("10000");
      BigInteger _retUnsignedLong__return = port.retUnsignedLong(_retUnsignedLong_inULong);
      System.out.println("retUnsignedLong.result=" + _retUnsignedLong__return);

      System.out.println("Invoking retUnsignedShort...");
      int _retUnsignedShort_inUShort = 10;
      int _retUnsignedShort__return = port.retUnsignedShort(_retUnsignedShort_inUShort);
      System.out.println("retUnsignedShort.result=" + _retUnsignedShort__return);

      System.out.println("Invoking retQName...");
      QName _retQName_inQName = new QName("http://foo", "bar");
      QName _retQName__return = port.retQName(_retQName_inQName);
      System.out.println("retQName.result=" + _retQName__return);

      System.out.println("Invoking retBoolean...");
      boolean _retBoolean_inBool = false;
      boolean _retBoolean__return = port.retBoolean(_retBoolean_inBool);
      System.out.println("retBoolean.result=" + _retBoolean__return);

      System.out.println("Invoking retAnyUri...");
      String _retAnyUri_inUri = "urn:inputui";
      String _retAnyUri__return = port.retAnyUri(_retAnyUri_inUri);
      System.out.println("retAnyUri.result=" + _retAnyUri__return);

   }
}
