/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Repuesto;

import Entidades.Repuesto;
import static TestUMLs.ProyectoFinalUniversidadG8.repud;
import javax.swing.JOptionPane;


public class Repuesto_Quitar extends javax.swing.JPanel {

    public Repuesto_Quitar() {
        initComponents();
        actualizarLista();
        JTFNumeroDeSerie.setEnabled(false);
        JTFDescripcion.setEnabled(false);
        JTFPrecio.setEnabled(false);
       
    }

    private void actualizarLista() {
        JCBRepuestosBorrarRepuestos.removeAllItems();
        for (Repuesto lista : repud.obtenerRepuestos()) {
            JCBRepuestosBorrarRepuestos.addItem(lista.getDescripcion());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JTFNumeroDeSerie = new javax.swing.JTextField();
        JTFDescripcion = new javax.swing.JTextField();
        JTFPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JBBorrarBorrarRepuesto = new java.awt.Button();
        JBLimpiarBorrarRepuesto = new java.awt.Button();
        JCBRepuestosBorrarRepuestos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setMinimumSize(new java.awt.Dimension(398, 600));
        jPanel1.setName(""); // NOI18N

        JTFNumeroDeSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumeroDeSerieActionPerformed(evt);
            }
        });

        JTFDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescripcionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Borrar Repuesto");

        JBBorrarBorrarRepuesto.setActionCommand("Borrar");
        JBBorrarBorrarRepuesto.setLabel("Borrar");
        JBBorrarBorrarRepuesto.setName(""); // NOI18N
        JBBorrarBorrarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBorrarBorrarRepuestoActionPerformed(evt);
            }
        });

        JBLimpiarBorrarRepuesto.setLabel("Limpiar");
        JBLimpiarBorrarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarBorrarRepuestoActionPerformed(evt);
            }
        });

        JCBRepuestosBorrarRepuestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBRepuestosBorrarRepuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBRepuestosBorrarRepuestosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setText("Datos");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel8.setText("Repuesto");

        jLabel3.setText("Num Serie :");

        jLabel4.setText("Descripcion :");

        jLabel9.setText("Precio :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCBRepuestosBorrarRepuestos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFNumeroDeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFDescripcion)
                                    .addComponent(JTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBLimpiarBorrarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(JBBorrarBorrarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(JCBRepuestosBorrarRepuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNumeroDeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBLimpiarBorrarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBorrarBorrarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JCBRepuestosBorrarRepuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBRepuestosBorrarRepuestosActionPerformed
        if (JCBRepuestosBorrarRepuestos.getSelectedIndex() >= 0) {
            JCBRepuestosBorrarRepuestos.setSelectedIndex(JCBRepuestosBorrarRepuestos.getSelectedIndex());
            JTFDescripcion.setText(repud.obtenerRepuestos().get(JCBRepuestosBorrarRepuestos.getSelectedIndex()).getDescripcion());
            JTFPrecio.setText(String.valueOf(repud.obtenerRepuestos().get(JCBRepuestosBorrarRepuestos.getSelectedIndex()).getPrecio()));
            JTFNumeroDeSerie.setText(String.valueOf(repud.obtenerRepuestos().get(JCBRepuestosBorrarRepuestos.getSelectedIndex()).getNumSerie()));
        }
    }//GEN-LAST:event_JCBRepuestosBorrarRepuestosActionPerformed

    private void JBLimpiarBorrarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarBorrarRepuestoActionPerformed
        JTFDescripcion.setText("");
        JTFPrecio.setText("");
        JTFNumeroDeSerie.setText("");
        actualizarLista();
    }//GEN-LAST:event_JBLimpiarBorrarRepuestoActionPerformed

    private void JBBorrarBorrarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBorrarBorrarRepuestoActionPerformed
        try {
            repud.borrarRepuesto(Integer.parseInt(JTFNumeroDeSerie.getText()));
            JBLimpiarBorrarRepuestoActionPerformed(evt);
            actualizarLista();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error eliminando el cliente.");
        }
    }//GEN-LAST:event_JBBorrarBorrarRepuestoActionPerformed

    private void JTFDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDescripcionActionPerformed

    private void JTFNumeroDeSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumeroDeSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumeroDeSerieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBorrarBorrarRepuesto;
    private java.awt.Button JBLimpiarBorrarRepuesto;
    private javax.swing.JComboBox<String> JCBRepuestosBorrarRepuestos;
    private javax.swing.JTextField JTFDescripcion;
    private javax.swing.JTextField JTFNumeroDeSerie;
    private javax.swing.JTextField JTFPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
