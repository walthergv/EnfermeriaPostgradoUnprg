/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.postgrado.postgradosistema.cliente.proyecto;

import com.postgrado.postgradosistema.logic.EspecialidadLogic;
import com.postgrado.postgradosistema.logic.IngresanteLogic;
import com.postgrado.postgradosistema.logic.ProyectoLogic;
import com.postgrado.postgradosistema.modelo.Especialidad;
import com.postgrado.postgradosistema.modelo.Ingresante;
import com.postgrado.postgradosistema.modelo.Proyecto;
import java.util.ArrayList;

import javax.swing.*;
import java.util.List;

/**
 * @author ESTUDIANTE-WALTHER GALAN VITE
 */
public class FrmModificarProyecto extends javax.swing.JDialog {

    EspecialidadLogic especialidadLogic = new EspecialidadLogic();
    IngresanteLogic ingresanteLogic = new IngresanteLogic();
    ProyectoLogic proyectoLogic = new ProyectoLogic();
    int xMouse, yMouse;

    /**
     * Creates new form FrmModificarProyecto
     */
    public FrmModificarProyecto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jtxtAsesoraProyecto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtIdProyecto = new javax.swing.JTextField();
        jtxtTituloProyecto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtResDesignacionProyecto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtResEjecucionProyecto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtResCambioJuradoProyecto = new javax.swing.JTextField();
        PROYECTO = new javax.swing.JLabel();
        jtxtingresante3 = new javax.swing.JTextField();
        jcomboboxalumno3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtResCambioTitulo = new javax.swing.JTextField();
        jtxtResSustentacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtJuradoProyecto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtOtrosProyecto = new javax.swing.JTextArea();
        jtxtEspecialidadProyecto1 = new javax.swing.JTextField();
        jtxingresante1 = new javax.swing.JTextField();
        jtxtingresante2 = new javax.swing.JTextField();
        jcomboboxEspecilidadProyecto1 = new javax.swing.JComboBox<>();
        jcomboboxalumno1 = new javax.swing.JComboBox<>();
        jcomboboxalumno2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbtnModificarProyecto = new javax.swing.JButton();
        jbtnSalirModificarProyecto = new javax.swing.JButton();

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
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 30));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel1.setText("MODIFICAR PROYECTO DE TESIS DE SEGUNDA ESPECIALIDAD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 36, -1, 48));

        jLabel2.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel3.setText("ALUMNO - 03");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel4.setText("ASESOR(A) *");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));
        jPanel2.add(jtxtAsesoraProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 680, 400, 40));

        jLabel5.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel5.setText("JURADO *");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, -1));

        jtxtIdProyecto.setEditable(false);
        jtxtIdProyecto.setEnabled(false);
        jPanel2.add(jtxtIdProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 150, 40));
        jPanel2.add(jtxtTituloProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 1080, 40));

        jLabel6.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel6.setText("RES. - DESIGNACIÓN *");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));
        jPanel2.add(jtxtResDesignacionProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 380, 40));

        jLabel7.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel7.setText("RES. -EJECUCIÓN");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));
        jPanel2.add(jtxtResEjecucionProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 380, 40));

        jLabel8.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel8.setText("RES. -CAMBIOJURADO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));
        jPanel2.add(jtxtResCambioJuradoProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 380, 40));

        PROYECTO.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        PROYECTO.setText("RES. -CAMBIOTITULO");
        jPanel2.add(PROYECTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, -1, -1));

        jtxtingresante3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtingresante3KeyReleased(evt);
            }
        });
        jPanel2.add(jtxtingresante3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 400, 40));

        jcomboboxalumno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboboxalumno3ActionPerformed(evt);
            }
        });
        jPanel2.add(jcomboboxalumno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 400, 40));

        jLabel9.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel9.setText("ESPECIALIDAD *");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel10.setText("RES. -SUSTENTACIÓN");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel11.setText("OTROS");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, -1, -1));

        jtxtResCambioTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResCambioTituloActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtResCambioTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 380, 40));
        jPanel2.add(jtxtResSustentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 380, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar02.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 36, -1, -1));

        jtxtJuradoProyecto.setColumns(20);
        jtxtJuradoProyecto.setLineWrap(true);
        jtxtJuradoProyecto.setRows(5);
        jScrollPane1.setViewportView(jtxtJuradoProyecto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 380, 70));

        jtxtOtrosProyecto.setColumns(20);
        jtxtOtrosProyecto.setRows(5);
        jScrollPane2.setViewportView(jtxtOtrosProyecto);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 630, 380, -1));

        jtxtEspecialidadProyecto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtEspecialidadProyecto1KeyReleased(evt);
            }
        });
        jPanel2.add(jtxtEspecialidadProyecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 400, 40));

        jtxingresante1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxingresante1KeyReleased(evt);
            }
        });
        jPanel2.add(jtxingresante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 400, 40));

        jtxtingresante2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtingresante2KeyReleased(evt);
            }
        });
        jPanel2.add(jtxtingresante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 400, 40));

        jcomboboxEspecilidadProyecto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboboxEspecilidadProyecto1ActionPerformed(evt);
            }
        });
        jPanel2.add(jcomboboxEspecilidadProyecto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 400, 40));

        jcomboboxalumno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboboxalumno1ActionPerformed(evt);
            }
        });
        jPanel2.add(jcomboboxalumno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 400, 40));

        jcomboboxalumno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboboxalumno2ActionPerformed(evt);
            }
        });
        jPanel2.add(jcomboboxalumno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 400, 40));

        jLabel13.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel13.setText("TITULO *");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel14.setText("AUTOR- 01 *");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 253, -1, 20));

        jLabel15.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel15.setText("AUTOR - 02 ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1330, 760));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jbtnModificarProyecto.setBackground(new java.awt.Color(204, 204, 204));
        jbtnModificarProyecto.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnModificarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar02 (2).png"))); // NOI18N
        jbtnModificarProyecto.setText("Modificar");
        jbtnModificarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarProyectoActionPerformed(evt);
            }
        });

        jbtnSalirModificarProyecto.setBackground(new java.awt.Color(204, 204, 204));
        jbtnSalirModificarProyecto.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnSalirModificarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jbtnSalirModificarProyecto.setText("Salir");
        jbtnSalirModificarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirModificarProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jbtnModificarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(jbtnSalirModificarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSalirModificarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnModificarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1329, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirModificarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirModificarProyectoActionPerformed

        this.dispose();
    }//GEN-LAST:event_jbtnSalirModificarProyectoActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jcomboboxalumno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboboxalumno3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboboxalumno3ActionPerformed

    private void jbtnModificarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarProyectoActionPerformed
        String idTxt = jtxtIdProyecto.getText();
        String titulo = jtxtTituloProyecto.getText();
        String asesora = jtxtAsesoraProyecto.getText();
        String jurado = jtxtJuradoProyecto.getText();
        String res_designacion = jtxtResDesignacionProyecto.getText();
        String res_ejecucion = jtxtResEjecucionProyecto.getText();
        String res_cambioJurado = jtxtResCambioJuradoProyecto.getText();
        String res_sustentacion = jtxtResSustentacion.getText().trim();
        String res_cambioTitulo = jtxtResCambioTitulo.getText().trim();
        String otro = jtxtOtrosProyecto.getText().trim();
        String nombreEspecialidad = (String) jcomboboxEspecilidadProyecto1.getSelectedItem();
        String nombreingresante1 = (String) jcomboboxalumno1.getSelectedItem();
        String nombreingresante2 = (String) jcomboboxalumno2.getSelectedItem();
        String nombreingresante3 = (String) jcomboboxalumno3.getSelectedItem();

        if (!titulo.isEmpty() && !asesora.isEmpty() && !jurado.isEmpty() && !res_designacion.isEmpty()) {
            try {

                EspecialidadLogic especialidadLogic = new EspecialidadLogic();
                IngresanteLogic ingresanteLogic = new IngresanteLogic();
                List<Especialidad> especialidades = especialidadLogic.buscarEspecialidadPorNombre(nombreEspecialidad);
                List<Ingresante> ingresantes1 = ingresanteLogic.buscaringresantePorNombre(nombreingresante1);

                List<Ingresante> ingresantes2 = new ArrayList<>();
                List<Ingresante> ingresantes3 = new ArrayList<>();
                if (nombreingresante2 != null && !nombreingresante2.isEmpty()) {
                    ingresantes2 = ingresanteLogic.buscaringresantePorNombre(nombreingresante2);
                }
                if (nombreingresante3 != null && !nombreingresante3.isEmpty()) {
                    ingresantes3 = ingresanteLogic.buscaringresantePorNombre(nombreingresante3);
                }

                if (!especialidades.isEmpty()) {
                    Especialidad especialidadSeleccionda = especialidades.get(0);
                    Ingresante ingresante1Seleccionda = ingresantes1.get(0);
                    Ingresante ingresante2Seleccionda = (!ingresantes2.isEmpty()) ? ingresantes2.get(0) : null;
                    Ingresante ingresante3Seleccionda = (!ingresantes3.isEmpty()) ? ingresantes3.get(0) : null;

                    int id = Integer.parseInt(idTxt);
                    Proyecto proyecto = new Proyecto();
                    proyecto.setId(id);
                    proyecto.setTitulo(titulo);
                    proyecto.setAsesora(asesora);
                    proyecto.setJurado(jurado);
                    proyecto.setRes_designacion(res_designacion);
                    proyecto.setRes_ejecucion(res_ejecucion);
                    proyecto.setRes_cambioJurado(res_cambioJurado);
                    proyecto.setRes_sustentacion(res_sustentacion);
                    proyecto.setRes_cambioTitulo(res_cambioTitulo);
                    proyecto.setOtros(otro);
                    proyecto.setEspecialidad(especialidadSeleccionda);
                    proyecto.setIngresante1(ingresante1Seleccionda);
                    proyecto.setIngresante2(ingresante2Seleccionda);
                    proyecto.setIngresante3(ingresante3Seleccionda);
                    if (proyectoLogic.modificarProyecto(proyecto)) {
                        JOptionPane.showMessageDialog(null, "Proyecto modificado correctamente");
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede modificar el proyecto");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Debe ingresar un nombre especialidad");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar proyecto: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe llenar los campos");
        }
    }//GEN-LAST:event_jbtnModificarProyectoActionPerformed

    private void jtxtingresante3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtingresante3KeyReleased
        String ingresante_nombre = jtxtingresante3.getText().trim();

        if (!ingresante_nombre.isEmpty()) {
            List<Ingresante> ingresantes = ingresanteLogic.buscaringresantePorNombre(ingresante_nombre);
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            for (Ingresante ingresante : ingresantes) {
                model.addElement(ingresante.getNombre());
            }
            jcomboboxalumno3.setModel(model);
        } else {
            jcomboboxalumno3.setModel(new DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_jtxtingresante3KeyReleased

    private void jtxtResCambioTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResCambioTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtResCambioTituloActionPerformed

    private void jtxtEspecialidadProyecto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEspecialidadProyecto1KeyReleased
        // TODO add your handling code here:

        String especialidad_nombre = jtxtEspecialidadProyecto1.getText().trim();

        if (!especialidad_nombre.isEmpty()) {
            List<Especialidad> especialidades = especialidadLogic.buscarEspecialidadPorNombre(especialidad_nombre);
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            for (Especialidad especialidad : especialidades) {
                model.addElement(especialidad.getNombre());
            }
            jcomboboxEspecilidadProyecto1.setModel(model);
        } else {
            jcomboboxEspecilidadProyecto1.setModel(new DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_jtxtEspecialidadProyecto1KeyReleased

    private void jtxingresante1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxingresante1KeyReleased
        // TODO add your handling code here:

        String ingresante_nombre = jtxingresante1.getText().trim();

        if (!ingresante_nombre.isEmpty()) {
            List<Ingresante> ingresantes = ingresanteLogic.buscaringresantePorNombre(ingresante_nombre);
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            for (Ingresante ingresante : ingresantes) {
                model.addElement(ingresante.getNombre());
            }
            jcomboboxalumno1.setModel(model);
        } else {
            jcomboboxalumno1.setModel(new DefaultComboBoxModel<>());
        }
    }//GEN-LAST:event_jtxingresante1KeyReleased

    private void jtxtingresante2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtingresante2KeyReleased
        // TODO add your handling code here:
        String ingresante_nombre = jtxtingresante2.getText().trim();

        if (!ingresante_nombre.isEmpty()) {
            List<Ingresante> ingresantes = ingresanteLogic.buscaringresantePorNombre(ingresante_nombre);
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            for (Ingresante ingresante : ingresantes) {
                model.addElement(ingresante.getNombre());
            }
            jcomboboxalumno2.setModel(model);
        } else {
            jcomboboxalumno2.setModel(new DefaultComboBoxModel<>());
        }


    }//GEN-LAST:event_jtxtingresante2KeyReleased

    private void jcomboboxEspecilidadProyecto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboboxEspecilidadProyecto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboboxEspecilidadProyecto1ActionPerformed

    private void jcomboboxalumno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboboxalumno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboboxalumno1ActionPerformed

    private void jcomboboxalumno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboboxalumno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboboxalumno2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmModificarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModificarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModificarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModificarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmModificarProyecto dialog = new FrmModificarProyecto(new javax.swing.JFrame(), true);
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

    public void setDatos(int id, String titulo, String nombre_estudiante1, String nombre_estudiante2, String nombre_estudiante3, String asesora, String jurado, String res_designacion, String res_ejecucion, String res_cambioJurado, String res_sustentacion, String res_cambioTitulo, String nombre_Especialidad, String otro) {
        jtxtIdProyecto.setText(String.valueOf(id));
        jtxtTituloProyecto.setText(titulo);
        jtxingresante1.setText(nombre_estudiante1);
        jtxtingresante2.setText(nombre_estudiante2);
        jtxtingresante3.setText(nombre_estudiante3);
        jtxtEspecialidadProyecto1.setText(nombre_Especialidad);
        jtxtAsesoraProyecto.setText(asesora);
        jtxtJuradoProyecto.setText(jurado);
        jtxtResDesignacionProyecto.setText(res_designacion);
        jtxtResEjecucionProyecto.setText(res_ejecucion);
        jtxtResCambioJuradoProyecto.setText(res_cambioJurado);
        jtxtResCambioTitulo.setText(res_cambioTitulo);
        jtxtResSustentacion.setText(res_sustentacion);
        jtxtOtrosProyecto.setText(otro);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PROYECTO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnModificarProyecto;
    private javax.swing.JButton jbtnSalirModificarProyecto;
    private javax.swing.JComboBox<String> jcomboboxEspecilidadProyecto1;
    private javax.swing.JComboBox<String> jcomboboxalumno1;
    private javax.swing.JComboBox<String> jcomboboxalumno2;
    private javax.swing.JComboBox<String> jcomboboxalumno3;
    private javax.swing.JTextField jtxingresante1;
    private javax.swing.JTextField jtxtAsesoraProyecto;
    private javax.swing.JTextField jtxtEspecialidadProyecto1;
    private javax.swing.JTextField jtxtIdProyecto;
    private javax.swing.JTextArea jtxtJuradoProyecto;
    private javax.swing.JTextArea jtxtOtrosProyecto;
    private javax.swing.JTextField jtxtResCambioJuradoProyecto;
    private javax.swing.JTextField jtxtResCambioTitulo;
    private javax.swing.JTextField jtxtResDesignacionProyecto;
    private javax.swing.JTextField jtxtResEjecucionProyecto;
    private javax.swing.JTextField jtxtResSustentacion;
    private javax.swing.JTextField jtxtTituloProyecto;
    private javax.swing.JTextField jtxtingresante2;
    private javax.swing.JTextField jtxtingresante3;
    // End of variables declaration//GEN-END:variables
}
