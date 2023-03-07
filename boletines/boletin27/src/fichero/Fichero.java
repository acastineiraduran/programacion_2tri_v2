/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichero;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dam1
 */
public class Fichero {

    String nombreArchivo = "miArchivo.text";
    String rutaArchivo = "/home/dam1/NetBeansProjects/programacion_2tri_v2/boletines/boletin27";
    
    // Creo objeto File
    File archivo = new File(rutaArchivo,nombreArchivo);
    
    /**
     * 
     * 
     */
    public void comprobarExistencia() {
        if (archivo.exists()) { // true si el archivo existe
            System.out.println("Archivo creado = " + archivo.getName());
        } else { // si es false, no lo encuentra, entra aqui:
            System.out.println("El archivo no existe");
        } 
    }
    
    /**
     * Crea un archivo, escribe texto en el y luego lo cierra
     */
    public void escribirArchivo () {
        try {
            FileWriter escritor = new FileWriter(archivo); // se crea obj "escritor"
            escritor.write("Este es el contenido de mi archivo."); // se llama a "escritor" para escribir en texto
            escritor.close(); // se llama al clone del obj "escritor" para cerrar archivo
            System.out.println("Se ha escrito en el archivo.");

        } catch (IOException e) {
            System.out.println("**HA OCURRIEDO ERROR ESCRITURA**");
            e.getSuppressed();
        }
    }

}
