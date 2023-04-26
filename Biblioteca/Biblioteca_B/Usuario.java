package Biblioteca.Biblioteca_B;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private String telefono;
    private String direccion;
    private String codigoPostal;
    private String correoElectronico;
    private List<Reserva> reservas;
    
    public Usuario() {
        this.reservas = new ArrayList<>();
    }
    
    public Usuario(String nombre, String apellido1, String apellido2, int edad, String telefono, String direccion,
                   String codigoPostal, String correoElectronico, List<Reserva> reservas) {
        super(nombre, apellido1, apellido2, edad);
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.correoElectronico = correoElectronico;
        this.reservas = reservas;
    }
    
    public Usuario(Usuario usuario) {
        super(usuario);
        this.telefono = usuario.telefono;
        this.direccion = usuario.direccion;
        this.codigoPostal = usuario.codigoPostal;
        this.correoElectronico = usuario.correoElectronico;
        this.reservas = new ArrayList<>(usuario.reservas);
    }
    
    // getters/setters
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getCodigoPostal() {
        return codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public List<Reserva> getReservas() {
        return reservas;
    }


    @Override
    public String toString() {
        return "{" +
            "nombre ='" + getNombre() + "'" +
            "primer apellido ='" + getApellido1() + "'" +
            "segundo apellido ='" + getApellido2() + "'" + 
            "edad ='" + getEdad() + "'" +
            " telefono='" + getTelefono() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", codigoPostal='" + getCodigoPostal() + "'" +
            ", correoElectronico='" + getCorreoElectronico() + "'" +
            ", reservas='" + getReservas() + "'" +
            "}";
    }

}