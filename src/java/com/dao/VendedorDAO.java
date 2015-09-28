/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Vendedor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cposa
 */
@Stateless
public class VendedorDAO implements VendedorDAOLocal {
    
    @PersistenceContext

    private EntityManager em;
    
    @Override
    public void addVendedor(Vendedor vendedor) {
        em.persist(vendedor);
    }

    @Override
    public void editVendedor(Vendedor vendedor) {
        em.merge(vendedor);
    }

    @Override
    public Vendedor getVendedor(int documentoVendedor) {
        return  em.find(Vendedor.class, documentoVendedor);
    }

    @Override
    public void deleteVendedor(int documentoVendedor) {
        em.remove(getVendedor(documentoVendedor));
    }

    @Override
    public List<Vendedor> getAllVendedores() {
        return em.createNamedQuery("Vendedor.getAll").getResultList();
    }

    
}
