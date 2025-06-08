package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.Alquiler;
import model.Vehiculo;
import model.DAO;

/**
 *
 * @author jsaco
 */
public class CargarListasParaAlquilerAction extends ActionSupport {
    
    private List<Vehiculo> listaVehiculos;
    private List<Alquiler> listaAlquileres;
    
    public CargarListasParaAlquilerAction() {
    }
    
    @Override
    public String execute() throws Exception {
        DAO dao = new DAO();
        this.setListaVehiculos(dao.getVehiculos());
        this.setListaAlquileres(dao.getAlquileres());
        
        return SUCCESS;
        
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(List<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }
    
    
    
}
