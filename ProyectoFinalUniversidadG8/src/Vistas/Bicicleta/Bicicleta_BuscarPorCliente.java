/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Bicicleta;

import Entidades.Bicicleta;
import static TestUMLs.ProyectoFinalUniversidadG8.bd;
import static TestUMLs.ProyectoFinalUniversidadG8.cd;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Santi
 */
public class Bicicleta_BuscarPorCliente extends javax.swing.JPanel {

    /**
     * Creates new form Cliente_BuscarClientePorID
     */
    private final DefaultTableModel modelo;

    public Bicicleta_BuscarPorCliente() {
        initComponents();
        this.modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        armarCabeceraTabla();
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("Numero De Serie");
        columnas.add("Tipo");
        columnas.add("Color");
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        JTBicicletasPorDueño.setModel(modelo);
    }

    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }
    }

    private void cargarBicicletas(int dni) {
        borrarFilasTabla();
        for (Bicicleta aux : bd.obtenerBicicletaPorDueño(dni)) {
            modelo.addRow(new Object[]{aux.getTipo(), aux.getColor(), aux.getNumSerie()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFDNI = new javax.swing.JTextField();
        JBBuscarBuscarBicicletaDNI = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTBicicletasPorDueño = new javax.swing.JTable();
        JBLimpiarBuscarBicicletaDNI = new java.awt.Button();

        setMaximumSize(new java.awt.Dimension(398, 600));
        setMinimumSize(new java.awt.Dimension(398, 600));
        setPreferredSize(new java.awt.Dimension(398, 600));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Bicicleta Por Dueño");

        jLabel3.setText("DNI Dueño:");

        JTFDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDNIActionPerformed(evt);
            }
        });

        JBBuscarBuscarBicicletaDNI.setActionCommand("Buscar");
        JBBuscarBuscarBicicletaDNI.setLabel("Buscar");
        JBBuscarBuscarBicicletaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarBuscarBicicletaDNIActionPerformed(evt);
            }
        });

        JTBicicletasPorDueño.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTBicicletasPorDueño.setPreferredSize(new java.awt.Dimension(398, 600));
        jScrollPane1.setViewportView(JTBicicletasPorDueño);

        JBLimpiarBuscarBicicletaDNI.setActionCommand("Limpiar");
        JBLimpiarBuscarBicicletaDNI.setLabel("Limpiar");
        JBLimpiarBuscarBicicletaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarBuscarBicicletaDNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 75, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBBuscarBuscarBicicletaDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBLimpiarBuscarBicicletaDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(JBBuscarBuscarBicicletaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(JBLimpiarBuscarBicicletaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JBBuscarBuscarBicicletaDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarBuscarBicicletaDNIActionPerformed
        if (JTFDNI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un N° DNI por favor");
        } else {
            try {
                cargarBicicletas(Integer.valueOf(JTFDNI.getText()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error, DNI invalido.");
            }
        }
    }//GEN-LAST:event_JBBuscarBuscarBicicletaDNIActionPerformed


    private void JTFDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDNIActionPerformed

    private void JBLimpiarBuscarBicicletaDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarBuscarBicicletaDNIActionPerformed
        borrarFilasTabla();
        JTFDNI.setText("");
    }//GEN-LAST:event_JBLimpiarBuscarBicicletaDNIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBuscarBuscarBicicletaDNI;
    private java.awt.Button JBLimpiarBuscarBicicletaDNI;
    private javax.swing.JTable JTBicicletasPorDueño;
    private javax.swing.JTextField JTFDNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
