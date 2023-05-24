/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.postgrado.postgradosistema.cliente.proyecto;

import com.postgrado.postgradosistema.cliente.FrmPrincipal;
import com.postgrado.postgradosistema.cliente.area.FrmArea;
import com.postgrado.postgradosistema.cliente.ciclo.FrmCiclo;
import com.postgrado.postgradosistema.cliente.especialidad.FrmEspecialidad;
import com.postgrado.postgradosistema.cliente.ingresante.FrmIngresante;
import com.postgrado.postgradosistema.cliente.sede.FrmSede;
import com.postgrado.postgradosistema.logic.ProyectoLogic;
import com.postgrado.postgradosistema.modelo.Proyecto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.List;

/**
 * @author ESTUDIANTE-WALTHER GALAN VITE
 */
public class FrmProyecto extends javax.swing.JFrame {

    ProyectoLogic proyectoLogic = new ProyectoLogic();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form FrmProyecto
     */
    public FrmProyecto() {
        initComponents();
        setLocationRelativeTo(null);
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
        jtxtBuscarPorNombreProyecto = new javax.swing.JTextField();
        jbtnMostrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtBuscarPorAñoProyecto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnRegistrarProyecto = new javax.swing.JButton();
        jbtnModificarProyecto = new javax.swing.JButton();
        jbtnEliminarProyecto = new javax.swing.JButton();
        jbtnMenu = new javax.swing.JButton();
        jTableEspecialidad = new javax.swing.JScrollPane();
        jTableProyecto = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemArea = new javax.swing.JMenuItem();
        jMenuItemCiclo = new javax.swing.JMenuItem();
        jMenuItemEspecialidad = new javax.swing.JMenuItem();
        jMenuItemSede = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
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
                        .addGap(0, 1290, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 60));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setText("PROYECTO DE TESIS DE SEGUNDA ESPECIALIDAD");

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel2.setText("BUSCAR");

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setText("Nombre");

        jtxtBuscarPorNombreProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarPorNombreProyectoKeyReleased(evt);
            }
        });

        jbtnMostrar.setBackground(new java.awt.Color(204, 204, 204));
        jbtnMostrar.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnMostrar.setText("Mostrar");
        jbtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel4.setText("Año");

        jtxtBuscarPorAñoProyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarPorAñoProyectoKeyReleased(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-proyecto.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)
                                .addGap(245, 245, 245))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtxtBuscarPorNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel4)
                                                .addGap(34, 34, 34)
                                                .addComponent(jtxtBuscarPorAñoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75)
                                                .addComponent(jbtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtxtBuscarPorNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jtxtBuscarPorAñoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1290, 240));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jbtnRegistrarProyecto.setBackground(new java.awt.Color(204, 204, 204));
        jbtnRegistrarProyecto.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnRegistrarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jbtnRegistrarProyecto.setText("Registrar");
        jbtnRegistrarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarProyectoActionPerformed(evt);
            }
        });

        jbtnModificarProyecto.setBackground(new java.awt.Color(204, 204, 204));
        jbtnModificarProyecto.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnModificarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        jbtnModificarProyecto.setText("Modificar");
        jbtnModificarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarProyectoActionPerformed(evt);
            }
        });

        jbtnEliminarProyecto.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEliminarProyecto.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnEliminarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jbtnEliminarProyecto.setText("Eliminar");
        jbtnEliminarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarProyectoActionPerformed(evt);
            }
        });

        jbtnMenu.setBackground(new java.awt.Color(204, 204, 204));
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
                                .addGap(76, 76, 76)
                                .addComponent(jbtnRegistrarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(jbtnModificarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                .addComponent(jbtnEliminarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184)
                                .addComponent(jbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtnRegistrarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnModificarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnEliminarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1290, 80));

        jTableEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        jTableEspecialidad.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTableEspecialidadComponentHidden(evt);
            }
        });

        jTableProyecto.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ID", "TITULO", "ASESORA", "JURADO", "RES_DESIGNACION", "RES_EJECUCIÓN", "RES_CAMBIO DE JURADO", "RES_SUSTENTACIÓN", "RES_NOMBRAMIENTO", "ESPECIALIDAD", "OTROS", "ESTADO"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTableEspecialidad.setViewportView(jTableProyecto);
        if (jTableProyecto.getColumnModel().getColumnCount() > 0) {
            jTableProyecto.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTableProyecto.getColumnModel().getColumn(11).setPreferredWidth(10);
        }

        jPanel1.add(jTableEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1290, 310));

        jMenuBar1.setBorder(null);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mantenimiento.png"))); // NOI18N
        jMenu2.setText("Mantenimiento");
        jMenu2.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

        jMenuItemArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/area.png"))); // NOI18N
        jMenuItemArea.setText("Área");
        jMenuItemArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAreaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemArea);

        jMenuItemCiclo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ciclo.png"))); // NOI18N
        jMenuItemCiclo.setText("Ciclo");
        jMenuItemCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCicloActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCiclo);

        jMenuItemEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/especialidad.png"))); // NOI18N
        jMenuItemEspecialidad.setText("Especialidad");
        jMenuItemEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEspecialidadActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEspecialidad);

        jMenuItemSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sede.png"))); // NOI18N
        jMenuItemSede.setText("Sede");
        jMenuItemSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSedeActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemSede);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proyectos.png"))); // NOI18N
        jMenu3.setText("Proyecto");
        jMenu3.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

        jMenuItemProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-proyecto.png"))); // NOI18N
        jMenuItemProyecto.setText("Proyecto");
        jMenuItemProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProyectoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemProyecto);

        jMenuItemIngresante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante.png"))); // NOI18N
        jMenuItemIngresante.setText("Estudiante");
        jMenuItemIngresante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresanteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemIngresante);

        jMenuBar1.add(jMenu3);

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

    private void jbtnRegistrarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarProyectoActionPerformed
        FrmRegistrarProyecto regisproyecto = new FrmRegistrarProyecto(this, true);
        regisproyecto.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRegistrarProyectoActionPerformed

    private void jbtnModificarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarProyectoActionPerformed

        int filaSeleccionada = jTableProyecto.getSelectedRow();
        if (filaSeleccionada != -1) {
            if (jTableProyecto.getValueAt(filaSeleccionada, 11).toString().equals("I")) {
                JOptionPane.showMessageDialog(null, "No se puede modificar un Proyecto inactiva");
            } else {
                int id = Integer.parseInt(jTableProyecto.getValueAt(filaSeleccionada, 0).toString());
                String titulo = jTableProyecto.getValueAt(filaSeleccionada, 1).toString();
                String asesora = jTableProyecto.getValueAt(filaSeleccionada, 2).toString();
                String jurado = jTableProyecto.getValueAt(filaSeleccionada, 3).toString();
                String res_designacion = jTableProyecto.getValueAt(filaSeleccionada, 4).toString();
                String res_ejecucion = jTableProyecto.getValueAt(filaSeleccionada, 5).toString();
                String res_cambioJurado = jTableProyecto.getValueAt(filaSeleccionada, 6).toString();
                String res_sustentacion = jTableProyecto.getValueAt(filaSeleccionada, 7).toString();
                String res_nombramiento = jTableProyecto.getValueAt(filaSeleccionada, 8).toString();
                String nombre_Especialidad = jTableProyecto.getValueAt(filaSeleccionada, 9).toString();
                String otro = jTableProyecto.getValueAt(filaSeleccionada, 10).toString();

                FrmModificarProyecto frmModificarProyecto = new FrmModificarProyecto(this, true);
                frmModificarProyecto.setDatos(id, titulo, asesora, jurado, res_designacion, res_ejecucion, res_cambioJurado, res_sustentacion, res_nombramiento, nombre_Especialidad, otro);
                frmModificarProyecto.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_jbtnModificarProyectoActionPerformed

    private void jbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuActionPerformed
        this.setVisible(false);
        FrmPrincipal m = new FrmPrincipal();
        m.setVisible(true);
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

    private void jbtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarActionPerformed
        listarTablaProyecto();
    }//GEN-LAST:event_jbtnMostrarActionPerformed

    private void jbtnEliminarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarProyectoActionPerformed
        int filaSeleccionada = jTableProyecto.getSelectedRow();
        if (filaSeleccionada != -1) {
            if (jTableProyecto.getValueAt(filaSeleccionada, 11).toString().equals("I")) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar un proyecto inactivo");
            } else {
                int id = Integer.parseInt(jTableProyecto.getValueAt(filaSeleccionada, 0).toString());

                Proyecto proyecto = new Proyecto();
                proyecto.setId(id);
                ProyectoLogic proyectoLogic = new ProyectoLogic();

                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el proyecto?", "Eliminar", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    if (proyectoLogic.eliminarProyecto(proyecto)) {
                        JOptionPane.showMessageDialog(null, "Se elimino Correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se elimino el proyecto");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_jbtnEliminarProyectoActionPerformed

    private void jTableEspecialidadComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableEspecialidadComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableEspecialidadComponentHidden

    private void jtxtBuscarPorNombreProyectoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarPorNombreProyectoKeyReleased
        String nombre = jtxtBuscarPorNombreProyecto.getText().trim();

        if (!nombre.isEmpty()) {
            List<Proyecto> proyectos = proyectoLogic.buscarProyectoPorNombre(nombre);
            modelo = (DefaultTableModel) jTableProyecto.getModel();
            modelo.setRowCount(0);
            Object[] ob = new Object[12];
            for (int i = proyectos.size() - 1; i >= 0; i--) {
                ob[0] = proyectos.get(i).getId();
                ob[1] = proyectos.get(i).getTitulo();
                ob[2] = proyectos.get(i).getAsesora();
                ob[3] = proyectos.get(i).getJurado();
                ob[4] = proyectos.get(i).getRes_designacion();
                ob[5] = proyectos.get(i).getRes_ejecucion();
                ob[6] = proyectos.get(i).getRes_cambioJurado();
                ob[7] = proyectos.get(i).getRes_sustentacion();
                ob[8] = proyectos.get(i).getRes_nombramiento();
                ob[9] = proyectos.get(i).getEspecialidad().getNombre();
                ob[10] = proyectos.get(i).getOtros();
                ob[11] = proyectos.get(i).getEs_proyecto();
                modelo.addRow(ob);
            }
        } else {
            listarTablaProyecto();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscarPorNombreProyectoKeyReleased

    private void jtxtBuscarPorAñoProyectoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarPorAñoProyectoKeyReleased
        String nombre = jtxtBuscarPorAñoProyecto.getText().trim();

        if (!nombre.isEmpty()) {
            List<Proyecto> proyectos = proyectoLogic.buscarProyectoPorAño(nombre);
            modelo = (DefaultTableModel) jTableProyecto.getModel();
            modelo.setRowCount(0);
            Object[] ob = new Object[12];
            for (int i = proyectos.size() - 1; i >= 0; i--) {
                ob[0] = proyectos.get(i).getId();
                ob[1] = proyectos.get(i).getTitulo();
                ob[2] = proyectos.get(i).getAsesora();
                ob[3] = proyectos.get(i).getJurado();
                ob[4] = proyectos.get(i).getRes_designacion();
                ob[5] = proyectos.get(i).getRes_ejecucion();
                ob[6] = proyectos.get(i).getRes_cambioJurado();
                ob[7] = proyectos.get(i).getRes_sustentacion();
                ob[8] = proyectos.get(i).getRes_nombramiento();
                ob[9] = proyectos.get(i).getEspecialidad().getNombre();
                ob[10] = proyectos.get(i).getOtros();
                ob[11] = proyectos.get(i).getEs_proyecto();
                modelo.addRow(ob);
            }
        } else {
            listarTablaProyecto();
        }
    }//GEN-LAST:event_jtxtBuscarPorAñoProyectoKeyReleased

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
            java.util.logging.Logger.getLogger(FrmProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProyecto().setVisible(true);
            }
        });
    }

    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void listarTablaProyecto() {
        List<Proyecto> proyectos = proyectoLogic.listaProyectos();
        modelo = (DefaultTableModel) jTableProyecto.getModel();
        modelo.setRowCount(0);
        Object[] ob = new Object[12];
        for (int i = proyectos.size() - 1; i >= 0; i--) {
            ob[0] = proyectos.get(i).getId();
            ob[1] = proyectos.get(i).getTitulo();
            ob[2] = proyectos.get(i).getAsesora();
            ob[3] = proyectos.get(i).getJurado();
            ob[4] = proyectos.get(i).getRes_designacion();
            ob[5] = proyectos.get(i).getRes_ejecucion();
            ob[6] = proyectos.get(i).getRes_cambioJurado();
            ob[7] = proyectos.get(i).getRes_sustentacion();
            ob[8] = proyectos.get(i).getRes_nombramiento();
            ob[9] = proyectos.get(i).getEspecialidad().getNombre();
            ob[10] = proyectos.get(i).getOtros();
            ob[11] = proyectos.get(i).getEs_proyecto();
            modelo.addRow(ob);
        }
        jTableProyecto.setModel(modelo);
        JTableHeader header = jTableProyecto.getTableHeader();
        header.setOpaque(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemArea;
    private javax.swing.JMenuItem jMenuItemCiclo;
    private javax.swing.JMenuItem jMenuItemEspecialidad;
    private javax.swing.JMenuItem jMenuItemIngresante;
    private javax.swing.JMenuItem jMenuItemProyecto;
    private javax.swing.JMenuItem jMenuItemSede;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jTableEspecialidad;
    private javax.swing.JTable jTableProyecto;
    private javax.swing.JButton jbtnEliminarProyecto;
    private javax.swing.JButton jbtnMenu;
    private javax.swing.JButton jbtnModificarProyecto;
    private javax.swing.JButton jbtnMostrar;
    private javax.swing.JButton jbtnRegistrarProyecto;
    private javax.swing.JTextField jtxtBuscarPorAñoProyecto;
    private javax.swing.JTextField jtxtBuscarPorNombreProyecto;
    // End of variables declaration//GEN-END:variables
}
