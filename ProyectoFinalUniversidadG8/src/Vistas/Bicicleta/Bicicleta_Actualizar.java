/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Bicicleta;

import Entidades.Bicicleta;
import static TestUMLs.ProyectoFinalUniversidadG8.bd;
import javax.swing.JOptionPane;

public class Bicicleta_Actualizar extends javax.swing.JPanel {

    public Bicicleta_Actualizar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JTFDNIDueño = new javax.swing.JTextField();
        JBActualizarActualizarBicicleta = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        JBLimpiarActualizarBicicleta = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JTFNumSerie = new javax.swing.JTextField();
        JTFTipo = new javax.swing.JTextField();
        JTFColor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JBBuscarActualizarBicicleta = new java.awt.Button();

        jPanel1.setMinimumSize(new java.awt.Dimension(398, 600));

        JTFDNIDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDNIDueñoActionPerformed(evt);
            }
        });

        JBActualizarActualizarBicicleta.setActionCommand("Actualizar");
        JBActualizarActualizarBicicleta.setLabel("Actualizar");
        JBActualizarActualizarBicicleta.setName(""); // NOI18N
        JBActualizarActualizarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActualizarActualizarBicicletaActionPerformed(evt);
            }
        });

        jLabel3.setText("Serie:");

        JBLimpiarActualizarBicicleta.setLabel("Limpiar");
        JBLimpiarActualizarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarActualizarBicicletaActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo:");

        jLabel5.setText("Color:");

        jLabel7.setText("DNI Dueño:");

        JTFNumSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumSerieActionPerformed(evt);
            }
        });

        JTFTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTipoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Actualizar Bicicleta");

        JBBuscarActualizarBicicleta.setActionCommand("Buscar");
        JBBuscarActualizarBicicleta.setLabel("Buscar");
        JBBuscarActualizarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActualizarBicicletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBBuscarActualizarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(19, 19, 19)
                        .addComponent(JTFDNIDueño))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44)
                                .addComponent(JTFNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBLimpiarActualizarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBActualizarActualizarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(JBBuscarActualizarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(JTFDNIDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBLimpiarActualizarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBActualizarActualizarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JBBuscarActualizarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActualizarBicicletaActionPerformed
        if (JTFNumSerie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un N° DNI por favor");
        } else {
            try {
                Bicicleta aux = bd.obtenerBicicletaPorId(Integer.parseInt(JTFNumSerie.getText()));
                JTFTipo.setText(aux.getTipo());
                JTFColor.setText(aux.getColor());
                JTFDNIDueño.setText(String.valueOf(aux.getDueño()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error, DNI invalido.");
            }
        }
    }//GEN-LAST:event_JBBuscarActualizarBicicletaActionPerformed

    private void JTFTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTipoActionPerformed

    private void JTFNumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumSerieActionPerformed

    private void JBLimpiarActualizarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarActualizarBicicletaActionPerformed
        JTFTipo.setText("");
        JTFColor.setText("");
        
        JTFDNIDueño.setText("");
    }//GEN-LAST:event_JBLimpiarActualizarBicicletaActionPerformed

    private void JBActualizarActualizarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActualizarActualizarBicicletaActionPerformed
        if (JTFTipo.getText().isEmpty() || JTFColor.getText().isEmpty() || JTFDNIDueño.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
        } else {
            try {
                Bicicleta aux = bd.obtenerBicicletaPorId(Integer.parseInt(JTFNumSerie.getText()));
                aux.setTipo(JTFTipo.getText());
                aux.setColor(JTFColor.getText());
                aux.setDueño(JTFDNIDueño.getText());
                bd.actualizarBicicleta(aux, Integer.parseInt(JTFNumSerie.getText()));
                JBLimpiarActualizarBicicletaActionPerformed(evt);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error, verifique haber ingresado todos los datos correctamente.");
            }
        }
    }//GEN-LAST:event_JBActualizarActualizarBicicletaActionPerformed

    private void JTFDNIDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDNIDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDNIDueñoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBActualizarActualizarBicicleta;
    private java.awt.Button JBBuscarActualizarBicicleta;
    private java.awt.Button JBLimpiarActualizarBicicleta;
    private javax.swing.JTextField JTFColor;
    private javax.swing.JTextField JTFDNIDueño;
    private javax.swing.JTextField JTFNumSerie;
    private javax.swing.JTextField JTFTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
