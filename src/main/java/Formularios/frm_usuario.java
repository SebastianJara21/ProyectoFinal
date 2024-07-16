/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Formularios;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class frm_usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form frm_usuario
     */
    DefaultTableModel modelo;

    public frm_usuario() {
        initComponents();
        PrepararTabla();
    }

    private void PrepararTabla() {
        String titulos[] = {"E-mail", "Contraseña", "Cédula", "Nombre", "Edad", "Dirección"};
        modelo = new DefaultTableModel(null, titulos);
        tb_usuario.setModel(modelo);

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
        jLabel6 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_contra = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        btn_agg = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_usuario = new javax.swing.JTable();
        btn_ordenar = new javax.swing.JButton();

        setTitle("REGISTRO DE USUARIO");
        setToolTipText("");
        setName("Registro de Usuario"); // NOI18N

        jLabel1.setText("Email:");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Cedula:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Direccion:");

        btn_agg.setText("Agregar");
        btn_agg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aggActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        tb_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_usuario);

        btn_ordenar.setText("Ordenar");
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_agg)
                                .addGap(41, 41, 41)
                                .addComponent(btn_editar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_eliminar)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(btn_ordenar)
                                .addGap(27, 27, 27)))
                        .addGap(9, 9, 9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agg)
                    .addComponent(btn_editar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_ordenar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private static boolean ban = false;
    private void btn_aggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aggActionPerformed
        try {
            if (txt_email.getText().trim().length() > 0) {
                if (txt_contra.getText().trim().length() > 0) {
                    if (txt_cedula.getText().trim().length() > 0) {
                        if (txt_nombre.getText().trim().length() > 0) {
                            if (txt_edad.getText().trim().length() > 0) {
                                if (txt_direccion.getText().trim().length() > 0) {

                                    Clases.Usuario obj = new Clases.Usuario(txt_email.getText(), txt_contra.getText(), txt_cedula.getText(), txt_nombre.getText(), Integer.parseInt(txt_edad.getText()), txt_direccion.getText());
                                    if (obj.mtd_guardar() == true) {
                                        if (ban == false) {
                                            if (mtd_duplicados() == false) {

                                                modelo = (DefaultTableModel) tb_usuario.getModel();
                                                String nuevaFila[] = {obj.getEmail(), obj.getContra(), obj.getCed(), obj.getNom(), String.valueOf(obj.getEdad()), obj.getDirecc()};
                                                modelo.addRow(nuevaFila);

                                                mtd_lipiartextos();
                                            }
                                        }
                                    }
                                    if (ban == true) {
                                        int filasel = tb_usuario.getSelectedRow();
                                        tb_usuario.setValueAt(txt_email.getText(), tb_usuario.getSelectedRow(), 0);
                                        tb_usuario.setValueAt(txt_contra.getText(), tb_usuario.getSelectedRow(), 1);
                                        tb_usuario.setValueAt(txt_cedula.getText(), tb_usuario.getSelectedRow(), 2);
                                        tb_usuario.setValueAt(txt_nombre.getText(), tb_usuario.getSelectedRow(), 3);
                                        tb_usuario.setValueAt(txt_edad.getText(), tb_usuario.getSelectedRow(), 4);
                                        tb_usuario.setValueAt(txt_direccion.getText(), tb_usuario.getSelectedRow(), 5);

                                        ban = false;
                                        mtd_lipiartextos();
                                        txt_cedula.setEnabled(true);

                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Por favor, ingrese su ");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Por favor, ingrese su ");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor, ingrese su número de ");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese su ");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese su ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese su ");
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error de codigo fuente", "Sistema de Autor", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showConfirmDialog(null, "Error: de código fuente", "Sistema de Autor", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_aggActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        int filsel = tb_usuario.getSelectedRow();
        if (filsel == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila!");
        } else {
            txt_email.setText(tb_usuario.getValueAt(filsel, 0).toString());
            txt_contra.setText(tb_usuario.getValueAt(filsel, 1).toString());
            txt_cedula.setText(tb_usuario.getValueAt(filsel, 2).toString());
            txt_nombre.setText(tb_usuario.getValueAt(filsel, 3).toString());
            txt_edad.setText(tb_usuario.getValueAt(filsel, 4).toString());
            txt_direccion.setText(tb_usuario.getValueAt(filsel, 5).toString());

            txt_cedula.setEnabled(false);

            ban = true;
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int filasel = tb_usuario.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
        } else {
            modelo = (DefaultTableModel) tb_usuario.getModel();
            modelo.removeRow(filasel);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarActionPerformed
       // Obtener el modelo de la tabla
    DefaultTableModel model = (DefaultTableModel) tb_usuario.getModel();
    
    // Obtener número de filas de la tabla
    int numRows = model.getRowCount();
    
    // Crear un ArrayList para almacenar los nombres
    ArrayList<String> nombres = new ArrayList<>();
    
    // Leer los nombres de la tabla y guardarlos en el ArrayList
    for (int i = 0; i < numRows; i++) {
        String nombre = (String) model.getValueAt(i, 0); // Suponiendo que el nombre está en la columna 0
        nombres.add(nombre);
    }
    
    // Ordenar alfabéticamente
    Collections.sort(nombres);
    
    // Limpiar la tabla
    model.setRowCount(0);
    
    // Agregar los nombres ordenados de vuelta a la tabla
    for (String nombre : nombres) {
        model.addRow(new Object[]{nombre}); // Añadir cada nombre como una nueva fila
    }
    }//GEN-LAST:event_btn_ordenarActionPerformed
    private boolean mtd_duplicados() {

        boolean dublicado = false;
        for (int i = 0; i < tb_usuario.getRowCount(); i++) {

            if (txt_cedula.getText().equals(tb_usuario.getValueAt(i, 0).toString())) {
                JOptionPane.showMessageDialog(null, "Ya existe un registro con el mismo número de cédula!");
                dublicado = true;
            }
        }
        return dublicado;
    }

    private void mtd_lipiartextos() {
        txt_email.setText("");
        txt_contra.setText("");
        txt_cedula.setText("");
        txt_nombre.setText("");
        txt_edad.setText("");
        txt_direccion.setText("");

        txt_cedula.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agg;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_usuario;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_contra;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
