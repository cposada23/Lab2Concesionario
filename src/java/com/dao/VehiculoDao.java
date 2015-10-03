/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Vehiculo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Martin
 */
@Stateless
public class VehiculoDao implements VehiculoDaoLocal {
 @PersistenceContext

    private EntityManager em;
    
    @Override
    public void addVehiculo(Vehiculo vehiculo) {
        em.persist(vehiculo);
    }

    @Override
    public void editVehiculo(Vehiculo vehiculo) {
        em.merge(vehiculo);
    }

    @Override
    public Vehiculo getVehiculo(int documentoVehiculo) {
        return  em.find(Vehiculo.class, documentoVehiculo);
    }

    @Override
    public void deleteVehiculo(int documentoVehiculo) {
        em.remove(getVehiculo(documentoVehiculo));
    }

    @Override
    public List<Vehiculo> getAllVehiculos() {
        
        
        return em.createNamedQuery("Vehiculo.getAll").getResultList();
    }

    @Override
    public byte[] cargarFoto(int codigoVehiculo) {
        return em.find(Vehiculo.class, codigoVehiculo).getFoto();
    }

    @Override
    public List<Vehiculo> getVehiculosXModelo(int modelo) {
        Query query = em.createQuery("SELECT v FROM Vehiculo v WHERE v.modelo = :modelo");
        query.setParameter("modelo", modelo);
        return query.getResultList();
    }
    
    
    
    
    
    
    
}
