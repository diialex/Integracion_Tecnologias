package model;
// Generated 07-jun-2025 12:53:59 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private Long id;
     private Alquiler alquiler;
     private Cliente cliente;
     private Date fechaemision;
     private Float importe;
     private Long iban;

    public Factura() {
    }

    public Factura(Alquiler alquiler, Cliente cliente, Date fechaemision, Float importe, Long iban) {
       this.alquiler = alquiler;
       this.cliente = cliente;
       this.fechaemision = fechaemision;
       this.importe = importe;
       this.iban = iban;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Alquiler getAlquiler() {
        return this.alquiler;
    }
    
    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getFechaemision() {
        return this.fechaemision;
    }
    
    public void setFechaemision(Date fechaemision) {
        this.fechaemision = fechaemision;
    }
    public Float getImporte() {
        return this.importe;
    }
    
    public void setImporte(Float importe) {
        this.importe = importe;
    }
    public Long getIban() {
        return this.iban;
    }
    
    public void setIban(Long iban) {
        this.iban = iban;
    }




}


