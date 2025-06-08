/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.DAO;
import model.Usuario;

/**
 *
 * @author aleep
 */
public class EliminarUsuarioAction extends ActionSupport {
    
    String nick;
    String contrasena;
    public EliminarUsuarioAction() {
    }
    
    public String execute() throws Exception {
        DAO dao= new DAO();
        dao.removeUsuario(nick, contrasena);
        return SUCCESS;
    }
    
}
