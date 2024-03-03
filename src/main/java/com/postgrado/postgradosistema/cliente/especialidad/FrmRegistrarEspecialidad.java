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
public class FrmRegistrarEspecialidad extends javax.swing.JDialog {

    AreaLogic areaLogic = new AreaLogic();
    int xMouse, yMouse;

    /**
     * Creates new form FrmRegistrarEspecialidad
     */
    public FrmRegistrarEspecialidad(java.awt.Frame parent, boolean modal) {
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
        jLabel3 = new javax.swing.JLabel();
        jtxtNombreEspecialidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcomboboxArea = new javax.swing.JComboBox<>();
        jtxtBuscarArea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbtnRegistrarEspecialidad = new javax.swing.JButton();
        jbtnSalirRegistrarEspecialidad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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
        jLabel1.setText("REGISTRAR ESPECIALIDAD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel3.setText("NOMBRE *");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));
        jPanel2.add(jtxtNombreEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 131, 340, 41));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel4.setText("AREA *");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jPanel2.add(jcomboboxArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 261, 340, 40));

        jtxtBuscarArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarAreaKeyReleased(evt);
            }
        });
        jPanel2.add(jtxtBuscarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 340, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar023.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, 38));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 340));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jbtnRegistrarEspecialidad.setBackground(new java.awt.Color(204, 204, 204));
        jbtnRegistrarEspecialidad.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnRegistrarEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jbtnRegistrarEspecialidad.setText("Registrar");
        jbtnRegistrarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarEspecialidadActionPerformed(evt);
            }
        });

        jbtnSalirRegistrarEspecialidad.setBackground(new java.awt.Color(204, 204, 204));
        jbtnSalirRegistrarEspecialidad.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnSalirRegistrarEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jbtnSalirRegistrarEspecialidad.setText("Salir");
        jbtnSalirRegistrarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirRegistrarEspecialidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jbtnRegistrarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jbtnSalirRegistrarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSalirRegistrarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRegistrarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 800, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirRegistrarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirRegistrarEspecialidadActionPerformed
        this.dispose();
        FrmEspecialidad e = new FrmEspecialidad();
        e.setVisible(true);
    }//GEN-LAST:event_jbtnSalirRegistrarEspecialidadActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jbtnRegistrarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarEspecialidadActionPerformed
        String nombre = jtxtNombreEspecialidad.getText().trim();
        String nombreArea = (String) jcomboboxArea.getSelectedItem();

        if (!nombre.isEmpty()) {
            AreaLogic areaLogic = new AreaLogic();
            List<Area> areas = areaLogic.buscarAreaPorNombre(nombreArea);
            if (!areas.isEmpty()) {
                Area areaSeleccionada = areas.get(0); // Obtener el primer objeto de la lista

                // Crear un objeto Especialidad con los datos ingresados
                Especialidad especialidad = new Especialidad();
                especialidad.setNombre(nombre);
                especialidad.setArea(areaSeleccionada);

                // Guardar el objeto Especialidad en la base de datos (o realizar la acción correspondiente)
                EspecialidadLogic especialidadLogic = new EspecialidadLogic();
                especialidadLogic.registrarEspecialidad(especialidad);
                JOptionPane.showMessageDialog(this, "Se inserto correctamente");
                // Limpiar los campos después de guardar la especialidad
                jtxtNombreEspecialidad.setText("");
                jcomboboxArea.setSelectedIndex(-1);
                this.setVisible(false);
                FrmEspecialidad e = new FrmEspecialidad();
                e.setVisible(true);
            } else {
                // Manejar el caso cuando no se encuentra el área correspondiente al nombre seleccionado
                JOptionPane.showMessageDialog(this, "No se pudo insertar, verifique que el area no este vacio");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo insertar, verifique que no este vacio");
        }
    }//GEN-LAST:event_jbtnRegistrarEspecialidadActionPerformed

    private void jtxtBuscarAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarAreaKeyReleased
        String area_nombre = jtxtBuscarArea.getText().trim();

        if (!area_nombre.isEmpty()) {
            List<Area> areas = areaLogic.buscarAreaPorNombre(area_nombre);
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            for (Area area : areas) {
                model.addElement(area.getNombre());
            }
            jcomboboxArea.setModel(model);
        } else {
            // Si el campo de búsqueda está vacío, limpiar el JComboBox
            jcomboboxArea.setModel(new DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_jtxtBuscarAreaKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        FrmEspecialidad e = new FrmEspecialidad();
        e.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FrmRegistrarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistrarEspecialidad dialog = new FrmRegistrarEspecialidad(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbtnRegistrarEspecialidad;
    private javax.swing.JButton jbtnSalirRegistrarEspecialidad;
    private javax.swing.JComboBox<String> jcomboboxArea;
    private javax.swing.JTextField jtxtBuscarArea;
    private javax.swing.JTextField jtxtNombreEspecialidad;
    // End of variables declaration//GEN-END:variables
}
