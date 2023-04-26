package Biblioteca.Biblioteca_B;

public class main {
    public static void main(String[] args) {
        Persona.solicitarDatos();

        for(int i = 0; i< Biblioteca.personal.size(); i++){
            System.out.println(Biblioteca.personal.get(i).getNombre() + 
                               Biblioteca.personal.get(i).getApellido1() + 
                               Biblioteca.personal.get(i).getApellido2() +
                               Biblioteca.personal.get(i).getEdad());
        }
    }
}
