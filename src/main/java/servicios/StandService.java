/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import modelo.Stand;
import modelo.Empresa;
import java.util.ArrayList;
import java.util.List;

public class StandService {
    private List<Stand> stands = new ArrayList<>();

    public void agregarStand(Stand stand) {
        stands.add(stand);
    }

    public void asignarEmpresa(Stand stand, Empresa empresa) {
        stand.setEmpresa(empresa);
    }