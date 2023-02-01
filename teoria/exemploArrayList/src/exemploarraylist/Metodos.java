/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class Metodos {
    // TODAS LAS COLECCIONES SON DE OBJTOS Y NO DE DATOS PRIMITIVOS
    ArrayList lista = new ArrayList(); // podemos meter cualquier tipo de datos
    // ArrayList <Integer> listaEnteiros = new ArrayList <Integer> (); // el 2 integer creo que no hace falta especificarlo
    public void crear() {
        lista.add(2);
        lista.add("aaa");
        lista.add(2.3);
        lista.add('b');
        
    }
    
    public void ver() {
        for (int i= 0; i < lista.size(); i++){
            System.out.println(lista.get(i)); // me devuelve valor de cada elemento
        }
    }
    
    
}
