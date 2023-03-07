/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroSerializable;

import java.io.File;

/**
 *
 * @author dam1
 */
public class Main {
    public static void main(String[] args) {
        File f = new File ("serializado.txt");
        EscrituraFicheirosSerializados obx = new EscrituraFicheirosSerializados();
        obx.escribirSeri(f);
    }
    
    
    
}
