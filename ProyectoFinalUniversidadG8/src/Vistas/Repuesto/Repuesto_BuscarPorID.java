/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Repuesto;

import Entidades.Repuesto;
import static TestUMLs.ProyectoFinalUniversidadG8.repud;
import javax.swing.JOptionPane;

public class Repuesto_BuscarPorID extends javax.swing.JPanel {

    public Repuesto_BuscarPorID() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFNumSerie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFDescripcion = new javax.swing.JTextField();
        JBBuscarBuscarRepuesto = new java.awt.Button();
        JTFPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JBLimpiarBuscarRepuesto = new java.awt.Button();

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Repuesto");

        jLabel3.setText("Num. Serie:");

        JTFNumSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumSerieActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripcion:");

        JTFDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescripcionActionPerformed(evt);
            }
        });

        JBBuscarBuscarRepuesto.setActionCommand("Buscar");
        JBBuscarBuscarRepuesto.setLabel("Buscar");
        JBBuscarBuscarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarBuscarRepuestoActionPerformed(evt);
            }
        });

        JTFPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPrecioActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio :");

        JBLimpiarBuscarRepuesto.setLabel("Limpiar");
        JBLimpiarBuscarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarBuscarRepuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFNumSerie)
                                    .addComponent(JTFPrecio)
                                    .addComponent(JTFDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBBuscarBuscarRepuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBLimpiarBuscarRepuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(JBBuscarBuscarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBLimpiarBuscarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumSerieActionPerformed

    private void JTFDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDescripcionActionPerformed

    private void JBBuscarBuscarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarBuscarRepuestoActionPerformed
        if (JTFNumSerie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un N° DNI por favor");
        } else {
            try {
                Repuesto aux = repud.obtenerRepuestoPorId(Integer.parseInt(JTFNumSerie.getText()));
                JTFDescripcion.setText(aux.getDescripcion());
                JTFPrecio.setText(String.valueOf(aux.getPrecio()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error, DNI invalido.");
            }
        }
    }//GEN-LAST:event_JBBuscarBuscarRepuestoActionPerformed

    private void JTFPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPrecioActionPerformed

    private void JBLimpiarBuscarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarBuscarRepuestoActionPerformed
        JTFDescripcion.setText("");
        JTFPrecio.setText("");
    }//GEN-LAST:event_JBLimpiarBuscarRepuestoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBuscarBuscarRepuesto;
    private java.awt.Button JBLimpiarBuscarRepuesto;
    private javax.swing.JTextField JTFDescripcion;
    private javax.swing.JTextField JTFNumSerie;
    private javax.swing.JTextField JTFPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
