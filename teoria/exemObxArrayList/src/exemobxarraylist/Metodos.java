/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemobxarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import nosaLibreria.PedirDatos;

/**
 *
 * @author dam1
 */
public class Metodos {

    public ArrayList<Xogador> engadir(ArrayList<Xogador> lista) {
        // Primer metodo
//        Xogador xo = new Xogador (PedirDatos.pedirString("nome"),
//                PedirDatos.pedirInt("dorsal"));
//        lista.add(xo);
        // Segundo metodo
        lista.add(new Xogador(PedirDatos.pedirString("nome"),
                PedirDatos.pedirInt("dorsal")));
        return lista;
    }

    public void amosar1(ArrayList<Xogador> lista) {
        System.out.println(lista);
    }

    public void amosar2(ArrayList<Xogador> lista) {
        //for each. recorre la lista y los objetos los mete en elemento
        for (Xogador elemento : lista) {
            System.out.println(elemento);
        }
    }

    public void amosar3(ArrayList<Xogador> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
    }

    public void amosar4(ArrayList<Xogador> lista) {
        /* con iterator. esta clase nos sirve para iterar. siempre que queramos 
        borrar un elemento de una colecccion debemos usar este*/
        Iterator it = lista.iterator();
        // cada vez que haya algo se itera
        while (it.hasNext()) {//me devuelve un boolean para saber si se acabo o no
            Xogador aux = (Xogador) it.next();//me devuelve un objeto de tipo Object --> casteo
            System.out.println(aux);
//            System.out.println(it.next()); // otra opcion sin hacer cast
        }
    }

    public int buscar(ArrayList<Xogador> lista, String mensaje) {
        int dorsal = PedirDatos.pedirInt(mensaje);
        Iterator it = lista.iterator();
        Xogador aux = null;
        int atopado = 0;
        while (it.hasNext()) {
            aux = (Xogador) it.next();
            if (aux.getDorsal() == dorsal) {
                System.out.println(aux.getNome());
                atopado = 1;
            }
        }
        if (atopado == 0) {
            System.out.println("Xogador no encontrado");
        }
        return atopado;
    }

    public void eliminar(ArrayList<Xogador> lista, String mensaje) {
        int atopado = buscar(lista, mensaje);
        if (atopado == 1) {
            String nome = PedirDatos.pedirString("Nome xogador a eliminar");
            Iterator it = lista.iterator();
            Xogador xo;
            while (it.hasNext()) {
                xo = (Xogador) it.next();
                if (xo.getNome().equalsIgnoreCase(nome)) {
                    it.remove();
                }
            }
        }

    }
    
    
    
    public void ordenar (ArrayList<Xogador>lista){
        Collections.sort(lista);
    }

}
