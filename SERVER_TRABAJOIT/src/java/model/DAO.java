/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.*;
/**
 *
 * @author Ariel
 */
public class DAO {
    
    private static Session session;
    
    
    public List<Vehiculo> getVehiculos(){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM vehiculo");
        List<Vehiculo> vehiculos = (List<Vehiculo>) q.list();
        tx.commit();
        return vehiculos;
    }
    
    
    public Vehiculo getVehiculo(String id){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM vehiculo WHERE id =  " + id);
        Vehiculo v = (Vehiculo) q.uniqueResult();
        tx.commit();
        return v;
    }
    
    
    
    public void newVehiculo(String modelo, String marca, String tipo, String numplaca, String estadodisponibilidad, Set calificacions, Set alquilers){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Vehiculo vehiculo = new Vehiculo(modelo, marca, tipo, numplaca, estadodisponibilidad, calificacions, alquilers);
        session.save(vehiculo);
        tx.commit();
    }
    
    public void removeVehiculo(Vehiculo veh){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(veh);
        tx.commit();
    }
    
    public void updateVehiculo(Vehiculo veh){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.merge(veh);
        tx.commit();
    }
    
    
    
    
    
    
    
    
    
    
    public List<Calificacion> getCalificaciones(){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM calificacion");
        List<Calificacion> calificaciones = (List<Calificacion>) q.list();
        tx.commit();
        return calificaciones;
    }
    
    
    public Calificacion getCalificacion(String id){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM calificacion WHERE id =  " + id);
        Calificacion v = (Calificacion) q.uniqueResult();
        tx.commit();
        return v;
    }
    
    public void newCalificacion(Cliente cliente, Vehiculo vehiculo, Integer estrellas, String  valoracion){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Calificacion calificacion = new Calificacion(cliente, vehiculo, estrellas, valoracion);
        session.save(calificacion);
        tx.commit();
    }
    
    public void removeCalificacion(Calificacion cal){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(cal);
        tx.commit();
    }
    
    public void updateCalificacion(Calificacion cal){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.merge(cal);
        tx.commit();
    }
    
    public List<Calificacion> getClienteCalifs(String dni){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM calificacion WHERE dniCliente = " + dni);
        List<Calificacion> cal = (List<Calificacion>) q.list();
        tx.commit();
        return cal;
    }
    
    
    
    
    
    
    
    
    
    public List<Factura> getFacturas(){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM factura");
        List<Factura> facturas = (List<Factura>) q.list();
        tx.commit();
        return facturas;
    }
    
    public List<Factura> getFacturasCliente(String id){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM factura WHERE idCliente = " + id);
        List<Factura> facturas = (List<Factura>) q.list();
        tx.commit();
        return facturas;
    }
    
    public void newFactura(Alquiler alquiler, Cliente cliente, Date fecha, Float importe, Long iban){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Factura factura = new Factura(alquiler, cliente, fecha, importe, iban);
        session.save(factura);
        tx.commit();
    }
    
    public void removeFactura(Factura fac){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(fac);
        tx.commit();
    }
    
    public List<Metodopago> getPayMethod(){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM metodopago");
        List<Metodopago> pay = (List<Metodopago>) q.list();
        tx.commit();
        return pay;
    }
    
    public List<Metodopago> getPayMethodClient(String dni){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM metodopago WHERE dnicliente = " + dni);
        List<Metodopago> pay = (List<Metodopago>) q.list();
        tx.commit();
        return pay;
    }
    
    public void newPayMethod(Cliente cliente, Long num, Date fechaexp, String banco){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Metodopago pay = new Metodopago(cliente, num, fechaexp, banco);
        session.save(pay);
        tx.commit();
    }
    
    public void removePayMethod(Metodopago payMethod){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(payMethod);
        tx.commit();
    }
    
    public void updatePayMethod(Metodopago payMethod){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.merge(payMethod);
        tx.commit();
    }
    
}
