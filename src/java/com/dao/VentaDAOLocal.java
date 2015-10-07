/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Venta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ElMarto
 */
@Local
public interface VentaDAOLocal {

    void addVenta(Venta venta);

    List<Venta> listarVentas();

    Venta getVenta(int codigo);

    List<Venta> getventaxCliente(int cliente);

    List<Venta> getVentaxVendedor(int vendedor);

     public List<Venta> getVentaxMatricula(String matricula);
    
    
    
}
