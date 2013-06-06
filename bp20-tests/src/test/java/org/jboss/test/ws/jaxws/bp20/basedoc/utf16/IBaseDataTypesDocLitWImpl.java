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
package org.jboss.test.ws.jaxws.bp20.basedoc.utf16;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


@javax.jws.WebService(
                      serviceName = "BaseDataTypesDocLitWService",
                      portName = "CustomBinding_IBaseDataTypesDocLitW",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "WEB-INF/wsdl/BaseDataTypesDocLitWUtf16.wsdl",
                      endpointInterface = "org.jboss.test.ws.jaxws.bp20.basedoc.utf16.IBaseDataTypesDocLitW")
                      
public class IBaseDataTypesDocLitWImpl implements IBaseDataTypesDocLitW {

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retInt(java.lang.Integer  inInt )*
     */
    public Integer retInt(Integer inInt) { 
       return inInt;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retDateTime(javax.xml.datatype.XMLGregorianCalendar  inDateTime )*
     */
    public XMLGregorianCalendar retDateTime(XMLGregorianCalendar inDateTime) { 
        return inDateTime;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retUnsignedInt(java.lang.Long  inUInt )*
     */
    public Long retUnsignedInt(Long inUInt) { 
        return inUInt;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retDuration(javax.xml.datatype.Duration  inTimeSpan )*
     */
    public Duration retDuration(Duration inTimeSpan) { 
       return inTimeSpan;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retDecimal(java.math.BigDecimal  inDecimal )*
     */
    public BigDecimal retDecimal(BigDecimal inDecimal) { 
        return inDecimal;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retDouble(java.lang.Double  inDouble )*
     */
    public Double retDouble(Double inDouble) { 
        return inDouble;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retFloat(java.lang.Float  inFloat )*
     */
    public Float retFloat(Float inFloat) { 
        return inFloat;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retLong(java.lang.Long  inLong )*
     */
    public Long retLong(Long inLong) { 
        return inLong;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retBase64Binary(byte[]  inByteArray )*
     */
    public byte[] retBase64Binary(byte[] inByteArray) { 
        return inByteArray;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retString(java.lang.String  inString )*
     */
    public String retString(String inString) { 
         return inString;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retShort(java.lang.Short  inShort )*
     */
    public Short retShort(Short inShort) { 
         return inShort;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retByte(java.lang.Byte  inSByte )*
     */
    public Byte retByte(Byte inSByte) { 
         return inSByte;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retAnyType(java.lang.Object  inObject )*
     */
    public Object retAnyType(Object inObject) { 
        return inObject;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retUnsignedByte(java.lang.Short  inByte )*
     */
    public Short retUnsignedByte(Short inByte) { 
        return inByte;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retUnsignedLong(java.math.BigInteger  inULong )*
     */
    public BigInteger retUnsignedLong(BigInteger inULong) { 
        return inULong;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retUnsignedShort(java.lang.Integer  inUShort )*
     */
    public Integer retUnsignedShort(Integer inUShort) { 
       return inUShort;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retQName(javax.xml.namespace.QName  inQName )*
     */
    public QName retQName(QName inQName) { 
       return inQName;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retBoolean(java.lang.Boolean  inBool )*
     */
    public Boolean retBoolean(Boolean inBool) { 
        return inBool;
    }

    /* (non-Javadoc)
     * @see org.jboss.test.ws.jaxws.bp12.basedoc.utf16.IBaseDataTypesDocLitW#retAnyUri(java.lang.String  inUri )*
     */
    public String retAnyUri(String inUri) { 
       return inUri;
    }
}
