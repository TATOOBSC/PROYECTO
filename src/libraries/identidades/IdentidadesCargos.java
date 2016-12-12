/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.identidades;

/**
 *
 * @author Ellet
 */
public class IdentidadesCargos {
    int id_cargos;
    String nombre_cargos;
    

    public IdentidadesCargos(int id_cargos, String nombre_cargos) {
        this.id_cargos = id_cargos;
        this.nombre_cargos = nombre_cargos;
    }

    public IdentidadesCargos(String nombre_cargos) {
        this.nombre_cargos = nombre_cargos;
    }
    
    
    public IdentidadesCargos(){
        
    }

    public int getId_cargos() {
        return id_cargos;
    }

    public void setId_cargos(int id_cargos) {
        this.id_cargos = id_cargos;
    }

    public String getNombre_cargos() {
        return nombre_cargos;
    }

    public void setNombre_cargos(String nombre_cargos) {
        this.nombre_cargos = nombre_cargos;
    }
    
    
}
