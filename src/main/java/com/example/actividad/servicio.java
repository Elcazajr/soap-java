package com.example.actividad;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name="servicio", targetNamespace="utez")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class servicio {
    @WebMethod(operationName = "devuelveMensaje")
    public String devuelveMensaje(@WebParam String valor) {
        return "Hola" + valor;
    }


    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7777/servicio", new servicio());
    }
}
