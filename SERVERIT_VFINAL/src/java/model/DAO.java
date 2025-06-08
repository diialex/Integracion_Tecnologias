/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
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

    /*------------------------------
    -------- METODOS ALQUILER ------
    --------------------------------*/
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

        try {
            tx = session.beginTransaction();
            session.save(nuevoAlquiler);

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
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

    public boolean setAlquilerSeleccionado(Long id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Obtener el alquiler
            Alquiler alquiler = (Alquiler) session.get(Alquiler.class, id);
            if (alquiler == null) {
                return false;
            }

            // Obtener el cliente con nick 'cliente'
            Query query = session.createQuery("FROM Cliente c WHERE c.nick = :nick");
            query.setParameter("nick", "cliente");
            Cliente cliente = (Cliente) query.uniqueResult();

            if (cliente == null) {
                System.out.println("Cliente con nick 'cliente' no encontrado.");
                return false;
            }

            // Cambiar cliente y fecha
            alquiler.setCliente(cliente);

            // Calcular nueva fecha con Date
            Date fechaActual = new Date();
            long dosSemanasEnMillis = 14L * 24 * 60 * 60 * 1000; // 14 días en milisegundos
            Date nuevaFecha = new Date(fechaActual.getTime() + dosSemanasEnMillis);
            alquiler.setFechafin(nuevaFecha);

            session.update(alquiler);

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateAlquiler(Long id, Vehiculo nuevoVehiculo, Date nuevaFechaDevolucion, Cliente nuevoCliente) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Alquiler alquiler = (Alquiler) session.get(Alquiler.class, id);
            if (alquiler != null) {
                if (nuevoCliente != null) {
                    alquiler.setVehiculo(nuevoVehiculo);
                    alquiler.setFechafin(nuevaFechaDevolucion);
                    alquiler.setCliente(nuevoCliente);
                    alquiler.setEstadoalquiler(1);
                } else {
                    alquiler.setVehiculo(nuevoVehiculo);
                }
                alquiler.setVehiculo(nuevoVehiculo);

                session.update(alquiler);
            } else {
                return false;
            }

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    public List<Cliente> getClientes() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM Cliente c JOIN FETCH c.usuario");
        List resultados = (List<Cliente>) q.list();
        tx.commit();
        return resultados;
    }

    public Cliente getCliente(Long id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM Cliente c JOIN FETCH c.usuario WHERE id = :identificador");
        q.setParameter("identificador", id);
        Cliente resultado = (Cliente) q.uniqueResult();
        tx.commit();
        return resultado;
    }

    /*------------------------------
    -------- METODOS USUARIO -------
    --------------------------------*/
    
    public boolean removeUsuario(String nick, String contrasena) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            String hql = "FROM Usuario WHERE nick = :nick AND contrasena = :contrasena";
            Query query = session.createQuery(hql);
            query.setParameter("nick", nick);
            query.setParameter("contrasena", contrasena);

            Usuario usuario = (Usuario) query.uniqueResult();

            if (usuario != null) {
                session.delete(usuario);
            } else {
                return false;
            }

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    public boolean addUsuario(Usuario usuario, Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(usuario);
            session.save(cliente);
            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    public boolean actualizarContra(String nick, String nuevaContrasena, String correo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            String hql = "FROM Usuario WHERE nick = :nick AND correo = :correo";
            Query query = session.createQuery(hql);
            query.setParameter("nick", nick);
            query.setParameter("correo", correo);

            Usuario usuario = (Usuario) query.uniqueResult();

            if (usuario != null) {
                usuario.setContrasena(nuevaContrasena);
                session.update(usuario);
            } else {
                return false;
            }

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    public String obtenerNickPorCorreo(String correo) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();

            String hql = "SELECT u.nick FROM Usuario u WHERE u.correo = :correoParam";
            Query query = session.createQuery(hql);
            query.setParameter("correoParam", correo);

            String nick = (String) query.uniqueResult();

            tx.commit();
            return nick;

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public Cliente buscarCliente(String nick) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;
        Cliente cliente = null;

        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("FROM Cliente c JOIN FETCH c.usuario u WHERE u.nick = :nickParam");
            q.setParameter("nickParam", nick);
            cliente = (Cliente) q.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }

        return cliente;
    }

    public Jefe buscarJefe(String nick) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;
        Jefe jefe = null;

        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("FROM Jefe j JOIN FETCH j.usuario u WHERE u.nick = :nickParam");
            q.setParameter("nickParam", nick);
            jefe = (Jefe) q.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }

        return jefe;
    }

    public boolean existeNick(String nick) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();

            String hql = "FROM Usuario u WHERE u.nick = :nick";
            Usuario usuario = (Usuario) session.createQuery(hql)
                    .setParameter("nick", nick)
                    .uniqueResult();

            tx.commit();
            return usuario != null;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    /*-------------------------------------------
    -------- METODOS FACTURA y PAY-METHODS-------
    -------------------------------------------*/
    
    public List<Factura> getFacturas() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM Factura");
        List<Factura> facturas = (List<Factura>) q.list();
        tx.commit();
        return facturas;
    }

    public Factura getFactura(Long id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM factura f LEFT JOIN FETCH f.alquiler JOIN FETCH f.cliente WHERE id = " + id);
        Factura factura = (Factura) q.uniqueResult();
        tx.commit();
        return factura;
    }

    public List<Factura> getFacturasCliente(String dni) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM factura f LEFT JOIN FETCH f.alquiler JOIN FETCH f.cliente WHERE dnicliente = " + dni);
        List<Factura> facturas = (List<Factura>) q.list();
        tx.commit();
        return facturas;
    }

    public void newFactura(Alquiler alquiler, Cliente cliente, Date fecha, Float importe, Long iban) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Factura factura = new Factura(alquiler, cliente, fecha, importe, iban);
        session.save(factura);
        tx.commit();
    }

    public boolean removeFactura(Long id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Usar la misma sesión para cargar y eliminar
            Factura fac = (Factura) session.get(Factura.class, id);
            if (fac != null) {
                session.delete(fac);
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

    public List<Metodopago> getPayMethods() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM metodopago");
        List<Metodopago> pay = (List<Metodopago>) q.list();
        tx.commit();
        return pay;
    }

    public Metodopago getPayMethod(Long id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM metodopago m LEFT JOIN FETCH m.cliente WHERE id = " + id);
        Metodopago pay = (Metodopago) q.uniqueResult();
        tx.commit();
        return pay;
    }

    public List<Metodopago> getPayMethodClient(String dni) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM metodopago m LEFT JOIN FETCH m.cliente WHERE dnicliente = " + dni);
        List<Metodopago> pay = (List<Metodopago>) q.list();
        tx.commit();
        return pay;
    }

    public void newPayMethod(Cliente cliente, Long num, Date fechaexp, String banco) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Metodopago pay = new Metodopago(cliente, num, fechaexp, banco);
        session.save(pay);
        tx.commit();
    }

    public boolean removePayMethod(Long id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Usar la misma sesión para cargar y eliminar
            Metodopago pay = (Metodopago) session.get(Metodopago.class, id);
            if (pay != null) {
                session.delete(pay);
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

    public void updatePayMethod(Metodopago payMethod) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.merge(payMethod);
        tx.commit();
    }

    /*------------------------------------------------
    -------- METODOS VEHÍCULO Y CALIFICACIONES -------
    ------------------------------------------------*/
    
    public List<Vehiculo> getVehiculos() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM Vehiculo v WHERE v.estadodisponibilidad = :estado");
        q.setParameter("estado", "disponible");
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
 
    public List<Vehiculo> getAllVehiculos() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("FROM Vehiculo");
        List resultados = (List<Vehiculo>) q.list();
        tx.commit();
        return resultados;
    }

    public boolean addVehiculo(Vehiculo veh) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(veh);

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
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

    public List<Calificacion> getClienteCalifs(String dni) {
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

        try {
            tx = session.beginTransaction();
            session.save(cal);

            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) {
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
