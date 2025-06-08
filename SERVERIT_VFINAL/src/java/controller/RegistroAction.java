package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.Cliente;
import model.DAO;
import model.Usuario;

public class RegistroAction extends ActionSupport {

    private String nick;
    private String contrasena;
    private String correo;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Long telefono;

    public String execute() {
        try {
            DAO dao = new DAO();
                  Usuario usuario = new Usuario(nick,contrasena,correo,telefono,nombre,apellido1,apellido2);
                  Cliente cliente= new Cliente(usuario);
            boolean registrado = dao.addUsuario(usuario,cliente);

            if (registrado) {
                return SUCCESS;
            } else {
                addActionError("No se pudo registrar el usuario. Verifique los datos.");
                return INPUT;
            }

        } catch (Exception e) {
            addActionError("Error en el registro: " + e.getMessage());
            return ERROR;
        }
    }
    
  /* public void validate() {
        
        if (telefono == null) {
            addFieldError("telefono", "El teléfono es obligatorio.");
        }

        // Validar teléfono: exactamente 9 dígitos
        if (telefono != null && String.valueOf(telefono).length() != 9) {
            addFieldError("telefono", "El teléfono debe tener exactamente 9 dígitos.");
        }

        // Validar correo con expresión regular básica
        if (correo != null && !correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            addFieldError("correo", "El formato del correo no es válido.");
        }
    }*/
   
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
}
