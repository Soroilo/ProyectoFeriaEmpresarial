/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import modelo.Empresa;
import java.util.ArrayList;
import java.util.List;

public class EmpresaService {
    private List<Empresa> empresas = new ArrayList<>();
    
 public void agregarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public void eliminarEmpresa(Empresa empresa) {
        empresas.remove(empresa);
    }

    public List<Empresa> listarEmpresas() {
        return empresas;
    }
}