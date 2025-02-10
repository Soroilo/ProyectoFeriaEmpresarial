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
    
 public List<Stand> listarStandsDisponibles() {
        List<Stand> disponibles = new ArrayList<>();
        for (Stand stand : stands) {
            if (stand.getEmpresa() == null) {
                disponibles.add(stand);
            }
        }
        return disponibles;
    }

    public List<Stand> listarStandsOcupados() {
        List<Stand> ocupados = new ArrayList<>();
        for (Stand stand : stands) {
            if (stand.getEmpresa() != null) {
                ocupados.add(stand);
            }
        }
        return ocupados;
    }
}