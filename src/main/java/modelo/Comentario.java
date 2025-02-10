/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Comentario {
    private Visitante visitante;
    private String fecha;
    private int calificacion;
    private String texto;
    private Stand stand;


    public Comentario(Visitante visitante, String fecha, int calificacion, String texto, Stand stand) {
        this.visitante = visitante;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.texto = texto;
        this.stand = stand;
    }

    // Getters y Setters
    public Visitante getVisitante() { return visitante; }
    public void setVisitante(Visitante visitante) { this.visitante = visitante; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public int getCalificacion() { return calificacion; }
    public void setCalificacion(int calificacion) { this.calificacion = calificacion; }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public Stand getStand() { return stand; }
    public void setStand(Stand stand) { this.stand = stand; }

    @Override
    public String toString() {
        return "Comentario{" + "visitante=" + visitante + ", fecha=" + fecha + ", calificacion=" + calificacion + ", texto=" + texto + ", stand=" + stand + '}';
    }
}