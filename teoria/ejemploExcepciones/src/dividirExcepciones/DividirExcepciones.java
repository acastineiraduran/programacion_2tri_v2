/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dividirExcepciones;

import nosaExcepcion.NosaExcepcion;

/**
 *
 * @author dam1
 */
public class DividirExcepciones {
    public void dividir(int numerador, int denominador){
        int resultado = numerador / denominador;
        System.out.println("resultado = " + resultado);
    }
    public void dividirTratandoExcepcion(int numerador, int denominador){
        try {
            int resultado = numerador / denominador;
            System.out.println("resultado = " + resultado);
        }catch (Exception error){
            System.out.println("Error dividir" + error.getLocalizedMessage());
        }
        System.out.println("Finaliza el programa");
    }
    
    public void dividirPropagandoExcepcion(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) 
            throw new ArithmeticException("ojo non dividas entre 0"); // me la lanzaria al main, tengo que capturarla con el try/catch
        /* estaria lanzando ese objeto a donde yo le llame */
        else{
            int resultado = numerador / denominador;
            System.out.println("resultado = " + resultado);
        }
        System.out.println("Finaliza el programa");
    }
    
    public void dividirNosaExcepcion(int numerador, int denominador) throws NosaExcepcion { /* con la "_s" 
    para decirle al compilador que no trate la excep, que la trate el objeto que lanzamos */
        if (denominador == 0)
            throw new NosaExcepcion("*****Non podemos dividir entre cero****"); // Creo el objeto
        else {
            int resultado = numerador / denominador;
        }
        System.out.println("Finaliza o programa");
    }
    
    public void dividirNosaExcepcion_sinElse(int numerador, int denominador) throws NosaExcepcion { /* con la "_s" 
    para decirle al compilador que no trate la excep, que la trate el objeto que lanzamos */
        if (denominador == 0)
            throw new NosaExcepcion("*****Non podemos dividir entre cero****"); // Creo el objeto
        System.out.println("Finaliza o programa");
    }
    
    
    
    
    
    
}
