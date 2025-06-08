/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.Alquiler;
import model.Cliente;
import model.DAO;
import model.Vehiculo;

/**
 *
 * @author jsaco
 */
public class CargarListasParaUpdateAction extends ActionSupport {
    
    public CargarListasParaUpdateAction() {
    }
    
    private List<Vehiculo> listaVehiculos;
    private List<Cliente> listaClientes;
    private Long id;
    
    @Override
    public String execute() throws Exception {
        DAO dao = new DAO();
        this.setListaVehiculos(dao.getVehiculos());
        this.setListaClientes(dao.getClientes());
        
        return SUCCESS;
        
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    
    
    
    
    
    
    
}
