/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Bicicleta;

import Entidades.Bicicleta;
import static TestUMLs.ProyectoFinalUniversidadG8.bd;
import javax.swing.JOptionPane;

public class Bicicleta_BuscarPorID extends javax.swing.JPanel {

    public Bicicleta_BuscarPorID() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFNumSerie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFTipo = new javax.swing.JTextField();
        JBBuscarBuscarBicicleta = new java.awt.Button();
        JTFColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFDNIDueño = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JBLimpiarBuscarRepuesto = new java.awt.Button();

        setMaximumSize(new java.awt.Dimension(398, 600));
        setMinimumSize(new java.awt.Dimension(398, 600));
        setPreferredSize(new java.awt.Dimension(398, 600));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Bicicleta Por ID");

        jLabel3.setText("Num. Serie:");

        JTFNumSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumSerieActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo:");

        JTFTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTipoActionPerformed(evt);
            }
        });

        JBBuscarBuscarBicicleta.setActionCommand("Buscar");
        JBBuscarBuscarBicicleta.setLabel("Buscar");
        JBBuscarBuscarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarBuscarBicicletaActionPerformed(evt);
            }
        });

        jLabel5.setText("Color:");

        JTFDNIDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDNIDueñoActionPerformed(evt);
            }
        });

        jLabel7.setText("DNI Dueño");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBBuscarBuscarBicicleta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBLimpiarBuscarRepuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFNumSerie))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 126, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFDNIDueño)
                            .addComponent(JTFColor, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(JTFTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))))
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
                .addComponent(JBBuscarBuscarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTFDNIDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(JBLimpiarBuscarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumSerieActionPerformed

    private void JTFTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTipoActionPerformed

    private void JBBuscarBuscarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarBuscarBicicletaActionPerformed
        if (JTFNumSerie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un N° Serie por favor");
        } else {
            try {
                Bicicleta aux = bd.obtenerBicicletaPorId(Integer.parseInt(JTFNumSerie.getText()));
                JTFTipo.setText(aux.getTipo());
                JTFColor.setText(aux.getColor());
                JTFDNIDueño.setText(String.valueOf(aux.getDueño().getDni()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error, N° Serie invalido.");
            }
        }
    }//GEN-LAST:event_JBBuscarBuscarBicicletaActionPerformed

    private void JTFDNIDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDNIDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDNIDueñoActionPerformed

    private void JBLimpiarBuscarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarBuscarRepuestoActionPerformed
        JTFTipo.setText("");
        JTFColor.setText("");
        JTFNumSerie.setText("");
        JTFDNIDueño.setText("");
    }//GEN-LAST:event_JBLimpiarBuscarRepuestoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBuscarBuscarBicicleta;
    private java.awt.Button JBLimpiarBuscarRepuesto;
    private javax.swing.JTextField JTFColor;
    private javax.swing.JTextField JTFDNIDueño;
    private javax.swing.JTextField JTFNumSerie;
    private javax.swing.JTextField JTFTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
