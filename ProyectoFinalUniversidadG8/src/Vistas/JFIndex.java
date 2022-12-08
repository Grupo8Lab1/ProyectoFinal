package Vistas;

import Vistas.Cliente.Cliente_Actualizar;
import Vistas.Cliente.Cliente_Agregar;
import Vistas.Cliente.Cliente_Quitar;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class JFIndex extends javax.swing.JFrame {

    public JFIndex() {
        initComponents();
        //    setIconImage(new ImageIcon(getClass().getResource("/Vistas.Iconos/bicicleteriaicono.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPCliente = new javax.swing.JPanel();
        BMostrarTodosCliente = new java.awt.Button();
        BBuscarPorIDCliente = new java.awt.Button();
        BActualizarCliente = new java.awt.Button();
        BQuitarCliente = new java.awt.Button();
        BAgregarCliente = new java.awt.Button();
        jPanelCliente = new javax.swing.JPanel();
        JPBicicleta = new javax.swing.JPanel();
        BMostrarTodosBicicleta = new java.awt.Button();
        BAgregarBicicleta = new java.awt.Button();
        BBuscarPorIDBicicleta = new java.awt.Button();
        BActualizarBicicleta = new java.awt.Button();
        BQuitarBicicleta = new java.awt.Button();
        jPanelBicicleta = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        JPRepuesto = new javax.swing.JPanel();
        BMostrarTodosRepuesto = new java.awt.Button();
        BAgregarRepuesto = new java.awt.Button();
        BBuscarPorIDRepuesto = new java.awt.Button();
        BActualizarRepuesto = new java.awt.Button();
        BQuitarRepuesto = new java.awt.Button();
        jPanelRepuesto = new javax.swing.JPanel();
        JPServicio = new javax.swing.JPanel();
        BMostrarTodosServicio = new java.awt.Button();
        BAgregarServicio = new java.awt.Button();
        BBuscarPorIDServicio = new java.awt.Button();
        BQuitarServicio = new java.awt.Button();
        jPanelServicio = new javax.swing.JPanel();
        JPReparacion = new javax.swing.JPanel();
        BMostrarTodosReparacion = new java.awt.Button();
        BAgregarReparacion = new java.awt.Button();
        BBuscarPorClienteReparacion = new java.awt.Button();
        BActualizarReparacion = new java.awt.Button();
        BQuitarReparacion = new java.awt.Button();
        BBuscarPorBicicletaReparacion = new java.awt.Button();
        BBuscarPorIDReparacion = new java.awt.Button();
        BBuscarPorFechaReparacion = new java.awt.Button();
        jPanelReparacion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(java.awt.Color.gray);

        BMostrarTodosCliente.setBackground(java.awt.Color.gray);
        BMostrarTodosCliente.setLabel("Mostrar Todos");

        BBuscarPorIDCliente.setBackground(java.awt.Color.gray);
        BBuscarPorIDCliente.setLabel("Buscar (ID)");

        BActualizarCliente.setBackground(java.awt.Color.gray);
        BActualizarCliente.setLabel("Actualizar");
        BActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarClienteActionPerformed(evt);
            }
        });

        BQuitarCliente.setBackground(java.awt.Color.gray);
        BQuitarCliente.setLabel("Quitar");
        BQuitarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQuitarClienteActionPerformed(evt);
            }
        });

        BAgregarCliente.setBackground(java.awt.Color.gray);
        BAgregarCliente.setLabel("Agregar");
        BAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarClienteActionPerformed(evt);
            }
        });

        jPanelCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCliente.setPreferredSize(new java.awt.Dimension(398, 600));

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPClienteLayout = new javax.swing.GroupLayout(JPCliente);
        JPCliente.setLayout(JPClienteLayout);
        JPClienteLayout.setHorizontalGroup(
            JPClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMostrarTodosCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAgregarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarPorIDCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BQuitarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPClienteLayout.setVerticalGroup(
            JPClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPClienteLayout.createSequentialGroup()
                        .addComponent(BAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQuitarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMostrarTodosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 265, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cliente", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/usuario.png")), JPCliente); // NOI18N

        BMostrarTodosBicicleta.setBackground(java.awt.Color.gray);
        BMostrarTodosBicicleta.setLabel("Mostrar Todos");

        BAgregarBicicleta.setBackground(java.awt.Color.gray);
        BAgregarBicicleta.setLabel("Agregar");

        BBuscarPorIDBicicleta.setBackground(java.awt.Color.gray);
        BBuscarPorIDBicicleta.setLabel("Buscar (ID)");

        BActualizarBicicleta.setBackground(java.awt.Color.gray);
        BActualizarBicicleta.setLabel("Actualizar");

        BQuitarBicicleta.setBackground(java.awt.Color.gray);
        BQuitarBicicleta.setLabel("Quitar");

        jPanelBicicleta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBicicleta.setPreferredSize(new java.awt.Dimension(398, 600));

        javax.swing.GroupLayout jPanelBicicletaLayout = new javax.swing.GroupLayout(jPanelBicicleta);
        jPanelBicicleta.setLayout(jPanelBicicletaLayout);
        jPanelBicicletaLayout.setHorizontalGroup(
            jPanelBicicletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jPanelBicicletaLayout.setVerticalGroup(
            jPanelBicicletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPBicicletaLayout = new javax.swing.GroupLayout(JPBicicleta);
        JPBicicleta.setLayout(JPBicicletaLayout);
        JPBicicletaLayout.setHorizontalGroup(
            JPBicicletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBicicletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPBicicletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPBicicletaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BMostrarTodosBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(540, 540, 540))
                    .addGroup(JPBicicletaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPBicicletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BQuitarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAgregarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BActualizarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBuscarPorIDBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPBicicletaLayout.setVerticalGroup(
            JPBicicletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBicicletaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPBicicletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPBicicletaLayout.createSequentialGroup()
                        .addComponent(BAgregarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQuitarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizarBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorIDBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMostrarTodosBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 265, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bicicleta", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/bicicleta.png")), JPBicicleta); // NOI18N

        jTabbedPane2.setBackground(java.awt.Color.gray);
        jTabbedPane2.setToolTipText("");

        BMostrarTodosRepuesto.setBackground(java.awt.Color.gray);
        BMostrarTodosRepuesto.setLabel("Mostrar Todos");

        BAgregarRepuesto.setBackground(java.awt.Color.gray);
        BAgregarRepuesto.setLabel("Agregar");

        BBuscarPorIDRepuesto.setBackground(java.awt.Color.gray);
        BBuscarPorIDRepuesto.setLabel("Buscar (ID)");

        BActualizarRepuesto.setBackground(java.awt.Color.gray);
        BActualizarRepuesto.setLabel("Actualizar (Precio)");

        BQuitarRepuesto.setBackground(java.awt.Color.gray);
        BQuitarRepuesto.setLabel("Quitar");

        jPanelRepuesto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelRepuestoLayout = new javax.swing.GroupLayout(jPanelRepuesto);
        jPanelRepuesto.setLayout(jPanelRepuestoLayout);
        jPanelRepuestoLayout.setHorizontalGroup(
            jPanelRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jPanelRepuestoLayout.setVerticalGroup(
            jPanelRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPRepuestoLayout = new javax.swing.GroupLayout(JPRepuesto);
        JPRepuesto.setLayout(JPRepuestoLayout);
        JPRepuestoLayout.setHorizontalGroup(
            JPRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRepuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BMostrarTodosRepuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAgregarRepuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarPorIDRepuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BQuitarRepuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BActualizarRepuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(616, 616, 616))
        );
        JPRepuestoLayout.setVerticalGroup(
            JPRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRepuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRepuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPRepuestoLayout.createSequentialGroup()
                        .addComponent(BAgregarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQuitarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizarRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorIDRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMostrarTodosRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Repuesto", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/engranaje.png")), JPRepuesto); // NOI18N

        BMostrarTodosServicio.setBackground(java.awt.Color.gray);
        BMostrarTodosServicio.setLabel("Mostrar Todos");

        BAgregarServicio.setBackground(java.awt.Color.gray);
        BAgregarServicio.setLabel("Agregar");

        BBuscarPorIDServicio.setBackground(java.awt.Color.gray);
        BBuscarPorIDServicio.setLabel("Buscar (ID)");

        BQuitarServicio.setBackground(java.awt.Color.gray);
        BQuitarServicio.setLabel("Quitar");

        jPanelServicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelServicioLayout = new javax.swing.GroupLayout(jPanelServicio);
        jPanelServicio.setLayout(jPanelServicioLayout);
        jPanelServicioLayout.setHorizontalGroup(
            jPanelServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jPanelServicioLayout.setVerticalGroup(
            jPanelServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPServicioLayout = new javax.swing.GroupLayout(JPServicio);
        JPServicio.setLayout(JPServicioLayout);
        JPServicioLayout.setHorizontalGroup(
            JPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BMostrarTodosServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAgregarServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarPorIDServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BQuitarServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1146, 1146, 1146))
        );
        JPServicioLayout.setVerticalGroup(
            JPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPServicioLayout.createSequentialGroup()
                        .addComponent(BAgregarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQuitarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorIDServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMostrarTodosServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Servicio", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/ingeniero.png")), JPServicio); // NOI18N

        BMostrarTodosReparacion.setBackground(java.awt.Color.gray);
        BMostrarTodosReparacion.setLabel("Mostrar Todos");

        BAgregarReparacion.setBackground(java.awt.Color.gray);
        BAgregarReparacion.setLabel("Agregar");

        BBuscarPorClienteReparacion.setBackground(java.awt.Color.gray);
        BBuscarPorClienteReparacion.setLabel("Buscar (Cliente)");

        BActualizarReparacion.setBackground(java.awt.Color.gray);
        BActualizarReparacion.setLabel("Actualizar ");

        BQuitarReparacion.setBackground(java.awt.Color.gray);
        BQuitarReparacion.setLabel("Quitar");

        BBuscarPorBicicletaReparacion.setBackground(java.awt.Color.gray);
        BBuscarPorBicicletaReparacion.setLabel("Buscar (Bicicleta)");

        BBuscarPorIDReparacion.setBackground(java.awt.Color.gray);
        BBuscarPorIDReparacion.setLabel("Buscar (ID)");

        BBuscarPorFechaReparacion.setBackground(java.awt.Color.gray);
        BBuscarPorFechaReparacion.setLabel("Buscar (Fecha)");

        jPanelReparacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelReparacionLayout = new javax.swing.GroupLayout(jPanelReparacion);
        jPanelReparacion.setLayout(jPanelReparacionLayout);
        jPanelReparacionLayout.setHorizontalGroup(
            jPanelReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jPanelReparacionLayout.setVerticalGroup(
            jPanelReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPReparacionLayout = new javax.swing.GroupLayout(JPReparacion);
        JPReparacion.setLayout(JPReparacionLayout);
        JPReparacionLayout.setHorizontalGroup(
            JPReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPReparacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BBuscarPorIDReparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BMostrarTodosReparacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BAgregarReparacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BQuitarReparacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BActualizarReparacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBuscarPorClienteReparacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBuscarPorBicicletaReparacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarPorFechaReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPReparacionLayout.setVerticalGroup(
            JPReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPReparacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelReparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPReparacionLayout.createSequentialGroup()
                        .addComponent(BAgregarReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQuitarReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizarReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorIDReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorClienteReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorBicicletaReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorFechaReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMostrarTodosReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Reparación", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/personafuerta.png")), JPReparacion); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarClienteActionPerformed
        Cliente_Agregar p = new Cliente_Agregar();
        presentarVistasCliente(p);
    }//GEN-LAST:event_BAgregarClienteActionPerformed

    private void BActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarClienteActionPerformed
        Cliente_Actualizar p = new Cliente_Actualizar();
        presentarVistasCliente(p);
    }//GEN-LAST:event_BActualizarClienteActionPerformed

    private void BQuitarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQuitarClienteActionPerformed
        Cliente_Quitar p = new Cliente_Quitar();
        presentarVistasCliente(p);
    }//GEN-LAST:event_BQuitarClienteActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFIndex().setVisible(true);
            }
        });
    }

    private void presentarVistasCliente(javax.swing.JPanel p) {
        p.setSize(398, 600);
        p.setLocation(0, 0);
        jPanelCliente.removeAll();
        jPanelCliente.add(p, BorderLayout.CENTER);
        jPanelCliente.revalidate();
        jPanelCliente.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BActualizarBicicleta;
    private java.awt.Button BActualizarCliente;
    private java.awt.Button BActualizarReparacion;
    private java.awt.Button BActualizarRepuesto;
    private java.awt.Button BAgregarBicicleta;
    private java.awt.Button BAgregarCliente;
    private java.awt.Button BAgregarReparacion;
    private java.awt.Button BAgregarRepuesto;
    private java.awt.Button BAgregarServicio;
    private java.awt.Button BBuscarPorBicicletaReparacion;
    private java.awt.Button BBuscarPorClienteReparacion;
    private java.awt.Button BBuscarPorFechaReparacion;
    private java.awt.Button BBuscarPorIDBicicleta;
    private java.awt.Button BBuscarPorIDCliente;
    private java.awt.Button BBuscarPorIDReparacion;
    private java.awt.Button BBuscarPorIDRepuesto;
    private java.awt.Button BBuscarPorIDServicio;
    private java.awt.Button BMostrarTodosBicicleta;
    private java.awt.Button BMostrarTodosCliente;
    private java.awt.Button BMostrarTodosReparacion;
    private java.awt.Button BMostrarTodosRepuesto;
    private java.awt.Button BMostrarTodosServicio;
    private java.awt.Button BQuitarBicicleta;
    private java.awt.Button BQuitarCliente;
    private java.awt.Button BQuitarReparacion;
    private java.awt.Button BQuitarRepuesto;
    private java.awt.Button BQuitarServicio;
    private javax.swing.JPanel JPBicicleta;
    private javax.swing.JPanel JPCliente;
    private javax.swing.JPanel JPReparacion;
    private javax.swing.JPanel JPRepuesto;
    private javax.swing.JPanel JPServicio;
    private javax.swing.JPanel jPanelBicicleta;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelReparacion;
    private javax.swing.JPanel jPanelRepuesto;
    private javax.swing.JPanel jPanelServicio;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables

}
