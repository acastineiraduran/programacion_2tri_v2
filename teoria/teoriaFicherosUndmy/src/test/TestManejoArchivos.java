/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import teoriaficherosundmy.ManejoArchivos;
import static teoriaficherosundmy.ManejoArchivos.crearArchivo;

/**
 *
 * @author casty
 */
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);
    }
}
