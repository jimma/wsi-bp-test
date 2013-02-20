
package org.jboss.test.ws.jaxws.bp12.basedoc.utf16;

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
 *         &lt;element name="RetBase64BinaryResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "retBase64BinaryResult"
})
@XmlRootElement(name = "RetBase64BinaryResponse")
public class RetBase64BinaryResponse {

    @XmlElementRef(name = "RetBase64BinaryResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<byte[]> retBase64BinaryResult;

    /**
     * Gets the value of the retBase64BinaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getRetBase64BinaryResult() {
        return retBase64BinaryResult;
    }

    /**
     * Sets the value of the retBase64BinaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setRetBase64BinaryResult(JAXBElement<byte[]> value) {
        this.retBase64BinaryResult = value;
    }

}
