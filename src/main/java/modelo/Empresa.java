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
