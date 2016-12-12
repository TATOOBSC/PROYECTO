/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.formularios;
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
 * @author Ellet
 */
public class dbUsers {
    public void IngresarIdentidades(){
        IdentidadesUsers id = new IdentidadesUsers();
        id.setUsername(MantenimientoUsuarios.txtusername.getText());
        id.setPassword(new String(MantenimientoUsuarios.txtpassword.getPassword()));
        id.setNivel(MantenimientoUsuarios.cbnivel.getSelectedItem().toString());
        IngresarRegistros(id);
    }
    
    public void IngresarRegistros(IdentidadesUsers id){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("INSERT INTO users(username,password,nivel) VALUES(?,?,?)");
            pst.setString(1, id.getUsername());
            pst.setString(2, id.getPassword());
            pst.setString(3, id.getNivel());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int CargarIdUser(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT id_user FROM users WHERE username = '" + MantenimientoUsuarios.txtusername.getText() + "'");
            ResultSet rs = pst.executeQuery();
            rs.next();
            return rs.getInt(1);
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
    
    public void ModificarIdentidades(){
        IdentidadesUsers id = new IdentidadesUsers();
        id.setUsername(MantenimientoUsuarios.txtusername.getText());
        id.setPassword(new String(MantenimientoUsuarios.txtpassword.getPassword()));
        id.setNivel(MantenimientoUsuarios.cbnivel.getSelectedItem().toString());
        ModificarRegistros(id);
    }
    
    public void ModificarRegistros(IdentidadesUsers id){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("UPDATE users SET username =?,password =?,nivel=? WHERE id_user =" + MantenimientoUsuarios.txtiduser.getText());
            pst.setString(1, id.getUsername());
            pst.setString(2, id.getPassword());
            pst.setString(3, id.getNivel());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void EliminarRegistros(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("DELETE FROM users WHERE id_user =" + MantenimientoUsuarios.txtiduser.getText());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ConsultarRegistros(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT * FROM users WHERE username = '"+ MantenimientoUsuarios.txtusername.getText()+ "'");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                MantenimientoUsuarios.txtiduser.setText(rs.getString(1));
                MantenimientoUsuarios.txtusername.setText(rs.getString(2));
                MantenimientoUsuarios.txtpassword.setText(rs.getString(3));
                MantenimientoUsuarios.cbnivel.setSelectedItem(rs.getString(4));
            }
            else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO USUARIO CON ESE NOMBRE","VALUE NOT FOUND",JOptionPane.ERROR_MESSAGE);
            }
            
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Limpiar(){
        MantenimientoUsuarios.txtiduser.setText("");
        MantenimientoUsuarios.txtusername.setText("");
        MantenimientoUsuarios.txtpassword.setText("");
        MantenimientoUsuarios.cbnivel.setSelectedIndex(-1);
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
