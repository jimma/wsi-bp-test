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
package org.jboss.test.ws.jaxws.bp20.complexdoc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetArrayInt1DResult" type="{http://schemas.example.com/2003/10/Serialization/Arrays}IntArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retArrayInt1DResult"
})
@XmlRootElement(name = "RetArrayInt1DResponse")
public class RetArrayInt1DResponse {

    @XmlElementRef(name = "RetArrayInt1DResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<IntArray> retArrayInt1DResult;

    /**
     * Gets the value of the retArrayInt1DResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntArray }{@code >}
     *     
     */
    public JAXBElement<IntArray> getRetArrayInt1DResult() {
        return retArrayInt1DResult;
    }

    /**
     * Sets the value of the retArrayInt1DResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntArray }{@code >}
     *     
     */
    public void setRetArrayInt1DResult(JAXBElement<IntArray> value) {
        this.retArrayInt1DResult = value;
    }

}
