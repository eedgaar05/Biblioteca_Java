package Biblioteca.Biblioteca_B;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro{

    public static ArrayList<Libro> Libros = new ArrayList<Libro>();//ArrayList de objetos para almacenar los objetos de la clase libro creados.
    
    //Atributos de la clase libro
    private String ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    public int copias;
    public int copiasDisponibles;
    private static int contador = 0;


    
    
    //Constructor vacio
    public Libro() {
    }


    //Constructor con parametros
    public Libro(String ISBN, String titulo, String autor, String editorial, int copias, int copiasDisponibles, int contador) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.copias = copias;
        this.copiasDisponibles = copiasDisponibles;
        setContador(); 
    }

    //Getters y setters
    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCopias() {
        return this.copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getCopiasDisponibles() {
        return this.copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public int getContador(){
        return Libro.contador;
    }

    public void setContador(){
        contador ++;
    }


    @Override
    public String toString() {
        return "{" +
            " ISBN='" + getISBN() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", editorial='" + getEditorial() + "'" +
            ", copias='" + getCopias() + "'" +
            ", copiasDisponibles='" + getCopiasDisponibles() + "'" +
            ", contador=' " + getContador() + "'" +
            "}";
    }

}