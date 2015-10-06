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
 * @author ElMarto
 */
@Entity
@Table(name = "venta")
@NamedQueries(@NamedQuery(name="Venta.getAll",query="SELECT v FROM Venta v"))
public class Venta implements Serializable{

    public Venta(int codigo, String fecha, String matricula, int vehiculo, int cliente, int vendedor) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.matricula = matricula;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public Venta() {
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int codigo;
    @Column
    private String fecha;
    @Column
    private String matricula;
    @Column
    private int vehiculo;
    @Column
    private int cliente;
    @Column 
    private int vendedor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(int vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getVendedor() {
        return vendedor;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }
    
    
}
