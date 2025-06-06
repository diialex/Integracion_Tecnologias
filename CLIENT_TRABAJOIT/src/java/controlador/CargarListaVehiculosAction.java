package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import controller.Vehiculo;

/**
 *
 * @author jsaco
 */
public class CargarListaVehiculosAction extends ActionSupport {
    
    private List<Vehiculo> listaVehiculos;
    
    public CargarListaVehiculosAction() {
    }
    
    @Override
    public String execute() throws Exception {
        controller.VehiculosController_Service service = new controller.VehiculosController_Service();
        controller.VehiculosController port = service.getVehiculosControllerPort();
        
        this.setListaVehiculos(port.getVehiculos());
        
        if(listaVehiculos == null){
            return INPUT;
        }else{
            return SUCCESS;
        }
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    
    
}
