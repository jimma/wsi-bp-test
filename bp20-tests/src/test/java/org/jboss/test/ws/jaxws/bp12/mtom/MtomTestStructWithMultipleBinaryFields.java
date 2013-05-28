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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MtomTestStructWithMultipleBinaryFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MtomTestStructWithMultipleBinaryFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstBinaryValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="FourthBinaryValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondBinaryValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ThirdBinaryValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MtomTestStructWithMultipleBinaryFields", propOrder = {
    "firstBinaryValue",
    "fourthBinaryValue",
    "name",
    "secondBinaryValue",
    "thirdBinaryValue"
})
public class MtomTestStructWithMultipleBinaryFields {

    @XmlElementRef(name = "FirstBinaryValue", namespace = "http://xmlsoap.org/Ping", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> firstBinaryValue;
    @XmlElementRef(name = "FourthBinaryValue", namespace = "http://xmlsoap.org/Ping", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> fourthBinaryValue;
    @XmlElementRef(name = "Name", namespace = "http://xmlsoap.org/Ping", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "SecondBinaryValue", namespace = "http://xmlsoap.org/Ping", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> secondBinaryValue;
    @XmlElementRef(name = "ThirdBinaryValue", namespace = "http://xmlsoap.org/Ping", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> thirdBinaryValue;

    /**
     * Gets the value of the firstBinaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFirstBinaryValue() {
        return firstBinaryValue;
    }

    /**
     * Sets the value of the firstBinaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFirstBinaryValue(JAXBElement<byte[]> value) {
        this.firstBinaryValue = value;
    }

    /**
     * Gets the value of the fourthBinaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFourthBinaryValue() {
        return fourthBinaryValue;
    }

    /**
     * Sets the value of the fourthBinaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFourthBinaryValue(JAXBElement<byte[]> value) {
        this.fourthBinaryValue = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the secondBinaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSecondBinaryValue() {
        return secondBinaryValue;
    }

    /**
     * Sets the value of the secondBinaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSecondBinaryValue(JAXBElement<byte[]> value) {
        this.secondBinaryValue = value;
    }

    /**
     * Gets the value of the thirdBinaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getThirdBinaryValue() {
        return thirdBinaryValue;
    }

    /**
     * Sets the value of the thirdBinaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setThirdBinaryValue(JAXBElement<byte[]> value) {
        this.thirdBinaryValue = value;
    }

}
