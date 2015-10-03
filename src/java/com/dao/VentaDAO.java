/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Venta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ElMarto
 */
@Stateless
public class VentaDAO implements VentaDAOLocal {
     @PersistenceContext

    private EntityManager em;

    @Override
    public void addVenta(Venta venta) {
        em.persist(venta);
    }
    
    
    
    
    @Override
    public List<Venta> listarVentas() {
        return em.createNamedQuery("Venta.getAll").getResultList();
    }

    @Override
    public Venta getVenta(int codigo) {
        return  em.find(Venta.class, codigo);
    }

    @Override
    public List<Venta> getventaxCliente(int cliente) {
        Query query = em.createQuery("SELECT v FROM Venta v WHERE v.cliente = :cliente");
        query.setParameter("cliente", cliente);
        return query.getResultList();
    }

    @Override
    public List<Venta> getVentaxVendedor(int vendedor) {
        Query query = em.createQuery("SELECT v FROM Venta v WHERE v.vendedor = :vendedor");
        query.setParameter("vendedor", vendedor);
        return query.getResultList();
    }
  
    
    
     
}
