/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.io.Serializable;

/**
 *
 * @author Martin
 */
import java.io.Serializable;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="vehiculo")
@NamedQueries(@NamedQuery(name="Vehiculo.getAll",query="SELECT v FROM Vehiculo v"))
public class Vehiculo implements Serializable{

    public Vehiculo() {
    }

    public Vehiculo(int codigo, int precio, String ano, int modelo, byte[] foto) {
        this.codigo = codigo;
        this.precio = precio;
        this.ano = ano;
        this.modelo = modelo;
        this.foto = foto;
    }
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int codigo;
    @Column
    private int precio;
    @Column
    private String ano;
    
    @Column
    private int modelo;
    
    @Lob
    @Column
    private byte[] foto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAño() {
        return ano;
    }

    public void setAño(String ano) {
        this.ano = ano;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    
    
}
