/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package FormulariosBH;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class frm_asignarSilla extends javax.swing.JInternalFrame {

    /**
     * Creates new form frm_asignarSilla
     */
    DefaultTableModel modelo;
    private static boolean ban = false;

    public frm_asignarSilla() {
        initComponents();
        PrepararTabla();
    }

    private void PrepararTabla() {
        String titulos[] = {"N silla", "Usuario", "Ubicacion silla", "Clase Silla"};
        modelo = new DefaultTableModel(null, titulos);
        tb_asignarSilla.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        ubiSilla = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nSilla = new javax.swing.JTextField();
        claseSilla = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb_asignarSilla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Asignar Silla");

        ubiSilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventana", "Centro", "Pasillo", "" }));

        jLabel1.setText("N silla:");

        jLabel4.setText("Usuario:");

        jLabel2.setText("Ubi silla:");

        jLabel3.setText("Clase silla:");

        claseSilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economica ", "Ejecutiva" }));

        tb_asignarSilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tb_asignarSilla);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setText("ASIGNAR SILLA");

        btnAgregar.setText("Agregar");
        btnAgregar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnAgregarStateChanged(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnOrdenar.setText("ORDENAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnAgregar)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscar)
                        .addGap(27, 27, 27)
                        .addComponent(btnEditar)
                        .addGap(28, 28, 28)
                        .addComponent(btnOrdenar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nSilla, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ubiSilla, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(claseSilla, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(221, 221, 221)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nSilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ubiSilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(claseSilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar)
                    .addComponent(btnOrdenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnAgregarStateChanged

    }//GEN-LAST:event_btnAgregarStateChanged

    private boolean mtd_duplicados() {

        boolean dublicado = false;
        for (int i = 0; i < tb_asignarSilla.getRowCount(); i++) {

            if (usuario.getText().equals(tb_asignarSilla.getValueAt(i, 0).toString())) {
                JOptionPane.showMessageDialog(null, "Ya existe un registro con el mismo número de cédula!");
                dublicado = true;
            }
        }
        return dublicado;
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (nSilla.getText().trim().length() > 0) {
            if (usuario.getText().trim().length() > 0) {
                if (ubiSilla.getSelectedItem().toString().trim().length() > 0) {
                    if (claseSilla.getSelectedItem().toString().trim().length() > 0) {
                        Clases.Silla obj = new Clases.Silla(Integer.parseInt(nSilla.getText()), ubiSilla.getSelectedItem().toString(), claseSilla.getSelectedItem().toString());
                        if (obj.mtd_guardar() == true) {
                            if (ban == false) {
                                if (mtd_duplicados() == false) {
                                    modelo = (DefaultTableModel) tb_asignarSilla.getModel();
                                    String nuevaFila[] = {String.valueOf(obj.getNumSilla()), obj.getUbiSilla(), obj.getClaseSilla()};
                                    modelo.addRow(nuevaFila);

                                    mtd_lipiartextos();
                                }
                            }

                        }
                        if (ban == true) {
                            int filasel = tb_asignarSilla.getSelectedRow();
                            tb_asignarSilla.setValueAt(nSilla.getText(), tb_asignarSilla.getSelectedRow(), 0);
                            tb_asignarSilla.setValueAt(ubiSilla.getSelectedItem().toString(), tb_asignarSilla.getSelectedRow(), 1);
                            tb_asignarSilla.setValueAt(claseSilla.getSelectedItem().toString(), tb_asignarSilla.getSelectedRow(), 2);

                            ban = false;
                            mtd_lipiartextos();
                            usuario.setEnabled(true);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, seleccione su clase");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese su ubicacion");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese su Dirección");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese su numero de silla");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int filsel = tb_asignarSilla.getSelectedRow();
        if (filsel == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila!");
        } else {
            nSilla.setText(tb_asignarSilla.getValueAt(filsel, 0).toString());
            ubiSilla.setSelectedItem(tb_asignarSilla.getValueAt(filsel, 1));
            claseSilla.setSelectedItem(tb_asignarSilla.getValueAt(filsel, 2));

            usuario.setEnabled(false);

            ban = true;
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JComboBox<String> claseSilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField nSilla;
    private javax.swing.JTable tb_asignarSilla;
    private javax.swing.JComboBox<String> ubiSilla;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    private void mtd_lipiartextos() {
        nSilla.setText("");

    }
}
