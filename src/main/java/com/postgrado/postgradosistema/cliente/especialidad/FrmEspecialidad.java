/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.postgrado.postgradosistema.cliente.especialidad;

import com.postgrado.postgradosistema.cliente.FrmAdmin;
import com.postgrado.postgradosistema.cliente.FrmMantenimiento;
import com.postgrado.postgradosistema.cliente.area.FrmArea;
import com.postgrado.postgradosistema.cliente.ciclo.FrmCiclo;
import com.postgrado.postgradosistema.cliente.ingresante.FrmIngresante;
import com.postgrado.postgradosistema.cliente.proyecto.FrmProyecto;
import com.postgrado.postgradosistema.cliente.sede.FrmSede;
import com.postgrado.postgradosistema.logic.EspecialidadLogic;
import com.postgrado.postgradosistema.modelo.Especialidad;
import login.FrmLogin1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.List;

/**
 * @author ESTUDIANTE-WALTHER GALAN VITE
 */
public class FrmEspecialidad extends javax.swing.JFrame {

    EspecialidadLogic especialidadLogic = new EspecialidadLogic();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form FrmEspecialidad
     */
    public FrmEspecialidad() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtBuscarPorNombreEspecialidad = new javax.swing.JTextField();
        jbtnMostrarTablaEspecialidad = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnRegistrarEspecialidad = new javax.swing.JButton();
        jbtnModificarEspecialidad = new javax.swing.JButton();
        jbtnEliminarEspecialidad = new javax.swing.JButton();
        jbtnMenu = new javax.swing.JButton();
        jScrollEspec = new javax.swing.JScrollPane();
        jTableEspecialidad = new javax.swing.JTable();
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
                        .addGap(0, 1140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 60));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setText("ESPECIALIDAD");

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel2.setText("BUSCAR");

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setText("Nombre");

        jtxtBuscarPorNombreEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarPorNombreEspecialidadKeyReleased(evt);
            }
        });

        jbtnMostrarTablaEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        jbtnMostrarTablaEspecialidad.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnMostrarTablaEspecialidad.setText("Mostrar");
        jbtnMostrarTablaEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarTablaEspecialidadActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enfermeria02.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel2))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(38, 38, 38)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jbtnMostrarTablaEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jtxtBuscarPorNombreEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jtxtBuscarPorNombreEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addComponent(jbtnMostrarTablaEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 470, 500));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jbtnRegistrarEspecialidad.setBackground(new java.awt.Color(204, 204, 204));
        jbtnRegistrarEspecialidad.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnRegistrarEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jbtnRegistrarEspecialidad.setText("Registrar");
        jbtnRegistrarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarEspecialidadActionPerformed(evt);
            }
        });

        jbtnModificarEspecialidad.setBackground(new java.awt.Color(204, 204, 204));
        jbtnModificarEspecialidad.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnModificarEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        jbtnModificarEspecialidad.setText("Modificar");
        jbtnModificarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarEspecialidadActionPerformed(evt);
            }
        });

        jbtnEliminarEspecialidad.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEliminarEspecialidad.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnEliminarEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jbtnEliminarEspecialidad.setText("Eliminar");
        jbtnEliminarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarEspecialidadActionPerformed(evt);
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
                                .addGap(46, 46, 46)
                                .addComponent(jbtnRegistrarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jbtnModificarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(jbtnEliminarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(jbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jbtnEliminarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jbtnRegistrarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jbtnModificarEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1140, 100));

        jTableEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ID", "ESPECIALIDAD", "AREA", "ESTADO"
                }
        ));
        jScrollEspec.setViewportView(jTableEspecialidad);
        if (jTableEspecialidad.getColumnModel().getColumnCount() > 0) {
            jTableEspecialidad.getColumnModel().getColumn(0).setMinWidth(20);
            jTableEspecialidad.getColumnModel().getColumn(0).setMaxWidth(40);
            jTableEspecialidad.getColumnModel().getColumn(3).setMinWidth(50);
            jTableEspecialidad.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jPanel1.add(jScrollEspec, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 670, 500));

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
        jMenu3.setEnabled(false);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarEspecialidadActionPerformed

        FrmRegistrarEspecialidad frmRegistrarEspecialidad = new FrmRegistrarEspecialidad(this, true);
        frmRegistrarEspecialidad.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRegistrarEspecialidadActionPerformed

    private void jbtnModificarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarEspecialidadActionPerformed
        int filaSeleccionada = jTableEspecialidad.getSelectedRow();
        if (filaSeleccionada != -1) {
            if (jTableEspecialidad.getValueAt(filaSeleccionada, 3).toString().equals("I")) {
                JOptionPane.showMessageDialog(null, "No se puede modificar una Especialidad inactiva");
            } else {
                int id = Integer.parseInt(jTableEspecialidad.getValueAt(filaSeleccionada, 0).toString());
                String nombre = jTableEspecialidad.getValueAt(filaSeleccionada, 1).toString();
                String area_nombre = jTableEspecialidad.getValueAt(filaSeleccionada, 2).toString();

                FrmModificarEspecialidad frmModificarEspecialidad = new FrmModificarEspecialidad(this, true);
                frmModificarEspecialidad.setDatos(id, nombre, area_nombre);
                frmModificarEspecialidad.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_jbtnModificarEspecialidadActionPerformed

    private void jbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuActionPerformed
        this.setVisible(false);
        if (FrmLogin1.tipoUsuario.equals("Administrador")) {
            FrmAdmin frmAdmin = new FrmAdmin();
            frmAdmin.setVisible(true);
        } else {
            FrmMantenimiento frmMantenimiento = new FrmMantenimiento();
            frmMantenimiento.setVisible(true);
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

    private void jbtnMostrarTablaEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarTablaEspecialidadActionPerformed
        listarTablaEspecialidad();
    }//GEN-LAST:event_jbtnMostrarTablaEspecialidadActionPerformed

    private void jtxtBuscarPorNombreEspecialidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarPorNombreEspecialidadKeyReleased
        String nombre = jtxtBuscarPorNombreEspecialidad.getText().trim();
        if (!nombre.isEmpty()) {
            List<Especialidad> especialidades = especialidadLogic.buscarEspecialidadPorNombre(nombre);
            modelo = (DefaultTableModel) jTableEspecialidad.getModel();
            modelo.setRowCount(0); // Limpiar filas existentes en la tabla

            Object[] ob = new Object[4];
            for (int i = especialidades.size() - 1; i >= 0; i--) {
                ob[0] = especialidades.get(i).getId();
                ob[1] = especialidades.get(i).getNombre();
                ob[2] = especialidades.get(i).getArea().getNombre();
                ob[3] = especialidades.get(i).getEs_especialidad();
                modelo.addRow(ob); // Agregar fila con los datos del ingresante
            }
        } else {
            // Si el campo de búsqueda está vacío, lista todos las especialidades
            listarTablaEspecialidad();
        }
    }//GEN-LAST:event_jtxtBuscarPorNombreEspecialidadKeyReleased

    private void jbtnEliminarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarEspecialidadActionPerformed
        int filaSeleccionada = jTableEspecialidad.getSelectedRow();
        if (filaSeleccionada != -1) {
            if (jTableEspecialidad.getValueAt(filaSeleccionada, 3).toString().equals("I")) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar un área inactiva");
            } else {
                int id = Integer.parseInt(jTableEspecialidad.getValueAt(filaSeleccionada, 0).toString());

                Especialidad especialidad = new Especialidad();
                especialidad.setId(id);
                EspecialidadLogic especialidadLogic = new EspecialidadLogic();

                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar la especialidad?", "Eliminar", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    if (especialidadLogic.eliminarEspacialidad(especialidad)) {
                        JOptionPane.showMessageDialog(null, "Se elimino Correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se elimino la especialidad");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_jbtnEliminarEspecialidadActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEspecialidad().setVisible(true);
            }
        });
    }

    /*public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }*/
    public void listarTablaEspecialidad() {
        List<Especialidad> especialidades = especialidadLogic.listaEspecialidades();
        modelo = (DefaultTableModel) jTableEspecialidad.getModel();
        modelo.setRowCount(0); // Limpiar filas existentes en la tabla
        Object[] ob = new Object[4];
        for (int i = especialidades.size() - 1; i >= 0; i--) {
            ob[0] = especialidades.get(i).getId();
            ob[1] = especialidades.get(i).getNombre();
            ob[2] = especialidades.get(i).getArea().getNombre();
            ob[3] = especialidades.get(i).getEs_especialidad();
            modelo.addRow(ob); // Agregar fila con los datos del ingresante
        }
        jTableEspecialidad.setModel(modelo);
        JTableHeader header = jTableEspecialidad.getTableHeader();
        header.setOpaque(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JScrollPane jScrollEspec;
    private javax.swing.JTable jTableEspecialidad;
    private javax.swing.JButton jbtnEliminarEspecialidad;
    private javax.swing.JButton jbtnMenu;
    private javax.swing.JButton jbtnModificarEspecialidad;
    private javax.swing.JButton jbtnMostrarTablaEspecialidad;
    private javax.swing.JButton jbtnRegistrarEspecialidad;
    private javax.swing.JTextField jtxtBuscarPorNombreEspecialidad;
    // End of variables declaration//GEN-END:variables
}
