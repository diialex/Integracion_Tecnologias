/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.DAO;
import model.Vehiculo;

/**
 *
 * @author Alex
 */
public class ListarVehiculosAction extends ActionSupport {
    
    
    private List<Vehiculo> vehiculos;
    
    
    public ListarVehiculosAction() {
    }
    
   @Override
    public String execute() throws Exception {
        DAO dao = new DAO();
        vehiculos = dao.getAllVehiculos();

        return SUCCESS;
        
    }
    
}
