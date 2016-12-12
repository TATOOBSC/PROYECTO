/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Mantenimiento;

import javax.swing.JOptionPane;
import libraries.formularios.dbCargos;
import libraries.formularios.libValidacionesTexto;
import libraries.identidades.IdentidadesCargos;

/**
 *
 * @author Ellet
 */
public class MantenimientoCargos extends javax.swing.JFrame {
    dbCargos dbcar = new dbCargos();
    /**
     * Creates new form MantenimientoCargos
     */
    public MantenimientoCargos() {
        initComponents();
        this.setLocationRelativeTo(null);
        lbidcargo.setVisible(false);
        txtidcargo.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbidcargo = new javax.swing.JLabel();
        botonnuevo = new javax.swing.JButton();
        botonmodificar = new javax.swing.JButton();
        botoneliminar = new javax.swing.JButton();
        botonconsultar = new javax.swing.JButton();
        botonguardar = new javax.swing.JButton();
        botoncancelar = new javax.swing.JButton();
        txtnombrecargo = new javax.swing.JTextField();
        txtidcargo = new javax.swing.JTextField();
        botonrealizarconsulta = new javax.swing.JButton();
        lbimagenfondo = new javax.swing.JLabel();

        setTitle("MANTENIMIENTO CARGOS");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setText("MANTENIMIENTO CARGOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lbidcargo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbidcargo.setText("ID CARGO:");
        getContentPane().add(lbidcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        botonnuevo.setText("NUEVO");
        botonnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(botonnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 181, 146, 40));

        botonmodificar.setText("MODIFICAR");
        botonmodificar.setEnabled(false);
        botonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 239, -1, 40));

        botoneliminar.setText("ELIMINAR");
        botoneliminar.setEnabled(false);
        botoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botoneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 239, 92, 40));

        botonconsultar.setText("CONSULTAR");
        botonconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(botonconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 181, 146, 40));

        botonguardar.setText("GUARDAR");
        botonguardar.setEnabled(false);
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 239, 90, 40));

        botoncancelar.setText("CANCELAR");
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botoncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 297, 140, 40));

        txtnombrecargo.setEnabled(false);
        txtnombrecargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrecargoActionPerformed(evt);
            }
        });
        txtnombrecargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombrecargoKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombrecargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 88, 136, -1));

        txtidcargo.setEditable(false);
        txtidcargo.setEnabled(false);
        getContentPane().add(txtidcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 128, 136, -1));

        botonrealizarconsulta.setText("...");
        botonrealizarconsulta.setEnabled(false);
        botonrealizarconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrealizarconsultaActionPerformed(evt);
            }
        });
        getContentPane().add(botonrealizarconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 87, 31, -1));

        lbimagenfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/rsz_1rsz_mantenimiento.jpg"))); // NOI18N
        lbimagenfondo.setText(" ");
        getContentPane().add(lbimagenfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonnuevoActionPerformed
        botonguardar.setEnabled(true);
        botonrealizarconsulta.setEnabled(false);
        botonmodificar.setEnabled(false);
        botoneliminar.setEnabled(false);
        lbidcargo.setVisible(false);
        txtidcargo.setVisible(false);
        HabilitarCampos();
        botonnuevo.setEnabled(false);
        botonconsultar.setEnabled(true);
        Limpiar();
    }//GEN-LAST:event_botonnuevoActionPerformed

    private void botoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarActionPerformed
        if(ValidacionEspacioEliminar()){
            JOptionPane.showMessageDialog(null, "DEBE LLENAR ID DEL CARGO A ELIMINAR", "WARNING",JOptionPane.ERROR_MESSAGE);
        }else{
            dbcar.EliminarRegistros(Integer.parseInt(txtidcargo.getText()));
            DeshabilitarCampos();
            botonconsultar.setEnabled(true);
            Limpiar();
        }
        
    }//GEN-LAST:event_botoneliminarActionPerformed

    private void botonconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonconsultarActionPerformed
        botonguardar.setEnabled(false);
        botonrealizarconsulta.setEnabled(true);
        botonmodificar.setEnabled(true);
        botoneliminar.setEnabled(true);
        botoneliminar.setEnabled(true);
        lbidcargo.setVisible(true);
        txtidcargo.setVisible(true);
        HabilitarCampos();
        botonconsultar.setEnabled(false);
        botonnuevo.setEnabled(true);
        Limpiar();
    }//GEN-LAST:event_botonconsultarActionPerformed

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
        if(ValidacionEspacioGuardar()){
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS DATOS", "WARNING",JOptionPane.ERROR_MESSAGE);
        }else{
            IdentidadesCargos idc = new IdentidadesCargos(txtnombrecargo.getText());
            dbcar.IngresoRegistros(idc);
            DeshabilitarCampos();
            botonnuevo.setEnabled(true);
            botonconsultar.setEnabled(true);
            Limpiar();
        }
        
        
    }//GEN-LAST:event_botonguardarActionPerformed

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botoncancelarActionPerformed

    private void txtnombrecargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrecargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrecargoActionPerformed

    private void botonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmodificarActionPerformed
        if(ValidacionEspacioModificar()){
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS DATOS", "WARNING",JOptionPane.ERROR_MESSAGE);
        }else{
            IdentidadesCargos idc = new IdentidadesCargos(Integer.parseInt(txtidcargo.getText()),txtnombrecargo.getText());
            dbcar.ModificarRegistros(idc);
            DeshabilitarCampos();
            botonconsultar.setEnabled(true);
            Limpiar();
        }
        
    }//GEN-LAST:event_botonmodificarActionPerformed

    private void botonrealizarconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrealizarconsultaActionPerformed
        if(txtnombrecargo.getText().replaceAll("\\s","").equals("")){
            JOptionPane.showMessageDialog(null, "PORFAVOR LLENE PARAMETRO DE BUSQUEDA","WARNING",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            IdentidadesCargos idc = dbcar.ConsultarRegistros(txtnombrecargo.getText());
            txtidcargo.setText(Integer.toString(idc.getId_cargos()));
            txtnombrecargo.setText(idc.getNombre_cargos());
        }
        
    }//GEN-LAST:event_botonrealizarconsultaActionPerformed

    private void txtnombrecargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombrecargoKeyTyped
        new libValidacionesTexto().ValidacionesCaracteresEspeciales(evt);
    }//GEN-LAST:event_txtnombrecargoKeyTyped
    
    public void HabilitarCampos(){
        txtnombrecargo.setEnabled(true);
        txtidcargo.setEnabled(true);
        
    }
    
    public void DeshabilitarCampos(){
        txtnombrecargo.setEnabled(false);
        txtidcargo.setEnabled(false);
        botonrealizarconsulta.setEnabled(false);
        botonmodificar.setEnabled(false);
        botoneliminar.setEnabled(false);
        botonguardar.setEnabled(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoCargos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoncancelar;
    private javax.swing.JButton botonconsultar;
    private javax.swing.JButton botoneliminar;
    private javax.swing.JButton botonguardar;
    private javax.swing.JButton botonmodificar;
    private javax.swing.JButton botonnuevo;
    private javax.swing.JButton botonrealizarconsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbidcargo;
    private javax.swing.JLabel lbimagenfondo;
    public static javax.swing.JTextField txtidcargo;
    public static javax.swing.JTextField txtnombrecargo;
    // End of variables declaration//GEN-END:variables

    public void Limpiar(){
        MantenimientoCargos.txtidcargo.setText("");
        MantenimientoCargos.txtnombrecargo.setText("");
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