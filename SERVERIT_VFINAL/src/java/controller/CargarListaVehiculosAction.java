package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.Vehiculo;
import model.DAO;

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
        DAO dao = new DAO();
        this.setListaVehiculos(dao.getVehiculos());
        
        return SUCCESS;
        
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
}
