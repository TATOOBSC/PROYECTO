/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.formularios;

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
 * @author Ellet
 */
public class dbProveedores {
    
    public void IngresarIdentidades(){
        IdentidadesProveedores id = new IdentidadesProveedores();
        id.setCodigo_proveedores(MantenimientoProveedores.txtcodigo.getText());
        id.setNombre_proveedores(MantenimientoProveedores.txtnombre.getText());
        id.setTipo_producto(MantenimientoProveedores.cbtipo.getSelectedItem().toString());
        IngresarRegistros(id);
    }
    
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
    
    public void ConsultarRegistro(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT * FROM proveedores WHERE codigo_proveedores = '"+ MantenimientoProveedores.txtcodigo.getText().toUpperCase()+"'");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                MantenimientoProveedores.txtidproveedores.setText(rs.getString(1));
                MantenimientoProveedores.txtcodigo.setText(rs.getString(2));
                MantenimientoProveedores.txtnombre.setText(rs.getString(3));
                MantenimientoProveedores.cbtipo.setSelectedItem(rs.getString(4));
            }
            else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO PROVEEDOR CON EL CODIGO ESPECIFICADO","VALUE NOT FOUND",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ModificarIdentidades(){
        IdentidadesProveedores id = new IdentidadesProveedores();
        id.setCodigo_proveedores(MantenimientoProveedores.txtcodigo.getText());
        id.setNombre_proveedores(MantenimientoProveedores.txtnombre.getText());
        id.setTipo_producto(MantenimientoProveedores.cbtipo.getSelectedItem().toString());
        ModificarRegistros(id);
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
    
}


