/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Servicio;

import Entidades.Servicio;
import static TestUMLs.ProyectoFinalUniversidadG8.sd;
import javax.swing.JOptionPane;

public class Servicio_BuscarPorID extends javax.swing.JPanel {

    public Servicio_BuscarPorID() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFDescripcion = new javax.swing.JTextField();
        JBBuscarBuscarServicio = new java.awt.Button();
        JTFPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JBLimpiarBuscarServicio = new java.awt.Button();

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Servicio");

        jLabel3.setText("Codigo:");

        JTFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCodigoActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripcion:");

        JTFDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescripcionActionPerformed(evt);
            }
        });

        JBBuscarBuscarServicio.setActionCommand("Buscar");
        JBBuscarBuscarServicio.setLabel("Buscar");
        JBBuscarBuscarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarBuscarServicioActionPerformed(evt);
            }
        });

        JTFPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPrecioActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio:");

        JBLimpiarBuscarServicio.setLabel("Limpiar");
        JBLimpiarBuscarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarBuscarServicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBBuscarBuscarServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBLimpiarBuscarServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(49, 49, 49)
                        .addComponent(JTFPrecio))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(JBBuscarBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addComponent(JBLimpiarBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCodigoActionPerformed

    private void JTFDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDescripcionActionPerformed

    private void JBBuscarBuscarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarBuscarServicioActionPerformed
        if (JTFCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un N° DNI por favor");
        } else {
            try {
                Servicio aux = sd.obtenerServicioPorId(Integer.parseInt(JTFCodigo.getText()));
                JTFDescripcion.setText(aux.getDescripcion());
                JTFPrecio.setText(String.valueOf(aux.getPrecio()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error, DNI invalido.");
            }
        }
    }//GEN-LAST:event_JBBuscarBuscarServicioActionPerformed

    private void JTFPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPrecioActionPerformed

    private void JBLimpiarBuscarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarBuscarServicioActionPerformed
        JTFDescripcion.setText("");
        JTFCodigo.setText("");
        JTFPrecio.setText("");
    }//GEN-LAST:event_JBLimpiarBuscarServicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBuscarBuscarServicio;
    private java.awt.Button JBLimpiarBuscarServicio;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFDescripcion;
    private javax.swing.JTextField JTFPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
