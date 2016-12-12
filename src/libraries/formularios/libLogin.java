/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.formularios;

import Formularios.Principal.Login;
import Formularios.Principal.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import libraries.conexion.Conexion;
/**
 *
 * @author Ellet
 */
public class libLogin {
    
    
    public boolean ComprobarLogin(){
        Conexion con = new Conexion();
        boolean log = false;
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT username,password FROM users");
            ResultSet rs = pst.executeQuery();
            while(rs.next() && log == false){
                if(Login.txtusername.getText().equals(rs.getString(1)) && new String(Login.txtpassword.getPassword()).equals(rs.getString(2))){
                    log = true;
                }
            }
            return log;
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            return log;
        }
    }
    
    public void Habilitar(){
        Login.txtusername.setEnabled(true);
        Login.txtpassword.setEnabled(true);
        Login.botlog.setEnabled(true);
    }
    
    public void Deshabilitar(){
        Login.txtusername.setEnabled(false);
        Login.txtpassword.setEnabled(false);
        Login.botlog.setEnabled(false);
    }
    
    ActionListener al = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Habilitar();
        }
    };
    
    public void LoginTimer(){
        Timer time = new Timer(15000,al);
        Deshabilitar();
        time.start();
    }
    
    public void CargarDatos(){
        Conexion con = new Conexion();
        try{
            Connection conex = con.Conectar();
            PreparedStatement pst = conex.prepareCall("SELECT empleados.nombres_empleado,empleados.apellidos_empleado,users.nivel FROM users "
                                                        + "INNER JOIN empleados ON (users.id_user = empleados.id_user) "
                                                        + "WHERE users.username ='"+ Login.txtusername.getText()+ "'"                           );
            ResultSet rs = pst.executeQuery();
            rs.next();
            Principal.lbnombres.setText(rs.getString(1));
            Principal.lbapellidos.setText(rs.getString(2));
            Principal.lbniveluser.setText(rs.getString(3));
        }
        catch(SQLException exc){
            JOptionPane.showMessageDialog(null,exc.getMessage(),"WARNING",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
