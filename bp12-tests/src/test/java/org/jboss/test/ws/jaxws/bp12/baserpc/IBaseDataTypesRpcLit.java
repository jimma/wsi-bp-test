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
package org.jboss.test.ws.jaxws.bp12.baserpc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;
import javax.xml.ws.soap.Addressing;

@WebService(targetNamespace = "http://tempuri.org/", name = "IBaseDataTypesRpcLit")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@Addressing
public interface IBaseDataTypesRpcLit {

    @WebResult(name = "RetIntResult", targetNamespace = "http://tempuri.org/", partName = "RetIntResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetInt", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetIntResponse")
    @WebMethod(operationName = "RetInt", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetInt")
    public int retInt(
        @WebParam(partName = "inInt", name = "inInt")
        int inInt
    );

    @WebResult(name = "RetDateTimeResult", targetNamespace = "http://tempuri.org/", partName = "RetDateTimeResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetDateTime", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetDateTimeResponse")
    @WebMethod(operationName = "RetDateTime", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetDateTime")
    public javax.xml.datatype.XMLGregorianCalendar retDateTime(
        @WebParam(partName = "inDateTime", name = "inDateTime")
        javax.xml.datatype.XMLGregorianCalendar inDateTime
    );

    @WebResult(name = "RetUnsignedIntResult", targetNamespace = "http://tempuri.org/", partName = "RetUnsignedIntResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedInt", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedIntResponse")
    @WebMethod(operationName = "RetUnsignedInt", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedInt")
    public long retUnsignedInt(
        @WebParam(partName = "inUInt", name = "inUInt")
        long inUInt
    );

    @WebResult(name = "RetDurationResult", targetNamespace = "http://tempuri.org/", partName = "RetDurationResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetDuration", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetDurationResponse")
    @WebMethod(operationName = "RetDuration", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetDuration")
    public javax.xml.datatype.Duration retDuration(
        @WebParam(partName = "inTimeSpan", name = "inTimeSpan")
        javax.xml.datatype.Duration inTimeSpan
    );

    @WebResult(name = "RetDecimalResult", targetNamespace = "http://tempuri.org/", partName = "RetDecimalResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetDecimal", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetDecimalResponse")
    @WebMethod(operationName = "RetDecimal", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetDecimal")
    public java.math.BigDecimal retDecimal(
        @WebParam(partName = "inDecimal", name = "inDecimal")
        java.math.BigDecimal inDecimal
    );

    @WebResult(name = "RetDoubleResult", targetNamespace = "http://tempuri.org/", partName = "RetDoubleResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetDouble", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetDoubleResponse")
    @WebMethod(operationName = "RetDouble", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetDouble")
    public double retDouble(
        @WebParam(partName = "inDouble", name = "inDouble")
        double inDouble
    );

    @WebResult(name = "RetFloatResult", targetNamespace = "http://tempuri.org/", partName = "RetFloatResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetFloat", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetFloatResponse")
    @WebMethod(operationName = "RetFloat", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetFloat")
    public float retFloat(
        @WebParam(partName = "inFloat", name = "inFloat")
        float inFloat
    );

    @WebResult(name = "RetLongResult", targetNamespace = "http://tempuri.org/", partName = "RetLongResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetLong", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetLongResponse")
    @WebMethod(operationName = "RetLong", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetLong")
    public long retLong(
        @WebParam(partName = "inLong", name = "inLong")
        long inLong
    );

    @WebResult(name = "RetBase64BinaryResult", targetNamespace = "http://tempuri.org/", partName = "RetBase64BinaryResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetBase64Binary", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetBase64BinaryResponse")
    @WebMethod(operationName = "RetBase64Binary", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetBase64Binary")
    public byte[] retBase64Binary(
        @WebParam(partName = "inByteArray", name = "inByteArray")
        byte[] inByteArray
    );

    @WebResult(name = "RetStringResult", targetNamespace = "http://tempuri.org/", partName = "RetStringResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetString", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetStringResponse")
    @WebMethod(operationName = "RetString", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetString")
    public java.lang.String retString(
        @WebParam(partName = "inString", name = "inString")
        java.lang.String inString
    );

    @WebResult(name = "RetShortResult", targetNamespace = "http://tempuri.org/", partName = "RetShortResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetShort", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetShortResponse")
    @WebMethod(operationName = "RetShort", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetShort")
    public short retShort(
        @WebParam(partName = "inShort", name = "inShort")
        short inShort
    );

    @WebResult(name = "RetByteResult", targetNamespace = "http://tempuri.org/", partName = "RetByteResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetByte", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetByteResponse")
    @WebMethod(operationName = "RetByte", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetByte")
    public byte retByte(
        @WebParam(partName = "inSByte", name = "inSByte")
        byte inSByte
    );

    @WebResult(name = "RetAnyTypeResult", targetNamespace = "http://tempuri.org/", partName = "RetAnyTypeResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetAnyType", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetAnyTypeResponse")
    @WebMethod(operationName = "RetAnyType", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetAnyType")
    public java.lang.Object retAnyType(
        @WebParam(partName = "inObject", name = "inObject")
        java.lang.Object inObject
    );

    @WebResult(name = "RetUnsignedByteResult", targetNamespace = "http://tempuri.org/", partName = "RetUnsignedByteResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedByte", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedByteResponse")
    @WebMethod(operationName = "RetUnsignedByte", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedByte")
    public short retUnsignedByte(
        @WebParam(partName = "inByte", name = "inByte")
        short inByte
    );

    @WebResult(name = "RetUnsignedLongResult", targetNamespace = "http://tempuri.org/", partName = "RetUnsignedLongResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedLong", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedLongResponse")
    @WebMethod(operationName = "RetUnsignedLong", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedLong")
    public java.math.BigInteger retUnsignedLong(
        @WebParam(partName = "inULong", name = "inULong")
        java.math.BigInteger inULong
    );

    @WebResult(name = "RetUnsignedShortResult", targetNamespace = "http://tempuri.org/", partName = "RetUnsignedShortResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedShort", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedShortResponse")
    @WebMethod(operationName = "RetUnsignedShort", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetUnsignedShort")
    public int retUnsignedShort(
        @WebParam(partName = "inUShort", name = "inUShort")
        int inUShort
    );

    @WebResult(name = "RetQNameResult", targetNamespace = "http://tempuri.org/", partName = "RetQNameResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetQName", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetQNameResponse")
    @WebMethod(operationName = "RetQName", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetQName")
    public javax.xml.namespace.QName retQName(
        @WebParam(partName = "inQName", name = "inQName")
        javax.xml.namespace.QName inQName
    );

    @WebResult(name = "RetBooleanResult", targetNamespace = "http://tempuri.org/", partName = "RetBooleanResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetBoolean", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetBooleanResponse")
    @WebMethod(operationName = "RetBoolean", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetBoolean")
    public boolean retBoolean(
        @WebParam(partName = "inBool", name = "inBool")
        boolean inBool
    );

    @WebResult(name = "RetAnyUriResult", targetNamespace = "http://tempuri.org/", partName = "RetAnyUriResult")
    @Action(input = "http://tempuri.org/IBaseDataTypesRpcLit/RetAnyUri", output = "http://tempuri.org/IBaseDataTypesRpcLit/RetAnyUriResponse")
    @WebMethod(operationName = "RetAnyUri", action = "http://tempuri.org/IBaseDataTypesRpcLit/RetAnyUri")
    public java.lang.String retAnyUri(
        @WebParam(partName = "inUri", name = "inUri")
        java.lang.String inUri
    );
}
