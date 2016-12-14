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

    
    public void IngresoRegistros(IdentidadesCargos id){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("INSERT INTO cargos(nombre_cargo) VALUES(?)");
            pst.setString(1,id.getNombre_cargos().toUpperCase());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public IdentidadesCargos ConsultarRegistros(String val){
        Conexion con = new Conexion();
        IdentidadesCargos idc = null;
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT * FROM cargos WHERE nombre_cargo = ?");
            pst.setString(1, val);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                idc = new IdentidadesCargos(rs.getInt(1),rs.getString(2));
            }
            else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO CARGO CON ESE NOMBRE","VALUE NOT FOUND",JOptionPane.ERROR_MESSAGE);
            }
            return idc;
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    
    
    public void ModificarRegistros(IdentidadesCargos id){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("UPDATE cargos SET nombre_cargo = ? WHERE id_cargo =?");
            pst.setInt(2, id.getId_cargos());
            pst.setString(1,id.getNombre_cargos().toUpperCase());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void EliminarRegistros(int val){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("DELETE FROM cargos WHERE id_cargo =?");
            pst.setInt(1, val);
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
}
