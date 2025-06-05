/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;

/**
 *
 * @author Ariel
 */
@WebService(serviceName = "alquilerController", portName = "alquilerControllerPort", endpointInterface = "controller.AlquilerController", targetNamespace = "http://controller/", wsdlLocation = "WEB-INF/wsdl/alquilerService/localhost_8080/SERVER_TRABAJOIT/alquilerController.wsdl")
public class alquilerService {

    public void removePayMethod(controller.Metodopago arg0) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void createPayMethod(controller.Cliente arg0, java.lang.Long arg1, javax.xml.datatype.XMLGregorianCalendar arg2, java.lang.String arg3) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void updatePayMethod(controller.Metodopago arg0) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void createFactura(controller.Alquiler arg0, controller.Cliente arg1, javax.xml.datatype.XMLGregorianCalendar arg2, java.lang.Float arg3, java.lang.Long arg4) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void removeFactura(controller.Alquiler arg0, controller.Cliente arg1, javax.xml.datatype.XMLGregorianCalendar arg2, java.lang.Float arg3, java.lang.Long arg4) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<controller.Factura> listFacturas() {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<controller.Metodopago> listPayMethods() {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
