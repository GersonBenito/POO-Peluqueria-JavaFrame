package com.pet.peluqueriapet.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Gerson Benito
 */

@Entity
public class Mascota implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "numero_cliente", nullable = false)
    private Long numeroCliente;
    @Column(name = "nombre_perro", nullable = false)
    private String nombrePerro;
    private String raza;
    private String color;
    private boolean alergico;
    @Column(name = "atencion_especial", nullable = false)
    private boolean atencionEspecial;
    private String observacion;
    @OneToOne
    private Dueno dueno;
    
    public Mascota(){
        
    }
    
    public Mascota(Long numeroCliente, String nombrePerro, String raza, String color, boolean alergico, boolean atencionEspecial, String observacion, Dueno dueno){
        this.numeroCliente = numeroCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.observacion = observacion;
        this.dueno = dueno;
    }
    
    public Long getNumeroCliente(){
        return this.numeroCliente;
    }
    
    public void setNumeroCliente(Long numeroCliente){
        this.numeroCliente = numeroCliente;
    }
    
    public String getNombrePerro(){
        return this.nombrePerro;
    }
    
    public void setNombrePerro(String nombrePerro){
        this.nombrePerro = nombrePerro;
    }
    
    public String getRaza(){
        return this.raza;
    }
    
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean getAlergico(){
        return this.alergico;
    }
    
    public void setAlergico(boolean alergico){
        this.alergico = alergico;
    }
    
    public boolean getAtencionEspecial(){
        return this.atencionEspecial;
    }
    
    public void setAtencionEspecial(boolean atencionEspecial){
        this.atencionEspecial = atencionEspecial;
    }
    
    public String getObservacion(){
        return this.observacion;
    }
    
    public void setObservacion(String observacion){
        this.observacion = observacion;
    }
    
    public Dueno getDueno(){
        return this.dueno;
    }
    
    public void setDueno(Dueno dueno){
        this.dueno = dueno;
    }
    
}
