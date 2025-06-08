/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.DAO;

/**
 *
 * @author jsaco
 */
public class EliminarAlquilerAction extends ActionSupport {
    
    private Long id;
    
    public EliminarAlquilerAction() {
    }
    
    public String execute() {
        if (id == null) {
            return INPUT;
        }

        DAO dao = new DAO();
        boolean eliminado = dao.removeAlquiler(id);

        return eliminado ? SUCCESS : ERROR;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    
}
