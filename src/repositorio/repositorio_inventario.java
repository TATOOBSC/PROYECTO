/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import Formularios.Mantenimiento.MantenimientoInventarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import libraries.conexion.Conexion;
import libraries.identidades.IdentidadesInventario;
import libraries.identidades.IdentidadesProveedores;

/**
 *
 * @author Solis
 */
public class repositorio_inventario {
     
    
    public void IngresarRegistros(IdentidadesInventario id){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("INSERT INTO inventario(codigo_producto,nombre_producto,descripcion,tipo,precio_unitario,id_proveedor,cantidad) VALUES(?,?,?,?,?,?,?)");
            pst.setString(1,id.getCodigo_producto().toUpperCase());
            pst.setString(2,id.getNombre_producto().toUpperCase());
            pst.setString(3,id.getDescripcion().toUpperCase());
            pst.setString(4,id.getTipo().toUpperCase());
            pst.setDouble(5,id.getPrecio_unitario());
            pst.setInt(6,id.getProveedores().getId_proveedores());
            pst.setInt(7,id.getCantidad());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ModificarRegistros(IdentidadesInventario id){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("UPDATE inventario SET codigo_producto=?,nombre_producto=?,descripcion=?,tipo=?,precio_unitario=?,id_proveedor=?,cantidad=? WHERE id_inventario =" + MantenimientoInventarios.txtidproducto.getText());
            pst.setString(1,id.getCodigo_producto().toUpperCase());
            pst.setString(2,id.getNombre_producto().toUpperCase());
            pst.setString(3,id.getDescripcion().toUpperCase());
            pst.setString(4,id.getTipo().toUpperCase());
            pst.setDouble(5,id.getPrecio_unitario());
            pst.setInt(6,id.getProveedores().getId_proveedores());
            pst.setInt(7,id.getCantidad());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    
    public IdentidadesInventario ConsultarRegistros(){
        Conexion con = new Conexion();
        IdentidadesInventario id = null;
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT inventario.*,proveedores.* FROM inventario INNER JOIN proveedores ON inventario.id_proveedor = proveedores.id_proveedores WHERE codigo_producto= '"+ MantenimientoInventarios.txtcodigo.getText().toUpperCase()+ "'");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                IdentidadesProveedores idp = new IdentidadesProveedores(rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12));
                id = new IdentidadesInventario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getInt(7),idp);
            }
            else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO PRODUCTO CON EL CODIGO ESPECICADO", "VALUE NOT FOUND",JOptionPane.ERROR_MESSAGE);
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
            PreparedStatement pst = conex.prepareStatement("DELETE FROM inventario WHERE id_inventario ="+ MantenimientoInventarios.txtidproducto.getText());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Limpiar(){
        MantenimientoInventarios.txtidproducto.setText("");
        MantenimientoInventarios.txtcodigo.setText("");
        MantenimientoInventarios.txtnombre.setText("");
        MantenimientoInventarios.txtadescripcion.setText("");
        MantenimientoInventarios.cbtipo.setSelectedIndex(-1);
        MantenimientoInventarios.txtpreciounitario.setText("");
        MantenimientoInventarios.cbproveedores.setSelectedIndex(-1);
        MantenimientoInventarios.spcantidad.setValue(0);
    }
    
    
    
    public boolean ValidarEspaciosGuardar(){
        boolean espacio = false;
        if(MantenimientoInventarios.txtcodigo.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoInventarios.txtnombre.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoInventarios.txtadescripcion.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoInventarios.cbtipo.getSelectedIndex() == -1){
            espacio = true;
        }
        if(MantenimientoInventarios.txtpreciounitario.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoInventarios.cbproveedores.getSelectedIndex() == -1){
            espacio = true;
        }
        if(Integer.parseInt(MantenimientoInventarios.spcantidad.getValue().toString()) == 0){
            espacio = true;
        }
        return espacio;
    }
    
    public boolean ValidarEspaciosModificar(){
        boolean espacio = false;
        if(MantenimientoInventarios.txtcodigo.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoInventarios.txtnombre.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoInventarios.txtadescripcion.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoInventarios.cbtipo.getSelectedIndex() == -1){
            espacio = true;
        }
        if(MantenimientoInventarios.txtpreciounitario.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoInventarios.cbproveedores.getSelectedIndex() == -1){
            espacio = true;
        }
        if(Integer.parseInt(MantenimientoInventarios.spcantidad.getValue().toString()) == 0){
            espacio = true;
        }
        if(MantenimientoInventarios.txtidproducto.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        return espacio;
    }
    
    public boolean ValidarEspaciosEliminar(){
        boolean espacio = false;
        if(MantenimientoInventarios.txtidproducto.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        return espacio;
    }
}
