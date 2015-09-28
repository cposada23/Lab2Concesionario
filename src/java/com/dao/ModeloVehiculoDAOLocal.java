/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.ModeloVehiculo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author camilo.posadaa
 */
@Local
public interface ModeloVehiculoDAOLocal {

    void addModelo(ModeloVehiculo modelo);

    ModeloVehiculo getModelo(int codigo);

    void editModelo(ModeloVehiculo modeloVehiculo);

    void deleteModeloVehiculo(int codigo);

    List<ModeloVehiculo> getAllModelos();

   
    
}
