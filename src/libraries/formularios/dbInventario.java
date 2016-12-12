/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.formularios;

import Formularios.Mantenimiento.MantenimientoInventarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import libraries.conexion.Conexion;
import libraries.identidades.IdentidadesInventario;

/**
 *
 * @author Ellet
 */
public class dbInventario {
    
    public void IngresarIdentidades(){
        IdentidadesInventario id = new IdentidadesInventario();
        id.setCodigo_producto(MantenimientoInventarios.txtcodigo.getText());
        id.setNombre_producto(MantenimientoInventarios.txtnombre.getText());
        id.setDescripcion(MantenimientoInventarios.txtadescripcion.getText());
        id.setTipo(MantenimientoInventarios.cbtipo.getSelectedItem().toString());
        id.setPrecio_unitario(Double.parseDouble(MantenimientoInventarios.txtpreciounitario.getText()));
        id.setId_proveedor(CargarIdProveedores());
        id.setCantidad((int) MantenimientoInventarios.spcantidad.getValue());
        IngresarRegistros(id);
        
    }
    
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
            pst.setInt(6,id.getId_proveedor());
            pst.setInt(7,id.getCantidad());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int CargarIdProveedores(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT id_proveedores FROM proveedores WHERE nombre_proveedores = '" + MantenimientoInventarios.cbproveedores.getSelectedItem().toString().toUpperCase() + "'");
            ResultSet rs = pst.executeQuery();
            rs.next();
            return rs.getInt(1);
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
    
    public void ConsultarRegistros(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT inventario.*,proveedores.nombre_proveedores FROM inventario INNER JOIN proveedores ON inventario.id_proveedor = proveedores.id_proveedores WHERE codigo_producto= '"+ MantenimientoInventarios.txtcodigo.getText().toUpperCase()+ "'");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                MantenimientoInventarios.txtidproducto.setText(rs.getString(1));
                MantenimientoInventarios.txtcodigo.setText(rs.getString(2));
                MantenimientoInventarios.txtnombre.setText(rs.getString(3));
                MantenimientoInventarios.txtadescripcion.setText(rs.getString(4));
                MantenimientoInventarios.cbtipo.setSelectedItem(rs.getString(5));
                MantenimientoInventarios.txtpreciounitario.setText(rs.getString(6));
                MantenimientoInventarios.spcantidad.setValue(rs.getObject(7));
                MantenimientoInventarios.cbproveedores.setSelectedItem(rs.getString(9));
            }
            else{
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO PRODUCTO CON EL CODIGO ESPECICADO", "VALUE NOT FOUND",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ModificarIdentidades(){
        IdentidadesInventario id = new IdentidadesInventario();
        id.setCodigo_producto(MantenimientoInventarios.txtcodigo.getText());
        id.setNombre_producto(MantenimientoInventarios.txtnombre.getText());
        id.setDescripcion(MantenimientoInventarios.txtadescripcion.getText());
        id.setTipo(MantenimientoInventarios.cbtipo.getSelectedItem().toString());
        id.setPrecio_unitario(Double.parseDouble(MantenimientoInventarios.txtpreciounitario.getText()));
        id.setId_proveedor(CargarIdProveedores());
        id.setCantidad((int) MantenimientoInventarios.spcantidad.getValue());
        ModificarRegistros(id);
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
            pst.setInt(6,id.getId_proveedor());
            pst.setInt(7,id.getCantidad());
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
    
    public void CargarProveedores(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT nombre_proveedores FROM proveedores WHERE tipo_producto = '"+ MantenimientoInventarios.cbtipo.getSelectedItem().toString().toUpperCase()+ "'");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                MantenimientoInventarios.cbproveedores.addItem(rs.getString(1));
            }
            MantenimientoInventarios.cbproveedores.setSelectedIndex(-1);
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE); 
        }
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
