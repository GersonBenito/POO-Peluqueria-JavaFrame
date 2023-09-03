package com.pet.peluqueriapet.utils;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerson Benito
 */
public class Message {
    
    /**
     * Mostrar un mensaje en pantalla
     * @param titulo Exito, Error, Info, etc
     * @param mensaje Contenido para mostrar, ejemplo, registro agregado exitosamente
     * @param tipo tipo de ventana que se va mostrar, Info u Error 
     */
    public void mostrarMensaje(String titulo, String mensaje, String tipo){
        JOptionPane optionPane = new JOptionPane(
                mensaje, 
                tipo.equals("info") ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE
        );
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
}
