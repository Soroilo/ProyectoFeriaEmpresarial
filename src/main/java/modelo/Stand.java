/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Stand {
    private int numero;
    private String ubicacion;
    private String tamano;
    private Empresa empresa;

    public Stand(int numero, String ubicacion, String tamano) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
    }

    // Getters y Setters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }

    public Empresa getEmpresa() { return empresa; }
    public void setEmpresa(Empresa empresa) { this.empresa = empresa; }

    @Override
    public String toString() {
        return "Stand{" + "numero=" + numero + ", ubicacion=" + ubicacion + ", tamano=" + tamano + ", empresa=" + empresa + '}';
    }
}