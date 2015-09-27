/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Cliente;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author cposa
 */
@Stateless
public class ClienteDAO implements ClienteDAOLocal {

    @Override
    public void addCliente(Cliente cliente) {
    }

    @Override
    public void editCliente(Cliente cliente) {
    }

    @Override
    public void deleteCliente(int documentoCliente) {
    }

    @Override
    public Cliente getCliente(Cliente documentoCliente) {
        return null;
    }

    @Override
    public List<Cliente> getAllClientes() {
        return null;
    }
    
    
   
}
