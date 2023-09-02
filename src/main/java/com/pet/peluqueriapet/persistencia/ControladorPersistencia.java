package com.pet.peluqueriapet.persistencia;

import com.pet.peluqueriapet.logica.Dueno;
import com.pet.peluqueriapet.logica.Mascota;

/**
 *
 * @author Gerson Benito
 */
public class ControladorPersistencia {
    
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    DuenoJpaController duenoJPA = new DuenoJpaController();
    
    // -------- Entidad Dueño
    public void crearDueno(Dueno dueno){
        duenoJPA.create(dueno);
    }
    
    
    // Entidad Mascota
    public void crearMascota(Mascota mascota){
        mascotaJPA.create(mascota);
    }
    
}
