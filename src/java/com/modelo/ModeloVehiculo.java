/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author camilo.posadaa
 */

@Entity
@Table(name="modelo_vehiculo")
@NamedQueries(@NamedQuery(name="ModeloVehiculo.getAll",query="SELECT mv FROM ModeloVehiculo mv"))
public class ModeloVehiculo implements Serializable {

    public ModeloVehiculo(int codigo, String nombre, String tipo ){
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public ModeloVehiculo() {
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int codigo;
    @Column
    private String nombre;
    @Column
    private String tipo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
