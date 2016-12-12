/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import Formularios.Mantenimiento.MantenimientoUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import libraries.conexion.Conexion;
import libraries.identidades.IdentidadesUsers;

/**
 *
 * @author Solis
 */
public class repositorio_users {

    
    public int CargarIdUser(){

    }

    
    public void EliminarRegistros(){

    }
    
    public void ConsultarRegistros(){

    }
    
    public void Limpiar(){

    }
    
    public boolean ValidacionesEspaciosGuardar(){
        boolean espacio = false;
        if(MantenimientoUsuarios.txtusername.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        if(new String(MantenimientoUsuarios.txtpassword.getPassword()).replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        return espacio;
    }
    
    public boolean ValidacionesEspaciosModificar(){
        boolean espacio = false;
        if(MantenimientoUsuarios.txtusername.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        if(new String(MantenimientoUsuarios.txtpassword.getPassword()).replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        if(MantenimientoUsuarios.txtiduser.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        return espacio;
    }
    
    public boolean ValidacionesEspaciosEliminar(){
        boolean espacio = false;
        if(MantenimientoUsuarios.txtiduser.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        return espacio;
    }
    
    
}
