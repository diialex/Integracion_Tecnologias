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
