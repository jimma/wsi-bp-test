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
package org.jboss.test.ws.jaxws.bp12.complexdoc;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import junit.framework.Test;

import org.jboss.wsf.test.JBossWSCXFTestSetup;
import org.jboss.wsf.test.JBossWSTest;

public class ComplexTypesDocTestCase extends JBossWSTest
{
   private final String serviceURL = "http://" + getServerHost() + ":8080/jaxws-bp12complexdoc/ComplexDoc";

   public static Test suite()
   {
      return new JBossWSCXFTestSetup(ComplexTypesDocTestCase.class, "jaxws-bp12complexdoc.war");
   }

   public void testAllTypes() throws Exception
   {
      // construct proxy
      QName serviceName = new QName("http://tempuri.org/", "ComplexDataTypesDocLitWService");
      URL wsdlURL = new URL(serviceURL + "?wsdl");
      Service service = Service.create(wsdlURL, serviceName);
      IComplexDataTypesDocLitW port = (IComplexDataTypesDocLitW) service.getPort(IComplexDataTypesDocLitW.class);
      // invoke method
      ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
            "http://localhost:9090/jaxws-bp12complexdoc/ComplexDoc");

      System.out.println("Invoking retArrayString1D...");
      StringArray inArrayString1D = new StringArray();
      inArrayString1D.getString().add("the first string");
      inArrayString1D.getString().add("the second string");
      inArrayString1D.getString().add("the third string");
      StringArray retArrayString1D  = port.retArrayString1D(inArrayString1D);
      System.out.println("retArrayString1D.result=" + retArrayString1D.getString().size());

      System.out.println("Invoking retArrayInt1D...");
      IntArray inArrayInt1D = new IntArray();
      inArrayInt1D.getInt().add(100);
      inArrayInt1D.getInt().add(200);
      inArrayInt1D.getInt().add(300);
      IntArray retArrayInt1D = port.retArrayInt1D(inArrayInt1D);
      System.out.println("retArrayInt1D.result=" + retArrayInt1D.getInt().size());

         

   }
}