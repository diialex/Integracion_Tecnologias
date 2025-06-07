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
            Query q = session.createQuery("FROM Vehiculo");
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
}
