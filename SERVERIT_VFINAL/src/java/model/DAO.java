/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jsaco
 */
public class DAO {
    Session session = null;
    
    public Alquiler getAlquiler(Long id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        Query q = session.createQuery("FROM Alquiler a LEFT JOIN FETCH a.cliente JOIN FETCH a.vehiculo WHERE id = :identificador");
        q.setParameter("identificador", id);
                
        Alquiler resultado = (Alquiler) q.uniqueResult();
        tx.commit();
        return resultado;
    }
        
    public List<Alquiler> getAlquileres() {
        //try{
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("FROM Alquiler a LEFT JOIN FETCH a.cliente JOIN FETCH a.vehiculo");
            List resultados = (List<Alquiler>) q.list();
            tx.commit();
            return resultados;
    }
    
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
    
    public boolean removeAlquiler(Long id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Usar la misma sesión para cargar y eliminar
            Alquiler alquiler = (Alquiler) session.get(Alquiler.class, id);
            if (alquiler != null) {
                session.delete(alquiler);
            } else {
                return false; 
            }

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace(); // Útil para depuración
            return false;
        }
    }
    
    
    public boolean updateAlquiler(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
    
    
    
    
    
    public List<Vehiculo> getVehiculos() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM Vehiculo v WHERE v.estadodisponibilidad = :estado");
        q.setParameter("estado", "disponible");
        List resultados = (List<Vehiculo>) q.list();
        tx.commit();
        return resultados;
    }
    
    
    public List<Vehiculo> getAllVehiculos() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM Vehiculo");
        List resultados = (List<Vehiculo>) q.list();
        tx.commit();
        return resultados;
    }
    
    public Vehiculo getVehiculo(String numplaca) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        Query q = session.createQuery("FROM Vehiculo WHERE numplaca = :numeroPlaca");
        q.setParameter("numeroPlaca", numplaca);
        
        /*Query q = session.createQuery("FROM Vehiculo WHERE numplaca = :numeroPlaca");
        q.setParameter("numeroPlaca", "ABC1234");*/
                
        Vehiculo resultado = (Vehiculo) q.uniqueResult();
        tx.commit();
        return resultado;
    }
    
    
    public boolean addVehiculo(Vehiculo veh) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;
        
        try{
            tx = session.beginTransaction();       
            session.save(veh);

            tx.commit();
            return true;
            
        }catch(Exception e){
            if(tx!=null){
                tx.rollback();
            }
            return false;
        }
    }
    
    public boolean updateVehiculo(String numPlaca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public boolean removeVehiculo(String numPlaca) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Usar la misma sesión para cargar y eliminar
            Vehiculo vehiculo = (Vehiculo) session.get(Vehiculo.class, numPlaca);
            if (vehiculo != null) {
                session.delete(vehiculo);
            } else {
                return false; 
            }

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace(); // Útil para depuración
            return false;
        }
    }
    
    
     
     
     
    public Calificacion getCalificacion(Long id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        Query q = session.createQuery("FROM Calificacion c WHERE id = :id");
        q.setParameter("id", id);

        Calificacion cal = (Calificacion) q.uniqueResult();
        tx.commit();
        return cal;
    }
     
    public List<Calificacion> getCalificaciones() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM Calificacion");
        List resultados = (List<Calificacion>) q.list();
        tx.commit();
        return resultados;
    }
     
    
    public List<Calificacion> getClienteCalifs(String dni){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM calificacion WHERE dniCliente = " + dni);
        List<Calificacion> cal = (List<Calificacion>) q.list();
        tx.commit();
        return cal;
    }
    
    public boolean addCalificacion(Calificacion cal) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;
        
        try{
            tx = session.beginTransaction();       
            session.save(cal);

            tx.commit();
            return true;
            
        }catch(Exception e){
            if(tx!=null){
                tx.rollback();
            }
            return false;
        }
    }
     
    
      public boolean updateCalificacion(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public boolean removeCalificacion(Long id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Usar la misma sesión para cargar y eliminar
            Calificacion calificacion = (Calificacion) session.get(Calificacion.class, id);
            if (calificacion != null) {
                session.delete(calificacion);
            } else {
                return false; 
            }

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace(); // Útil para depuración
            return false;
        }
    }
    
    
    
    
    
}
