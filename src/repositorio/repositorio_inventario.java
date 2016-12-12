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
    
    public void EliminarRegistros(){

    }
    
    public void Limpiar(){

        
    }
    
    public void CargarProveedores(){

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
