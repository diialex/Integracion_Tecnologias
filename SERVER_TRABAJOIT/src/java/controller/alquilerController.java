/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.*;
import service.alquilerService;

/**
 *
 * @author jsaco
 */
@WebService(serviceName = "alquilerController")
public class alquilerController {

    
    private alquilerService as;
     /**
     * AQUI VAN TODOS LOS WEBSERVICES-MÉTODOS QUE LLAMARÁ EL CLIENTE
     * en este caso relacionados a los casos relacionados con los alquileres
     */
    
    //Solo se usan como metodos de llamada para el cliente, que ejecutan el service correspondiente
    //los service del paquete service son los que llaman al DAO y realizan las acciones en condiciones
    
    @WebMethod(operationName = "createFactura")
    public void createFactura(Alquiler alquiler, Cliente cliente, Date fecha, Float importe, Long iban) {
        as.newFactura(alquiler, cliente, fecha, importe, iban);
    }
    
    @WebMethod(operationName = "listFacturas")
    public List<Factura> listFacturas() {
        List<Factura> facts = as.listFacturas();
        return facts;
    }
    
    
    @WebMethod(operationName = "removeFactura")
    public void createFactura(Factura fac) {
        as.removeFactura(fac);
    }
    
    @WebMethod(operationName = "createPayMethod")
    public void createPayMethod(Cliente cliente, Long num, Date fechaexp, String banco) {
        as.newPayMethod(cliente, num, fechaexp, banco);
    }
    
    @WebMethod(operationName = "removePayMethod")
    public void removePayMethod(Metodopago m) {
        as.removePayMethod(m);
    }
    
    @WebMethod(operationName = "updatePayMethod")
    public void updatePayMethod(Metodopago m) {
        as.updatePayMethod(m);
    }
 }
