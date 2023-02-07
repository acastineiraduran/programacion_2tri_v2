/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin24;

/**
 *
 * @author dam1
 */
public class Libro {

    public static int getNumUni() {
        return numUni;
    }

    public static void setNumUni(int aNumUni) {
        numUni = aNumUni;
    }
    private String titulo;
    private String autor;
    private String isbn;
    private float prezo;
    private static int numUni;

    public Libro(String titulo, String autor, String isbn, float prezo) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }
    
    
    
}
