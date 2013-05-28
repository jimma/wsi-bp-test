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
package org.jboss.test.ws.jaxws.bp12.mtom.utf16;



@javax.jws.WebService(serviceName = "MtomExtendedService", 
                      portName = "CustomBinding_IMtomExtendedContract", 
                      targetNamespace = "http://tempuri.org/", 
                      wsdlLocation = "WEB-INF/wsdl/Soap12MtomUtf16.wsdl", 
                      endpointInterface = "org.jboss.test.ws.jaxws.bp12.mtom.utf16.IMtomExtendedContract")
public class MtomExtendedContractImpl implements IMtomExtendedContract {

	private ObjectFactory objFactory = new ObjectFactory();
	public Base64BinaryArray echoStringArrayAsBinaryArray(StringArray stringArray) {
		Base64BinaryArray result = new Base64BinaryArray();
		for (String str : stringArray.getString()) {
			System.out.println(str);
			result.getBase64Binary().add(str.getBytes());
		}
		return result;

	}

	public String echoBinaryFieldAsString(MtomTestStruct s) {
		String name = s.getName().getValue();
		String value = new String(s.getArray().getValue());
		return name + value;

	}

	public StringArray echoBinaryArrayAsStringArray(Base64BinaryArray binaryArray) {
		StringArray result = new StringArray();
		for (byte[] item : binaryArray.getBase64Binary()) {
			result.getString().add(new String(item));
		}
		return result;
	}

	public byte[] echoStringAsBinary(String s) {
		return s.getBytes();

	}

	public MtomTestStructWithMultipleBinaryFields echoStringArrayAsBinaryFields(
			StringArray textArray) {
		MtomTestStructWithMultipleBinaryFields result = new MtomTestStructWithMultipleBinaryFields();
		result.setName(objFactory.createMtomTestStructWithMultipleBinaryFieldsName(textArray.getString().get(0)));
		result.setFirstBinaryValue(
				objFactory.createMtomTestStructWithMultipleBinaryFieldsFirstBinaryValue(textArray.getString().get(1).getBytes()));
		result.setSecondBinaryValue(
				objFactory.createMtomTestStructWithMultipleBinaryFieldsSecondBinaryValue(textArray.getString().get(2).getBytes()));
		result.setThirdBinaryValue(
				objFactory.createMtomTestStructWithMultipleBinaryFieldsThirdBinaryValue(textArray.getString().get(3).getBytes()));
		result.setFourthBinaryValue(
				objFactory.createMtomTestStructWithMultipleBinaryFieldsFourthBinaryValue(textArray.getString().get(4).getBytes()));
		return result;
	}

	public String echoBinaryAsString(byte[] array) {
		return new String(array);

	}

	public EchoBinaryHeaderResponse echoBinaryHeader(EchoBinaryHeaderRequest parameters, javax.xml.ws.Holder<byte[]> headerData) {
		EchoBinaryHeaderResponse result = new EchoBinaryHeaderResponse();
		result.setBodyData(parameters.getBodyData());
		return result;

	}

}