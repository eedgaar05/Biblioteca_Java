package Biblioteca.Biblioteca_A;
import java.util.*;

public class Usuario extends Persona{

    private int reservas;
    private String tituloReservado;
    private String isbnReservado;
    
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    //Metodo añadir Usuario
    static void AñadirUsuario(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String name  = keyboard.nextLine();

        System.out.println("Apellido: ");
        String surname = keyboard.nextLine();

        System.out.println("NIF: ");
        String NIF = keyboard.nextLine();

        System.out.println("Contraseña: ");
        String password = keyboard.nextLine();

        int reservasUsuario = 0;

        String tituloReservUsuario = "";

        String isbnReservUsuario = "";

        Usuario usuario = new Usuario(name, surname, NIF, password, reservasUsuario, tituloReservUsuario, isbnReservUsuario);

        listaUsuarios.add(usuario);
    }

    //Metodo eliminar Usuario
    static void EliminarUsuario(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombrePersona = keyboard.nextLine();
        System.out.println("Introduce su respectiva contraseña: ");
        String contraseñaPersona = keyboard.nextLine();


        for(int i = 0; i<listaUsuarios.size(); i++){
            if(listaUsuarios.get(i).getNombre().equals(nombrePersona) && listaUsuarios.get(i).getContraseña().equals(contraseñaPersona)){
                listaUsuarios.remove(i);
            }
        }
    }

    //Metodo Reserva
    static void Reserva(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombrePersona = keyboard.nextLine();
        System.out.println("Introduce su respectiva contraseña: ");
        String contraseñaPersona = keyboard.nextLine(); 

        for(int i = 0; i<listaUsuarios.size(); i++){
            if(listaUsuarios.get(i).getNombre().equals(nombrePersona) && listaUsuarios.get(i).getContraseña().equals(contraseñaPersona)){
                if(listaUsuarios.get(i).getReservas() < 5){
                    System.out.println("Que libro quieres reservar?");
                    String tituloLibro = keyboard.nextLine();
              
                    for(int j = 0; j<Libro.Libros.size(); j++){
                        if(Libro.Libros.get(j).getTitulo().equals(tituloLibro)){
                            Libro.Libros.get(j).setCopiasDisponibles(Libro.Libros.get(j).getCopiasDisponibles() - 1);
                            Usuario.listaUsuarios.get(i).setTituloReservado(Libro.Libros.get(j).getTitulo());
                            Usuario.listaUsuarios.get(i).setIsbnReservado(Libro.Libros.get(j).getISBN());
                            Usuario.listaUsuarios.get(i).setReservas(Usuario.listaUsuarios.get(i).getReservas() + 1);
                        }
                    } 
                }

            }

            else{
            System.out.println("Usuario o contraseña incorrecta.");
            }
        }   
    }

    static void Devolver(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombrePersona = keyboard.nextLine();
        System.out.println("Introduce su respectiva contraseña: ");
        String contraseñaPersona = keyboard.nextLine(); 

        for(int i = 0; i<listaUsuarios.size(); i++){
            if(listaUsuarios.get(i).getNombre().equals(nombrePersona) && listaUsuarios.get(i).getContraseña().equals(contraseñaPersona)){
                if(listaUsuarios.get(i).getReservas() < 5){
                    System.out.println("Que libro quieres devolver?");
                    String tituloLibro = keyboard.nextLine();
              
                    for(int j = 0; j<Libro.Libros.size(); j++){
                        if(Libro.Libros.get(j).getTitulo().equals(tituloLibro)){
                            Libro.Libros.get(j).setCopiasDisponibles(Libro.Libros.get(j).getCopiasDisponibles() + 1);
                            Usuario.listaUsuarios.get(i).setTituloReservado(Libro.Libros.get(j).getTitulo());
                            Usuario.listaUsuarios.get(i).setIsbnReservado(Libro.Libros.get(j).getISBN());
                            Usuario.listaUsuarios.get(i).setReservas(Usuario.listaUsuarios.get(i).getReservas() - 1);
                        }
                    } 
                }

            }

            else{
            System.out.println("Usuario o contraseña incorrecta.");
            }
        }   
    }

    

    //Constructor Usuario

    public Usuario(String nombre, String apellidos, String nif, String contraseña,int reservas, String tituloReservado, String isbnReservado) {
        super(nombre, apellidos, nif, contraseña);
        this.reservas = reservas;
        this.tituloReservado = tituloReservado;
        this.isbnReservado = isbnReservado;
    }

    
    //Getters y setters

    public int getReservas() {
        return this.reservas;
    }

    public void setReservas(int reservas) {
        this.reservas = reservas;
    }

    public String getTituloReservado() {
        return this.tituloReservado;
    }

    public void setTituloReservado(String tituloReservado) {
        this.tituloReservado = tituloReservado;
    }

    public String getIsbnReservado() {
        return this.isbnReservado;
    }

    public void setIsbnReservado(String isbnReservado) {
        this.isbnReservado = isbnReservado;
    }


    @Override
    public String toString() {
        return "{" +
            " reservas='" + getReservas() + "'" +
            ", tituloReservado='" + getTituloReservado() + "'" +
            ", isbnReservado='" + getIsbnReservado() + "'" +
            "}";
    }

}
