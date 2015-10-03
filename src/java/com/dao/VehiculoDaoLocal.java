/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Vehiculo;
import com.modelo.Vendedor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Martin
 */
@Local
public interface VehiculoDaoLocal {
 
      void addVehiculo(Vehiculo vehiculo);

    void editVehiculo(Vehiculo vehiculo);

    Vehiculo getVehiculo(int documentoVehiculo);

    void deleteVehiculo(int documentoVehiculo);

    List<Vehiculo> getAllVehiculos();
}
