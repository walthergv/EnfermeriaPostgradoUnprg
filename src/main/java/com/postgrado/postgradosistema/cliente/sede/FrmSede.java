/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.postgrado.postgradosistema.cliente.sede;

import com.postgrado.postgradosistema.cliente.FrmPrincipal;
import com.postgrado.postgradosistema.cliente.area.FrmArea;
import com.postgrado.postgradosistema.cliente.ciclo.FrmCiclo;
import com.postgrado.postgradosistema.cliente.especialidad.FrmEspecialidad;
import com.postgrado.postgradosistema.cliente.ingresante.FrmIngresante;
import com.postgrado.postgradosistema.cliente.proyecto.FrmProyecto;
import com.postgrado.postgradosistema.cliente.usuario.FrmUsuario;
import com.postgrado.postgradosistema.logic.SedeLogic;
import com.postgrado.postgradosistema.modelo.Sede;
import login.FrmLogin1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.List;

/**
 * @author ESTUDIANTE
 */
public class FrmSede extends javax.swing.JFrame {

    SedeLogic sedeLogic = new SedeLogic();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form FrmSede
     */
    public FrmSede() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/enfermeria.png")).getImage());
        if (FrmLogin1.tipoUsuario.equals("Administrador")) {
            jMenuMantenimiento.setVisible(true);
            jMenuRegistro.setVisible(true);
        } else {
            jMenuMantenimiento.setVisible(true);
            jMenuRegistro.setVisible(false);
        }
        listarTablaSede();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtBuscarPorNombreSede = new javax.swing.JTextField();
        jbtnMostrarTablaSede = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnRegistrarSede = new javax.swing.JButton();
        jbtnModificarSede = new javax.swing.JButton();
        jbtnEliminarSede = new javax.swing.JButton();
        jbtnMenu = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTableSede = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuMantenimiento = new javax.swing.JMenu();
        jMenuItemArea = new javax.swing.JMenuItem();
        jMenuItemCiclo = new javax.swing.JMenuItem();
        jMenuItemEspecialidad = new javax.swing.JMenuItem();
        jMenuItemSede = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemProyecto = new javax.swing.JMenuItem();
        jMenuItemIngresante = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 60));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setText("SEDE");

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel2.setText("BUSCAR");

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setText("Nombre");

        jtxtBuscarPorNombreSede.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarPorNombreSedeKeyReleased(evt);
            }
        });

        jbtnMostrarTablaSede.setBackground(new java.awt.Color(204, 204, 204));
        jbtnMostrarTablaSede.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnMostrarTablaSede.setText("Mostrar");
        jbtnMostrarTablaSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarTablaSedeActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sede.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jtxtBuscarPorNombreSede, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jbtnMostrarTablaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)))
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtBuscarPorNombreSede, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jbtnMostrarTablaSede, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 530, 510));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jbtnRegistrarSede.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegistrarSede.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnRegistrarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jbtnRegistrarSede.setText("Registrar");
        jbtnRegistrarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarSedeActionPerformed(evt);
            }
        });

        jbtnModificarSede.setBackground(new java.awt.Color(204, 204, 204));
        jbtnModificarSede.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnModificarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        jbtnModificarSede.setText("Modificar");
        jbtnModificarSede.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jbtnModificarSedeAncestorRemoved(evt);
            }
        });
        jbtnModificarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarSedeActionPerformed(evt);
            }
        });

        jbtnEliminarSede.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEliminarSede.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnEliminarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jbtnEliminarSede.setText("Eliminar");
        jbtnEliminarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarSedeActionPerformed(evt);
            }
        });

        jbtnMenu.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        jbtnMenu.setText("Menú Principal");
        jbtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jbtnRegistrarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jbtnModificarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jbtnEliminarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnEliminarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnRegistrarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnModificarSede, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1060, 120));

        jTableSede.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SEDE", "ESTADO"
            }
        ));
        jScrollPane.setViewportView(jTableSede);

        jPanel1.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 530, 510));

        jMenuBar1.setBorder(null);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mantenimiento.png"))); // NOI18N
        jMenuMantenimiento.setText("Mantenimiento");
        jMenuMantenimiento.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

        jMenuItemArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/area.png"))); // NOI18N
        jMenuItemArea.setText("Área");
        jMenuItemArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAreaActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemArea);

        jMenuItemCiclo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ciclo.png"))); // NOI18N
        jMenuItemCiclo.setText("Ciclo");
        jMenuItemCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCicloActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemCiclo);

        jMenuItemEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/especialidad.png"))); // NOI18N
        jMenuItemEspecialidad.setText("Especialidad");
        jMenuItemEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEspecialidadActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemEspecialidad);

        jMenuItemSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sede.png"))); // NOI18N
        jMenuItemSede.setText("Sede");
        jMenuItemSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSedeActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemSede);

        jMenuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jMenuItemUsuario.setText("Usuario");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemUsuario);

        jMenuBar1.add(jMenuMantenimiento);

        jMenuRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proyectos.png"))); // NOI18N
        jMenuRegistro.setText("Registro");
        jMenuRegistro.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

        jMenuItemProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-proyecto.png"))); // NOI18N
        jMenuItemProyecto.setText("Proyecto");
        jMenuItemProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProyectoActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemProyecto);

        jMenuItemIngresante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante.png"))); // NOI18N
        jMenuItemIngresante.setText("Estudiante");
        jMenuItemIngresante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresanteActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemIngresante);

        jMenuBar1.add(jMenuRegistro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarSedeActionPerformed
        FrmRegistrarSede regissede = new FrmRegistrarSede(this, true);
        regissede.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRegistrarSedeActionPerformed

    private void jbtnModificarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarSedeActionPerformed
        int filaSeleccionada = jTableSede.getSelectedRow();
        if (filaSeleccionada != -1) {
            if (jTableSede.getValueAt(filaSeleccionada, 2).toString().equals("I")) {
                JOptionPane.showMessageDialog(null, "No se puede modificar un área inactiva");
            } else {
                String id = jTableSede.getValueAt(filaSeleccionada, 0).toString();
                String nombre = jTableSede.getValueAt(filaSeleccionada, 1).toString();
                Sede sede = new Sede();
                sede.setId(Integer.parseInt(id));
                sede.setNombre(nombre);
                FrmModificarSede frmModificarSede = new FrmModificarSede(this, true);
                frmModificarSede.setDatos(id, nombre);
                frmModificarSede.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModificarSedeActionPerformed

    private void jbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuActionPerformed
        this.setVisible(false);
        if (FrmLogin1.tipoUsuario.equals("Administrador")) {
            FrmPrincipal frmPrincipal = new FrmPrincipal();
            frmPrincipal.setVisible(true);
        } else {
            FrmPrincipal frmPrincipal = new FrmPrincipal();
            frmPrincipal.setVisible(true);
        }
    }//GEN-LAST:event_jbtnMenuActionPerformed

    private void jMenuItemAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAreaActionPerformed
        this.setVisible(false);
        FrmArea a = new FrmArea();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItemAreaActionPerformed

    private void jMenuItemCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCicloActionPerformed

        this.setVisible(false);
        FrmCiclo c = new FrmCiclo();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItemCicloActionPerformed

    private void jMenuItemEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEspecialidadActionPerformed
        this.setVisible(false);
        FrmEspecialidad e = new FrmEspecialidad();
        e.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEspecialidadActionPerformed

    private void jMenuItemSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSedeActionPerformed
        this.setVisible(false);
        FrmSede s = new FrmSede();
        s.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSedeActionPerformed

    private void jMenuItemProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProyectoActionPerformed
        this.setVisible(false);
        FrmProyecto e = new FrmProyecto();
        e.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemProyectoActionPerformed

    private void jMenuItemIngresanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresanteActionPerformed

        this.setVisible(false);
        FrmIngresante i = new FrmIngresante();
        i.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemIngresanteActionPerformed

    private void jbtnMostrarTablaSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarTablaSedeActionPerformed
        listarTablaSede();
    }//GEN-LAST:event_jbtnMostrarTablaSedeActionPerformed

    private void jbtnModificarSedeAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jbtnModificarSedeAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModificarSedeAncestorRemoved

    private void jbtnEliminarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarSedeActionPerformed
        int filaSeleccionada = jTableSede.getSelectedRow();
        if (filaSeleccionada != -1) {
            if (jTableSede.getValueAt(filaSeleccionada, 2).toString().equals("I")) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar un área inactiva");
            } else {
                String id = jTableSede.getValueAt(filaSeleccionada, 0).toString();
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la sede?", "Eliminar Sede", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.YES_OPTION) {
                    Sede sede = new Sede();
                    sede.setId(Integer.parseInt(id));

                    if (sedeLogic.eliminarSede(sede)) {
                        JOptionPane.showMessageDialog(null, "Sede eliminada");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar sede");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se eliminó la sede");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_jbtnEliminarSedeActionPerformed

    private void jtxtBuscarPorNombreSedeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarPorNombreSedeKeyReleased
        String nombre = jtxtBuscarPorNombreSede.getText();
        if (!nombre.isEmpty()) {
            List<Sede> sedes = sedeLogic.buscarSedePorNombre(nombre);
            DefaultTableModel model = (DefaultTableModel) jTableSede.getModel();
            model.setRowCount(0); // Limpiar filas existentes en la tabla
            Object[] ob = new Object[3];
            for (int i = sedes.size() - 1; i >= 0; i--) {
                ob[0] = sedes.get(i).getId();
                ob[1] = sedes.get(i).getNombre();
                ob[2] = sedes.get(i).getEs_sede();
                modelo.addRow(ob);
            }
        } else {
            listarTablaSede();
        }
    }//GEN-LAST:event_jtxtBuscarPorNombreSedeKeyReleased

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        this.setVisible(false);
        FrmUsuario u = new FrmUsuario();
        u.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSede().setVisible(true);
            }
        });
    }

    /*
    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }*/
    public void listarTablaSede() {
        List<Sede> sedes = sedeLogic.listaSedes();
        modelo = (DefaultTableModel) jTableSede.getModel();
        modelo.setRowCount(0); // Limpiar filas existentes en la tabla
        Object[] ob = new Object[3];
        for (int i = sedes.size() - 1; i >= 0; i--) {
            ob[0] = sedes.get(i).getId();
            ob[1] = sedes.get(i).getNombre();
            ob[2] = sedes.get(i).getEs_sede();
            modelo.addRow(ob);
        }
        jTableSede.setModel(modelo);
        JTableHeader header = jTableSede.getTableHeader();
        header.setOpaque(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemArea;
    private javax.swing.JMenuItem jMenuItemCiclo;
    private javax.swing.JMenuItem jMenuItemEspecialidad;
    private javax.swing.JMenuItem jMenuItemIngresante;
    private javax.swing.JMenuItem jMenuItemProyecto;
    private javax.swing.JMenuItem jMenuItemSede;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenu jMenuMantenimiento;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableSede;
    private javax.swing.JButton jbtnEliminarSede;
    private javax.swing.JButton jbtnMenu;
    private javax.swing.JButton jbtnModificarSede;
    private javax.swing.JButton jbtnMostrarTablaSede;
    private javax.swing.JButton jbtnRegistrarSede;
    private javax.swing.JTextField jtxtBuscarPorNombreSede;
    // End of variables declaration//GEN-END:variables
}
