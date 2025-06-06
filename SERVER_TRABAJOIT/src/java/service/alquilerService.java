/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.*;
import model.*;

/**
 *
 * @author jsaco
 */
public class alquilerService {
    
    private static DAO dao;
    private static final String SUCCESS = "SUCCESS";
    private static final String ERROR = "ERROR";
    
    public alquilerService(){
        
    }
    
    public String newAlquiler(Cliente cliente, Vehiculo vehiculo, Date fechafin, Integer estadoalquiler){
        Alquiler nuevoAlquiler = new Alquiler(cliente, vehiculo, fechafin, estadoalquiler);
        boolean insertado = dao.addAlquiler(nuevoAlquiler);
        
        if(insertado){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }
    /*
    public void newFactura(Alquiler al, Cliente cl, Date fecha, Float importe, Long iban){
        dao.newFactura(al, cl, fecha, importe, iban);
    }
    
    public void newPayMethod(Cliente cliente, Long num, Date fechaexp, String banco){
        dao.newPayMethod(cliente, num, fechaexp, banco);
    }
    
    public void removeFactura(Factura f){
        dao.removeFactura(f);
    }
    public void removePayMethod(Metodopago m){
        dao.removePayMethod(m);
    }
    public void updatePayMethod(Metodopago m){
        dao.updatePayMethod(m);
    }
    */
}
