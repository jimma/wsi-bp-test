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
package org.jboss.test.ws.jaxws.bp12.wsa.test1197;

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
 * generated in the org.jboss.test.ws.jaxws.bp12.wsa.test1197 package. 
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
    private final static QName _Long_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "long");
    private final static QName _SignatureOutHeaderMember_QNAME = new QName("http://example.org/signature", "SignatureOutHeaderMember");
    private final static QName _Float_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "float");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "anyURI");
    private final static QName _QName_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "QName");
    private final static QName _DateTime_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "dateTime");
    private final static QName _Boolean_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "boolean");
    private final static QName _SignatureOut_QNAME = new QName("http://example.org/signature", "SignatureOut");
    private final static QName _SignatureInHeader_QNAME = new QName("http://example.org/signature", "SignatureInHeader");
    private final static QName _SignatureIn_QNAME = new QName("http://example.org/signature", "SignatureIn");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Short_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "short");
    private final static QName _SignatureInHeaderMember_QNAME = new QName("http://example.org/signature", "SignatureInHeaderMember");
    private final static QName _Byte_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "double");
    private final static QName _Decimal_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "decimal");
    private final static QName _Int_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "int");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _AnyType_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _SignatureHeaderFaultContract_QNAME = new QName("http://example.org/signature", "SignatureHeaderFaultContract");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _SignatureOutHeader_QNAME = new QName("http://example.org/signature", "SignatureOutHeader");
    private final static QName _Duration_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.example.com/2003/10/Serialization/", "string");
    private final static QName _SignatureInMultipartMessageSignatureInFirstPart_QNAME = new QName("http://example.org/signature", "SignatureInFirstPart");
    private final static QName _SignatureInMultipartMessageSignatureInSecondPart_QNAME = new QName("http://example.org/signature", "SignatureInSecondPart");
    private final static QName _SignatureHeaderFaultContractFaultAdditionalText_QNAME = new QName("http://example.org/signature", "FaultAdditionalText");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.test.ws.jaxws.bp12.wsa.test1197
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignatureHeaderFaultContract }
     * 
     */
    public SignatureHeaderFaultContract createSignatureHeaderFaultContract() {
        return new SignatureHeaderFaultContract();
    }

    /**
     * Create an instance of {@link SignatureInMultipartMessage }
     * 
     */
    public SignatureInMultipartMessage createSignatureInMultipartMessage() {
        return new SignatureInMultipartMessage();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/signature", name = "SignatureOutHeaderMember")
    public JAXBElement<String> createSignatureOutHeaderMember(String value) {
        return new JAXBElement<String>(_SignatureOutHeaderMember_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/signature", name = "SignatureOut")
    public JAXBElement<String> createSignatureOut(String value) {
        return new JAXBElement<String>(_SignatureOut_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/signature", name = "SignatureInHeader")
    public JAXBElement<String> createSignatureInHeader(String value) {
        return new JAXBElement<String>(_SignatureInHeader_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/signature", name = "SignatureIn")
    public JAXBElement<String> createSignatureIn(String value) {
        return new JAXBElement<String>(_SignatureIn_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "http://example.org/signature", name = "SignatureInHeaderMember")
    public JAXBElement<String> createSignatureInHeaderMember(String value) {
        return new JAXBElement<String>(_SignatureInHeaderMember_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureHeaderFaultContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/signature", name = "SignatureHeaderFaultContract")
    public JAXBElement<SignatureHeaderFaultContract> createSignatureHeaderFaultContract(SignatureHeaderFaultContract value) {
        return new JAXBElement<SignatureHeaderFaultContract>(_SignatureHeaderFaultContract_QNAME, SignatureHeaderFaultContract.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/signature", name = "SignatureOutHeader")
    public JAXBElement<String> createSignatureOutHeader(String value) {
        return new JAXBElement<String>(_SignatureOutHeader_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.example.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/signature", name = "SignatureInFirstPart", scope = SignatureInMultipartMessage.class)
    public JAXBElement<String> createSignatureInMultipartMessageSignatureInFirstPart(String value) {
        return new JAXBElement<String>(_SignatureInMultipartMessageSignatureInFirstPart_QNAME, String.class, SignatureInMultipartMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/signature", name = "SignatureInSecondPart", scope = SignatureInMultipartMessage.class)
    public JAXBElement<String> createSignatureInMultipartMessageSignatureInSecondPart(String value) {
        return new JAXBElement<String>(_SignatureInMultipartMessageSignatureInSecondPart_QNAME, String.class, SignatureInMultipartMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/signature", name = "FaultAdditionalText", scope = SignatureHeaderFaultContract.class)
    public JAXBElement<String> createSignatureHeaderFaultContractFaultAdditionalText(String value) {
        return new JAXBElement<String>(_SignatureHeaderFaultContractFaultAdditionalText_QNAME, String.class, SignatureHeaderFaultContract.class, value);
    }

}
