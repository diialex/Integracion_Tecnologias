/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.Vehiculo;

/**
 *
 * @author Alex
 */
public class datosVehiculoAction extends ActionSupport {
    
    
    private service.Vehiculo vehiculoAux;
    private Vehiculo vehiculo;
    
    
    public datosVehiculoAction() {
    }
    
    public String execute() throws Exception {
        
        try {
            /*
            service.alquilerService ser = new service.alquilerService();
            facturas = ser.listFacturas();*/
            
            service.VehiculoController_Service service = new service.VehiculoController_Service();
            service.VehiculoController port = service.getVehiculosControllerPort();
            vehiculoAux = port.getVehiculo();
            //vehiculo = port.listFacturasClient(dni);*/
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        if (vehiculos != null) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
}
