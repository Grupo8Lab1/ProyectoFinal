/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Reparacion;

import Entidades.Reparacion;
import static TestUMLs.ProyectoFinalUniversidadG8.repad;
import Vistas.Cliente.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class Reparacion_Quitar extends javax.swing.JPanel {

    /**
     * Creates new form Cliente_Quitar
     */
    public Reparacion_Quitar() {
        initComponents();
        actualizarLista();
        JTFIDBicicleta.setEditable(false);
        JTFServicio.setEditable(false);
        JTFID.setEditable(false);
        JTFDueño.setEditable(false);
        JTFTelefono.setEditable(false);
        JTFCosto.setEditable(false);
        JTFFecha.setEditable(false);
        JTFEstado.setEditable(false);
    }

    private void actualizarLista() {
        JCBReparacionesBorrarReparacion.removeAllItems();
        for (Reparacion lista : repad.obtenerTodasLasReparaciones()) {
            JCBReparacionesBorrarReparacion.addItem(lista.getServicio().getDescripcion() + " a " + lista.getBicicleta().getTipo() + " " + lista.getBicicleta().getColor() + " n°" + lista.getBicicleta().getNumSerie() + " Fecha: " + lista.getFechaEntrada());
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

        jLabel2 = new javax.swing.JLabel();
        JTFServicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTFTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JBBorrarBorrarReparacion = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        JBLimpiarBorrarReparacion = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFIDBicicleta = new javax.swing.JTextField();
        JCBReparacionesBorrarReparacion = new javax.swing.JComboBox<>();
        JTFDueño = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTFCosto = new javax.swing.JTextField();
        JTFFecha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTFEstado = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(398, 600));
        setMinimumSize(new java.awt.Dimension(398, 600));
        setPreferredSize(new java.awt.Dimension(398, 600));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setText("Datos");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel8.setText("Reparaciones");

        JTFTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefonoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Borrar Reparacion");

        JBBorrarBorrarReparacion.setActionCommand("Borrar");
        JBBorrarBorrarReparacion.setLabel("Borrar");
        JBBorrarBorrarReparacion.setName(""); // NOI18N
        JBBorrarBorrarReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBorrarBorrarReparacionActionPerformed(evt);
            }
        });

        jLabel3.setText("ID:");

        JBLimpiarBorrarReparacion.setLabel("Limpiar");
        JBLimpiarBorrarReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarBorrarReparacionActionPerformed(evt);
            }
        });

        jLabel4.setText("ID Bicicleta:");

        jLabel7.setText("Telefono :");

        jLabel5.setText("Servicio:");

        JTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIDActionPerformed(evt);
            }
        });

        jLabel6.setText("Dueño:");

        JTFIDBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIDBicicletaActionPerformed(evt);
            }
        });

        JCBReparacionesBorrarReparacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBReparacionesBorrarReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBReparacionesBorrarReparacionActionPerformed(evt);
            }
        });

        JTFDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDueñoActionPerformed(evt);
            }
        });

        jLabel9.setText("Costo :");

        jLabel10.setText("Fecha:");

        JTFCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCostoActionPerformed(evt);
            }
        });

        JTFFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFechaActionPerformed(evt);
            }
        });

        jLabel11.setText("Estado:");

        JTFEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(7, 7, 7))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFCosto)
                                    .addComponent(JTFTelefono)
                                    .addComponent(JTFFecha)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTFIDBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                        .addComponent(JTFServicio)
                                        .addComponent(JTFDueño))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JBLimpiarBorrarReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBBorrarBorrarReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JCBReparacionesBorrarReparacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(JCBReparacionesBorrarReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFIDBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBBorrarBorrarReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLimpiarBorrarReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTelefonoActionPerformed

    private void JBBorrarBorrarReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBorrarBorrarReparacionActionPerformed
        try {
            repad.borrarReparacion(Integer.parseInt(JTFID.getText()));
            JBLimpiarBorrarReparacionActionPerformed(evt);
            actualizarLista();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error eliminando la reparacion.");
        }
    }//GEN-LAST:event_JBBorrarBorrarReparacionActionPerformed

    private void JBLimpiarBorrarReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarBorrarReparacionActionPerformed
        JTFIDBicicleta.setText("");
        JTFServicio.setText("");
        JTFID.setText("");
        JTFDueño.setText("");
        JTFTelefono.setText("");
        JTFCosto.setText("");
        JTFFecha.setText("");
        JTFEstado.setText("");
        actualizarLista();
    }//GEN-LAST:event_JBLimpiarBorrarReparacionActionPerformed

    private void JTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIDActionPerformed

    private void JTFIDBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIDBicicletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIDBicicletaActionPerformed

    private void JCBReparacionesBorrarReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBReparacionesBorrarReparacionActionPerformed
        if (JCBReparacionesBorrarReparacion.getSelectedIndex() >= 0) {
            JCBReparacionesBorrarReparacion.setSelectedIndex(JCBReparacionesBorrarReparacion.getSelectedIndex());
            JTFID.setText(String.valueOf(repad.obtenerTodasLasReparaciones().get(JCBReparacionesBorrarReparacion.getSelectedIndex()).getIdReparacion()));
            JTFIDBicicleta.setText(String.valueOf(repad.obtenerTodasLasReparaciones().get(JCBReparacionesBorrarReparacion.getSelectedIndex()).getBicicleta().getNumSerie()));
//            JTFServicio.setText(repad.obtenerTodasLasReparaciones().get(JCBReparacionesBorrarReparacion.getSelectedIndex()).getServicio().getDescripcion());
            //      JTFDueño.setText(repad.obtenerTodasLasReparaciones().get(JCBReparacionesBorrarReparacion.getSelectedIndex()).getBicicleta().getDueño().getNombre() + " " + repad.obtenerTodasLasReparaciones().get(JCBReparacionesBorrarReparacion.getSelectedIndex()).getBicicleta().getDueño().getApellido() + " DNI: " + repad.obtenerTodasLasReparaciones().get(JCBReparacionesBorrarReparacion.getSelectedIndex()).getBicicleta().getDueño().getDni());
            //     JTFTelefono.setText(String.valueOf(repad.obtenerTodasLasReparaciones().get(JCBReparacionesBorrarReparacion.getSelectedIndex()).getBicicleta().getDueño().getTelefono()));
            //    JTFFecha.setText(String.valueOf(repad.obtenerTodasLasReparaciones().get(JCBReparacionesBorrarReparacion.getSelectedIndex()).getFechaEntrada()));
            //    JTFCosto.setText(String.valueOf(repad.obtenerTodasLasReparaciones().get(JCBReparacionesBorrarReparacion.getSelectedIndex()).getCostoFinal()));
            if (repad.obtenerTodasLasReparaciones().get(JCBReparacionesBorrarReparacion.getSelectedIndex()).isEstado()) {
                JTFEstado.setText("Finalizada");
            } else {
                JTFEstado.setText("Pendiente");
            }
        }
    }//GEN-LAST:event_JCBReparacionesBorrarReparacionActionPerformed

    private void JTFDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDueñoActionPerformed

    private void JTFCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCostoActionPerformed

    private void JTFFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFechaActionPerformed

    private void JTFEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBorrarBorrarReparacion;
    private java.awt.Button JBLimpiarBorrarReparacion;
    private javax.swing.JComboBox<String> JCBReparacionesBorrarReparacion;
    private javax.swing.JTextField JTFCosto;
    private javax.swing.JTextField JTFDueño;
    private javax.swing.JTextField JTFEstado;
    private javax.swing.JTextField JTFFecha;
    private javax.swing.JTextField JTFID;
    private javax.swing.JTextField JTFIDBicicleta;
    private javax.swing.JTextField JTFServicio;
    private javax.swing.JTextField JTFTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
