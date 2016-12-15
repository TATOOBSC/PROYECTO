/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.Mantenimiento;

import javax.swing.JOptionPane;
import libraries.formularios.dbPromociones;
import libraries.formularios.libValidacionesTexto;
import libraries.identidades.IdentidadesPromociones;
import repositorio.repositorio_promociones;

/**
 *
 * @author Ellet
 */
public class MantenimientoPromociones extends javax.swing.JFrame {
    repositorio_promociones repro = new repositorio_promociones();
    /**
     * Creates new form MantenimientoPromociones
     */
    public MantenimientoPromociones() {
        initComponents();
        this.setLocationRelativeTo(null);
        lbidpromocion.setVisible(false);
        txtidpromocion.setVisible(false);
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadescripcion = new javax.swing.JTextArea();
        cbtipo = new javax.swing.JComboBox<>();
        botoneliminar = new javax.swing.JButton();
        botonconsultar = new javax.swing.JButton();
        botonguardar = new javax.swing.JButton();
        botoncancelar = new javax.swing.JButton();
        botonnuevo = new javax.swing.JButton();
        botonmodificar = new javax.swing.JButton();
        lbidpromocion = new javax.swing.JLabel();
        txtidpromocion = new javax.swing.JTextField();
        botonrealizarconsulta = new javax.swing.JButton();
        lbimagenfondo = new javax.swing.JLabel();

        setTitle("MANTENIMIENTO PROMOCIONES");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setText("MANTENIMIENTO PROMOCIONES");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("CODIGO:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 111, -1, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("DESCRIPCION:");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 149, -1, -1));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("TIPO:");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 261, -1, -1));

        txtcodigo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtcodigo.setToolTipText("");
        txtcodigo.setEnabled(false);
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 67, 166, -1));

        txtnombre.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtnombre.setToolTipText("");
        txtnombre.setEnabled(false);
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 108, 166, -1));

        jScrollPane1.setToolTipText("");
        jScrollPane1.setEnabled(false);

        txtadescripcion.setColumns(20);
        txtadescripcion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtadescripcion.setRows(5);
        txtadescripcion.setEnabled(false);
        jScrollPane1.setViewportView(txtadescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 149, -1, -1));

        cbtipo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHIP", "RECARGA" }));
        cbtipo.setSelectedIndex(-1);
        cbtipo.setToolTipText("");
        cbtipo.setEnabled(false);
        cbtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 258, -1, -1));

        botoneliminar.setText("ELIMINAR");
        botoneliminar.setEnabled(false);
        botoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botoneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 423, 92, 40));

        botonconsultar.setText("CONSULTAR");
        botonconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(botonconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 365, 146, 40));

        botonguardar.setText("GUARDAR");
        botonguardar.setEnabled(false);
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 423, 90, 40));

        botoncancelar.setText("CANCELAR");
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botoncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 481, 140, 40));

        botonnuevo.setText("NUEVO");
        botonnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(botonnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 365, 146, 40));

        botonmodificar.setText("MODIFICAR");
        botonmodificar.setEnabled(false);
        botonmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 423, -1, 40));

        lbidpromocion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbidpromocion.setText("ID PROMOCION:");
        lbidpromocion.setToolTipText("");
        getContentPane().add(lbidpromocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 309, -1, -1));

        txtidpromocion.setEditable(false);
        txtidpromocion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtidpromocion.setToolTipText("");
        txtidpromocion.setEnabled(false);
        getContentPane().add(txtidpromocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 306, 84, -1));

        botonrealizarconsulta.setText("...");
        botonrealizarconsulta.setEnabled(false);
        botonrealizarconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrealizarconsultaActionPerformed(evt);
            }
        });
        getContentPane().add(botonrealizarconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 67, 31, -1));

        lbimagenfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/rsz_mantenimiento.jpg"))); // NOI18N
        lbimagenfondo.setText(" ");
        getContentPane().add(lbimagenfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarActionPerformed
        if(repro.ValidacionEspaciosEliminar()){
            JOptionPane.showMessageDialog(null, "DEBE LLENAR LA ID DE LA PROMOCION A ELIMINAR", "WARNING",JOptionPane.ERROR_MESSAGE);
        }
        else{
            repro.EliminarRegistros();
            DeshabilitarCampos();
            repro.Limpiar();
            botonnuevo.setEnabled(true);
            botonconsultar.setEnabled(true);
            botonrealizarconsulta.setEnabled(false);
            botonmodificar.setEnabled(false);
            botoneliminar.setEnabled(false);
            botonguardar.setEnabled(false);
        }
        
    }//GEN-LAST:event_botoneliminarActionPerformed

    private void botonconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonconsultarActionPerformed
        botonguardar.setEnabled(false);
        botonrealizarconsulta.setEnabled(true);
        botonmodificar.setEnabled(true);
        botoneliminar.setEnabled(true);
        lbidpromocion.setVisible(true);
        txtidpromocion.setVisible(true);
        HabilitarCampos();
        botonconsultar.setEnabled(false);
        botonnuevo.setEnabled(true);
        repro.Limpiar();
    }//GEN-LAST:event_botonconsultarActionPerformed

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
        if(repro.ValidacionEspaciosGuardar()){
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS DATOS", "WARNING",JOptionPane.ERROR_MESSAGE);
        }
        else{
            IdentidadesPromociones id = new IdentidadesPromociones(txtcodigo.getText(),txtnombre.getText(),txtadescripcion.getText(),cbtipo.getSelectedItem().toString());
            repro.IngresarRegistros(id);
            DeshabilitarCampos();
            repro.Limpiar();
            botonnuevo.setEnabled(true);
            botonconsultar.setEnabled(true);
            botonrealizarconsulta.setEnabled(false);
            botonmodificar.setEnabled(false);
            botoneliminar.setEnabled(false);
            botonguardar.setEnabled(false);
        }
        
    }//GEN-LAST:event_botonguardarActionPerformed

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botoncancelarActionPerformed

    private void botonnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonnuevoActionPerformed
        botonguardar.setEnabled(true);
        botonrealizarconsulta.setEnabled(false);
        botonmodificar.setEnabled(false);
        botoneliminar.setEnabled(false);
        lbidpromocion.setVisible(false);
        txtidpromocion.setVisible(false);
        HabilitarCampos();
        botonnuevo.setEnabled(false);
        botonconsultar.setEnabled(true);
        repro.Limpiar();
    }//GEN-LAST:event_botonnuevoActionPerformed

    private void cbtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtipoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void botonmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmodificarActionPerformed
        if(repro.ValidacionEspaciosModificar()){
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS DATOS", "WARNING",JOptionPane.ERROR_MESSAGE);
        }
        else{
            IdentidadesPromociones id = new IdentidadesPromociones(Integer.parseInt(txtidpromocion.getText()),txtcodigo.getText(),txtnombre.getText(),txtadescripcion.getText(),cbtipo.getSelectedItem().toString());
            repro.ModificarRegistros(id);
            DeshabilitarCampos();
            repro.Limpiar();
            botonnuevo.setEnabled(true);
            botonconsultar.setEnabled(true);
            botonrealizarconsulta.setEnabled(false);
            botonmodificar.setEnabled(false);
            botoneliminar.setEnabled(false);
            botonguardar.setEnabled(false);
        }
        
    }//GEN-LAST:event_botonmodificarActionPerformed

    private void botonrealizarconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrealizarconsultaActionPerformed
        if(txtcodigo.getText().replaceAll("\\s","").equals("")){
            JOptionPane.showMessageDialog(null, "PORFAVOR LLENE PARAMETRO DE BUSQUEDA","WARNING",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            IdentidadesPromociones id = repro.ConsultarRegistros();
            txtidpromocion.setText(Integer.toString(id.getId_promociones()));
            txtcodigo.setText(id.getCodigo_promocion());
            txtnombre.setText(id.getNombre_promocion());
            txtadescripcion.setText(id.getDescripcion());
            cbtipo.setSelectedItem(id.getTipo());
            
        }
        
    }//GEN-LAST:event_botonrealizarconsultaActionPerformed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        new libValidacionesTexto().ValidacionesCodigoPromociones(evt, txtcodigo.getText().length());
        new libValidacionesTexto().ValidarLetrasYNumeros(evt);
        
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        new libValidacionesTexto().ValidacionesCaracteresEspeciales(evt);
    }//GEN-LAST:event_txtnombreKeyTyped
    public void HabilitarCampos(){
        txtcodigo.setEnabled(true);
        txtnombre.setEnabled(true);
        txtadescripcion.setEnabled(true);
        cbtipo.setEnabled(true);
        txtidpromocion.setEnabled(true);
    }
    public void DeshabilitarCampos(){
        txtcodigo.setEnabled(false);
        txtnombre.setEnabled(false);
        txtadescripcion.setEnabled(false);
        cbtipo.setEnabled(false);
        txtidpromocion.setEnabled(false);
        botonguardar.setEnabled(false);
        botonmodificar.setEnabled(false);
        botoneliminar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(MantenimientoPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoPromociones().setVisible(true);
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
    public static javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbidpromocion;
    private javax.swing.JLabel lbimagenfondo;
    public static javax.swing.JTextArea txtadescripcion;
    public static javax.swing.JTextField txtcodigo;
    public static javax.swing.JTextField txtidpromocion;
    public static javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
