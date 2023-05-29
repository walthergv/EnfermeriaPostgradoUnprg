/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.postgrado.postgradosistema.cliente.especialidad;

import com.postgrado.postgradosistema.logic.AreaLogic;
import com.postgrado.postgradosistema.logic.EspecialidadLogic;
import com.postgrado.postgradosistema.modelo.Area;
import com.postgrado.postgradosistema.modelo.Especialidad;

import javax.swing.*;
import java.util.List;

/**
 * @author ESTUDIANTE-WALTHER GALAN VITE
 */
public class FrmModificarEspecialidad extends javax.swing.JDialog {
    AreaLogic areaLogic = new AreaLogic();
    EspecialidadLogic especialidadLogic = new EspecialidadLogic();
    int xMouse, yMouse;

    /**
     * Creates new form FrmModificarEspecialidad
     */
    public FrmModificarEspecialidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/enfermeria.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtIdEspecialidad = new javax.swing.JTextField();
        jtxtNombreEspecialidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcomboboxArea = new javax.swing.JComboBox<>();
        jtxtBuscarArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbtnModificarEspecialidad = new javax.swing.JButton();
        jbtnSalirModificarEspecialidad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel1.setText("MODIFICAR ESPECIALIDAD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 57, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jtxtIdEspecialidad.setEditable(false);
        jtxtIdEspecialidad.setEnabled(false);
        jPanel2.add(jtxtIdEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 70, -1));
        jPanel2.add(jtxtNombreEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 370, 41));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel4.setText("AREA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jPanel2.add(jcomboboxArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 370, 40));

        jtxtBuscarArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarAreaKeyReleased(evt);
            }
        });
        jPanel2.add(jtxtBuscarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 255, 370, 39));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar02.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 37, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 380));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jbtnModificarEspecialidad.setBackground(new java.awt.Color(204, 204, 204));
        jbtnModificarEspecialidad.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnModificarEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar02 (2).png"))); // NOI18N
        jbtnModificarEspecialidad.setText("Modificar");
        jbtnModificarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarEspecialidadActionPerformed(evt);
            }
        });

        jbtnSalirModificarEspecialidad.setBackground(new java.awt.Color(204, 204, 204));
        jbtnSalirModificarEspecialidad.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnSalirModificarEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jbtnSalirModificarEspecialidad.setText("Salir");
        jbtnSalirModificarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirModificarEspecialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jbtnModificarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                .addComponent(jbtnSalirModificarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(26, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtnSalirModificarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnModificarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 800, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirModificarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirModificarEspecialidadActionPerformed

        this.dispose();
    }//GEN-LAST:event_jbtnSalirModificarEspecialidadActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jbtnModificarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarEspecialidadActionPerformed
        String idTxt = jtxtIdEspecialidad.getText();
        String nombreEspecialidad = jtxtNombreEspecialidad.getText();
        String area_nombre = (String) jcomboboxArea.getSelectedItem();
        if (!nombreEspecialidad.isEmpty()) {
            try {
                AreaLogic areaLogic = new AreaLogic();
                List<Area> areas = areaLogic.buscarAreaPorNombre(area_nombre);
                Area areaSeleccionado = areas.get(0);
                if (!area_nombre.isEmpty()) {
                    int id = Integer.parseInt(idTxt);
                    Especialidad especialidad = new Especialidad();
                    especialidad.setId(id);
                    especialidad.setNombre(nombreEspecialidad);
                    especialidad.setArea(areaSeleccionado);
                    if (especialidadLogic.modificarEspecialidad(especialidad)) {
                        JOptionPane.showMessageDialog(null, "Especialidad modificada correctamente");
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puedo modificar especialidad");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de especialidad");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar especialidad");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe llenar los campos");
        }
    }//GEN-LAST:event_jbtnModificarEspecialidadActionPerformed

    private void jtxtBuscarAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarAreaKeyReleased
        String nombreArea = jtxtBuscarArea.getText().trim();
        if (!nombreArea.isEmpty()) {
            List<Area> areas = areaLogic.buscarAreaPorNombre(nombreArea);
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            for (Area area : areas) {
                model.addElement(area.getNombre());
            }
            jcomboboxArea.setModel(model);
        } else {
            jcomboboxArea.setModel(new DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_jtxtBuscarAreaKeyReleased

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
            java.util.logging.Logger.getLogger(FrmModificarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModificarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModificarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModificarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmModificarEspecialidad dialog = new FrmModificarEspecialidad(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void setDatos(int id, String nombre, String area_nombre) {
        jtxtIdEspecialidad.setText(String.valueOf(id));
        jtxtNombreEspecialidad.setText(nombre);
        jtxtBuscarArea.setText(area_nombre);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbtnModificarEspecialidad;
    private javax.swing.JButton jbtnSalirModificarEspecialidad;
    private javax.swing.JComboBox<String> jcomboboxArea;
    private javax.swing.JTextField jtxtBuscarArea;
    private javax.swing.JTextField jtxtIdEspecialidad;
    private javax.swing.JTextField jtxtNombreEspecialidad;
    // End of variables declaration//GEN-END:variables
}
