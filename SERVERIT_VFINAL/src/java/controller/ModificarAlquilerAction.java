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
import java.util.Date;
import model.Cliente;
import model.DAO;
import model.Vehiculo;

/**
 *
 * @author jsaco
 */
public class ModificarAlquilerAction extends ActionSupport {
    
    private Long idAlquiler;
    private Long idCliente;
    private String numplaca;
    //private Date fechaRegistro;
    
    
    public ModificarAlquilerAction() {
    }
    
    @Override
    public String execute() {
        DAO dao = new DAO();
        boolean b;
        
        Vehiculo vehiculoSol = dao.getVehiculo(numplaca);
        Cliente clienteSol = dao.getCliente(idCliente);
        
        if (idCliente != null) {
            //return ERROR;
            Date fecha = new Date();
            b = dao.updateAlquiler(idAlquiler, vehiculoSol, fecha, clienteSol);

        }else{
            //return ERROR;
            b = dao.updateAlquiler(idCliente, vehiculoSol, null, null);
        }
        
        /*if(vehiculoSol==null || clienteSol==null || fechaRegistro==null || idAlquiler==null){
            return ERROR;
        }*/

        return b ? SUCCESS : ERROR;
    }

    public Long getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Long idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumplaca() {
        return numplaca;
    }

    public void setNumplaca(String numplaca) {
        this.numplaca = numplaca;
    }

    /*public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }*/

    
    
    
}
