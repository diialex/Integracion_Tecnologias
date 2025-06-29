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
import model.DAO;

/**
 *
 * @author Alex
 */
public class EliminarVehiculoAction extends ActionSupport {
    
    private String numPlaca;
    
    public EliminarVehiculoAction() {
    }
    
    public String execute() throws Exception {
        if (numPlaca == null) {
            return INPUT;
        }

        DAO dao = new DAO();
        boolean eliminado = dao.removeVehiculo(numPlaca);

        return eliminado ? SUCCESS : ERROR;
    }
    
    public String getnumPlaca() {
        return numPlaca;
    }

    public void setnumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

}
