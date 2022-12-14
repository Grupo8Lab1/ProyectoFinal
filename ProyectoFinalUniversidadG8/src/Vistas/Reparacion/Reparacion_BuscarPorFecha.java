/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.Reparacion;

import Entidades.Reparacion;
import static TestUMLs.ProyectoFinalUniversidadG8.repad;
import Vistas.Cliente.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Santi
 */
public class Reparacion_BuscarPorFecha extends javax.swing.JPanel {

    /**
     * Creates new form Cliente_BuscarClientePorID
     */
    private final DefaultTableModel modelo;

    public Reparacion_BuscarPorFecha() {
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
        columnas.add("ID");
        columnas.add("Servicio");
        columnas.add("Cliente");
        columnas.add("Fecha");
        columnas.add("Costo");
        columnas.add("Estado");
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        JTReparacionesPorFecha.setModel(modelo);
    }

    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }
    }

    private void cargarReparaciones(LocalDate f1, LocalDate f2) {
        borrarFilasTabla();
        for (Reparacion aux : repad.obtenerReparacionesPorFecha(f1, f2)) {
            String estado;
            if (aux.isEstado()) {
                estado = "Finalizado";
            } else {
                estado = "Pendiente";
            }
            modelo.addRow(new Object[]{aux.getIdReparacion(), aux.getServicio().getDescripcion(), (aux.getBicicleta().getDue??o().getNombre() + " " + aux.getBicicleta().getDue??o().getApellido()), aux.getFechaEntrada(), aux.getCostoFinal(), estado});
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

        JBBuscarBuscarRepPorFecha = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTReparacionesPorFecha = new javax.swing.JTable();
        JBLimpiarBuscarRepPorFecha = new java.awt.Button();
        JDCBuscarRepPorFecha2 = new com.toedter.calendar.JDateChooser();
        JDCBuscarRepPorFecha1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(398, 600));
        setMinimumSize(new java.awt.Dimension(398, 600));
        setPreferredSize(new java.awt.Dimension(398, 600));

        JBBuscarBuscarRepPorFecha.setActionCommand("Buscar");
        JBBuscarBuscarRepPorFecha.setLabel("Buscar");
        JBBuscarBuscarRepPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarBuscarRepPorFechaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Reparacion");

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel9.setText("(Fecha)");

        JTReparacionesPorFecha.setModel(new javax.swing.table.DefaultTableModel(
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
        JTReparacionesPorFecha.setPreferredSize(new java.awt.Dimension(398, 600));
        jScrollPane1.setViewportView(JTReparacionesPorFecha);

        JBLimpiarBuscarRepPorFecha.setActionCommand("Limpiar");
        JBLimpiarBuscarRepPorFecha.setLabel("Limpiar");
        JBLimpiarBuscarRepPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarBuscarRepPorFechaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel10.setText("Y");

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel11.setText("Entre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addComponent(JBLimpiarBuscarRepPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JDCBuscarRepPorFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBBuscarBuscarRepPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JDCBuscarRepPorFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(JBBuscarBuscarRepPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCBuscarRepPorFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDCBuscarRepPorFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(JBLimpiarBuscarRepPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JBBuscarBuscarRepPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarBuscarRepPorFechaActionPerformed
        if (JDCBuscarRepPorFecha1.getDate() == null || JDCBuscarRepPorFecha2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese 2 fechas para buscar por favor");
        } else if (!JDCBuscarRepPorFecha1.getDate().before(JDCBuscarRepPorFecha2.getDate())) {
            JOptionPane.showMessageDialog(null, "Las fechas deben ser distintas, siendo la primera anterior a la segunda");
        } else {
            try {
                cargarReparaciones(JDCBuscarRepPorFecha1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), JDCBuscarRepPorFecha2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } catch (NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Error en busqueda de Fechas.");
            }
        }
    }//GEN-LAST:event_JBBuscarBuscarRepPorFechaActionPerformed

    private void JBLimpiarBuscarRepPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarBuscarRepPorFechaActionPerformed
        borrarFilasTabla();
        JDCBuscarRepPorFecha1.setDate(null);
        JDCBuscarRepPorFecha2.setDate(null);
    }//GEN-LAST:event_JBLimpiarBuscarRepPorFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JBBuscarBuscarRepPorFecha;
    private java.awt.Button JBLimpiarBuscarRepPorFecha;
    private com.toedter.calendar.JDateChooser JDCBuscarRepPorFecha1;
    private com.toedter.calendar.JDateChooser JDCBuscarRepPorFecha2;
    private javax.swing.JTable JTReparacionesPorFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
