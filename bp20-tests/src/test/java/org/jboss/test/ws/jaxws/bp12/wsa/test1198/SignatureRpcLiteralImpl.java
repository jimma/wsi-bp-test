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

package org.jboss.test.ws.jaxws.bp12.wsa.test1198;

import javax.jws.WebService;

@WebService(serviceName = "WSAddressingCR", 
            portName = "CustomBinding_SignatureRpcLiteral", 
            targetNamespace = "http://tempuri.org/", 
            wsdlLocation = "WEB-INF/wsdl/SignatureRpcLit.wsdl", 
            endpointInterface = "org.jboss.test.ws.jaxws.bp12.wsa.test1198.SignatureRpcLiteral")
public class SignatureRpcLiteralImpl implements SignatureRpcLiteral
{

   public String sign1()
   {
      return "Sign1";
   }

   public String sign2(String parameter1, String parameter2) throws SignatureRpcLiteralSign2SignatureHeaderRpcFaultFaultMessage
   {
      if (parameter1.equals("Fault"))
      {
         new SignatureRpcLiteralSign2SignatureHeaderRpcFaultFaultMessage("Fault : " + parameter1 + "," + parameter2);
      }
      return "Sign2, Parameter=" + parameter1 + ",Parameter=" + parameter2;
   }

}
