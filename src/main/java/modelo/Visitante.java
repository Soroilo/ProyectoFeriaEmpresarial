/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Visitante {
    private String nombre;
    private String identificacion;
    private String email;

    public Visitante(String nombre, String identificacion, String email) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
    }
    
  // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Visitante{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", email=" + email + '}';
    }
}