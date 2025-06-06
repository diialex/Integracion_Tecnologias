/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
import model.*;

/**
 *
 * @author Ariel
 */
public class facturasAction extends ActionSupport {

    private List<service.Factura> facturasAux;
    private List<Factura> facturas;
    private String dni;

    public facturasAction() {
    }

    public String execute() throws Exception {
        
        //rescatar dni de la vista anterior

        try {
            /*
            service.alquilerService ser = new service.alquilerService();
            facturas = ser.listFacturas();*/
            
            service.AlquilerController_Service service = new service.AlquilerController_Service();
            service.AlquilerController port = service.getAlquilerControllerPort();
            facturasAux = port.listFacturas();
            //facturas = port.listFacturasClient(dni);*/
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        if (facturas != null) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
}
