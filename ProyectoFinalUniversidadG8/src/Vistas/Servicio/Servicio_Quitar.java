/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Servicio;

import Entidades.Servicio;
import static TestUMLs.ProyectoFinalUniversidadG8.sd;
import javax.swing.JOptionPane;

public class Servicio_Quitar extends javax.swing.JPanel {

    public Servicio_Quitar() {
        initComponents();
        actualizarLista();
        JTFCodigo.setEnabled(false);
        JTFDescripcion.setEnabled(false);
        JTFPrecio.setEnabled(false);
    }

    private void actualizarLista() {
        JCBServiciosBorrarServicio.removeAllItems();
        for (Servicio lista : sd.obtenerServicios()) {
            JCBServiciosBorrarServicio.addItem(lista.getDescripcion());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        JTFDescripcion = new javax.swing.JTextField();
        JTFPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JBBorrarBorrarServicio = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        JBLimpiarBorrarServicio = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        JCBServiciosBorrarServicio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setMinimumSize(new java.awt.Dimension(398, 600));
        jPanel1.setName(""); // NOI18N

        jLabel7.setText("Precio:");

        JTFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCodigoActionPerformed(evt);
            }
        });

        JTFDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescripcionActionPerformed(evt);
            }
        });

        JTFPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPrecioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Borrar Servicio");

        JBBorrarBorrarServicio.setActionCommand("Borrar");
        JBBorrarBorrarServicio.setLabel("Borrar");
        JBBorrarBorrarServicio.setName(""); // NOI18N
        JBBorrarBorrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBorrarBorrarServicioActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo:");

        JBLimpiarBorrarServicio.setLabel("Limpiar");
        JBLimpiarBorrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarBorrarServicioActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripcion:");

        JCBServiciosBorrarServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBServiciosBorrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBServiciosBorrarServicioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setText("Datos");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel8.setText("Servicio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCBServiciosBorrarServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTFPrecio)
                                        .addComponent(JTFDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBLimpiarBorrarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBBorrarBorrarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(JCBServiciosBorrarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBLimpiarBorrarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBorrarBorrarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCodigoActionPerformed

    private void JTFDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDescripcionActionPerformed

    private void JTFPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPrecioActionPerformed

    private void JBBorrarBorrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBorrarBorrarServicioActionPerformed
        try {
            sd.borrarServicio(Integer.parseInt(JTFCodigo.getText()));
            JBLimpiarBorrarServicioActionPerformed(evt);
            actualizarLista();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error eliminando el cliente.");
        }
    }//GEN-LAST:event_JBBorrarBorrarServicioActionPerformed

    private void JBLimpiarBorrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarBorrarServicioActionPerformed
        JTFDescripcion.setText("");
        JTFCodigo.setText("");
        JTFPrecio.setText("");
        actualizarLista();
    }//GEN-LAST:event_JBLimpiarBorrarServicioActionPerformed

    private void JCBServiciosBorrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBServiciosBorrarServicioActionPerformed
        if (JCBServiciosBorrarServicio.getSelectedIndex() >= 0) {
            JCBServiciosBorrarServicio.setSelectedIndex(JCBServiciosBorrarServicio.getSelectedIndex());
            JTFDescripcion.setText(sd.obtenerServicios().get(JCBServiciosBorrarServicio.getSelectedIndex()).getDescripcion());
            JTFPrecio.setText(String.valueOf(sd.obtenerServicios().get(JCBServiciosBorrarServicio.getSelectedIndex()).getPrecio()));
            JTFCodigo.setText(String.valueOf(sd.obtenerServicios().get(JCBServiciosBorrarServicio.getSelectedIndex()).getCodigo()));
        }
    }//GEN-LAST:event_JCBServiciosBorrarServicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBorrarBorrarServicio;
    private java.awt.Button JBLimpiarBorrarServicio;
    private javax.swing.JComboBox<String> JCBServiciosBorrarServicio;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFDescripcion;
    private javax.swing.JTextField JTFPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
