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
package org.jboss.test.ws.jaxws.bp12.wsa.test1198;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import junit.framework.Test;

import org.jboss.test.ws.jaxws.bp12.common.BP12Test;
import org.jboss.wsf.test.JBossWSCXFTestSetup;

public class Test1198TestCase extends BP12Test
{
   private final String serviceURL = "http://" + getServerHost() + ":8080/jaxws-bp12test1198/Test1198";

   public static Test suite()
   {
      return new JBossWSCXFTestSetup(Test1198TestCase.class, "jaxws-bp12test1198.war");
   }

   public void testSignature() throws Exception
   {
      // construct proxy
      QName serviceName = new QName("http://tempuri.org/", "WSAddressingCR");
      URL wsdlURL = new URL(serviceURL + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);
      SignatureRpcLiteral port = (SignatureRpcLiteral) service.getPort(SignatureRpcLiteral.class);
      // invoke method
      ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
            PROXY_ADDRESS + "/jaxws-bp12test1198/Test1198");


      //request 1      
      System.out.println("Invoking sign1...");
      String response = port.sign1();
      System.out.println(response);
      
      
      //request 2
      System.out.println("Invoking sign2...");
      response = port.sign2("Hello", "World");
      System.out.println(response);
      
      
      //request 3
      System.out.println("Invoking sign2 and exception is expected...");
      try
      {
         response = port.sign2("Fault","World");
      }
      catch (Exception e)
      {
         System.out.println("sign2 exception message : " + e.getMessage());
      }
      
   }
 
   
}
