package Vistas.Repuesto;

import Entidades.Repuesto;
import static TestUMLs.ProyectoFinalUniversidadG8.repud;
import javax.swing.JOptionPane;

public class Repuesto_Actualizar_Precio extends javax.swing.JPanel {
    
    public Repuesto_Actualizar_Precio() {
        initComponents();
        actualizarLista();
        JTFPrecioActual.setEnabled(false);
    }
    
    private void actualizarLista() {
        JCBRepuestosActualizarPrecio.removeAllItems();
        for (Repuesto lista : repud.obtenerRepuestos()) {
            JCBRepuestosActualizarPrecio.addItem(lista.getDescripcion());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBActualizarActualizarRepuesto = new java.awt.Button();
        JBLimpiarActualizarRepuesto = new java.awt.Button();
        JTFPrecioNuevo = new javax.swing.JTextField();
        JTFPrecioActual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JCBRepuestosActualizarPrecio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(398, 600));
        setMinimumSize(new java.awt.Dimension(398, 600));
        setPreferredSize(new java.awt.Dimension(398, 600));

        JBActualizarActualizarRepuesto.setActionCommand("Actualizar");
        JBActualizarActualizarRepuesto.setLabel("Actualizar");
        JBActualizarActualizarRepuesto.setName(""); // NOI18N
        JBActualizarActualizarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActualizarActualizarRepuestoActionPerformed(evt);
            }
        });

        JBLimpiarActualizarRepuesto.setLabel("Limpiar");
        JBLimpiarActualizarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarActualizarRepuestoActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio actual :");

        jLabel6.setText("Precio Nuevo :");

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Actualizar Precio Repuesto");

        JCBRepuestosActualizarPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBRepuestosActualizarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBRepuestosActualizarPrecioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setText("Repuesto");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel4.setText("Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBLimpiarActualizarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBActualizarActualizarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCBRepuestosActualizarPrecio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFPrecioNuevo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFPrecioActual)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCBRepuestosActualizarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTFPrecioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBActualizarActualizarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLimpiarActualizarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JBActualizarActualizarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActualizarActualizarRepuestoActionPerformed
        try {
            Repuesto aux = repud.obtenerRepuestos().get(JCBRepuestosActualizarPrecio.getSelectedIndex());
            aux.setPrecio(Float.valueOf(JTFPrecioNuevo.getText()));
            repud.actualizaRepuesto(aux, aux.getNumSerie());
            actualizarLista();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error actualizando precio.");
        }
    }//GEN-LAST:event_JBActualizarActualizarRepuestoActionPerformed

    private void JBLimpiarActualizarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarActualizarRepuestoActionPerformed
        JTFPrecioActual.setText("");
        JTFPrecioNuevo.setText("");
    }//GEN-LAST:event_JBLimpiarActualizarRepuestoActionPerformed

    private void JCBRepuestosActualizarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBRepuestosActualizarPrecioActionPerformed
        if (JCBRepuestosActualizarPrecio.getSelectedIndex() >= 0) {
            Repuesto aux = repud.obtenerRepuestos().get(JCBRepuestosActualizarPrecio.getSelectedIndex());
            JCBRepuestosActualizarPrecio.setSelectedIndex(JCBRepuestosActualizarPrecio.getSelectedIndex());
            JTFPrecioActual.setText(String.valueOf(aux.getPrecio()));
        }
    }//GEN-LAST:event_JCBRepuestosActualizarPrecioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBActualizarActualizarRepuesto;
    private java.awt.Button JBLimpiarActualizarRepuesto;
    private javax.swing.JComboBox<String> JCBRepuestosActualizarPrecio;
    private javax.swing.JTextField JTFPrecioActual;
    private javax.swing.JTextField JTFPrecioNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
