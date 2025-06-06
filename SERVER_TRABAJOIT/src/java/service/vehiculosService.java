/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Date;
import java.util.List;
import model.Alquiler;
import model.Cliente;
import model.DAO;
import model.Vehiculo;

/**
 *
 * @author jsaco
 */
public class vehiculosService {
    
    private DAO dao;
    
    public vehiculosService(){
        dao = new DAO();
    }
    
    public List<Vehiculo> consultaVehiculos(){
        List<Vehiculo> listaVehiculos = dao.getVehiculos();
        return listaVehiculos;
    }
    
}
