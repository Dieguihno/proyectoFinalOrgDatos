package laCasitademiabuela;

import Entidades.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TomaPedido extends javax.swing.JFrame {

    //crear las tres tablas como defaultTeble
    private DefaultTableModel modelo;
    private DefaultTableModel ordenes;
    private DefaultTableModel productos;
    int contador = 0;
    int contadorCliente = 0;
    Date fecha = new Date();

    //constructor
    public TomaPedido() {
        initComponents();
        modelo = (DefaultTableModel) jTablePedidosCancelados.getModel();
        ordenes = (DefaultTableModel) jTable1.getModel();
        productos = (DefaultTableModel) jTable2.getModel();

    }

    //metodo para la validacion de campos
    public boolean validar() {
        boolean bandera = true;
        if (jTextFieldNombre.getText().isEmpty() || jTextFieldID.getText().isEmpty() || jTextFieldTelefono.getText().isEmpty() || jTextFieldDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ningun campo debe quedar vacio");
            bandera = false;
        }
        return bandera;
    }

    //metodo para limpiar los campos
    public void limpiar() {
        jTextFieldNombre.setText("");
        jTextFieldID.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldDistancia.setText("");
        jTextFieldTiempoEntrega.setText("");

    }

    //metodo para limpiar toda la tabla
    public void limpiarTabla() {
        int a = jTable2.getRowCount();
        for (int i = 0; i < a; i++) {
            productos.removeRow(i);
        }
    }

    //eliminar una fila seleccionada de la tabla
    private void eliminarProducto() {
        int eliminar = jTable2.getSelectedRow();
        productos.removeRow(eliminar);
    }

    public boolean precios() {
        
        //fijar los precios en el jcomboBox

        int cantidad = Integer.parseInt(jTextFieldCantidad.getText());
        if (jComboBox1.getSelectedItem().equals("Bebida natural")) {
            jTable2.setValueAt(jComboBox1.getSelectedItem().toString(), contador, 0);
            jTable2.setValueAt(Integer.parseInt(jTextFieldCantidad.getText()), contador, 1);
            jTable2.setValueAt(1000, contador, 2);
            jTable2.setValueAt(cantidad * 1000, contador, 3);
            contador++;
        }
        if (jComboBox1.getSelectedItem().equals("Bebida gaseosa")) {
            jTable2.setValueAt(jComboBox1.getSelectedItem().toString(), contador, 0);
            jTable2.setValueAt(Integer.parseInt(jTextFieldCantidad.getText()), contador, 1);
            jTable2.setValueAt(1200, contador, 2);
            jTable2.setValueAt(cantidad * 1200, contador, 3);
            contador++;
        }
        if (jComboBox1.getSelectedItem().equals("Bebida caliente")) {
            jTable2.setValueAt(jComboBox1.getSelectedItem().toString(), contador, 0);
            jTable2.setValueAt(Integer.parseInt(jTextFieldCantidad.getText()), contador, 1);
            jTable2.setValueAt(800, contador, 2);
            jTable2.setValueAt(cantidad * 800, contador, 3);
            contador++;
        }
        if (jComboBox1.getSelectedItem().equals("Leche")) {
            jTable2.setValueAt(jComboBox1.getSelectedItem().toString(), contador, 0);
            jTable2.setValueAt(Integer.parseInt(jTextFieldCantidad.getText()), contador, 1);
            jTable2.setValueAt(600, contador, 2);
            jTable2.setValueAt(cantidad * 600, contador, 3);
            contador++;
        }
        if (jComboBox1.getSelectedItem().equals("Desayuno")) {
            jTable2.setValueAt(jComboBox1.getSelectedItem().toString(), contador, 0);
            jTable2.setValueAt(Integer.parseInt(jTextFieldCantidad.getText()), contador, 1);
            jTable2.setValueAt(2500, contador, 2);
            jTable2.setValueAt(cantidad * 2500, contador, 3);
            contador++;
        }
        if (jComboBox1.getSelectedItem().equals("Almuerzo")) {
            jTable2.setValueAt(jComboBox1.getSelectedItem().toString(), contador, 0);
            jTable2.setValueAt(Integer.parseInt(jTextFieldCantidad.getText()), contador, 1);
            jTable2.setValueAt(3500, contador, 2);
            jTable2.setValueAt(cantidad * 3500, contador, 3);
            contador++;
        }
        if (jComboBox1.getSelectedItem().equals("Gallo")) {
            jTable2.setValueAt(jComboBox1.getSelectedItem().toString(), contador, 0);
            jTable2.setValueAt(Integer.parseInt(jTextFieldCantidad.getText()), contador, 1);
            jTable2.setValueAt(1200, contador, 2);
            jTable2.setValueAt(cantidad * 1200, contador, 3);
            contador++;
        }
        if (jComboBox1.getSelectedItem().equals("Gallo")) {
            jTable2.setValueAt(jComboBox1.getSelectedItem().toString(), contador, 0);
            jTable2.setValueAt(Integer.parseInt(jTextFieldCantidad.getText()), contador, 1);
            jTable2.setValueAt(500, contador, 2);
            jTable2.setValueAt(cantidad * 500, contador, 3);
            contador++;
        }
        return false;

    }

    /**
    Acciones
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonRealizarPedido = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonAgregar = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDistancia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTiempoEntrega = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonEliminarProducto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePedidosCancelados = new javax.swing.JTable();
        jButtonAnularPedido = new javax.swing.JButton();
        jButtonPedidoEntregado = new javax.swing.JButton();
        jButtonReanudarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 166, 180));
        setForeground(new java.awt.Color(0, 166, 180));

        jPanel1.setBackground(new java.awt.Color(0, 166, 180));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Nombre cliente");

        jTextFieldNombre.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jTextFieldID.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Cédula");

        jTextFieldTelefono.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Teléfono");

        jTextFieldDireccion.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Dirección");

        jButtonRealizarPedido.setBackground(java.awt.Color.white);
        jButtonRealizarPedido.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButtonRealizarPedido.setForeground(new java.awt.Color(0, 166, 180));
        jButtonRealizarPedido.setText("Realizar Pedido");
        jButtonRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarPedidoActionPerformed(evt);
            }
        });

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Pedido de productos");

        jTextFieldCantidad.setForeground(new java.awt.Color(0, 168, 180));
        jTextFieldCantidad.setText("1");

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Cantidad");

        jComboBox1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 168, 180));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebida natural", "Bebida gaseosa", "Bebida caliente", "Leche", "Desayuno", "Almuerzo", "Gallo", "Guarnicion" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButtonAgregar.setBackground(java.awt.Color.white);
        jButtonAgregar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 166, 180));
        jButtonAgregar.setText("Agregar producto");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 166, 180));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motorizado 1", "Motorizado 2", "Motorizado 3", "motorizado 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Motorizado");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Distancia");

        jTextFieldDistancia.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Tiempo de entrega");

        jTextFieldTiempoEntrega.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Consolas", 3, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("INFORMACIÓN DEL CLIENTE Y ENTREGA DEL PEDIDO");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCantidad)
                            .addComponent(jComboBox1, 0, 158, Short.MAX_VALUE)
                            .addComponent(jTextFieldTiempoEntrega)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAgregar)
                .addGap(18, 18, 18)
                .addComponent(jButtonRealizarPedido)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldTiempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRealizarPedido)
                    .addComponent(jButtonAgregar))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 168, 180));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Orden", "Nombre", "Cedula", "Telefono", "Direccion", "Distancia", "Hora", "Motorizado", "Tiempo Entrega", "Pedido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setBackground(new java.awt.Color(0, 168, 180));
        jTable2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButtonEliminarProducto.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButtonEliminarProducto.setForeground(new java.awt.Color(0, 166, 180));
        jButtonEliminarProducto.setText("Eliminar producto");
        jButtonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarProductoActionPerformed(evt);
            }
        });

        jTablePedidosCancelados.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTablePedidosCancelados.setForeground(new java.awt.Color(0, 166, 180));
        jTablePedidosCancelados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Orden", "Nombre", "Cedula", "Telefono", "Direccion", "Distancia", "Hora", "Motorizado", "Tiempo Entrega", "Pedido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePedidosCancelados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosCanceladosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePedidosCancelados);

        jButtonAnularPedido.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButtonAnularPedido.setForeground(new java.awt.Color(0, 166, 180));
        jButtonAnularPedido.setText("Anular Pedido");
        jButtonAnularPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnularPedidoActionPerformed(evt);
            }
        });

        jButtonPedidoEntregado.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButtonPedidoEntregado.setForeground(new java.awt.Color(0, 166, 180));
        jButtonPedidoEntregado.setText("Pedido Entregado");
        jButtonPedidoEntregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidoEntregadoActionPerformed(evt);
            }
        });

        jButtonReanudarPedido.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButtonReanudarPedido.setForeground(new java.awt.Color(0, 166, 180));
        jButtonReanudarPedido.setText("Reanudar pedido");
        jButtonReanudarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReanudarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonEliminarProducto)
                                .addGap(135, 135, 135))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonReanudarPedido)
                                .addGap(28, 28, 28))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPedidoEntregado)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jButtonAnularPedido)))
                        .addContainerGap(225, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPedidoEntregado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAnularPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonReanudarPedido))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarPedidoActionPerformed

        if (validar()) {

            try {

                Pedido pedido = new Pedido();
                pedido.setNombre(jTextFieldNombre.getText());
                pedido.setCedula(jTextFieldID.getText());
                pedido.setTelefono(jTextFieldTelefono.getText());
                pedido.setDireccion(jTextFieldDireccion.getText());

                jTable1.setValueAt(contadorCliente + 1, contadorCliente, 0);
                jTable1.setValueAt(jTextFieldNombre.getText(), contadorCliente, 1);
                jTable1.setValueAt(jTextFieldID.getText(), contadorCliente, 2);
                jTable1.setValueAt(jTextFieldTelefono.getText(), contadorCliente, 3);
                jTable1.setValueAt(jTextFieldDireccion.getText(), contadorCliente, 4);
                jTable1.setValueAt(jTextFieldDistancia.getText(), contadorCliente, 5);
                jTable1.setValueAt(fecha, contadorCliente, 6);
                jTable1.setValueAt(jComboBox2.getSelectedItem().toString(), contadorCliente, 7);
                jTable1.setValueAt(jTextFieldTiempoEntrega.getText(), contadorCliente, 8);
                jTable1.setValueAt(jTable2.toString(), contadorCliente, 9);
                contadorCliente++;

            } catch (Exception e) {
            } finally {

                limpiar();
                limpiarTabla();

            }

        }


    }//GEN-LAST:event_jButtonRealizarPedidoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed

        try {

            if (jTextFieldCantidad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "digite la cantidad de producto que desea ordenar");
            }
            precios();

        } catch (Exception e) {
        } finally {
            jTextFieldCantidad.setText("1");

        }


    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarProductoActionPerformed
        try {
            eliminarProducto();
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButtonEliminarProductoActionPerformed

    private void jTablePedidosCanceladosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosCanceladosMouseClicked
        
    }//GEN-LAST:event_jTablePedidosCanceladosMouseClicked

    private void jButtonPedidoEntregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidoEntregadoActionPerformed
        
        // eliminar la fila seleccionada
        int entregado = jTable1.getSelectedRow();
        ordenes.removeRow(entregado);
        
        
    }//GEN-LAST:event_jButtonPedidoEntregadoActionPerformed

    private void jButtonAnularPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnularPedidoActionPerformed
        
        //mover la jtable1 a jtableAnulados
        int anular = jTable1.getSelectedRow();

        if (anular != -1) {
            Object[] filaSeleccionada = {
                jTable1.getValueAt(anular, 0), jTable1.getValueAt(anular, 1),
                jTable1.getValueAt(anular, 2), jTable1.getValueAt(anular, 3),
                jTable1.getValueAt(anular, 4), jTable1.getValueAt(anular, 5),
                jTable1.getValueAt(anular, 6), jTable1.getValueAt(anular, 7),
                jTable1.getValueAt(anular, 8), jTable1.getValueAt(anular, 9)
            };
            ordenes.addRow(filaSeleccionada);
        }

       modelo.removeRow(anular);

    }//GEN-LAST:event_jButtonAnularPedidoActionPerformed

    private void jButtonReanudarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReanudarPedidoActionPerformed
        
        //para reanudar el pedido anulado
        int anular = jTablePedidosCancelados.getSelectedRow();
        
         if (anular != -1) {
            Object[] filaSeleccionada = {
                jTablePedidosCancelados.getValueAt(anular, 0), jTablePedidosCancelados.getValueAt(anular, 1),
                jTablePedidosCancelados.getValueAt(anular, 2), jTablePedidosCancelados.getValueAt(anular, 3),
                jTablePedidosCancelados.getValueAt(anular, 4), jTablePedidosCancelados.getValueAt(anular, 5),
                jTablePedidosCancelados.getValueAt(anular, 6), jTablePedidosCancelados.getValueAt(anular, 7),
                jTablePedidosCancelados.getValueAt(anular, 8), jTablePedidosCancelados.getValueAt(anular, 9)
            };
            ordenes.addRow(filaSeleccionada);
        }

       modelo.removeRow(anular);        
        
        
    }//GEN-LAST:event_jButtonReanudarPedidoActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(TomaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TomaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TomaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TomaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TomaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonAnularPedido;
    private javax.swing.JButton jButtonEliminarProducto;
    private javax.swing.JButton jButtonPedidoEntregado;
    private javax.swing.JButton jButtonRealizarPedido;
    private javax.swing.JButton jButtonReanudarPedido;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTablePedidosCancelados;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldDistancia;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldTiempoEntrega;
    // End of variables declaration//GEN-END:variables
}
