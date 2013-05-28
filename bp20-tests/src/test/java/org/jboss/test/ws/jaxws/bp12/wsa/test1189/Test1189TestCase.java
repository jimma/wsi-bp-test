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
package org.jboss.test.ws.jaxws.bp12.wsa.test1189;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import junit.framework.Test;
import org.jboss.wsf.test.JBossWSCXFTestSetup;
import org.jboss.wsf.test.JBossWSTest;

public class Test1189TestCase extends JBossWSTest
{
   private final String serviceURL = "http://" + getServerHost() + ":8080/jaxws-bp12test1189/Test1189";

   public static Test suite()
   {
      return new JBossWSCXFTestSetup(Test1189TestCase.class, "jaxws-bp12test1189.war");
   }

   public void testWSA() throws Exception
   {
      // construct proxy
      QName serviceName = new QName("http://tempuri.org/", "wsaTestService");
      URL wsdlURL = new URL(serviceURL + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);
      WsaTestPortType port = (WsaTestPortType) service.getPort(WsaTestPortType.class);
      // invoke method
      ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
            "http://localhost:9090/jaxws-bp12test1189/Test1189");

      System.out.println("Invoking echo...");
      String response = port.echo("input string");
      System.out.println("echo.result: " + response);
      
      
      System.out.println("Invoking notify...");
      port.notify("input string");
      
      
      
 
      

   }
}