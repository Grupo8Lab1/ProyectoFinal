package Vistas;

public class JFIndex extends javax.swing.JFrame {

    public JFIndex() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPCliente = new javax.swing.JPanel();
        BMostrarTodos0 = new java.awt.Button();
        BBuscarPorID0 = new java.awt.Button();
        BActualizar0 = new java.awt.Button();
        BQuitar0 = new java.awt.Button();
        BAgregar0 = new java.awt.Button();
        jPanelCliente = new javax.swing.JPanel();
        JPBicicleta = new javax.swing.JPanel();
        BMostrarTodos1 = new java.awt.Button();
        BAgregar1 = new java.awt.Button();
        BBuscarPorID1 = new java.awt.Button();
        BActualizar1 = new java.awt.Button();
        BQuitar1 = new java.awt.Button();
        jPanelBicicleta = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        JPRepuesto = new javax.swing.JPanel();
        BMostrarTodos2 = new java.awt.Button();
        BAgregar2 = new java.awt.Button();
        BBuscarPorID2 = new java.awt.Button();
        BActualizar2 = new java.awt.Button();
        BQuitar2 = new java.awt.Button();
        jPanelRepuesto = new javax.swing.JPanel();
        JPServicio = new javax.swing.JPanel();
        BMostrarTodos3 = new java.awt.Button();
        BAgregar3 = new java.awt.Button();
        BBuscarPorID3 = new java.awt.Button();
        BQuitar3 = new java.awt.Button();
        jPanelServicio = new javax.swing.JPanel();
        JPReparacion = new javax.swing.JPanel();
        BMostrarTodos4 = new java.awt.Button();
        BAgregar4 = new java.awt.Button();
        BBuscarPorCliente4 = new java.awt.Button();
        BActualizar4 = new java.awt.Button();
        BQuitar4 = new java.awt.Button();
        BBuscarPorBicicleta4 = new java.awt.Button();
        BBuscarPorID4 = new java.awt.Button();
        BBuscarPorFecha4 = new java.awt.Button();
        jPanelReparacion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(java.awt.Color.gray);

        BMostrarTodos0.setBackground(java.awt.Color.gray);
        BMostrarTodos0.setLabel("Mostrar Todos");

        BBuscarPorID0.setBackground(java.awt.Color.gray);
        BBuscarPorID0.setLabel("Buscar (ID)");

        BActualizar0.setBackground(java.awt.Color.gray);
        BActualizar0.setLabel("Actualizar");

        BQuitar0.setBackground(java.awt.Color.gray);
        BQuitar0.setLabel("Quitar");

        BAgregar0.setBackground(java.awt.Color.gray);
        BAgregar0.setLabel("Agregar");

        jPanelCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                    .addComponent(BActualizar0, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMostrarTodos0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAgregar0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarPorID0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BQuitar0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPClienteLayout.setVerticalGroup(
            JPClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPClienteLayout.createSequentialGroup()
                        .addComponent(BAgregar0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQuitar0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizar0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorID0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMostrarTodos0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 265, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cliente", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/usuario.png")), JPCliente); // NOI18N

        BMostrarTodos1.setBackground(java.awt.Color.gray);
        BMostrarTodos1.setLabel("Mostrar Todos");

        BAgregar1.setBackground(java.awt.Color.gray);
        BAgregar1.setLabel("Agregar");

        BBuscarPorID1.setBackground(java.awt.Color.gray);
        BBuscarPorID1.setLabel("Buscar (ID)");

        BActualizar1.setBackground(java.awt.Color.gray);
        BActualizar1.setLabel("Actualizar");

        BQuitar1.setBackground(java.awt.Color.gray);
        BQuitar1.setLabel("Quitar");

        jPanelBicicleta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                        .addComponent(BMostrarTodos1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(540, 540, 540))
                    .addGroup(JPBicicletaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPBicicletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BQuitar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBuscarPorID1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JPBicicletaLayout.setVerticalGroup(
            JPBicicletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBicicletaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPBicicletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPBicicletaLayout.createSequentialGroup()
                        .addComponent(BAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQuitar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorID1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMostrarTodos1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 265, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bicicleta", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/bicicleta.png")), JPBicicleta); // NOI18N

        jTabbedPane2.setBackground(java.awt.Color.gray);
        jTabbedPane2.setToolTipText("");

        BMostrarTodos2.setBackground(java.awt.Color.gray);
        BMostrarTodos2.setLabel("Mostrar Todos");

        BAgregar2.setBackground(java.awt.Color.gray);
        BAgregar2.setLabel("Agregar");

        BBuscarPorID2.setBackground(java.awt.Color.gray);
        BBuscarPorID2.setLabel("Buscar (ID)");

        BActualizar2.setBackground(java.awt.Color.gray);
        BActualizar2.setLabel("Actualizar (Precio)");

        BQuitar2.setBackground(java.awt.Color.gray);
        BQuitar2.setLabel("Quitar");

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
                    .addComponent(BMostrarTodos2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAgregar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarPorID2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BQuitar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BActualizar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(616, 616, 616))
        );
        JPRepuestoLayout.setVerticalGroup(
            JPRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRepuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPRepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRepuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPRepuestoLayout.createSequentialGroup()
                        .addComponent(BAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQuitar2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorID2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMostrarTodos2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Repuesto", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/engranaje.png")), JPRepuesto); // NOI18N

        BMostrarTodos3.setBackground(java.awt.Color.gray);
        BMostrarTodos3.setLabel("Mostrar Todos");

        BAgregar3.setBackground(java.awt.Color.gray);
        BAgregar3.setLabel("Agregar");

        BBuscarPorID3.setBackground(java.awt.Color.gray);
        BBuscarPorID3.setLabel("Buscar (ID)");

        BQuitar3.setBackground(java.awt.Color.gray);
        BQuitar3.setLabel("Quitar");

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
                    .addComponent(BMostrarTodos3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAgregar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarPorID3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BQuitar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1146, 1146, 1146))
        );
        JPServicioLayout.setVerticalGroup(
            JPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPServicioLayout.createSequentialGroup()
                        .addComponent(BAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQuitar3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorID3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMostrarTodos3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Servicio", new javax.swing.ImageIcon(getClass().getResource("/Vistas/Iconos/ingeniero.png")), JPServicio); // NOI18N

        BMostrarTodos4.setBackground(java.awt.Color.gray);
        BMostrarTodos4.setLabel("Mostrar Todos");

        BAgregar4.setBackground(java.awt.Color.gray);
        BAgregar4.setLabel("Agregar");

        BBuscarPorCliente4.setBackground(java.awt.Color.gray);
        BBuscarPorCliente4.setLabel("Buscar (Cliente)");

        BActualizar4.setBackground(java.awt.Color.gray);
        BActualizar4.setLabel("Actualizar ");

        BQuitar4.setBackground(java.awt.Color.gray);
        BQuitar4.setLabel("Quitar");

        BBuscarPorBicicleta4.setBackground(java.awt.Color.gray);
        BBuscarPorBicicleta4.setLabel("Buscar (Bicicleta)");

        BBuscarPorID4.setBackground(java.awt.Color.gray);
        BBuscarPorID4.setLabel("Buscar (ID)");

        BBuscarPorFecha4.setBackground(java.awt.Color.gray);
        BBuscarPorFecha4.setLabel("Buscar (Fecha)");

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
                    .addComponent(BBuscarPorID4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BMostrarTodos4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BAgregar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BQuitar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BActualizar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBuscarPorCliente4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBuscarPorBicicleta4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarPorFecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPReparacionLayout.setVerticalGroup(
            JPReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPReparacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelReparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPReparacionLayout.createSequentialGroup()
                        .addComponent(BAgregar4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BQuitar4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizar4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorID4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorCliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorBicicleta4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscarPorFecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMostrarTodos4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BActualizar0;
    private java.awt.Button BActualizar1;
    private java.awt.Button BActualizar2;
    private java.awt.Button BActualizar4;
    private java.awt.Button BAgregar0;
    private java.awt.Button BAgregar1;
    private java.awt.Button BAgregar2;
    private java.awt.Button BAgregar3;
    private java.awt.Button BAgregar4;
    private java.awt.Button BBuscarPorBicicleta4;
    private java.awt.Button BBuscarPorCliente4;
    private java.awt.Button BBuscarPorFecha4;
    private java.awt.Button BBuscarPorID0;
    private java.awt.Button BBuscarPorID1;
    private java.awt.Button BBuscarPorID2;
    private java.awt.Button BBuscarPorID3;
    private java.awt.Button BBuscarPorID4;
    private java.awt.Button BMostrarTodos0;
    private java.awt.Button BMostrarTodos1;
    private java.awt.Button BMostrarTodos2;
    private java.awt.Button BMostrarTodos3;
    private java.awt.Button BMostrarTodos4;
    private java.awt.Button BQuitar0;
    private java.awt.Button BQuitar1;
    private java.awt.Button BQuitar2;
    private java.awt.Button BQuitar3;
    private java.awt.Button BQuitar4;
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
