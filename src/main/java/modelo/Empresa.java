/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Empresa {
    private String nombre;
    private String sector;
    private String email;

    public Empresa(String nombre, String sector, String email) {
        this.nombre = nombre;
        this.sector = sector;
        this.email = email;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getSector() { return sector; }
    public void setSector(String sector) { this.sector = sector; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", sector=" + sector + ", email=" + email + '}';
    }
}