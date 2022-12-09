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
        JTFTipo.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        JBBorrarBorrarBicicleta = new java.awt.Button();
        JCBBicicleasBorrarBicicletas = new javax.swing.JComboBox<>();
        JTFNumSerie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTFColor = new javax.swing.JTextField();
        JTFTipo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JTFDueño = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(398, 600));
        setMinimumSize(new java.awt.Dimension(398, 600));
        setPreferredSize(new java.awt.Dimension(398, 600));

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

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel8.setText("Bicicleta");

        JTFTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTipoActionPerformed(evt);
            }
        });

        jLabel7.setText("N° Serie:");

        jLabel9.setText("Dueño :");

        jLabel10.setText("Tipo: ");

        jLabel11.setText("Color:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBBorrarBorrarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel8)
                        .addComponent(JCBBicicleasBorrarBicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JTFDueño))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTFDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(JBBorrarBorrarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNumSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNumSerieActionPerformed

    private void JTFTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTipoActionPerformed

    private void JBBorrarBorrarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBorrarBorrarBicicletaActionPerformed
        try {
            bd.borrarBicicleta(Integer.parseInt(JTFNumSerie.getText()));
            actualizarLista();
            JTFColor.setText("");
            JTFDueño.setText("");
            JTFNumSerie.setText("");
            JTFTipo.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error eliminando bicicleta.");
        }
    }//GEN-LAST:event_JBBorrarBorrarBicicletaActionPerformed

    private void JCBBicicleasBorrarBicicletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBBicicleasBorrarBicicletasActionPerformed
        if (JCBBicicleasBorrarBicicletas.getSelectedIndex() >= 0) {
            Bicicleta aux = bd.obtenerBicicletas().get(JCBBicicleasBorrarBicicletas.getSelectedIndex());
            JCBBicicleasBorrarBicicletas.setSelectedIndex(JCBBicicleasBorrarBicicletas.getSelectedIndex());
            JTFTipo.setText(aux.getTipo());
            JTFColor.setText(aux.getColor());
            JTFNumSerie.setText(String.valueOf(aux.getNumSerie()));
            JTFDueño.setText(aux.getDueño().getNombre() + " " + aux.getDueño().getApellido());
        }
    }//GEN-LAST:event_JCBBicicleasBorrarBicicletasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBorrarBorrarBicicleta;
    private javax.swing.JComboBox<String> JCBBicicleasBorrarBicicletas;
    private javax.swing.JTextField JTFColor;
    private javax.swing.JTextField JTFDueño;
    private javax.swing.JTextField JTFNumSerie;
    private javax.swing.JTextField JTFTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
