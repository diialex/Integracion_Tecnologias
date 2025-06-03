/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.DAO;

/**
 *
 * @author jsaco
 */
public class usuarioService {

    private DAO dao;
    
    public usuarioService() {
        
    }
    
    public static String altaUsuario(String correo){
        //llamada al DAO, le pasas el correo y lo registra en la BBDD
        return correo;
    }
    
}
