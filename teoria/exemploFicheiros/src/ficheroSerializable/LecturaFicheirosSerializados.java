/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroSerializable;

import escritura.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.PrintWriter;

/**
 *
 * @author dam1
 */
public class LecturaFicheirosSerializados {

    FileWriter ou = null; // null para que no apunte a nada

    PrintWriter fich = null;// me coge el "ou" pq quiero hacer lectura y escritura en buffer (va en paquetes)

    public void lerSerializable(File ficheiro) { // recibo el obj dd quiero escribir
        AlumnadoSerializado al = null;
        
        try {
            ler = new ObjectInputStream (new FileInputStream(fich));
            al = (AlumnadoSerializado)ler.readObject();
            while (al!=null){
                if (al!=null){
                    System.out.println("");
                    al = AlumnadoSerializado ler.readObject;
                }
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("erro escritura: " + ex.getMessage());
        } catch (IOException ex){
            System.out.println("erro 2 " + ex.getMessage());
        } finally {
            try {
                fich.close();
            }catch (IOException ex){
                System.out.println("erro o pechar o fich");
            }
                
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
