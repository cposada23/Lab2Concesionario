/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Cliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cposa
 */
@Local
public interface ClienteDAOLocal {

    void addCliente(Cliente cliente);

    void editCliente(Cliente cliente);

    void deleteCliente(int documentoCliente);

    Cliente getCliente(Cliente documentoCliente);

    List<Cliente> getAllClientes();
    
}
