/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Alquiler;
import model.Calificacion;
import model.Cliente;
import model.Factura;
import model.Metodopago;
import model.Vehiculo;
import service.vehiculosService;

/**
 *
 * @author jsaco
 */
@WebService(serviceName = "vehiculosController")
public class vehiculosController {

    private vehiculosService vs;
     /**
     * AQUI VAN TODOS LOS WEBSERVICES-MÉTODOS QUE LLAMARÁ EL CLIENTE
     * en este caso relacionados a los casos de uso de alta-baja-modif de vehículo por parte del jefe etc
     */
    
    //Solo se usan como metodos de llamada para el cliente, que ejecutan el service correspondiente
    //los service del paquete service son los que llaman al DAO y realizan las acciones en condiciones
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
    @WebMethod(operationName = "createVehiculo")
    public void createVehiculo(String modelo, String marca, String tipo, String numplaca, String estadodisponibilidad, Set calificacions, Set alquilers) {
        vs.newVehiculo(modelo, marca, tipo, numplaca, estadodisponibilidad, calificacions, alquilers);
    }
    
    @WebMethod(operationName = "removeVehiculo")
    public void createFactura(Vehiculo veh) {
        vs.removeVehiculo(veh);
    }
    
    @WebMethod(operationName = "updateVehiculo")
    public void updateVehiculo(Vehiculo v) {
        vs.updateVehiculo(v);
    }
    
    @WebMethod(operationName = "getVehiculos")
    public List<Vehiculo> getVehiculos(){
       return vs.getVehiculos();
    }
    
    
    
    
    @WebMethod(operationName = "createCalificacion")
    public void createCalificacion(Cliente cliente, Vehiculo vehiculo, Integer estrellas, String  valoracion) {
        vs.newCalificacion(cliente, vehiculo, estrellas, valoracion);
    }
    
    @WebMethod(operationName = "removeCalificacion")
    public void removeCalificacion(Calificacion c) {
        vs.removeCalificacion(c);
    }
    
    @WebMethod(operationName = "updateCalificacion")
    public void updateCalificacion(Calificacion c) {
        vs.updateCalificacion(c);
    }
    
    @WebMethod(operationName = "getCalificaciones")
    public List<Calificacion> getCalificaciones(){
       return vs.getCalificaciones();
    }
    
    @WebMethod(operationName = "getClientCalificaciones")
    public List<Calificacion> getClienteCalifs(String dni){
        return vs.getClienteCalifs(dni);
    }
    
    
}
