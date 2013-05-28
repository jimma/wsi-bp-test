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
package org.jboss.test.ws.jaxws.bp12.mtom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
//import javax.xml.ws.soap.MTOM;

@WebService(targetNamespace = "http://xmlsoap.org/Ping", name = "IMtomExtendedContract")
@XmlSeeAlso({ObjectFactory.class})
//@MTOM
public interface IMtomExtendedContract {

    @WebResult(name = "EchoStringArrayAsBinaryArrayResult", targetNamespace = "http://xmlsoap.org/Ping")
    @Action(input = "http://xmlsoap.org/EchoStringArrayAsBinaryArray", output = "http://xmlsoap.org/EchoStringArrayAsBinaryArrayReply")
    @RequestWrapper(localName = "EchoStringArrayAsBinaryArray", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoStringArrayAsBinaryArray")
    @WebMethod(operationName = "EchoStringArrayAsBinaryArray", action = "http://xmlsoap.org/EchoStringArrayAsBinaryArray")
    @ResponseWrapper(localName = "EchoStringArrayAsBinaryArrayResponse", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoStringArrayAsBinaryArrayResponse")
    public Base64BinaryArray echoStringArrayAsBinaryArray(
        @WebParam(name = "stringArray", targetNamespace = "http://xmlsoap.org/Ping")
        StringArray stringArray
    );

    @WebResult(name = "EchoBinaryFieldAsStringResult", targetNamespace = "http://xmlsoap.org/Ping")
    @Action(input = "http://xmlsoap.org/EchoBinaryFieldAsString", output = "http://xmlsoap.org/EchoBinaryFieldAsStringResponse")
    @RequestWrapper(localName = "EchoBinaryFieldAsString", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoBinaryFieldAsString")
    @WebMethod(operationName = "EchoBinaryFieldAsString", action = "http://xmlsoap.org/EchoBinaryFieldAsString")
    @ResponseWrapper(localName = "EchoBinaryFieldAsStringResponse", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoBinaryFieldAsStringResponse")
    public String echoBinaryFieldAsString(
        @WebParam(name = "s", targetNamespace = "http://xmlsoap.org/Ping")
        MtomTestStruct s
    );

    @WebResult(name = "EchoBinaryArrayAsStringArrayResult", targetNamespace = "http://xmlsoap.org/Ping")
    @Action(input = "http://xmlsoap.org/EchoBinaryArrayAsStringArray", output = "http://xmlsoap.org/EchoBinaryArrayAsStringArrayResponse")
    @RequestWrapper(localName = "EchoBinaryArrayAsStringArray", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoBinaryArrayAsStringArray")
    @WebMethod(operationName = "EchoBinaryArrayAsStringArray", action = "http://xmlsoap.org/EchoBinaryArrayAsStringArray")
    @ResponseWrapper(localName = "EchoBinaryArrayAsStringArrayResponse", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoBinaryArrayAsStringArrayResponse")
    public StringArray echoBinaryArrayAsStringArray(
        @WebParam(name = "BinaryArray", targetNamespace = "http://xmlsoap.org/Ping")
        Base64BinaryArray binaryArray
    );

    @WebResult(name = "EchoStringAsBinaryResult", targetNamespace = "http://xmlsoap.org/Ping")
    @Action(input = "http://xmlsoap.org/EchoStringAsBinary", output = "http://xmlsoap.org/EchoStringAsBinaryResponse")
    @RequestWrapper(localName = "EchoStringAsBinary", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoStringAsBinary")
    @WebMethod(operationName = "EchoStringAsBinary", action = "http://xmlsoap.org/EchoStringAsBinary")
    @ResponseWrapper(localName = "EchoStringAsBinaryResponse", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoStringAsBinaryResponse")
    public byte[] echoStringAsBinary(
        @WebParam(name = "s", targetNamespace = "http://xmlsoap.org/Ping")
        String s
    );

    @WebResult(name = "EchoStringArrayAsBinaryFieldsResult", targetNamespace = "http://xmlsoap.org/Ping")
    @Action(input = "http://xmlsoap.org/EchoStringArrayAsBinaryFields", output = "http://xmlsoap.org/EchoStringArrayAsBinaryFieldsReply")
    @RequestWrapper(localName = "EchoStringArrayAsBinaryFields", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoStringArrayAsBinaryFields")
    @WebMethod(operationName = "EchoStringArrayAsBinaryFields", action = "http://xmlsoap.org/EchoStringArrayAsBinaryFields")
    @ResponseWrapper(localName = "EchoStringArrayAsBinaryFieldsResponse", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoStringArrayAsBinaryFieldsResponse")
    public MtomTestStructWithMultipleBinaryFields echoStringArrayAsBinaryFields(
        @WebParam(name = "textArray", targetNamespace = "http://xmlsoap.org/Ping")
        StringArray textArray
    );

    @WebResult(name = "EchoBinaryAsStringResult", targetNamespace = "http://xmlsoap.org/Ping")
    @Action(input = "http://xmlsoap.org/EchoBinaryAsString", output = "http://xmlsoap.org/EchoBinaryAsStringResponse")
    @RequestWrapper(localName = "EchoBinaryAsString", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoBinaryAsString")
    @WebMethod(operationName = "EchoBinaryAsString", action = "http://xmlsoap.org/EchoBinaryAsString")
    @ResponseWrapper(localName = "EchoBinaryAsStringResponse", targetNamespace = "http://xmlsoap.org/Ping", className = "org.jboss.test.ws.jaxws.bp12.mtom.EchoBinaryAsStringResponse")
    public String echoBinaryAsString(
        @WebParam(name = "array", targetNamespace = "http://xmlsoap.org/Ping")
        byte[] array
    );

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "EchoBinaryHeaderResponse", targetNamespace = "http://xmlsoap.org/Ping", partName = "parameters")
    @Action(input = "http://xmlsoap.org/HeaderRequest", output = "http://xmlsoap.org/HeaderResponse")
    @WebMethod(operationName = "EchoBinaryHeader", action = "http://xmlsoap.org/HeaderRequest")
    public EchoBinaryHeaderResponse echoBinaryHeader(
        @WebParam(partName = "parameters", name = "EchoBinaryHeaderRequest", targetNamespace = "http://xmlsoap.org/Ping")
        EchoBinaryHeaderRequest parameters,
        @WebParam(partName = "HeaderData", mode = WebParam.Mode.INOUT, name = "HeaderData", targetNamespace = "http://xmlsoap.org/Ping", header = true)
        javax.xml.ws.Holder<byte[]> headerData
    );
}
