package Biblioteca.Biblioteca_A;
    
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int contador = 0;
        while(contador == 0){
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Elige");
            System.out.println("1.Añadir libro");
            System.out.println("2.Eliminar libro");
            System.out.println("3.Buscar por ISBN");
            System.out.println("4.Buscar por titulo");
            System.out.println("5.Mostrar todos los libros");
            System.out.println("6.Mostrar libros disponibles");
            System.out.println("7.Añadir bibliotecario");
            System.out.println("8.Eliminar bibliotecario");
            System.out.println("9.Añadir usuario");
            System.out.println("10.Eliminar usuario");
            System.out.println("11.Hacer reserva");
            System.out.println("12.Devolver libro");
            System.out.println("0.Salir");
            
            int number = keyboard.nextInt();
            switch(number){
                case 0:
                    contador = contador + 1;
                    break;
                case 1:
                    Libro.AñadirLibro();;
                    break;
                case 2:
                    Libro.EliminarLibro();
                    break;
                case 3:;
                    Libro.BuscarISBN();
                    break;
                case 4:
                    Libro.BuscarTitulo();
                    break;
                case 5:
                    Biblioteca.MostrarLibros();
                    break;
                case 6:
                    Biblioteca.MostrarLibrosDisponibles();
                    break;
                case 7:
                    Bibliotecario.AñadirBibliotecario();
                    break;
                case 8:
                    Bibliotecario.EliminarBibliotecario();
                    break;
                case 9:
                    Usuario.AñadirUsuario();
                    break;
                case 10:
                    Usuario.EliminarUsuario();
                    break;
                case 11:
                    Usuario.Reserva();
                    break;
                case 12:
                    Usuario.Devolver();
            }
        }

        
        

    }
}
