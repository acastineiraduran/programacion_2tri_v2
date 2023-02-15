/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LerFicheiros {
    
    Scanner sc; 
    
    public void lerPalarbas(File ficheiro){
        try {
            sc = new Scanner(ficheiro); // abro fiche en modo lectura
            while (sc.hasNext()){// mentres tengamos algo que leer...
                // ...lo veo y lo visualizo:
                String dato = sc.next();
                      System.out.println(dato);
            }
            //sc.close(); 
            /* no hay problema, leemos y lo cerramos pero si ha
            problema iria al catch y deharia al fichero abierto*/
        } catch (FileNotFoundException ex) {
            System.out.println("erro 1:" + ex.getMessage());
        }
        finally{
            sc.close(); // por lo anterior mencionado, lo tengo que poner aqui
        }
        
    }
    
}
