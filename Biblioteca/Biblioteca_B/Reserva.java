package Biblioteca.Biblioteca_B;

import java.sql.Time;
import java.util.*;

public class Reserva {
    private String libro;
    private Date fecha;
    private Time hora;



    public Reserva() {
    }


    public Reserva(String libro, Date fecha, Time hora) {
        this.libro = libro;
        this.fecha = fecha;
        this.hora = hora;
    }


    public String getLibro() {
        return this.libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return this.hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }


    @Override
    public String toString() {
        return "{" +
            " libro='" + getLibro() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", hora='" + getHora() + "'" +
            "}";
    }



}
