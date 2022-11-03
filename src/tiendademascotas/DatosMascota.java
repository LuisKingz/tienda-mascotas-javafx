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
public class DatosMascota {

    private int idMascota;
    private String NombreMascota;
    private String color;
    private String NombreDueño;
    private String sexo;
    private int edad;

    public DatosMascota(int idMascota, String NombreMascota, String color, String NombreDueño, String sexo, int edad) {
        this.idMascota = idMascota;
        this.NombreMascota = NombreMascota;
        this.color = color;
        this.NombreDueño = NombreDueño;
        this.sexo = sexo;
        this.edad = edad;
    }
    public DatosMascota(){
        this.idMascota = 0;
        this.NombreMascota = "";
        this.color = "";
        this.NombreDueño = "";
        this.sexo = "";
        this.edad = 0;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public String getNombreMascota() {
        return NombreMascota;
    }

    public String getColor() {
        return color;
    }

    public String getNombreDueño() {
        return NombreDueño;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNombreDueño(String NombreDueño) {
        this.NombreDueño = NombreDueño;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
