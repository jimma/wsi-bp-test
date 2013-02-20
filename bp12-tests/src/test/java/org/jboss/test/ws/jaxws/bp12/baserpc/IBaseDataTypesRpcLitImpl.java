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

import java.math.BigDecimal;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;



@javax.jws.WebService(
                      serviceName = "BaseDataTypesRpcLitService",
                      portName = "CustomBinding_IBaseDataTypesRpcLit",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "WEB-INF/wsdl/BaseDataTypesRpcLit.wsdl",
                      endpointInterface = "org.jboss.test.ws.jaxws.bp12.baserpc.IBaseDataTypesRpcLit")
                      
public class IBaseDataTypesRpcLitImpl implements IBaseDataTypesRpcLit {
    public int retInt(int inInt) { 
        return inInt;
    }

    public XMLGregorianCalendar retDateTime(XMLGregorianCalendar inDateTime) { 
        return inDateTime;
    }

    public long retUnsignedInt(long inUInt) { 
        return inUInt;
    }

    public Duration retDuration(Duration inTimeSpan) { 
        return inTimeSpan;
    }

    public BigDecimal retDecimal(BigDecimal inDecimal) { 
        return inDecimal;
    }


    public double retDouble(double inDouble) { 
        return inDouble;
    }

    public float retFloat(float inFloat) { 
       return inFloat;
    }

    public long retLong(long inLong) { 
         return inLong;
    }

    public byte[] retBase64Binary(byte[] inByteArray) { 
        return inByteArray;
    }

    public String retString(String inString) { 
        return inString;
    }

    public short retShort(short inShort) { 
        return inShort;
    }

    public byte retByte(byte inSByte) { 
       return inSByte;
    }

    public Object retAnyType(java.lang.Object inObject) { 
        return inObject;
    }

    public short retUnsignedByte(short inByte) { 
        return inByte;
    }

    public java.math.BigInteger retUnsignedLong(java.math.BigInteger inULong) { 
       return inULong;
    }


    public int retUnsignedShort(int inUShort) { 
       return inUShort;
    }

    public QName retQName(QName inQName) { 
       return inQName;
    }


    public boolean retBoolean(boolean inBool) { 
        return inBool;
    }

    public java.lang.String retAnyUri(java.lang.String inUri) { 
        return inUri;
    }

}
