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
 * @author aleep
 */
public class ResetAction extends ActionSupport {
    String nick;
    String nuevaContrasena;
    String correo;
    public ResetAction() {
    }
    
    public String execute() throws Exception {
        DAO dao= new DAO();
        dao.actualizarContra(nick, nuevaContrasena, correo);
        return SUCCESS;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNuevaContrasena() {
        return nuevaContrasena;
    }

    public void setNuevoContrasena(String nuevaContrasena) {
        this.nuevaContrasena = nuevaContrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
   /* public void validate() {
        DAO dao = new DAO();

        if (nick == null || nick.trim().isEmpty()) {
            addFieldError("nick", "El nombre de usuario es obligatorio.");
        } else if (!dao.existeNick(nick)) {
            addFieldError("nick", "El usuario no existe en la base de datos.");
        }

        if (contrasena == null || contrasena.trim().isEmpty()) {
            addFieldError("contrasena", "La nueva contraseña es obligatoria.");
        }

        if (correo == null || correo.trim().isEmpty()) {
            addFieldError("correo", "El correo es obligatorio.");
        } else if (!correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            addFieldError("correo", "El formato del correo no es válido.");
        }
    }*/
    
}
