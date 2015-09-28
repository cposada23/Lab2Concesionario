/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Vendedor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cposa
 */
@Local
public interface VendedorDAOLocal {

    void addVendedor(Vendedor vendedor);

    void editVendedor(Vendedor vendedor);

    Vendedor getVendedor(int documentoVendedor);

    void deleteVendedor(int documentoVendedor);

    List<Vendedor> getAllVendedores();
    
}
