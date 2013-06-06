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
package org.jboss.test.ws.jaxws.bp20.mtom.utf16;

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
 * generated in the org.jboss.test.ws.jaxws.bp12.mtom.utf16 package. 
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
    private final static QName _MtomTestStructWithMultipleBinaryFields_QNAME = new QName("http://xmlsoap.org/Ping", "MtomTestStructWithMultipleBinaryFields");
    private final static QName _StringValue_QNAME = new QName("http://xmlsoap.org/Ping", "StringValue");
    private final static QName _Long_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "long");
    private final static QName _Double_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "float");
    private final static QName _Decimal_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "decimal");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "anyURI");
    private final static QName _QName_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "QName");
    private final static QName _Int_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "int");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _AnyType_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "anyType");
    private final static QName _Char_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "char");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "dateTime");
    private final static QName _Boolean_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "boolean");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _HeaderData_QNAME = new QName("http://xmlsoap.org/Ping", "HeaderData");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Duration_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "duration");
    private final static QName _Short_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "guid");
    private final static QName _StringArray_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/Arrays", "stringArray");
    private final static QName _MtomTestStruct_QNAME = new QName("http://xmlsoap.org/Ping", "MtomTestStruct");
    private final static QName _ByteArray_QNAME = new QName("http://xmlsoap.org/Ping", "ByteArray");
    private final static QName _String_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "string");
    private final static QName _Base64BinaryArray_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/Arrays", "base64BinaryArray");
    private final static QName _Byte_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "byte");
    private final static QName _EchoStringArrayAsBinaryFieldsTextArray_QNAME = new QName("http://xmlsoap.org/Ping", "textArray");
    private final static QName _EchoBinaryAsStringArray_QNAME = new QName("http://xmlsoap.org/Ping", "array");
    private final static QName _EchoBinaryFieldAsStringS_QNAME = new QName("http://xmlsoap.org/Ping", "s");
    private final static QName _EchoStringAsBinaryResponseEchoStringAsBinaryResult_QNAME = new QName("http://xmlsoap.org/Ping", "EchoStringAsBinaryResult");
    private final static QName _EchoStringArrayAsBinaryArrayResponseEchoStringArrayAsBinaryArrayResult_QNAME = new QName("http://xmlsoap.org/Ping", "EchoStringArrayAsBinaryArrayResult");
    private final static QName _EchoStringArrayAsBinaryFieldsResponseEchoStringArrayAsBinaryFieldsResult_QNAME = new QName("http://xmlsoap.org/Ping", "EchoStringArrayAsBinaryFieldsResult");
    private final static QName _EchoStringArrayAsBinaryArrayStringArray_QNAME = new QName("http://xmlsoap.org/Ping", "stringArray");
    private final static QName _EchoBinaryArrayAsStringArrayBinaryArray_QNAME = new QName("http://xmlsoap.org/Ping", "BinaryArray");
    private final static QName _MtomTestStructWithMultipleBinaryFieldsThirdBinaryValue_QNAME = new QName("http://xmlsoap.org/Ping", "ThirdBinaryValue");
    private final static QName _MtomTestStructWithMultipleBinaryFieldsFirstBinaryValue_QNAME = new QName("http://xmlsoap.org/Ping", "FirstBinaryValue");
    private final static QName _MtomTestStructWithMultipleBinaryFieldsFourthBinaryValue_QNAME = new QName("http://xmlsoap.org/Ping", "FourthBinaryValue");
    private final static QName _MtomTestStructWithMultipleBinaryFieldsSecondBinaryValue_QNAME = new QName("http://xmlsoap.org/Ping", "SecondBinaryValue");
    private final static QName _MtomTestStructWithMultipleBinaryFieldsName_QNAME = new QName("http://xmlsoap.org/Ping", "Name");
    private final static QName _EchoBinaryArrayAsStringArrayResponseEchoBinaryArrayAsStringArrayResult_QNAME = new QName("http://xmlsoap.org/Ping", "EchoBinaryArrayAsStringArrayResult");
    private final static QName _EchoBinaryHeaderResponseBodyData_QNAME = new QName("http://xmlsoap.org/Ping", "BodyData");
    private final static QName _EchoBinaryFieldAsStringResponseEchoBinaryFieldAsStringResult_QNAME = new QName("http://xmlsoap.org/Ping", "EchoBinaryFieldAsStringResult");
    private final static QName _EchoBinaryAsStringResponseEchoBinaryAsStringResult_QNAME = new QName("http://xmlsoap.org/Ping", "EchoBinaryAsStringResult");
    private final static QName _MtomTestStructArray_QNAME = new QName("http://xmlsoap.org/Ping", "Array");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.test.ws.jaxws.bp12.mtom.utf16
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EchoStringAsBinary }
     * 
     */
    public EchoStringAsBinary createEchoStringAsBinary() {
        return new EchoStringAsBinary();
    }

    /**
     * Create an instance of {@link EchoStringArrayAsBinaryFieldsResponse }
     * 
     */
    public EchoStringArrayAsBinaryFieldsResponse createEchoStringArrayAsBinaryFieldsResponse() {
        return new EchoStringArrayAsBinaryFieldsResponse();
    }

    /**
     * Create an instance of {@link MtomTestStructWithMultipleBinaryFields }
     * 
     */
    public MtomTestStructWithMultipleBinaryFields createMtomTestStructWithMultipleBinaryFields() {
        return new MtomTestStructWithMultipleBinaryFields();
    }

    /**
     * Create an instance of {@link EchoStringArrayAsBinaryArrayResponse }
     * 
     */
    public EchoStringArrayAsBinaryArrayResponse createEchoStringArrayAsBinaryArrayResponse() {
        return new EchoStringArrayAsBinaryArrayResponse();
    }

    /**
     * Create an instance of {@link Base64BinaryArray }
     * 
     */
    public Base64BinaryArray createBase64BinaryArray() {
        return new Base64BinaryArray();
    }

    /**
     * Create an instance of {@link EchoBinaryArrayAsStringArray }
     * 
     */
    public EchoBinaryArrayAsStringArray createEchoBinaryArrayAsStringArray() {
        return new EchoBinaryArrayAsStringArray();
    }

    /**
     * Create an instance of {@link EchoBinaryHeaderResponse }
     * 
     */
    public EchoBinaryHeaderResponse createEchoBinaryHeaderResponse() {
        return new EchoBinaryHeaderResponse();
    }

    /**
     * Create an instance of {@link EchoBinaryAsStringResponse }
     * 
     */
    public EchoBinaryAsStringResponse createEchoBinaryAsStringResponse() {
        return new EchoBinaryAsStringResponse();
    }

    /**
     * Create an instance of {@link EchoBinaryHeaderRequest }
     * 
     */
    public EchoBinaryHeaderRequest createEchoBinaryHeaderRequest() {
        return new EchoBinaryHeaderRequest();
    }

    /**
     * Create an instance of {@link EchoBinaryFieldAsStringResponse }
     * 
     */
    public EchoBinaryFieldAsStringResponse createEchoBinaryFieldAsStringResponse() {
        return new EchoBinaryFieldAsStringResponse();
    }

    /**
     * Create an instance of {@link EchoBinaryArrayAsStringArrayResponse }
     * 
     */
    public EchoBinaryArrayAsStringArrayResponse createEchoBinaryArrayAsStringArrayResponse() {
        return new EchoBinaryArrayAsStringArrayResponse();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link EchoStringArrayAsBinaryFields }
     * 
     */
    public EchoStringArrayAsBinaryFields createEchoStringArrayAsBinaryFields() {
        return new EchoStringArrayAsBinaryFields();
    }

    /**
     * Create an instance of {@link MtomTestStruct }
     * 
     */
    public MtomTestStruct createMtomTestStruct() {
        return new MtomTestStruct();
    }

    /**
     * Create an instance of {@link EchoBinaryAsString }
     * 
     */
    public EchoBinaryAsString createEchoBinaryAsString() {
        return new EchoBinaryAsString();
    }

    /**
     * Create an instance of {@link EchoStringArrayAsBinaryArray }
     * 
     */
    public EchoStringArrayAsBinaryArray createEchoStringArrayAsBinaryArray() {
        return new EchoStringArrayAsBinaryArray();
    }

    /**
     * Create an instance of {@link EchoStringAsBinaryResponse }
     * 
     */
    public EchoStringAsBinaryResponse createEchoStringAsBinaryResponse() {
        return new EchoStringAsBinaryResponse();
    }

    /**
     * Create an instance of {@link EchoBinaryFieldAsString }
     * 
     */
    public EchoBinaryFieldAsString createEchoBinaryFieldAsString() {
        return new EchoBinaryFieldAsString();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MtomTestStructWithMultipleBinaryFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "MtomTestStructWithMultipleBinaryFields")
    public JAXBElement<MtomTestStructWithMultipleBinaryFields> createMtomTestStructWithMultipleBinaryFields(MtomTestStructWithMultipleBinaryFields value) {
        return new JAXBElement<MtomTestStructWithMultipleBinaryFields>(_MtomTestStructWithMultipleBinaryFields_QNAME, MtomTestStructWithMultipleBinaryFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "StringValue")
    public JAXBElement<String> createStringValue(String value) {
        return new JAXBElement<String>(_StringValue_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
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
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "HeaderData")
    public JAXBElement<byte[]> createHeaderData(byte[] value) {
        return new JAXBElement<byte[]>(_HeaderData_QNAME, byte[].class, null, ((byte[]) value));
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
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/Arrays", name = "stringArray")
    public JAXBElement<StringArray> createStringArray(StringArray value) {
        return new JAXBElement<StringArray>(_StringArray_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MtomTestStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "MtomTestStruct")
    public JAXBElement<MtomTestStruct> createMtomTestStruct(MtomTestStruct value) {
        return new JAXBElement<MtomTestStruct>(_MtomTestStruct_QNAME, MtomTestStruct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "ByteArray")
    public JAXBElement<byte[]> createByteArray(byte[] value) {
        return new JAXBElement<byte[]>(_ByteArray_QNAME, byte[].class, null, ((byte[]) value));
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64BinaryArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/Arrays", name = "base64BinaryArray")
    public JAXBElement<Base64BinaryArray> createBase64BinaryArray(Base64BinaryArray value) {
        return new JAXBElement<Base64BinaryArray>(_Base64BinaryArray_QNAME, Base64BinaryArray.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "textArray", scope = EchoStringArrayAsBinaryFields.class)
    public JAXBElement<StringArray> createEchoStringArrayAsBinaryFieldsTextArray(StringArray value) {
        return new JAXBElement<StringArray>(_EchoStringArrayAsBinaryFieldsTextArray_QNAME, StringArray.class, EchoStringArrayAsBinaryFields.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "array", scope = EchoBinaryAsString.class)
    public JAXBElement<byte[]> createEchoBinaryAsStringArray(byte[] value) {
        return new JAXBElement<byte[]>(_EchoBinaryAsStringArray_QNAME, byte[].class, EchoBinaryAsString.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MtomTestStruct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "s", scope = EchoBinaryFieldAsString.class)
    public JAXBElement<MtomTestStruct> createEchoBinaryFieldAsStringS(MtomTestStruct value) {
        return new JAXBElement<MtomTestStruct>(_EchoBinaryFieldAsStringS_QNAME, MtomTestStruct.class, EchoBinaryFieldAsString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "EchoStringAsBinaryResult", scope = EchoStringAsBinaryResponse.class)
    public JAXBElement<byte[]> createEchoStringAsBinaryResponseEchoStringAsBinaryResult(byte[] value) {
        return new JAXBElement<byte[]>(_EchoStringAsBinaryResponseEchoStringAsBinaryResult_QNAME, byte[].class, EchoStringAsBinaryResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "s", scope = EchoStringAsBinary.class)
    public JAXBElement<String> createEchoStringAsBinaryS(String value) {
        return new JAXBElement<String>(_EchoBinaryFieldAsStringS_QNAME, String.class, EchoStringAsBinary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64BinaryArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "EchoStringArrayAsBinaryArrayResult", scope = EchoStringArrayAsBinaryArrayResponse.class)
    public JAXBElement<Base64BinaryArray> createEchoStringArrayAsBinaryArrayResponseEchoStringArrayAsBinaryArrayResult(Base64BinaryArray value) {
        return new JAXBElement<Base64BinaryArray>(_EchoStringArrayAsBinaryArrayResponseEchoStringArrayAsBinaryArrayResult_QNAME, Base64BinaryArray.class, EchoStringArrayAsBinaryArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MtomTestStructWithMultipleBinaryFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "EchoStringArrayAsBinaryFieldsResult", scope = EchoStringArrayAsBinaryFieldsResponse.class)
    public JAXBElement<MtomTestStructWithMultipleBinaryFields> createEchoStringArrayAsBinaryFieldsResponseEchoStringArrayAsBinaryFieldsResult(MtomTestStructWithMultipleBinaryFields value) {
        return new JAXBElement<MtomTestStructWithMultipleBinaryFields>(_EchoStringArrayAsBinaryFieldsResponseEchoStringArrayAsBinaryFieldsResult_QNAME, MtomTestStructWithMultipleBinaryFields.class, EchoStringArrayAsBinaryFieldsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "stringArray", scope = EchoStringArrayAsBinaryArray.class)
    public JAXBElement<StringArray> createEchoStringArrayAsBinaryArrayStringArray(StringArray value) {
        return new JAXBElement<StringArray>(_EchoStringArrayAsBinaryArrayStringArray_QNAME, StringArray.class, EchoStringArrayAsBinaryArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64BinaryArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "BinaryArray", scope = EchoBinaryArrayAsStringArray.class)
    public JAXBElement<Base64BinaryArray> createEchoBinaryArrayAsStringArrayBinaryArray(Base64BinaryArray value) {
        return new JAXBElement<Base64BinaryArray>(_EchoBinaryArrayAsStringArrayBinaryArray_QNAME, Base64BinaryArray.class, EchoBinaryArrayAsStringArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "ThirdBinaryValue", scope = MtomTestStructWithMultipleBinaryFields.class)
    public JAXBElement<byte[]> createMtomTestStructWithMultipleBinaryFieldsThirdBinaryValue(byte[] value) {
        return new JAXBElement<byte[]>(_MtomTestStructWithMultipleBinaryFieldsThirdBinaryValue_QNAME, byte[].class, MtomTestStructWithMultipleBinaryFields.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "FirstBinaryValue", scope = MtomTestStructWithMultipleBinaryFields.class)
    public JAXBElement<byte[]> createMtomTestStructWithMultipleBinaryFieldsFirstBinaryValue(byte[] value) {
        return new JAXBElement<byte[]>(_MtomTestStructWithMultipleBinaryFieldsFirstBinaryValue_QNAME, byte[].class, MtomTestStructWithMultipleBinaryFields.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "FourthBinaryValue", scope = MtomTestStructWithMultipleBinaryFields.class)
    public JAXBElement<byte[]> createMtomTestStructWithMultipleBinaryFieldsFourthBinaryValue(byte[] value) {
        return new JAXBElement<byte[]>(_MtomTestStructWithMultipleBinaryFieldsFourthBinaryValue_QNAME, byte[].class, MtomTestStructWithMultipleBinaryFields.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "SecondBinaryValue", scope = MtomTestStructWithMultipleBinaryFields.class)
    public JAXBElement<byte[]> createMtomTestStructWithMultipleBinaryFieldsSecondBinaryValue(byte[] value) {
        return new JAXBElement<byte[]>(_MtomTestStructWithMultipleBinaryFieldsSecondBinaryValue_QNAME, byte[].class, MtomTestStructWithMultipleBinaryFields.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "Name", scope = MtomTestStructWithMultipleBinaryFields.class)
    public JAXBElement<String> createMtomTestStructWithMultipleBinaryFieldsName(String value) {
        return new JAXBElement<String>(_MtomTestStructWithMultipleBinaryFieldsName_QNAME, String.class, MtomTestStructWithMultipleBinaryFields.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "EchoBinaryArrayAsStringArrayResult", scope = EchoBinaryArrayAsStringArrayResponse.class)
    public JAXBElement<StringArray> createEchoBinaryArrayAsStringArrayResponseEchoBinaryArrayAsStringArrayResult(StringArray value) {
        return new JAXBElement<StringArray>(_EchoBinaryArrayAsStringArrayResponseEchoBinaryArrayAsStringArrayResult_QNAME, StringArray.class, EchoBinaryArrayAsStringArrayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "BodyData", scope = EchoBinaryHeaderResponse.class)
    public JAXBElement<String> createEchoBinaryHeaderResponseBodyData(String value) {
        return new JAXBElement<String>(_EchoBinaryHeaderResponseBodyData_QNAME, String.class, EchoBinaryHeaderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "EchoBinaryFieldAsStringResult", scope = EchoBinaryFieldAsStringResponse.class)
    public JAXBElement<String> createEchoBinaryFieldAsStringResponseEchoBinaryFieldAsStringResult(String value) {
        return new JAXBElement<String>(_EchoBinaryFieldAsStringResponseEchoBinaryFieldAsStringResult_QNAME, String.class, EchoBinaryFieldAsStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "EchoBinaryAsStringResult", scope = EchoBinaryAsStringResponse.class)
    public JAXBElement<String> createEchoBinaryAsStringResponseEchoBinaryAsStringResult(String value) {
        return new JAXBElement<String>(_EchoBinaryAsStringResponseEchoBinaryAsStringResult_QNAME, String.class, EchoBinaryAsStringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "BodyData", scope = EchoBinaryHeaderRequest.class)
    public JAXBElement<String> createEchoBinaryHeaderRequestBodyData(String value) {
        return new JAXBElement<String>(_EchoBinaryHeaderResponseBodyData_QNAME, String.class, EchoBinaryHeaderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "Array", scope = MtomTestStruct.class)
    public JAXBElement<byte[]> createMtomTestStructArray(byte[] value) {
        return new JAXBElement<byte[]>(_MtomTestStructArray_QNAME, byte[].class, MtomTestStruct.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlsoap.org/Ping", name = "Name", scope = MtomTestStruct.class)
    public JAXBElement<String> createMtomTestStructName(String value) {
        return new JAXBElement<String>(_MtomTestStructWithMultipleBinaryFieldsName_QNAME, String.class, MtomTestStruct.class, value);
    }

}
