/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import java.util.Set;
import model.Calificacion;
import model.Cliente;
import model.DAO;
import model.HibernateUtil;
import model.Vehiculo;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author jsaco
 */
public class vehiculosService {
    
    private DAO dao;
    
    public vehiculosService(){
        
    }
    
    
    public List<Vehiculo> getVehiculos(){
        return dao.getVehiculos();
    }
    
    public void newVehiculo(String modelo, String marca, String tipo, String numplaca, String estadodisponibilidad, Set calificacions, Set alquilers){
        dao.newVehiculo( modelo, marca, tipo, numplaca, estadodisponibilidad, calificacions, alquilers);
    }
    
    
    public void removeVehiculo(Vehiculo veh){
        dao.removeVehiculo(veh);
    }
    
    public void updateVehiculo(Vehiculo veh){
        dao.updateVehiculo(veh);
    }
    
    
    
    
    //
    //
    //     _._     _,-'""`-._
    //    (,-.`._,'(       |\`-/|
    //        `-.-' \ )-`( , o o)
    //              `-    \`_`"'-
    //
    //
    //
    //
    
    
    
    public List<Calificacion> getCalificaciones(){
       return dao.getCalificaciones();
    }

    public List<Calificacion> getClienteCalifs(String dni){
        return dao.getClienteCalifs(dni);
    }
    
    public void newCalificacion(Cliente cliente, Vehiculo vehiculo, Integer estrellas, String  valoracion){
        dao.newCalificacion(cliente, vehiculo,  estrellas, valoracion);
    }
    
    
    public void removeCalificacion(Calificacion cal){
        dao.removeCalificacion(cal);
    }
    
    public void updateCalificacion(Calificacion cal){
        dao.updateCalificacion(cal);
    }

    
    
    
    
    
    
    
    
    
}
