/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
import model.*;

/**
 *
 * @author Ariel
 */
public class facturasAction extends ActionSupport {

    private List <Factura> facturas;
    
    public facturasAction() {
    }
    
    public String execute() throws Exception {
        
        try{
            service.alquilerService ser = new service.alquilerService();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        if(facturas!=null){
            return SUCCESS;
        }else
            return ERROR;
    }
    
}
