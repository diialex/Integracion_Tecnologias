package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.*;
import model.DAO;

public class LoginAction extends ActionSupport {

    private String nick;
    private String correo;
    private String contrasena;
    private String tipoUsuario;

    public String execute() throws Exception {

        DAO dao = new DAO();
        if (correo != null) {
            Boolean b = true;
            this.setNick(dao.obtenerNickPorCorreo(correo));
            return SUCCESS;
        }
            if (dao.buscarCliente(nick) != null) {
                return SUCCESS;
            } else if (dao.buscarJefe(nick) != null) {

                return INPUT;
            } else {
                addActionError("Usuario o contraseña incorrectos.");
                return ERROR;
            }

    }

    

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
