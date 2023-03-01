/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author dam1
 */
public class EscribirFicheiros {

    FileWriter ou = null; // null para que no apunte a nada

    PrintWriter fich = null;// me coge el "ou" pq quiero hacer lectura y escritura en buffer (va en paquetes)

    /**
     * 1.con esto tengo abierto el fichero en modo escritura 2.el puntero esta
     * apuntando al principio 3.el punterro se me va (al principio?) si exsite
     * lo destruye si no lo crea 4.para no tener problemas: solucion: si el
     * fichero no existe lo crea, sino se pone al final para eseguir escribiendo
     * --tengo que poner un true en el parametro del metodo--
     *
     * @param ficheiro
     */
    public void escribirPalabras(File ficheiro) { // recibo el obj dd quiero escribir
        try {
            ou = new FileWriter(ficheiro);
            fich = new PrintWriter(ou);

            fich.println("lun++++s"); // escribo
            fich.println("maertes");
            fich.println("mercoles");

        } catch (IOException ex) {
            System.out.println("erro escritura: " + ex.getMessage());

        } finally {
            fich.close();
        }
       
    }
    public void engadirPalabras (File ficheiro){
        try {
            ou = new FileWriter(ficheiro, true);
            fich = new PrintWriter(ou);

            fich.println("lun++++s"); // escribo
            fich.println("maertes");
            fich.println("mercoles");

        } catch (IOException ex) {
            System.out.println("erro escritura: " + ex.getMessage());

        } finally {
            fich.close();
        }
    }
}
