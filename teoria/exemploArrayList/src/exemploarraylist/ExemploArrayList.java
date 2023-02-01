/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploarraylist;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        obx.crear();

        ListaEnteiros obx2 = new ListaEnteiros();
        obx2.engadir();
        obx2.amosar();

        // EJERCICIOS
        // 1.
        System.out.println("\nañadir 2 en la posicion 2");
        obx2.engadirNumero(2, 2);
        obx2.amosar();
        // 2. 
        System.out.println("\nborrar el elemento de la posicion 1");
        obx2.eliminarNumero(1);
        obx2.amosar();
        // 3. 
        System.out.println("\nver si hay un 5 en la coleccion ");
        obx2.verElemento(5);
        obx2.amosar();
        // 4,6. borrar el 5
        System.out.println("\nborrar el 2");
        obx2.borrarPorNumero(2);
        obx2.amosar();
        // otra forma para borrar
        System.out.println("\nborrar el 2 - segunda forma");
        obx2.borrarPorNumero_v2(2);
        obx2.amosar();
        // el 5 no lo hice por que es similar al 1
        
        
    }

}
