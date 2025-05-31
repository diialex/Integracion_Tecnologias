/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import service.usuarioService;

/**
 *
 * @author jsaco
 */
@WebService(serviceName = "usuarioController")
public class usuarioController {

    /**
     * AQUI VAN TODOS LOS WEBSERVICES-MÉTODOS QUE LLAMARÁ EL CLIENTE
     * en este caso relacionados a los casos de uso de usuario
     */
    
    //Solo se usan como metodos de llamada para el cliente, que ejecutan el service correspondiente
    //los service del paquete service son los que llaman al DAO y realizan las acciones en condiciones
    
    @WebMethod(operationName = "altaUsuario")
    public String altaUsuario(@WebParam(name = "coreo") String correo) {
        return usuarioService.altaUsuario(correo);
    }
}
