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
package org.jboss.test.ws.jaxws.bp12.wsa.test1192;

import org.apache.cxf.helpers.IOUtils;
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

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.AddressingFeature;
import javax.xml.ws.soap.SOAPFaultException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

@RunWith(Arquillian.class)
public class Test1192TestCase extends BP12Test
{
  
   @ArquillianResource
   private URL baseURL;

   @Deployment(testable = false)
   public static WebArchive createDeployment()
   {
      WebArchive archive = ShrinkWrap.create(WebArchive.class, "jaxws-bp12test1192.war");
      archive.setManifest(new StringAsset("Manifest-Version: 1.0\n" + "Dependencies: org.apache.cxf\n"))
            .addPackages(false, Filters.exclude(Test1192TestCase.class), Test1192TestCase.class.getPackage().getName())
            .setWebXML(new File(JBossWSTestHelper.getTestResourcesDir() + "/jaxws/bp12/wsa/test1192/WEB-INF/web.xml"));
       addResroucesToWebInf(JBossWSTestHelper.getTestResourcesDir() + "/jaxws/bp12/wsa/test1192/WEB-INF", archive, "wsdl", "xsd");
      return archive;
   }

   //Test1192
   @Test
   @RunAsClient
   public void testMustUnderstand() throws Exception
   {
      // construct proxy
      QName serviceName = new QName("http://example.org/wsaTestService", "wsaTestService");
      QName portName = new QName("http://example.org/wsaTestService", "wsaTestPort");
      URL wsdlURL = new URL(baseURL + "/Test1192" + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);

      Dispatch<SOAPMessage> disp = service.createDispatch(portName, SOAPMessage.class,
            Service.Mode.MESSAGE,
            new AddressingFeature(false, false));
      ((BindingProvider) disp).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
            getProxyAddress(baseURL) + "/Test1192"); 
      //To mustunderstand
      InputStream msgIns = getClass().getResourceAsStream("./wsa-to-mustunderstand.xml");
      String msg = new String(IOUtils.readBytesFromStream(msgIns));
      msg = msg.replaceAll("$PORT", PROXY_PORT);
      
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
      msg = msg.replaceAll("$PORT", PROXY_PORT);
      
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
      msg = msg.replaceAll("$PORT", PROXY_PORT);
      
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
      msg = msg.replaceAll("$PORT", PROXY_PORT);
      
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

}
