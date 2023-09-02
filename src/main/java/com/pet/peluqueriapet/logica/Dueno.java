package com.pet.peluqueriapet.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gerson Benito
 */

@Entity
public class Dueno implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_dueno", nullable = false) // indicar que el campo en la DB es id_dueno
    private Long idDueno;
    private String nombre;
    private String celular;
    private String direccion;
    
    public Dueno(){
    
    }
    
    public Dueno(Long idDueno, String nombre, String celular, String direccion){
        this.idDueno = idDueno;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
    }
    
    public Long getIdDueno(){
        return this.idDueno;
    }
    
    public void setIdDueno(Long idDueno){
        this.idDueno = idDueno;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getCelular(){
        return this.celular;
    }
    
    public void setCelular(String celular){
        this.celular = celular;
    } 
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
}
