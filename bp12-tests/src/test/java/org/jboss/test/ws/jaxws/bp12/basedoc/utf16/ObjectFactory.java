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
package org.jboss.test.ws.jaxws.bp12.basedoc.utf16;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jboss.test.ws.jaxws.bp12.basedoc.utf16 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Double_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "double");
    private final static QName _Long_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "long");
    private final static QName _Decimal_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "decimal");
    private final static QName _Float_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "float");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "anyURI");
    private final static QName _Int_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "int");
    private final static QName _QName_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _AnyType_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "dateTime");
    private final static QName _Boolean_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "boolean");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Duration_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "duration");
    private final static QName _Short_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "string");
    private final static QName _Byte_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "byte");
    private final static QName _RetBase64BinaryInByteArray_QNAME = new QName("http://tempuri.org/", "inByteArray");
    private final static QName _RetBase64BinaryResponseRetBase64BinaryResult_QNAME = new QName("http://tempuri.org/", "RetBase64BinaryResult");
    private final static QName _RetAnyUriInUri_QNAME = new QName("http://tempuri.org/", "inUri");
    private final static QName _RetAnyUriResponseRetAnyUriResult_QNAME = new QName("http://tempuri.org/", "RetAnyUriResult");
    private final static QName _RetStringInString_QNAME = new QName("http://tempuri.org/", "inString");
    private final static QName _RetStringResponseRetStringResult_QNAME = new QName("http://tempuri.org/", "RetStringResult");
    private final static QName _RetQNameResponseRetQNameResult_QNAME = new QName("http://tempuri.org/", "RetQNameResult");
    private final static QName _RetQNameInQName_QNAME = new QName("http://tempuri.org/", "inQName");
    private final static QName _RetAnyTypeResponseRetAnyTypeResult_QNAME = new QName("http://tempuri.org/", "RetAnyTypeResult");
    private final static QName _RetAnyTypeInObject_QNAME = new QName("http://tempuri.org/", "inObject");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.test.ws.jaxws.bp12.basedoc.utf16
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetUnsignedByte }
     * 
     */
    public RetUnsignedByte createRetUnsignedByte() {
        return new RetUnsignedByte();
    }

    /**
     * Create an instance of {@link RetDecimal }
     * 
     */
    public RetDecimal createRetDecimal() {
        return new RetDecimal();
    }

    /**
     * Create an instance of {@link RetFloatResponse }
     * 
     */
    public RetFloatResponse createRetFloatResponse() {
        return new RetFloatResponse();
    }

    /**
     * Create an instance of {@link RetUnsignedShortResponse }
     * 
     */
    public RetUnsignedShortResponse createRetUnsignedShortResponse() {
        return new RetUnsignedShortResponse();
    }

    /**
     * Create an instance of {@link RetDecimalResponse }
     * 
     */
    public RetDecimalResponse createRetDecimalResponse() {
        return new RetDecimalResponse();
    }

    /**
     * Create an instance of {@link RetShortResponse }
     * 
     */
    public RetShortResponse createRetShortResponse() {
        return new RetShortResponse();
    }

    /**
     * Create an instance of {@link RetStringResponse }
     * 
     */
    public RetStringResponse createRetStringResponse() {
        return new RetStringResponse();
    }

    /**
     * Create an instance of {@link RetBooleanResponse }
     * 
     */
    public RetBooleanResponse createRetBooleanResponse() {
        return new RetBooleanResponse();
    }

    /**
     * Create an instance of {@link RetUnsignedIntResponse }
     * 
     */
    public RetUnsignedIntResponse createRetUnsignedIntResponse() {
        return new RetUnsignedIntResponse();
    }

    /**
     * Create an instance of {@link RetQNameResponse }
     * 
     */
    public RetQNameResponse createRetQNameResponse() {
        return new RetQNameResponse();
    }

    /**
     * Create an instance of {@link RetString }
     * 
     */
    public RetString createRetString() {
        return new RetString();
    }

    /**
     * Create an instance of {@link RetDurationResponse }
     * 
     */
    public RetDurationResponse createRetDurationResponse() {
        return new RetDurationResponse();
    }

    /**
     * Create an instance of {@link RetLong }
     * 
     */
    public RetLong createRetLong() {
        return new RetLong();
    }

    /**
     * Create an instance of {@link RetAnyTypeResponse }
     * 
     */
    public RetAnyTypeResponse createRetAnyTypeResponse() {
        return new RetAnyTypeResponse();
    }

    /**
     * Create an instance of {@link RetByteResponse }
     * 
     */
    public RetByteResponse createRetByteResponse() {
        return new RetByteResponse();
    }

    /**
     * Create an instance of {@link RetBoolean }
     * 
     */
    public RetBoolean createRetBoolean() {
        return new RetBoolean();
    }

    /**
     * Create an instance of {@link RetDouble }
     * 
     */
    public RetDouble createRetDouble() {
        return new RetDouble();
    }

    /**
     * Create an instance of {@link RetDoubleResponse }
     * 
     */
    public RetDoubleResponse createRetDoubleResponse() {
        return new RetDoubleResponse();
    }

    /**
     * Create an instance of {@link RetQName }
     * 
     */
    public RetQName createRetQName() {
        return new RetQName();
    }

    /**
     * Create an instance of {@link RetBase64BinaryResponse }
     * 
     */
    public RetBase64BinaryResponse createRetBase64BinaryResponse() {
        return new RetBase64BinaryResponse();
    }

    /**
     * Create an instance of {@link RetUnsignedInt }
     * 
     */
    public RetUnsignedInt createRetUnsignedInt() {
        return new RetUnsignedInt();
    }

    /**
     * Create an instance of {@link RetAnyUriResponse }
     * 
     */
    public RetAnyUriResponse createRetAnyUriResponse() {
        return new RetAnyUriResponse();
    }

    /**
     * Create an instance of {@link RetInt }
     * 
     */
    public RetInt createRetInt() {
        return new RetInt();
    }

    /**
     * Create an instance of {@link RetBase64Binary }
     * 
     */
    public RetBase64Binary createRetBase64Binary() {
        return new RetBase64Binary();
    }

    /**
     * Create an instance of {@link RetLongResponse }
     * 
     */
    public RetLongResponse createRetLongResponse() {
        return new RetLongResponse();
    }

    /**
     * Create an instance of {@link RetDateTime }
     * 
     */
    public RetDateTime createRetDateTime() {
        return new RetDateTime();
    }

    /**
     * Create an instance of {@link RetFloat }
     * 
     */
    public RetFloat createRetFloat() {
        return new RetFloat();
    }

    /**
     * Create an instance of {@link RetIntResponse }
     * 
     */
    public RetIntResponse createRetIntResponse() {
        return new RetIntResponse();
    }

    /**
     * Create an instance of {@link RetDateTimeResponse }
     * 
     */
    public RetDateTimeResponse createRetDateTimeResponse() {
        return new RetDateTimeResponse();
    }

    /**
     * Create an instance of {@link RetAnyType }
     * 
     */
    public RetAnyType createRetAnyType() {
        return new RetAnyType();
    }

    /**
     * Create an instance of {@link RetAnyUri }
     * 
     */
    public RetAnyUri createRetAnyUri() {
        return new RetAnyUri();
    }

    /**
     * Create an instance of {@link RetShort }
     * 
     */
    public RetShort createRetShort() {
        return new RetShort();
    }

    /**
     * Create an instance of {@link RetDuration }
     * 
     */
    public RetDuration createRetDuration() {
        return new RetDuration();
    }

    /**
     * Create an instance of {@link RetUnsignedShort }
     * 
     */
    public RetUnsignedShort createRetUnsignedShort() {
        return new RetUnsignedShort();
    }

    /**
     * Create an instance of {@link RetUnsignedLong }
     * 
     */
    public RetUnsignedLong createRetUnsignedLong() {
        return new RetUnsignedLong();
    }

    /**
     * Create an instance of {@link RetUnsignedByteResponse }
     * 
     */
    public RetUnsignedByteResponse createRetUnsignedByteResponse() {
        return new RetUnsignedByteResponse();
    }

    /**
     * Create an instance of {@link RetUnsignedLongResponse }
     * 
     */
    public RetUnsignedLongResponse createRetUnsignedLongResponse() {
        return new RetUnsignedLongResponse();
    }

    /**
     * Create an instance of {@link RetByte }
     * 
     */
    public RetByte createRetByte() {
        return new RetByte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "inByteArray", scope = RetBase64Binary.class)
    public JAXBElement<byte[]> createRetBase64BinaryInByteArray(byte[] value) {
        return new JAXBElement<byte[]>(_RetBase64BinaryInByteArray_QNAME, byte[].class, RetBase64Binary.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetBase64BinaryResult", scope = RetBase64BinaryResponse.class)
    public JAXBElement<byte[]> createRetBase64BinaryResponseRetBase64BinaryResult(byte[] value) {
        return new JAXBElement<byte[]>(_RetBase64BinaryResponseRetBase64BinaryResult_QNAME, byte[].class, RetBase64BinaryResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "inUri", scope = RetAnyUri.class)
    public JAXBElement<String> createRetAnyUriInUri(String value) {
        return new JAXBElement<String>(_RetAnyUriInUri_QNAME, String.class, RetAnyUri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetAnyUriResult", scope = RetAnyUriResponse.class)
    public JAXBElement<String> createRetAnyUriResponseRetAnyUriResult(String value) {
        return new JAXBElement<String>(_RetAnyUriResponseRetAnyUriResult_QNAME, String.class, RetAnyUriResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "inString", scope = RetString.class)
    public JAXBElement<String> createRetStringInString(String value) {
        return new JAXBElement<String>(_RetStringInString_QNAME, String.class, RetString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetStringResult", scope = RetStringResponse.class)
    public JAXBElement<String> createRetStringResponseRetStringResult(String value) {
        return new JAXBElement<String>(_RetStringResponseRetStringResult_QNAME, String.class, RetStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetQNameResult", scope = RetQNameResponse.class)
    public JAXBElement<QName> createRetQNameResponseRetQNameResult(QName value) {
        return new JAXBElement<QName>(_RetQNameResponseRetQNameResult_QNAME, QName.class, RetQNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "inQName", scope = RetQName.class)
    public JAXBElement<QName> createRetQNameInQName(QName value) {
        return new JAXBElement<QName>(_RetQNameInQName_QNAME, QName.class, RetQName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetAnyTypeResult", scope = RetAnyTypeResponse.class)
    public JAXBElement<Object> createRetAnyTypeResponseRetAnyTypeResult(Object value) {
        return new JAXBElement<Object>(_RetAnyTypeResponseRetAnyTypeResult_QNAME, Object.class, RetAnyTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "inObject", scope = RetAnyType.class)
    public JAXBElement<Object> createRetAnyTypeInObject(Object value) {
        return new JAXBElement<Object>(_RetAnyTypeInObject_QNAME, Object.class, RetAnyType.class, value);
    }

}
