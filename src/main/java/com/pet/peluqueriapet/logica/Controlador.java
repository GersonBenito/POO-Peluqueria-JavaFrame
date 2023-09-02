package com.pet.peluqueriapet.logica;

import com.pet.peluqueriapet.persistencia.ControladorPersistencia;

/**
 *
 * @author Gerson Benito
 */
public class Controlador {
    ControladorPersistencia controladorJPA = new ControladorPersistencia();
    
    // ------- Dueño
    public void crearDueno(Long idDueno, String nombre, String celular, String direccion){
        Dueno dueno = new Dueno(idDueno, nombre, celular, direccion);
        controladorJPA.crearDueno(dueno);
    }
    
    
    // ------- Mascota
    public void crearMascota(Long numeroCliente, String nombrePerro, String raza,String color, 
                            boolean alergico, boolean atencionEspecial, String observacion, 
                            Long idDueno, String nombre, String celular, String direccion){
        
        // asignar datos a dueño
        Dueno dueno = new Dueno(idDueno, nombre, celular, direccion);
        controladorJPA.crearDueno(dueno);
        
        // asigar datos a la mascota asociandolo a un dueño
        Mascota mascota = new Mascota(numeroCliente, nombrePerro, raza, 
                                      color, alergico, atencionEspecial, observacion, dueno);
        controladorJPA.crearMascota(mascota);
    }
}
