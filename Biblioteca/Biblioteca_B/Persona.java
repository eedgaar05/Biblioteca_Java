package Biblioteca.Biblioteca_B;

import java.util.*;;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;


    public Persona() {
    }

    static void solicitarDatos(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String name  = keyboard.nextLine();

        System.out.println("Apellido1: ");
        String surname1 = keyboard.nextLine();

        System.out.println("Apellido2: ");
        String surname2 = keyboard.nextLine();

        System.out.println("Edad: ");
        int age = keyboard.nextInt();

        Persona persona = new Persona(name, surname1, surname2, age);

        Biblioteca.personal.add(persona);
    }

    public Persona(String nombre, String apellido1, String apellido2, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public Persona(Usuario usuario) {
    }

    public Persona(Bibliotecario bibliotecario){
        
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", apellido1='" + getApellido1() + "'" +
            ", apellido2='" + getApellido2() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }

}
