package Biblioteca.Biblioteca_B;

public class Bibliotecario extends Persona{
    private String puestoTrabajo;
    private String nif;
    private String contraseña;


    public Bibliotecario() {
    }

    public Bibliotecario(String nombre, String apellido1, String apellido2, int edad,String puestoTrabajo, String nif, String contraseña) {
        super(nombre, apellido1, apellido2, edad);
        this.puestoTrabajo = puestoTrabajo;
        this.nif = nif;
        this.contraseña = contraseña;
    }

    public Bibliotecario(Bibliotecario bibliotecario){
        super(bibliotecario);
        this.puestoTrabajo = bibliotecario.puestoTrabajo;
        this.nif = bibliotecario.nif;
        this.contraseña = bibliotecario.contraseña;
    }

    public String getPuestoTrabajo() {
        return this.puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    @Override
    public String toString() {
        return "{" +
            " puestoTrabajo='" + getPuestoTrabajo() + "'" +
            ", nif='" + getNif() + "'" +
            ", contraseña='" + getContraseña() + "'" +
            "}";
    }

    
}
