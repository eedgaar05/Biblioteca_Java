package Biblioteca.Biblioteca_A;

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

    //Metodo añadir libro
    static void AñadirLibro(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el ISBN:");
        String isbnLibro = keyboard.nextLine();

        System.out.println("Introduce el titulo:");
        String tituloLibro = keyboard.nextLine();

        System.out.println("Introduce el nombre del autor:");
        String autorLibro = keyboard.nextLine();

        System.out.println("Introduce la editorial:");
        String editorialLibro = keyboard.nextLine();

        System.out.println("Introduce el numero de copias: ");
        int copiasLibro = keyboard.nextInt();

        System.out.println("Introduce las copias disponibles");
        int copiasDispoLibro = keyboard.nextInt();

        while(copiasDispoLibro > copiasLibro){
            System.out.println("Introduce las copias disponibles");
            copiasDispoLibro = keyboard.nextInt();
        }

        Libro libro = new Libro(isbnLibro, tituloLibro, autorLibro, editorialLibro, copiasLibro, copiasDispoLibro, copiasDispoLibro);

        Libros.add(libro);
    }

    //Metodo eliminar libro
    static void EliminarLibro(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el ISBN");
        String isbnLibro = keyboard.nextLine();

        for(int i = 0; i<Libros.size(); i++){
            if(Libros.get(i).getISBN().equals(isbnLibro)){
                Libros.remove(i);
            }
        }
    }


    //Metodo buscar por isbn
    static void BuscarISBN(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el ISBN");
        String isbnLibro = keyboard.nextLine();

        for(int i = 0; i<Libros.size(); i++){
            if(Libros.get(i).getISBN().equals(isbnLibro)){
                System.out.println("ISBN: " + Libros.get(i).getISBN() + " " + 
                                   "Titulo: " + Libros.get(i).getTitulo() + " " +
                                   "Autor: " + Libros.get(i).getAutor() + " " + 
                                   "Editorial: " + Libros.get(i).getEditorial() + " " + 
                                   "Copias: " + Libros.get(i).getCopias() + " " + 
                                   "Copias Disponibles: " + Libros.get(i).getCopiasDisponibles() + " " +
                                   "Contador: " + Libros.get(i).getContador());
            }
        }
    }


    //Metodo buscar por titulo
    static void BuscarTitulo(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el ISBN");
        String tituloLibro = keyboard.nextLine();

        for(int i = 0; i<Libros.size(); i++){
            if(Libros.get(i).getTitulo().equals(tituloLibro)){
                System.out.println("ISBN: " + Libros.get(i).getISBN() + " " + 
                                   "Titulo: " + Libros.get(i).getTitulo() + " " +
                                   "Autor: " + Libros.get(i).getAutor() + " " + 
                                   "Editorial: " + Libros.get(i).getEditorial() + " " + 
                                   "Copias: " + Libros.get(i).getCopias() + " " + 
                                   "Copias Disponibles: " + Libros.get(i).getCopiasDisponibles() + " " +
                                   "Contador: " + Libros.get(i).getContador());
            }
        }
        
    }



    
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