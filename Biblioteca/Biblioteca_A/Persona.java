package Biblioteca.Biblioteca_A;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellidos;
    private String nif;
    private String contraseña;



    
    //Constructor con todos los parametros
    public Persona(String nombre, String apellidos, String nif, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        setContraseña(contraseña);
    }

    //Constructor copia
    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.apellidos = persona.apellidos;
        this.nif = persona.nif;
        this.contraseña = persona.contraseña;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        if (contraseña.length() >= 8) {
            this.contraseña = contraseña;
        } else {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres");
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif='" + nif + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }

    public int getReservas() {
        return 0;
    }
}
