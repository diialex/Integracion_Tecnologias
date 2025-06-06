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

/**
 *
 * @author Ariel
 */
public class DAO {
    
    private static Session session;
    
    public boolean addAlquiler(Alquiler nuevoAlquiler) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;
        
        try{
            tx = session.beginTransaction();       
            session.save(nuevoAlquiler);

            tx.commit();
            return true;
            
        }catch(Exception e){
            if(tx!=null){
                tx.rollback();
            }
            return false;
        }
    }
    
    public List<Vehiculo> getVehiculos() {
        //try{
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction tx = session.beginTransaction();
            // Utilizamos JOIN FETCH para cargar explícitamente las relaciones
            Query q = session.createQuery("FROM Vehiculo v JOIN FETCH v.calificaciones JOIN FETCH v.alquileres");
            List resultados = (List<Vehiculo>) q.list();
            tx.commit();
            //String modelo, String marca, String tipo, String numplaca, String estadodisponibilidad)
            Vehiculo v = new Vehiculo("Seat", "Seat", "helicptero", "3333", "si");
            resultados.add(v);
            return resultados;
        /*}catch(Exception e){
            List prueba = new ArrayList<>();
            prueba.add("hola");
            System.err.println("Error al obtener vehículos desde DAO: " + e.getMessage());
            e.printStackTrace();
            return prueba;
        }*/
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
