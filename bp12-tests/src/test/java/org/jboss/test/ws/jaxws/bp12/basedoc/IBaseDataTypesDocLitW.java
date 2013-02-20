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
package org.jboss.test.ws.jaxws.bp12.basedoc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.soap.Addressing;


@WebService(targetNamespace = "http://tempuri.org/", name = "IBaseDataTypesDocLitW")
@XmlSeeAlso({ObjectFactory.class})
@Addressing
public interface IBaseDataTypesDocLitW {

    @WebResult(name = "RetIntResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetInt", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetIntResponse")
    @RequestWrapper(localName = "RetInt", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetInt")
    @WebMethod(operationName = "RetInt", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetInt")
    @ResponseWrapper(localName = "RetIntResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetIntResponse")
    public java.lang.Integer retInt(
        @WebParam(name = "inInt", targetNamespace = "http://tempuri.org/")
        java.lang.Integer inInt
    );

    @WebResult(name = "RetDateTimeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetDateTime", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetDateTimeResponse")
    @RequestWrapper(localName = "RetDateTime", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetDateTime")
    @WebMethod(operationName = "RetDateTime", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetDateTime")
    @ResponseWrapper(localName = "RetDateTimeResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetDateTimeResponse")
    public javax.xml.datatype.XMLGregorianCalendar retDateTime(
        @WebParam(name = "inDateTime", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar inDateTime
    );

    @WebResult(name = "RetUnsignedIntResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedInt", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedIntResponse")
    @RequestWrapper(localName = "RetUnsignedInt", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetUnsignedInt")
    @WebMethod(operationName = "RetUnsignedInt", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedInt")
    @ResponseWrapper(localName = "RetUnsignedIntResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetUnsignedIntResponse")
    public java.lang.Long retUnsignedInt(
        @WebParam(name = "inUInt", targetNamespace = "http://tempuri.org/")
        java.lang.Long inUInt
    );

    @WebResult(name = "RetDurationResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetDuration", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetDurationResponse")
    @RequestWrapper(localName = "RetDuration", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetDuration")
    @WebMethod(operationName = "RetDuration", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetDuration")
    @ResponseWrapper(localName = "RetDurationResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetDurationResponse")
    public javax.xml.datatype.Duration retDuration(
        @WebParam(name = "inTimeSpan", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.Duration inTimeSpan
    );

    @WebResult(name = "RetDecimalResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetDecimal", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetDecimalResponse")
    @RequestWrapper(localName = "RetDecimal", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetDecimal")
    @WebMethod(operationName = "RetDecimal", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetDecimal")
    @ResponseWrapper(localName = "RetDecimalResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetDecimalResponse")
    public java.math.BigDecimal retDecimal(
        @WebParam(name = "inDecimal", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal inDecimal
    );

    @WebResult(name = "RetDoubleResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetDouble", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetDoubleResponse")
    @RequestWrapper(localName = "RetDouble", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetDouble")
    @WebMethod(operationName = "RetDouble", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetDouble")
    @ResponseWrapper(localName = "RetDoubleResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetDoubleResponse")
    public java.lang.Double retDouble(
        @WebParam(name = "inDouble", targetNamespace = "http://tempuri.org/")
        java.lang.Double inDouble
    );

    @WebResult(name = "RetFloatResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetFloat", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetFloatResponse")
    @RequestWrapper(localName = "RetFloat", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetFloat")
    @WebMethod(operationName = "RetFloat", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetFloat")
    @ResponseWrapper(localName = "RetFloatResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetFloatResponse")
    public java.lang.Float retFloat(
        @WebParam(name = "inFloat", targetNamespace = "http://tempuri.org/")
        java.lang.Float inFloat
    );

    @WebResult(name = "RetLongResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetLong", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetLongResponse")
    @RequestWrapper(localName = "RetLong", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetLong")
    @WebMethod(operationName = "RetLong", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetLong")
    @ResponseWrapper(localName = "RetLongResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetLongResponse")
    public java.lang.Long retLong(
        @WebParam(name = "inLong", targetNamespace = "http://tempuri.org/")
        java.lang.Long inLong
    );

    @WebResult(name = "RetBase64BinaryResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetBase64Binary", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetBase64BinaryResponse")
    @RequestWrapper(localName = "RetBase64Binary", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetBase64Binary")
    @WebMethod(operationName = "RetBase64Binary", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetBase64Binary")
    @ResponseWrapper(localName = "RetBase64BinaryResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetBase64BinaryResponse")
    public byte[] retBase64Binary(
        @WebParam(name = "inByteArray", targetNamespace = "http://tempuri.org/")
        byte[] inByteArray
    );

    @WebResult(name = "RetStringResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetString", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetStringResponse")
    @RequestWrapper(localName = "RetString", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetString")
    @WebMethod(operationName = "RetString", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetString")
    @ResponseWrapper(localName = "RetStringResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetStringResponse")
    public java.lang.String retString(
        @WebParam(name = "inString", targetNamespace = "http://tempuri.org/")
        java.lang.String inString
    );

    @WebResult(name = "RetShortResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetShort", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetShortResponse")
    @RequestWrapper(localName = "RetShort", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetShort")
    @WebMethod(operationName = "RetShort", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetShort")
    @ResponseWrapper(localName = "RetShortResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetShortResponse")
    public java.lang.Short retShort(
        @WebParam(name = "inShort", targetNamespace = "http://tempuri.org/")
        java.lang.Short inShort
    );

    @WebResult(name = "RetByteResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetByte", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetByteResponse")
    @RequestWrapper(localName = "RetByte", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetByte")
    @WebMethod(operationName = "RetByte", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetByte")
    @ResponseWrapper(localName = "RetByteResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetByteResponse")
    public java.lang.Byte retByte(
        @WebParam(name = "inSByte", targetNamespace = "http://tempuri.org/")
        java.lang.Byte inSByte
    );

    @WebResult(name = "RetAnyTypeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetAnyType", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetAnyTypeResponse")
    @RequestWrapper(localName = "RetAnyType", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetAnyType")
    @WebMethod(operationName = "RetAnyType", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetAnyType")
    @ResponseWrapper(localName = "RetAnyTypeResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetAnyTypeResponse")
    public java.lang.Object retAnyType(
        @WebParam(name = "inObject", targetNamespace = "http://tempuri.org/")
        java.lang.Object inObject
    );

    @WebResult(name = "RetUnsignedByteResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedByte", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedByteResponse")
    @RequestWrapper(localName = "RetUnsignedByte", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetUnsignedByte")
    @WebMethod(operationName = "RetUnsignedByte", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedByte")
    @ResponseWrapper(localName = "RetUnsignedByteResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetUnsignedByteResponse")
    public java.lang.Short retUnsignedByte(
        @WebParam(name = "inByte", targetNamespace = "http://tempuri.org/")
        java.lang.Short inByte
    );

    @WebResult(name = "RetUnsignedLongResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedLong", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedLongResponse")
    @RequestWrapper(localName = "RetUnsignedLong", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetUnsignedLong")
    @WebMethod(operationName = "RetUnsignedLong", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedLong")
    @ResponseWrapper(localName = "RetUnsignedLongResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetUnsignedLongResponse")
    public java.math.BigInteger retUnsignedLong(
        @WebParam(name = "inULong", targetNamespace = "http://tempuri.org/")
        java.math.BigInteger inULong
    );

    @WebResult(name = "RetUnsignedShortResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedShort", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedShortResponse")
    @RequestWrapper(localName = "RetUnsignedShort", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetUnsignedShort")
    @WebMethod(operationName = "RetUnsignedShort", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetUnsignedShort")
    @ResponseWrapper(localName = "RetUnsignedShortResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetUnsignedShortResponse")
    public java.lang.Integer retUnsignedShort(
        @WebParam(name = "inUShort", targetNamespace = "http://tempuri.org/")
        java.lang.Integer inUShort
    );

    @WebResult(name = "RetQNameResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetQName", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetQNameResponse")
    @RequestWrapper(localName = "RetQName", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetQName")
    @WebMethod(operationName = "RetQName", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetQName")
    @ResponseWrapper(localName = "RetQNameResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetQNameResponse")
    public javax.xml.namespace.QName retQName(
        @WebParam(name = "inQName", targetNamespace = "http://tempuri.org/")
        javax.xml.namespace.QName inQName
    );

    @WebResult(name = "RetBooleanResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetBoolean", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetBooleanResponse")
    @RequestWrapper(localName = "RetBoolean", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetBoolean")
    @WebMethod(operationName = "RetBoolean", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetBoolean")
    @ResponseWrapper(localName = "RetBooleanResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetBooleanResponse")
    public java.lang.Boolean retBoolean(
        @WebParam(name = "inBool", targetNamespace = "http://tempuri.org/")
        java.lang.Boolean inBool
    );

    @WebResult(name = "RetAnyUriResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IBaseDataTypesDocLitW/RetAnyUri", output = "http://tempuri.org/IBaseDataTypesDocLitW/RetAnyUriResponse")
    @RequestWrapper(localName = "RetAnyUri", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetAnyUri")
    @WebMethod(operationName = "RetAnyUri", action = "http://tempuri.org/IBaseDataTypesDocLitW/RetAnyUri")
    @ResponseWrapper(localName = "RetAnyUriResponse", targetNamespace = "http://tempuri.org/", className = "org.jboss.test.ws.jaxws.bp12.basedoc.RetAnyUriResponse")
    public java.lang.String retAnyUri(
        @WebParam(name = "inUri", targetNamespace = "http://tempuri.org/")
        java.lang.String inUri
    );
}
