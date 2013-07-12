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
package org.jboss.test.ws.jaxws.bp12.wsa.test1197;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import junit.framework.Test;

import org.jboss.test.ws.jaxws.bp12.common.BP12Test;
import org.jboss.wsf.test.JBossWSCXFTestSetup;

public class Test1197TestCase extends BP12Test
{
   private final String serviceURL = "http://" + getServerHost() + ":8080/jaxws-bp12test1197/Test1197";

   public static Test suite()
   {
      return new JBossWSCXFTestSetup(Test1197TestCase.class, "jaxws-bp12test1197.war");
   }

   public void testSignature() throws Exception
   {
      // construct proxy
      QName serviceName = new QName("http://tempuri.org/", "WSAddressingCR");
      URL wsdlURL = new URL(serviceURL + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);
      SignatureDocumentLiteral port = (SignatureDocumentLiteral) service.getPort(SignatureDocumentLiteral.class);
      // invoke method
      ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
            PROXY_ADDRESS + "/jaxws-bp12test1197/Test1197");

      System.out.println("Invoking sign1...");
      String response = port.sign1("Hello");
      System.out.println(response);
      
      
      System.out.println("Invoking sign2...");
      response = port.sign2("Hello");
      System.out.println(response);
      
      System.out.println("Invoking sign3...");
      response = port.sign3();
      System.out.println(response);
      
      System.out.println("Invoking sign4...");
      response = port.sign4();
      System.out.println(response);
      
      System.out.println("Invoking sign5...");
      port.sign5();
      
      System.out.println("Invoking sign6...");
      SignatureInMultipartMessage inMessage = new SignatureInMultipartMessage();
      inMessage.setSignatureInFirstPart(new ObjectFactory().createSignatureInMultipartMessageSignatureInFirstPart("Hello"));
      inMessage.setSignatureInSecondPart(new ObjectFactory().createSignatureInMultipartMessageSignatureInSecondPart("World"));
      response = port.sign6(inMessage);
      System.out.println(response);
      
      //request 7
      System.out.println("Invoking sign7...");
      javax.xml.ws.Holder<String> headerText = new javax.xml.ws.Holder<String>();
      headerText.value = "World";
      response = port.sign7("Hello", headerText);
      System.out.println(response);
      
      
      //request 8
      System.out.println("Invoking sign7 and exception is expected...");
      headerText.value = "Hello";
      try
      {
         response = port.sign1("world");
      }
      catch (Exception e)
      {
         System.out.println("sign7 exception message : " + e.getMessage());
      }
      
   }
 
   
}
