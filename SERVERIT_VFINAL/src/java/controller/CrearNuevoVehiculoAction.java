/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;
import model.DAO;
import model.Vehiculo;

/**
 *
 * @author Alex
 */
public class CrearNuevoVehiculoAction extends ActionSupport {
    
    
    private Vehiculo v;
    
    public CrearNuevoVehiculoAction() {
    }
    
    @Override
    public String execute() throws Exception {
        DAO dao = new DAO();
        Vehiculo veh = new Vehiculo(v.getModelo(),v.getMarca(),v.getTipo(),v.getNumplaca(),v.getEstadodisponibilidad());
        boolean insertado = dao.addVehiculo(veh);
        
        if(insertado){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }

    public Vehiculo getVehiculo() {
        return v;
    }

    public void setVehiculo(Vehiculo veh) {
        v = veh;
    }
}
