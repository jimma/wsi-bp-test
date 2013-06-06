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
package org.jboss.test.ws.jaxws.bp20.wsa.test1197;

@javax.jws.WebService(serviceName = "WSAddressingCR", 
                      portName = "CustomBinding_SignatureDocumentLiteral", 
                      targetNamespace = "http://tempuri.org/", 
                      wsdlLocation = "WEB-INF/wsdl/SignatureDocLit.wsdl", 
                      endpointInterface = "org.jboss.test.ws.jaxws.bp20.wsa.test1197.SignatureDocumentLiteral")
public class SignatureDocumentLiteralImpl implements SignatureDocumentLiteral
{

   public String sign2(java.lang.String signatureIn)
   {
      System.out.println(signatureIn);
      return "Sign2,Parameter=" + signatureIn;
   }

   public String sign3()
   {
      return "Sign3";
   }

   public String sign4()
   {
      return "Sign4";
   }

   public String sign6(SignatureInMultipartMessage parameters)
   {
      System.out.println("First Part:" + parameters.getSignatureInFirstPart().getValue());
      System.out.println("Second Part:" + parameters.getSignatureInSecondPart().getValue());
      return "Sign6,Parameter=" + parameters.getSignatureInFirstPart().getValue() 
            + ",Parameter=" + parameters.getSignatureInSecondPart().getValue();
   }

   public String sign1(String signatureIn)
   {
      System.out.println("sign1 request " + signatureIn);
      return "Sign1,Parameter=" + signatureIn;
   }

   public void sign5()
   {
      System.out.println("sign5 .... ");
   }

   
   public String sign7(String signatureInHeaderMember, javax.xml.ws.Holder<String> headerText)
         throws SignatureDocumentLiteralSign7SignatureHeaderFaultFaultMessage
   {
      System.out.println("sign7 request " + signatureInHeaderMember + "," + headerText.value);
      if (signatureInHeaderMember.equals("World"))
      {
         throw new SignatureDocumentLiteralSign7SignatureHeaderFaultFaultMessage("World, " + headerText.value );
      }
      return "Sign7, Parameter=" + signatureInHeaderMember + ",Parameter=" + headerText.value;
   }

}
