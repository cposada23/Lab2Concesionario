/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.ModeloVehiculo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author camilo.posadaa
 */
@Stateless
public class ModeloVehiculoDAO implements ModeloVehiculoDAOLocal {
    
    
    @PersistenceContext

    private EntityManager em;
    
    @Override
    public void addModelo(ModeloVehiculo modelo) {
        em.persist(modelo);
    }

    @Override
    public ModeloVehiculo getModelo(int codigo) {
        return em.find(ModeloVehiculo.class, codigo);
    }

    @Override
    public void editModelo(ModeloVehiculo modeloVehiculo) {
        em.merge(modeloVehiculo);
    }

    @Override
    public void deleteModeloVehiculo(int codigo) {
        em.remove(getModelo(codigo));
    }

    @Override
    public List<ModeloVehiculo> getAllModelos() {
        return em.createNamedQuery("ModeloVehiculo.getAll").getResultList();
    }
    
    
   
    
    

    
}
