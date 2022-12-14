/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Cliente;

import Entidades.Cliente;
import static TestUMLs.ProyectoFinalUniversidadG8.cd;
import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class Cliente_Quitar extends javax.swing.JPanel {

    /**
     * Creates new form Cliente_Quitar
     */
    public Cliente_Quitar() {
        initComponents();
        actualizarLista();
        JTFNombre.setEnabled(false);
        JTFApellido.setEnabled(false);
        JTFDomicilio.setEnabled(false);
        JTFDNI.setEnabled(false);
        JTFTelefono.setEnabled(false);
    }

    private void actualizarLista() {
        JCBClientesBorrarCliente.removeAllItems();
        for (Cliente lista : cd.obtenerClientes()) {
            JCBClientesBorrarCliente.addItem(lista.getNombre() + " " + lista.getApellido());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        JTFDNI = new javax.swing.JTextField();
        JTFNombre = new javax.swing.JTextField();
        JTFDomicilio = new javax.swing.JTextField();
        JTFApellido = new javax.swing.JTextField();
        JTFTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JBBorrarBorrarCliente = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JCBClientesBorrarCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(398, 600));
        setMinimumSize(new java.awt.Dimension(398, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(398, 600));

        jLabel7.setText("Telefono :");

        JTFDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDNIActionPerformed(evt);
            }
        });

        JTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNombreActionPerformed(evt);
            }
        });

        JTFDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDomicilioActionPerformed(evt);
            }
        });

        JTFTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefonoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Borrar Cliente");

        JBBorrarBorrarCliente.setActionCommand("Borrar");
        JBBorrarBorrarCliente.setLabel("Borrar");
        JBBorrarBorrarCliente.setName(""); // NOI18N
        JBBorrarBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBorrarBorrarClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI :");

        jLabel4.setText("Nombre :");

        jLabel5.setText("Apellido :");

        jLabel6.setText("Domicilio :");

        JCBClientesBorrarCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBClientesBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBClientesBorrarClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setText("Datos");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel8.setText("Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTFNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(JTFApellido)
                                    .addComponent(JTFDNI)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JCBClientesBorrarCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JBBorrarBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(14, 14, 14)
                                .addComponent(JTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(JCBClientesBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTFDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(JBBorrarBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDNIActionPerformed

    private void JTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNombreActionPerformed

    private void JTFTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTelefonoActionPerformed

    private void JBBorrarBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBorrarBorrarClienteActionPerformed
        try {
            cd.borrarCliente(Integer.parseInt(JTFDNI.getText()));
            JTFNombre.setText("");
            JTFDomicilio.setText("");
            JTFDNI.setText("");
            JTFApellido.setText("");
            JTFTelefono.setText("");
            actualizarLista();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error eliminando el cliente.");
        }

    }//GEN-LAST:event_JBBorrarBorrarClienteActionPerformed

    private void JCBClientesBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBClientesBorrarClienteActionPerformed
        if (JCBClientesBorrarCliente.getSelectedIndex() >= 0) {
            JCBClientesBorrarCliente.setSelectedIndex(JCBClientesBorrarCliente.getSelectedIndex());
            JTFNombre.setText(cd.obtenerClientes().get(JCBClientesBorrarCliente.getSelectedIndex()).getNombre());
            JTFApellido.setText(cd.obtenerClientes().get(JCBClientesBorrarCliente.getSelectedIndex()).getApellido());
            JTFDomicilio.setText(cd.obtenerClientes().get(JCBClientesBorrarCliente.getSelectedIndex()).getDomicilio());
            JTFTelefono.setText(String.valueOf(cd.obtenerClientes().get(JCBClientesBorrarCliente.getSelectedIndex()).getTelefono()));
            JTFDNI.setText(String.valueOf(cd.obtenerClientes().get(JCBClientesBorrarCliente.getSelectedIndex()).getDni()));
        }
    }//GEN-LAST:event_JCBClientesBorrarClienteActionPerformed

    private void JTFDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDomicilioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBorrarBorrarCliente;
    private javax.swing.JComboBox<String> JCBClientesBorrarCliente;
    private javax.swing.JTextField JTFApellido;
    private javax.swing.JTextField JTFDNI;
    private javax.swing.JTextField JTFDomicilio;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JTextField JTFTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
