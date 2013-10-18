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
package org.jboss.test.ws.jaxws.bp12.wsa.test1190;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.AddressingFeature;
import javax.xml.ws.soap.SOAPFaultException;

import junit.framework.Test;

import org.apache.cxf.helpers.IOUtils;
import org.jboss.test.ws.jaxws.bp12.common.BP12Test;
import org.jboss.wsf.test.JBossWSCXFTestSetup;

public class Test119XTestCase extends BP12Test
{
   private final String serviceURL = "http://" + getServerHost() + ":8080/jaxws-bp12test1190/Test1190";

   public static Test suite()
   {
      return new JBossWSCXFTestSetup(Test119XTestCase.class, "jaxws-bp12test1190.war");
   }

   public void testWSA() throws Exception
   {
      // construct proxy
      QName serviceName = new QName("http://example.org/wsaTestService", "wsaTestService");
      URL wsdlURL = new URL(serviceURL + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);
      WsaTestPortType port = (WsaTestPortType) service.getPort(WsaTestPortType.class);
      // invoke method
      ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
    		  PROXY_ADDRESS +"/jaxws-bp12test1190/Test1190");

      System.out.println("Invoking echo1...");
      String response = port.echo1("input string");
      System.out.println("echo1.result: " + response);
      
      
      System.out.println("Invoking echo2...");
      port.echo2("input string");
      
   }
   
   //Test1191
   public void testMessageIdMissed() throws Exception
   {
      // construct proxy
      QName serviceName = new QName("http://example.org/wsaTestService", "wsaTestService");
      QName portName = new QName("http://example.org/wsaTestService", "wsaTestPort");
      URL wsdlURL = new URL(serviceURL + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);
           
      Dispatch<SOAPMessage> disp = service.createDispatch(portName, SOAPMessage.class,
            Service.Mode.MESSAGE,
            new AddressingFeature(false, false));
      ((BindingProvider) disp).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
            PROXY_ADDRESS + "/jaxws-bp12test1190/Test1190");
      InputStream msgIns = getClass().getResourceAsStream("./wsa-without-messageid.xml");
      String msg = new String(IOUtils.readBytesFromStream(msgIns));
      msg = msg.replaceAll("$PORT", "9090");
      
      ByteArrayInputStream bout = new ByteArrayInputStream(msg.getBytes());
      
      SOAPMessage soapReqMsg = MessageFactory.newInstance().createMessage(null, bout);
      assertNotNull(soapReqMsg);
      
      try {
          disp.invoke(soapReqMsg);
          fail("SOAPFaultException is expected");
      } catch (SOAPFaultException ex) {
          assertTrue("A required header representing a Message Addressing Property is not present is expected", 
                ex.getMessage().contains("A required header representing a Message Addressing Property is not present"));
      }        
   }
   
   
   //Test1192
   public void testMustUnderstand() throws Exception
   {
      // construct proxy
      QName serviceName = new QName("http://example.org/wsaTestService", "wsaTestService");
      QName portName = new QName("http://example.org/wsaTestService", "wsaTestPort");
      URL wsdlURL = new URL(serviceURL + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);
           
      Dispatch<SOAPMessage> disp = service.createDispatch(portName, SOAPMessage.class,
            Service.Mode.MESSAGE,
            new AddressingFeature(false, false));
      ((BindingProvider) disp).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
    		  PROXY_ADDRESS +"/jaxws-bp12test1190/Test1192");
      //To mustunderstand
      InputStream msgIns = getClass().getResourceAsStream("./wsa-to-mustunderstand.xml");
      String msg = new String(IOUtils.readBytesFromStream(msgIns));
      msg = msg.replaceAll("$PORT", "9090");
      
      ByteArrayInputStream bout = new ByteArrayInputStream(msg.getBytes());
      
      SOAPMessage soapReqMsg = MessageFactory.newInstance().createMessage(null, bout);
      assertNotNull(soapReqMsg);
      
      try {
          disp.invoke(soapReqMsg);
          fail("SOAPFaultException is expected");
      } catch (SOAPFaultException ex) {
          assertTrue("[{http://www.w3.org/2005/08/addressing}To] are not understood is expected", 
                ex.getMessage().contains("[{http://www.w3.org/2005/08/addressing}To] are not understood."));
      }  
     
      //fault to must understand
      msgIns = getClass().getResourceAsStream("./wsa-faultto-mustunderstand.xml");
      msg = new String(IOUtils.readBytesFromStream(msgIns));
      msg = msg.replaceAll("$PORT", "9090");
      
      bout = new ByteArrayInputStream(msg.getBytes());
      
      soapReqMsg = MessageFactory.newInstance().createMessage(null, bout);
      assertNotNull(soapReqMsg);
      
      try {
          disp.invoke(soapReqMsg);
          fail("SOAPFaultException is expected");
      } catch (SOAPFaultException ex) {
          assertTrue("[{http://www.w3.org/2005/08/addressing}FaultTo] are not understood is expected", 
                ex.getMessage().contains("[{http://www.w3.org/2005/08/addressing}FaultTo] are not understood"));
      } 
      
      msgIns = getClass().getResourceAsStream("./wsa-faultto-mustunderstand.xml");
      msg = new String(IOUtils.readBytesFromStream(msgIns));
      msg = msg.replaceAll("$PORT", "9090");
      
      bout = new ByteArrayInputStream(msg.getBytes());
      
      soapReqMsg = MessageFactory.newInstance().createMessage(null, bout);
      assertNotNull(soapReqMsg);
      
      try {
          disp.invoke(soapReqMsg);
          fail("SOAPFaultException is expected");
      } catch (SOAPFaultException ex) {
          assertTrue("[{http://www.w3.org/2005/08/addressing}FaultTo] are not understood is expected", 
                ex.getMessage().contains("[{http://www.w3.org/2005/08/addressing}FaultTo] are not understood"));
      } 
      
      msgIns = getClass().getResourceAsStream("./wsa-replyto-mustunderstand.xml");
      msg = new String(IOUtils.readBytesFromStream(msgIns));
      msg = msg.replaceAll("$PORT", "9090");
      
      bout = new ByteArrayInputStream(msg.getBytes());
      
      soapReqMsg = MessageFactory.newInstance().createMessage(null, bout);
      assertNotNull(soapReqMsg);
      
      try {
          disp.invoke(soapReqMsg);
          fail("SOAPFaultException is expected");
      } catch (SOAPFaultException ex) {
          assertTrue("[{http://www.w3.org/2005/08/addressing}ReplyTo] are not understood is expected", 
                ex.getMessage().contains("[{http://www.w3.org/2005/08/addressing}ReplyTo] are not understood"));
      } 
      msgIns = getClass().getResourceAsStream("./wsa-msgid-mustunderstand.xml");
      msg = new String(IOUtils.readBytesFromStream(msgIns));
      msg = msg.replaceAll("$PORT", "9090");
      
      bout = new ByteArrayInputStream(msg.getBytes());
      
      soapReqMsg = MessageFactory.newInstance().createMessage(null, bout);
      assertNotNull(soapReqMsg);
      
      try {
          disp.invoke(soapReqMsg);
          fail("SOAPFaultException is expected");
      } catch (SOAPFaultException ex) {
          assertTrue("[{http://www.w3.org/2005/08/addressing}MessageID] are not understood is expected", 
                ex.getMessage().contains("[{http://www.w3.org/2005/08/addressing}MessageID] are not understood"));
      } 
      
   }
   public void testVersionMisMatch() throws Exception
   {
      //test1194-version mismatch  
      // construct proxy 
      URL url = new URL( PROXY_ADDRESS +"/jaxws-bp12test1190/Test1190");
      HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
      InputStream msgIns = getClass().getResourceAsStream("./wsa-version-mismatch.xml");
      String msg = new String(IOUtils.readBytesFromStream(msgIns));
      httpConn.setRequestProperty("Content-Length", String.valueOf(msg.length()));
      httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
      httpConn.setRequestProperty("SOAPAction", "test");
      httpConn.setRequestMethod("POST");
      httpConn.setDoOutput(true);
      httpConn.setDoInput(true);

      OutputStream out = httpConn.getOutputStream();
      out.write(msg.getBytes());
      out.close();

      if (httpConn.getResponseCode() >= 500)
      {
         InputStreamReader isr = new InputStreamReader(httpConn.getErrorStream());
         BufferedReader in = new BufferedReader(isr);

         String inputLine;

         StringBuffer buffer = new StringBuffer();
         while ((inputLine = in.readLine()) != null)
         {
            buffer.append(inputLine);
         }

         in.close();
         System.out.println(buffer.toString());
         assertTrue("Expected version mismatch error", buffer.toString().contains("soap:VersionMismatch"));

      }
      else
      {
         fail("Expected version mismatch error");
      }
      
      
      /* Test1194 : Application fault sent to a non-anonymous FaultTo address.
       * There is such test in apache cxf: look at org.apache.cxf.systest.ws.addr_feature.WSAFaultToClientServerTest
       */

   }
   
}
