/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.DAO;
import model.Vehiculo;

/**
 *
 * @author Alex
 */
public class ModificarVehiculoAction extends ActionSupport {
    
    
    private String numPlaca;
    
    public ModificarVehiculoAction() {
    }
    
    public String execute() throws Exception {
         if (numPlaca == null) {
            return INPUT;
        }

        DAO dao = new DAO();
        boolean modificado = dao.updateVehiculo(numPlaca);

        return modificado ? SUCCESS : ERROR;
    }
    
}
