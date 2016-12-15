/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import Formularios.Mantenimiento.MantenimientoInventarios;
import Formularios.Mantenimiento.MantenimientoProveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import libraries.conexion.Conexion;
import libraries.identidades.IdentidadesProveedores;

/**
 *
 * @author Solis
 */
public class repositorio_proveedores {
 
    public void IngresarRegistros(IdentidadesProveedores id){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("INSERT INTO proveedores(codigo_proveedores,nombre_proveedores,tipo_producto) VALUES(?,?,?)");
            pst.setString(1,id.getCodigo_proveedores().toUpperCase());
            pst.setString(2,id.getNombre_proveedores().toUpperCase());
            pst.setString(3,id.getTipo_producto().toUpperCase());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void ModificarRegistros(IdentidadesProveedores id){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("UPDATE proveedores SET codigo_proveedores=?,nombre_proveedores=?,tipo_producto=? WHERE id_proveedores="+ MantenimientoProveedores.txtidproveedores.getText());
            pst.setString(1,id.getCodigo_proveedores().toUpperCase());
            pst.setString(2,id.getNombre_proveedores().toUpperCase());
            pst.setString(3,id.getTipo_producto().toUpperCase());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public IdentidadesProveedores ConsultarRegistro(){
        Conexion con = new Conexion();
        IdentidadesProveedores id = null;
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT * FROM proveedores WHERE codigo_proveedores = '"+ MantenimientoProveedores.txtcodigo.getText().toUpperCase()+"'");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                id = new IdentidadesProveedores(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }
            else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO PROVEEDOR CON EL CODIGO ESPECIFICADO","VALUE NOT FOUND",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
        return id;
    }
    
    public IdentidadesProveedores ConsultarRegistro(String val){
        Conexion con = new Conexion();
        IdentidadesProveedores id = null;
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT * FROM proveedores WHERE nombre_proveedores = '"+val+"'");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                id = new IdentidadesProveedores(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }
            else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO PROVEEDOR CON EL CODIGO ESPECIFICADO","VALUE NOT FOUND",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
        return id;
    }
    

    
    public void EliminarRegistros(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("DELETE FROM proveedores WHERE id_proveedores ="+ MantenimientoProveedores.txtidproveedores.getText());
            pst.executeUpdate();    
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Limpiar(){
        MantenimientoProveedores.txtidproveedores.setText("");
        MantenimientoProveedores.txtcodigo.setText("");
        MantenimientoProveedores.txtnombre.setText("");
        MantenimientoProveedores.cbtipo.setSelectedIndex(-1);
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
    
    public List<IdentidadesProveedores> cargarProveedores(){
        Conexion con = new Conexion();
        List<IdentidadesProveedores> provs = new ArrayList<IdentidadesProveedores>();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT * FROM proveedores WHERE tipo_producto = '" +MantenimientoInventarios.cbtipo.getSelectedItem().toString()+ "'" );
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                IdentidadesProveedores id = new IdentidadesProveedores(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                provs.add(id);
            }
            
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
        return provs;
    }
}
