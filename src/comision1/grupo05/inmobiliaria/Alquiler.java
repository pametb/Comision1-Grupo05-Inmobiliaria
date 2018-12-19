/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo05.inmobiliaria;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Alquiler {
   private int id_alquiler;
   private LocalDate fechaDeInicio;
   private LocalDate fechaFin;
   private double precio;
   private Persona persona;
   private Inmueble inmueble; 

    public Alquiler(int id_alquiler, LocalDate fechaDeInicio, LocalDate fechaFin, double precio, Persona persona, Inmueble inmueble) {
        this.id_alquiler = id_alquiler;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.persona = persona;
        this.inmueble = inmueble;
    }

    public Alquiler(LocalDate fechaDeInicio, LocalDate fechaFin, double precio, Persona persona, Inmueble inmueble) {
        this.fechaDeInicio = fechaDeInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.persona = persona;
        this.inmueble = inmueble;
    }

    public int getId_alquiler() {
        return id_alquiler;
    }

    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
   
   
}
