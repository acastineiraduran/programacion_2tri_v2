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
    String rutaArchivo = "/home/dam1/NetBeansProjects/programacion_2tri_v2/boletines/boletin27/,miArchivo.text";

    // Creo objeto file
    File archivo = new File(rutaArchivo);

    public void comprarExistencia() {
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado = " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("**HA OCURRIDO UN ERROR EXISTENCIA**");
            e.getStackTrace();
        } 
    }
    
    public void escribirArchivo () {
        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("Este es el contenido de mi archivo.");
            escritor.close();
            System.out.println("Se ha escrito en el archivo.");

        } catch (IOException e) {
            System.out.println("**HA OCURRIEDO ERROR ESCRITURA**");
            e.getSuppressed();
        }
    }

}
