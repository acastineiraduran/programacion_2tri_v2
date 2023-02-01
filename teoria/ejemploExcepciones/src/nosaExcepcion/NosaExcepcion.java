/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nosaExcepcion;

/**
 *
 * @author dam1
 */
public class NosaExcepcion extends Exception{ // todas las excep extiendes de esta
    public NosaExcepcion(){
        super();
    }
    
    // Crearemos el objeto de este constructor en la clase Dividir Excepciones
    public NosaExcepcion(String mensaxe){ // contstructor de mi clase 
        super(mensaxe); // normalmente se acompaña de un mensaje indicando que ocurre
    }
    
}
