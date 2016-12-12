/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import Formularios.Mantenimiento.MantenimientoProveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import libraries.conexion.Conexion;
import libraries.identidades.IdentidadesProveedores;

/**
 *
 * @author Solis
 */
public class repositorio_proveedores {
 
    
    public void ConsultarRegistro(){

    }
    

    
    public void EliminarRegistros(){

    }
    
    public void Limpiar(){

    }
    
    public boolean ValidacionEspaciosGuardar(){
        boolean espacio = false;
        if(MantenimientoProveedores.txtcodigo.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        if(MantenimientoProveedores.txtnombre.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        if(MantenimientoProveedores.cbtipo.getSelectedIndex() == -1){
            espacio = true;
        }
        return espacio;
    }
    
    public boolean ValidacionEspaciosModificar(){
        boolean espacio = false;
        if(MantenimientoProveedores.txtcodigo.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        if(MantenimientoProveedores.txtnombre.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        if(MantenimientoProveedores.cbtipo.getSelectedIndex() == -1){
            espacio = true;
        }
        if(MantenimientoProveedores.txtidproveedores.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        return espacio;
    }
    
    public boolean ValidacionEspaciosEliminar(){
        boolean espacio = false;
        if(MantenimientoProveedores.txtidproveedores.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        return espacio;
    }
    
}
