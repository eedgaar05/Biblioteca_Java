package Biblioteca.Biblioteca_A;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    public ArrayList<Persona> personal;

    //Metodo Mostrar Todos Los Libros
    static void MostrarLibros(){
        for(int i = 0; i<Libro.Libros.size(); i++){
            System.out.println("ISBN: " + Libro.Libros.get(i).getISBN() + " " + 
                               "Titulo: " + Libro.Libros.get(i).getTitulo() + " " +
                               "Autor: " + Libro.Libros.get(i).getAutor() + " " + 
                               "Editorial: " + Libro.Libros.get(i).getEditorial() + " " + 
                               "Copias: " + Libro.Libros.get(i).getCopias() + " " + 
                               "Copias Disponibles: " + Libro.Libros.get(i).getCopiasDisponibles() + " " +
                               "Contador: " + Libro.Libros.get(i).getContador());
        }
    }

    //Metodo Mostrar Libros Disponibles
    static void MostrarLibrosDisponibles(){
        for(int i = 0; i<Libro.Libros.size(); i++){
            if(Libro.Libros.get(i).getCopiasDisponibles() > 0){
                System.out.println("ISBN: " + Libro.Libros.get(i).getISBN() + " " + 
                                "Titulo: " + Libro.Libros.get(i).getTitulo() + " " +
                                "Autor: " + Libro.Libros.get(i).getAutor() + " " + 
                                "Editorial: " + Libro.Libros.get(i).getEditorial() + " " + 
                                "Copias: " + Libro.Libros.get(i).getCopias() + " " + 
                                "Copias Disponibles: " + Libro.Libros.get(i).getCopiasDisponibles() + " " +
                                "Contador: " + Libro.Libros.get(i).getContador());
            }
        }
    }



    // Constructor vacío
    public Biblioteca() {
        this.nombre = "";
        this.libros = new ArrayList<>();
        this.personal = new ArrayList<>();
    }


    //Constructor con todos los parametros

    public Biblioteca(String nombre, ArrayList<Libro> libros, ArrayList<Persona> personal) {
        this.nombre = nombre;
        this.libros = libros;
        this.personal = personal;
    }

    

    // Constructor copia
    public Biblioteca(Biblioteca biblioteca) {
        this.nombre = biblioteca.nombre;
        this.libros = new ArrayList<>(biblioteca.libros);
        this.personal = new ArrayList<>(biblioteca.personal);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isEmpty()){
            this.nombre = nombre.substring(0,1).toUpperCase() + nombre.substring(1);
        }
    }


    public ArrayList<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Persona> getPersonal() {
        return this.personal;
    }

    public void setPersonal(ArrayList<Persona> personal) {
        this.personal = personal;
    }


    // Método toString
    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                ", personal=" + personal +
                '}';
    }
}

