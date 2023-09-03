package com.pet.peluqueriapet.persistencia;

import com.pet.peluqueriapet.logica.Dueno;
import com.pet.peluqueriapet.logica.Mascota;
import com.pet.peluqueriapet.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;

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
    
    // ---- Guardar dueño y mascota
    public void guardar(Dueno dueno, Mascota mascota){
        duenoJPA.create(dueno);
        mascotaJPA.create(mascota);
    }
    
    public ArrayList<Mascota> obtenerMascotas(){
        List<Mascota> mascotas = mascotaJPA.findMascotaEntities();
        
        // el collection Set no no permite obtener valores duplicados
        ArrayList<Mascota> mascotasList = new ArrayList<>(mascotas);
        
        return mascotasList;
    }
    
    public Mascota obtenerMascota(Long id){
        Mascota mascota = mascotaJPA.findMascota(id);
        return mascota;
    }
    
    public Dueno obtenerDueno(Long id){
        Dueno dueno = duenoJPA.findDueno(id);
        return dueno;
    }
    
    public void eliminarMascota(Long id){
        try{
            mascotaJPA.destroy(id);
        }catch(NonexistentEntityException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void actualizarMascota(Mascota mascota){
        try{
            mascotaJPA.edit(mascota);
        }catch(Exception e){
            System.out.println("Error: " +  e.getMessage());
        }
    }
    
    public void actualizarDueno(Dueno dueno){
        try{
            duenoJPA.edit(dueno);
        }catch(Exception e){
            System.out.println("Error: " +  e.getMessage());
        }
    }
    
}
