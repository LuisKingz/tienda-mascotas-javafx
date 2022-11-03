/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendademascotas;

/**
 *
 * @author Luis Reyes
 */
public class DatosDueño {

    private int IdDueño;
    private String nombre;
    private int Edad;
    private int telefono;
    private String NombreMascota;

    public DatosDueño(int IdDueño, String nombre, int Edad, int telefono, String NombreMascota) {
        this.IdDueño = IdDueño;
        this.nombre = nombre;
        this.Edad = Edad;
        this.telefono = telefono;
        this.NombreMascota = NombreMascota;
    }

   
    public DatosDueño(){
        this.IdDueño = 0;
        this.nombre = "";
        this.Edad = 0;
        this.telefono = 0;
        this.NombreMascota = "";
    }

    public int getIdDueño() {
        return IdDueño;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setIdDueño(int IdDueño) {
        this.IdDueño = IdDueño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }
    
}
