/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.formularios;

import Formularios.Mantenimiento.MantenimientoPromociones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import libraries.conexion.Conexion;
import libraries.identidades.IdentidadesPromociones;

/**
 *
 * @author Ellet
 */
public class dbPromociones {
    
    public void IngresarIdentidades(){
        IdentidadesPromociones id = new IdentidadesPromociones();
        id.setCodigo_promocion(MantenimientoPromociones.txtcodigo.getText());
        id.setNombre_promocion(MantenimientoPromociones.txtnombre.getText());
        id.setDescripcion(MantenimientoPromociones.txtadescripcion.getText());
        id.setTipo(MantenimientoPromociones.cbtipo.getSelectedItem().toString());
        IngresarRegistros(id);
    }
    
    public void IngresarRegistros(IdentidadesPromociones id){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("INSERT INTO promociones(codigo_promocion,nombre_promocion,descripcion,tipo) VALUES(?,?,?,?)");
            pst.setString(1,id.getCodigo_promocion().toUpperCase());
            pst.setString(2,id.getNombre_promocion().toUpperCase());
            pst.setString(3,id.getDescripcion().toUpperCase());
            pst.setString(4,id.getTipo().toUpperCase());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ConsultarRegistros(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT * FROM promociones WHERE codigo_promocion = '"+ MantenimientoPromociones.txtcodigo.getText().toUpperCase()+ "'");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                MantenimientoPromociones.txtidpromocion.setText(rs.getString(1));
                MantenimientoPromociones.txtnombre.setText(rs.getString(3));
                MantenimientoPromociones.txtcodigo.setText(rs.getString(2));
                MantenimientoPromociones.txtadescripcion.setText(rs.getString(4));
                MantenimientoPromociones.cbtipo.setSelectedItem(rs.getString(5));        
            }
            else{
                JOptionPane.showMessageDialog(null,"NO SE PUDO ENCONTRAR PROMOCION CON ESE CODIGO","VALUE NOT FOUND",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ModificarIdentidades(){
        IdentidadesPromociones id = new IdentidadesPromociones();
        id.setCodigo_promocion(MantenimientoPromociones.txtcodigo.getText());
        id.setNombre_promocion(MantenimientoPromociones.txtnombre.getText());
        id.setDescripcion(MantenimientoPromociones.txtadescripcion.getText());
        id.setTipo(MantenimientoPromociones.cbtipo.getSelectedItem().toString());
        ModificarRegistros(id);
    }
    
    public void ModificarRegistros(IdentidadesPromociones id){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareStatement("UPDATE promociones SET codigo_promocion=?,nombre_promocion=?,descripcion=?,tipo=? WHERE id_promociones = "+ MantenimientoPromociones.txtidpromocion.getText());
            pst.setString(1,id.getCodigo_promocion().toUpperCase());
            pst.setString(2,id.getNombre_promocion().toUpperCase());
            pst.setString(3,id.getDescripcion().toUpperCase());
            pst.setString(4,id.getTipo().toUpperCase());
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
            PreparedStatement pst = conex.prepareStatement("DELETE FROM promociones WHERE id_promociones = " + MantenimientoPromociones.txtidpromocion.getText());
            pst.executeUpdate();
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Limpiar(){
        MantenimientoPromociones.txtcodigo.setText("");
        MantenimientoPromociones.txtidpromocion.setText("");
        MantenimientoPromociones.txtnombre.setText("");
        MantenimientoPromociones.txtadescripcion.setText("");
        MantenimientoPromociones.cbtipo.setSelectedIndex(-1);
    }
    
    public boolean ValidacionEspaciosGuardar(){
        boolean espacio = false;
        if(MantenimientoPromociones.txtcodigo.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoPromociones.txtnombre.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoPromociones.txtadescripcion.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoPromociones.cbtipo.getSelectedIndex() == -1){
            espacio = true;
        }
        return espacio;       
    }
    
    public boolean ValidacionEspaciosModificar(){
        boolean espacio = false;
        if(MantenimientoPromociones.txtcodigo.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoPromociones.txtnombre.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoPromociones.txtadescripcion.getText().replaceAll("\\s","").equals("")){
            espacio = true;
        }
        if(MantenimientoPromociones.cbtipo.getSelectedIndex() == -1){
            espacio = true;
        }
        if(MantenimientoPromociones.txtidpromocion.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        return espacio;       
    }
    
    public boolean ValidacionEspaciosEliminar(){
        boolean espacio = false;
        if(MantenimientoPromociones.txtidpromocion.getText().replaceAll("\\s", "").equals("")){
            espacio = true;
        }
        return espacio;       
    }
}
