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

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

@WebService(targetNamespace = "http://example.org/signature", name = "SignatureRpcLiteral")
@XmlSeeAlso({ ObjectFactory.class })
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SignatureRpcLiteral
{

   @WebResult(name = "Sign1Result", targetNamespace = "http://example.org/signature", partName = "Sign1Result")
   @Action(input = "http://example.org/action/SignatureRpcInEmpty", output = "http://example.org/action/SignatureRpcOutEmpty")
   @WebMethod(operationName = "Sign1", action = "http://example.org/action/SignatureRpcInEmpty")
   public String sign1();

   @WebResult(name = "Sign2Result", targetNamespace = "http://example.org/signature", partName = "Sign2Result")
   @Action(input = "http://example.org/action/SignatureHeaderRpcIn", output = "http://example.org/action/SignatureHeaderRpcReply", fault = { @FaultAction(className = SignatureRpcLiteralSign2SignatureHeaderRpcFaultFaultMessage.class, value = "http://example.org/action/SignatureHeaderFaultRpc") })
   @WebMethod(operationName = "Sign2", action = "http://example.org/action/SignatureHeaderRpcIn")
   public String sign2(@WebParam(partName = "parameter1", name = "parameter1")
                      String parameter1, 
                      @WebParam(partName = "parameter2", name = "parameter2")
                      String parameter2) throws SignatureRpcLiteralSign2SignatureHeaderRpcFaultFaultMessage;
}
