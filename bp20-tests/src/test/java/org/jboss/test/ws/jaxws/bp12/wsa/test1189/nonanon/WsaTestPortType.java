package org.jboss.test.ws.jaxws.bp12.wsa.test1189.nonanon;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

@WebService(targetNamespace = "http://example.org", name = "wsaTestPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsaTestPortType {

    @Oneway
    @Action(input = "http://example.org/action/notify")
    @WebMethod(operationName = "Notify", action = "http://example.org/action/notify")
    public void notify(
        @WebParam(partName = "notify", name = "notify", targetNamespace = "http://example.org/notify")
        java.lang.String notify
    );

    @WebResult(name = "echoOut", targetNamespace = "http://example.org/echo", partName = "echoOut")
    @Action(input = "http://example.org/action/echoIn", output = "http://example.org/action/echoOut")
    @WebMethod(operationName = "Echo", action = "http://example.org/action/echoIn")
    public java.lang.String echo(
        @WebParam(partName = "echoIn", name = "echoIn", targetNamespace = "http://example.org/echo")
        java.lang.String echoIn
    );
}
