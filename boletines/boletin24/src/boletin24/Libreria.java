/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin24;

import java.util.ArrayList;
import nosaLibreria.PedirDatos;

/**
 *
 * @author dam1
 */
public class Libreria {
    
    
    public void engadir(ArrayList<Libro> lista) {
        
        lista.add(new Libro(PedirDatos.pedirString(pedirTitulo), 
                PedirDatos.pedirString(pedirAutor), PedirDatos.pedirString(pedirIsbnm), 
        PedirDatos.pedirFloat(pedirPrezo)));
    }
    
    

}
