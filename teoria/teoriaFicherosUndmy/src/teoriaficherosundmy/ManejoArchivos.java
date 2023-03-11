/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaficherosundmy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author casty
 */
public class ManejoArchivos { 
    /**
     * static solo para no tener que crear obj
     * 
     * @param nombreArchivo 
     */
    public static void crearArchivo (String nombreArchivo){
        PrintWriter salida = null;
        try {
            File archivo = new File (nombreArchivo); // Creamos obj de tipo file en memo
            salida = new PrintWriter(archivo); // lo abrimos en disc duro/memo
            salida.close(); // cd llamamos a este metodo -> si guardamos
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            // Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
        } finally {
            salida.close();
        }
    }   
}
