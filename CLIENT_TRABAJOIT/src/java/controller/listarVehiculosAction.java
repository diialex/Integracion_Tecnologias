/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.Vehiculo;

/**
 *
 * @author Alex
 */
public class listarVehiculosAction extends ActionSupport {
    
    private List<service.Vehiculo> vehiculosAux;
    private List<Vehiculo> vehiculos;
    
    public listarVehiculosAction() {
    }
    
    public String execute() throws Exception {
             
         //rescatar dni de la vista anterior

        try {
            /*
            service.alquilerService ser = new service.alquilerService();
            facturas = ser.listFacturas();*/
            
            service.VehiculoController_Service service = new service.VehiculoController_Service();
            service.VehiculoController port = service.getVehiculosControllerPort();
            vehiculosAux = port.getVehiculos();
            //vehiculos = port.listFacturasClient(dni);*/
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
