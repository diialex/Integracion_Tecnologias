/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import model.DAO;

/**
 *
 * @author jsaco
 */
public class ModificarAlquilerAction extends ActionSupport {
    
    private Long id;
    
    public ModificarAlquilerAction() {
    }
    
    public String execute() {
        if (id == null) {
            return INPUT;
        }

        DAO dao = new DAO();
        boolean modificado = dao.updateAlquiler(id);

        return modificado ? SUCCESS : ERROR;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
}
