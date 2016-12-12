/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import Formularios.Mantenimiento.MantenimientoCargos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import libraries.conexion.Conexion;
import libraries.identidades.IdentidadesCargos;

/**
 *
 * @author Solis
 */
public class repositorio_cargos {

    

    
    public void ConsultarRegistros(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT * FROM cargos WHERE nombre_cargo = '" + MantenimientoCargos.txtnombrecargo.getText().toUpperCase() + "'");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                MantenimientoCargos.txtidcargo.setText(rs.getString(1));
                MantenimientoCargos.txtnombrecargo.setText(rs.getString(2));
                
            }
            else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO CARGO CON ESE NOMBRE","VALUE NOT FOUND",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void EliminarRegistros(){
        
    }
    
    public void Limpiar(){

    }
     
    public boolean ValidacionEspacioGuardar(){
        boolean espacio = false;
        if(MantenimientoCargos.txtnombrecargo.getText().replaceAll("\\s+","").equals("")){
            espacio = true;
        }
        return espacio;
    }
    
    public boolean ValidacionEspacioModificar(){
        boolean espacio = false;
        if(MantenimientoCargos.txtnombrecargo.getText().replaceAll("\\s+","").equals("")){
            espacio = true;
        }
        if(MantenimientoCargos.txtidcargo.getText().replaceAll("\\s+","").equals("")){
            espacio = true;
        }
        return espacio;
    }
    
    public boolean ValidacionEspacioEliminar(){
        boolean espacio = false;
        if(MantenimientoCargos.txtidcargo.getText().replaceAll("\\s+","").equals("")){
            espacio = true;
        }
        return espacio;
    }
}
