package ficheroSerializable;

import lectura.*;
import eficheiros.Alumno;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * si utilizo obj de esta clase, se van a serializar (solo objetos). Voy a hacer 
 * un flujo de datos de lo que yo le mande
 * 
 * @author NSteuerberg
 */
public class EscrituraFicheirosSerializados{ 
    Scanner sc;
    ObjectInputStream lec = null; // creo obj tipo ObjectInputStream
    ObjectOutputStream escr = null;
    public void escribirSeri (File fich){
        try{
        // serializao los objetos y los escribo
            escr = new ObjectOutputStream (new FileOutputStream(fich));
            AlumnadoSerializado a11 = new AlumnadoSerializado("aa", 3);
            AlumnadoSerializado a12 = new AlumnadoSerializado("bb", 2);
            escr.writeObject (a11);
            escr.writeObject (a12);
        
        }catch (FileNotFoundException ex){
            System.out.println("No se encontro en fichero " +  ex.toString());
        
        }catch (IOException ex) {// capturo excep y los cierro
            System.out.println("error 2" + ex.getMessage());
            
        }finally {
            
            try {
                escr.close();
            }catch(IOException ex){ // es un erro de escritura, es distinto al anterior 
                System.out.println("erro 3 " + ex.getMessage());
            }
        }
    }
    
    
}