/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.Alquiler;
import model.DAO;
import model.Vehiculo;

/**
 *
 * @author jsaco
 */
public class CrearNuevoAlquilerAction extends ActionSupport {
    
    private String numplaca;
    
    public CrearNuevoAlquilerAction() {
    }
    
    @Override
    public String execute() throws Exception {
        DAO dao = new DAO();
        Vehiculo v = dao.getVehiculo(numplaca);
        Alquiler nuevoAlquiler = new Alquiler(null, v, null, 0);
        boolean insertado = dao.addAlquiler(nuevoAlquiler);
        
        if(insertado && numplaca!=null){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }

    public String getNumplaca() {
        return numplaca;
    }

    public void setNumplaca(String numplaca) {
        this.numplaca = numplaca;
    }
    
    
    
}
