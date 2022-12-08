/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Bicicleta;

import Entidades.Bicicleta;
import static TestUMLs.ProyectoFinalUniversidadG8.bd;
import javax.swing.JOptionPane;

public class Bicicleta_Quitar extends javax.swing.JPanel {

    public Bicicleta_Quitar() {
        initComponents();
        actualizarLista();
        JTFTipo.setEnabled(false);
        JTFColor.setEnabled(false);
        JTFNumSerie.setEnabled(false);
        JTFDueño.setEnabled(false);
    }

    private void actualizarLista() {
        JCBBicicleasBorrarBicicletas.removeAllItems();
        for (Bicicleta lista : bd.obtenerBicicletas()) {
            JCBBicicleasBorrarBicicletas.addItem(lista.getTipo() + " " + lista.getColor());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JBBorrarBorrarBicicleta = new java.awt.Button();
        JBLimpiarBorrarBicicleta = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        JCBBicicleasBorrarBicicletas = new javax.swing.JComboBox<>();
        JTFNumSerie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFTipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTFColor = new javax.swing.JTextField();
        JTFDueño = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(398, 600));
        setMinimumSize(new java.awt.Dimension(398, 600));
        setPreferredSize(new java.awt.Dimension(398, 600));

        jPanel1.setMinimumSize(new java.awt.Dimension(398, 600));
        jPanel1.setName(""); // NOI18N

        jLabel3.setText("Serie:");

        jLabel4.setText("Tipo :");

        jLabel5.setText("Color:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Borrar Bicicleta");

        JBBorrarBorrarBicicleta.setActionCommand("Borrar");
        JBBorrarBorrarBicicleta.setLabel("Borrar");
        JBBorrarBorrarBicicleta.setName(""); // NOI18N
        JBBorrarBorrarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBorrarBorrarBicicletaActionPerformed(evt);
            }
        });

        JBLimpiarBorrarBicicleta.setLabel("Limpiar");
        JBLimpiarBorrarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarBorrarBicicletaActionPerformed(evt);
            }
        });

        jLabel7.setText("Dueño :");

        JCBBicicleasBorrarBicicletas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBBicicleasBorrarBicicletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBBicicleasBorrarBicicletasActionPerformed(evt);
            }
        });

        JTFNumSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNumSerieActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setText("Datos");

        JTFTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTipoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel8.setText("Bicicleta");

        JTFDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDueñoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCBBicicleasBorrarBicicletas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFDueño))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTFTipo)
                                        .addComponent(JTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBLimpiarBorrarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBBorrarBorrarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(JCBBicicleasBorrarBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(JTFNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTFDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBBorrarBorrarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLimpiarBorrarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumSerieActionPerformed

    private void JTFTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTipoActionPerformed

    private void JTFDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDueñoActionPerformed

    private void JBBorrarBorrarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBorrarBorrarBicicletaActionPerformed
        try {
            bd.borrarBicicleta(Integer.parseInt(JTFNumSerie.getText()));
            JBLimpiarBorrarBicicletaActionPerformed(evt);
            actualizarLista();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error eliminando el cliente.");
        }
    }//GEN-LAST:event_JBBorrarBorrarBicicletaActionPerformed

    private void JBLimpiarBorrarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarBorrarBicicletaActionPerformed
        JTFTipo.setText("");
        JTFColor.setText("");
        JTFDueño.setText("");
        JTFNumSerie.setText("");
        actualizarLista();
    }//GEN-LAST:event_JBLimpiarBorrarBicicletaActionPerformed

    private void JCBBicicleasBorrarBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBBicicleasBorrarBicicletasActionPerformed
        if (JCBBicicleasBorrarBicicletas.getSelectedIndex() >= 0) {
            JCBBicicleasBorrarBicicletas.setSelectedIndex(JCBBicicleasBorrarBicicletas.getSelectedIndex());
            JTFTipo.setText(bd.obtenerBicicletas().get(JCBBicicleasBorrarBicicletas.getSelectedIndex()).getTipo());
            JTFColor.setText(bd.obtenerBicicletas().get(JCBBicicleasBorrarBicicletas.getSelectedIndex()).getColor());
            JTFDueño.setText(String.valueOf(bd.obtenerBicicletas().get(JCBBicicleasBorrarBicicletas.getSelectedIndex()).getDueño()));
        }
    }//GEN-LAST:event_JCBBicicleasBorrarBicicletasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBorrarBorrarBicicleta;
    private java.awt.Button JBLimpiarBorrarBicicleta;
    private javax.swing.JComboBox<String> JCBBicicleasBorrarBicicletas;
    private javax.swing.JTextField JTFColor;
    private javax.swing.JTextField JTFDueño;
    private javax.swing.JTextField JTFNumSerie;
    private javax.swing.JTextField JTFTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
