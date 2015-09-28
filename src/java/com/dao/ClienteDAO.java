/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cposa
 */
@Stateless
public class ClienteDAO implements ClienteDAOLocal {
     
    @PersistenceContext

    private EntityManager em;
    
    @Override
    public void addCliente(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public void editCliente(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void deleteCliente(int documentoCliente) {
        em.remove(getCliente(documentoCliente));
    }
    
    @Override
    public List<Cliente> getAllClientes() {
        return em.createNamedQuery("cliente.getAll").getResultList();
    }

    @Override
    public Cliente getCliente(int documentoCliente) {
        return  em.find(Cliente.class, documentoCliente);
    }
    
    
   
}
