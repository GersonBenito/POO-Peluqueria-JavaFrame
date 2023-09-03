package com.pet.peluqueriapet.logica;

import com.pet.peluqueriapet.persistencia.ControladorPersistencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerson Benito
 */
public class Controlador {
    ControladorPersistencia controladorJPA = new ControladorPersistencia();
    
    // ------- Dueño
    public void crearDueno(Long idDueno, String nombre, String celular){
        Dueno dueno = new Dueno(idDueno, nombre, celular);
        controladorJPA.crearDueno(dueno);
    }
    
    
    // ------- Mascota
    public void crearMascota(String nombrePerro, String raza,String color, 
                            String alergico, String atencionEspecial, String observacion, 
                            String nombre, String celular){
        
        Dueno dueno = new Dueno();
        
        dueno.setNombre(nombre);
        dueno.setCelular(celular);
        
        boolean isAlergico = alergico.equals("Si");
        boolean isAtencinEspecial = atencionEspecial.equals("Si");
        
        Mascota mascota = new Mascota();
        mascota.setNombrePerro(nombrePerro);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(isAlergico);
        mascota.setAtencionEspecial(isAtencinEspecial);
        mascota.setObservacion(observacion);
        mascota.setDueno(dueno);
        
        // ---- Guardar
        controladorJPA.guardar(dueno, mascota);
    }
    
    public ArrayList<Mascota> obtenerMascotas(){
        List<Mascota> mascotas = controladorJPA.obtenerMascotas();
        ArrayList<Mascota> mascotasList = new ArrayList<>(mascotas);
        return mascotasList;
    }
    
    public void eliminarMascota(Long id){
        controladorJPA.eliminarMascota(id);
    }
}
