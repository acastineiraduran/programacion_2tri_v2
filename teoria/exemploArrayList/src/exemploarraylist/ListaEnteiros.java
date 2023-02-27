/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Colecciones
 *
 * @author dam1
 */
public class ListaEnteiros {

    ArrayList<Integer> listaEnteiros = new ArrayList<Integer>();

    public void engadir() {
        listaEnteiros.add(2);
        // listaEnteiros.add("bbb"); // no me deja pq le estoy especificando el tipo?? SI
        listaEnteiros.add(3);
        listaEnteiros.add(5);
        listaEnteiros.add(1);
    }

    public void amosar() {
        System.out.println(listaEnteiros); // al ser Integer te da el toString por eso no imprime direccion
    }

    /**
     * engade numero en posicion especifica
     *
     * @param numero
     */
    public void engadirNumero(int elemento, int posicion) {
        listaEnteiros.add(posicion, elemento);
    }

    /**
     * remueve en una posicion determinada
     *
     * @param posicion
     */
    public void eliminarNumero(int posicion) {
        listaEnteiros.remove(posicion);
    }

    /**
     * busca elementos en la array
     *
     * @param elemento
     */
    public void verElemento(int elemento) {
        int posicion = listaEnteiros.indexOf(elemento);
        if (posicion != -1) {
            System.out.println("El numero se encuentra en la posicion = " + (posicion + 1));
        } else {
            System.out.println("El numero buscado no se encuentra en la Array");
        }
    }

    /**
     * elimimar en funcion del elemento, se itera por cada ele duplicado
     *
     * @param elemento
     */
    public void borrarPorNumero(int elemento) {
        int posicion;
        do {
            posicion = listaEnteiros.indexOf(elemento);
            if (posicion != -1) {
                eliminarNumero(posicion);
            } else {
                System.out.println("El numero buscado no se encuentra en la Array");
            }
        } while (posicion != -1);
    }
    /**
     * elimimar en funcion del elemento, se itera por cada ele duplicado - 2 FORMA
     * @param elemento 
     */
    public void borrarPorNumero_v2 (int elemento){
        Iterator it = listaEnteiros.iterator();
        while (it.hasNext())
            if ((int)it.next()==elemento)
                it.remove();
    }
    
    // OTROS METODOS DE NINA:...
    
    public void ordenar (){
        // Collections.sort(listaEnteiros,Collections.reverseOrder()); // lo ordena al reves
        Collections.sort(listaEnteiros);
    }
    
    public void borrar2 () {
        listaEnteiros.remove(Integer.valueOf(5));
    }
    

}
