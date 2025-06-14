package model;
// Generated 07-jun-2025 12:53:59 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Long id;
     private Usuario usuario;
     private Set metodopagos = new HashSet(0);
     private Set notificacions = new HashSet(0);
     private Set calificacions = new HashSet(0);
     private Set alquilers = new HashSet(0);
     private Set facturas = new HashSet(0);

    public Cliente() {
    }
    
    public Cliente(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente(Usuario usuario, Set metodopagos, Set notificacions, Set calificacions, Set alquilers, Set facturas) {
       this.usuario = usuario;
       this.metodopagos = metodopagos;
       this.notificacions = notificacions;
       this.calificacions = calificacions;
       this.alquilers = alquilers;
       this.facturas = facturas;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Set getMetodopagos() {
        return this.metodopagos;
    }
    
    public void setMetodopagos(Set metodopagos) {
        this.metodopagos = metodopagos;
    }
    public Set getNotificacions() {
        return this.notificacions;
    }
    
    public void setNotificacions(Set notificacions) {
        this.notificacions = notificacions;
    }
    public Set getCalificacions() {
        return this.calificacions;
    }
    
    public void setCalificacions(Set calificacions) {
        this.calificacions = calificacions;
    }
    public Set getAlquilers() {
        return this.alquilers;
    }
    
    public void setAlquilers(Set alquilers) {
        this.alquilers = alquilers;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }




}


