/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import model.DAO;
import model.Vehiculo;

/**
 *
 * @author Alex
 */
public class DatosVehiculoAction extends ActionSupport {
    
    
    
    private String numPlacaVehiculo;
    private Vehiculo vehiculo;
    private Map<String, Object> session;
    
    public DatosVehiculoAction() {
    }
    
    @Override
    public String execute() throws Exception {
        DAO dao = new DAO();
        if (vehiculo.getNumplaca() != null) {
            vehiculo = dao.getVehiculo(vehiculo.getNumplaca());
            if (vehiculo != null) {
                session.put("vehiculo", vehiculo);
                return SUCCESS;
            } else {
                addActionError("Vehículo no encontrado.");
                return ERROR;
            }
        } else {
            addActionError("ID de vehículo no proporcionado.");
            return ERROR;
        }
    }

    public String getNumPlacaVehiculo() {
        return numPlacaVehiculo;
    }

    public void setNumPlacaVehiculo(String numPlacaVehiculo) {
        this.numPlacaVehiculo = numPlacaVehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
    
}
