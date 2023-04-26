package Biblioteca.Biblioteca_A;
import java.util.*;

public class Bibliotecario extends Persona {
    private static ArrayList<Persona> listaBibliotecarios = new ArrayList<>();

    //Metodo añadir Bibliotecario
    static void AñadirBibliotecario(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String name  = keyboard.nextLine();

        System.out.println("Apellido: ");
        String surname = keyboard.nextLine();

        System.out.println("NIF: ");
        String NIF = keyboard.nextLine();

        System.out.println("Contraseña: ");
        String password = keyboard.nextLine();

        Persona persona = new Persona(name, surname, NIF, password);

        listaBibliotecarios.add(persona);
        
    }

    //Metodo eliminar bibliotecario
    static void EliminarBibliotecario(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombrePersona = keyboard.nextLine();
        System.out.println("Introduce su respectiva contraseña: ");
        String contraseñaPersona = keyboard.nextLine();


        for(int i = 0; i<listaBibliotecarios.size(); i++){
            if(listaBibliotecarios.get(i).getNombre().equals(nombrePersona) && listaBibliotecarios.get(i).getContraseña().equals(contraseñaPersona)){
                listaBibliotecarios.remove(i);
            }
        }
    }

    //Constructor de Persona
    public Bibliotecario(Persona persona) {
        super(persona);
    }
    
}
