/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo05.inmobiliaria;

/**
 *
 * @author usuario
 */
public class Inmueble {
       private int id_inmueble;
    private String direccion;
    private double precio;
    private boolean disponible;
    private Persona persona;

    public Inmueble(int id_inmueble, String direccion, double precio, boolean disponible, Persona persona) {
        this.id_inmueble = id_inmueble;
        this.direccion = direccion;
        this.precio = precio;
        this.disponible = disponible;
        this.persona = persona;
    }

    public Inmueble(String direccion, double precio, boolean disponible, Persona persona) {
        this.direccion = direccion;
        this.precio = precio;
        this.disponible = disponible;
        this.persona = persona;
    }

    public int getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}
