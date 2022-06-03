package vistas;

import controlador.PacienteC;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PacienteView extends javax.swing.JFrame {

    public static String sexo = "M";
    public int tipo = 1; //1: todos, 2:nombre, 3:apellido, 4:dni
    public String dato = ""; // contenido del filtro
    PacienteC controlador;
    DefaultTableModel modeloTabla;

    public PacienteView() throws Exception {
        initComponents();
        controlador = new PacienteC();
        btnGrupoSex.add(jrdnMasculino);
        btnGrupoSex.add(jrdnFemenino);
        btnGrupoFiltro.add(jrdnApe);
        btnGrupoFiltro.add(jrdnDni);
        btnGrupoFiltro.add(jrdnNom);
        jchkTodos.setSelected(true);
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoSex = new javax.swing.ButtonGroup();
        btnGrupoFiltro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrdnMasculino = new javax.swing.JRadioButton();
        jrdnFemenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();
        jtxtDni = new javax.swing.JTextField();
        jcboDistrito = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtxtdir = new javax.swing.JTextField();
        jdcNac = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtUbigeo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jlblCodigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblPaciente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbtnGuardar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jbtnReporte = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jrdnNom = new javax.swing.JRadioButton();
        jrdnApe = new javax.swing.JRadioButton();
        jrdnDni = new javax.swing.JRadioButton();
        jtxtFiltro = new javax.swing.JTextField();
        jchkTodos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DNI");

        jrdnMasculino.setBackground(new java.awt.Color(204, 255, 204));
        jrdnMasculino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrdnMasculino.setSelected(true);
        jrdnMasculino.setText("Masculino");
        jrdnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnMasculinoActionPerformed(evt);
            }
        });

        jrdnFemenino.setBackground(new java.awt.Color(204, 255, 204));
        jrdnFemenino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrdnFemenino.setText("Femenino");
        jrdnFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnFemeninoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Mantenimiento de Pacientes");

        jtxtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtNombre.setMaximumSize(new java.awt.Dimension(10, 250));

        jtxtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtApellido.setMaximumSize(new java.awt.Dimension(10, 250));

        jtxtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtDni.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtDni.setMaximumSize(new java.awt.Dimension(10, 250));
        jtxtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDniKeyTyped(evt);
            }
        });

        jcboDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Distrito");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Departamento");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Provincia");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Dirección");

        jtxtdir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtdir.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Nacimiento");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Ubigeo");

        jtxtUbigeo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtUbigeo.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Código:");

        jlblCodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        jlblCodigo.setMaximumSize(new java.awt.Dimension(100, 30));
        jlblCodigo.setMinimumSize(new java.awt.Dimension(100, 30));
        jlblCodigo.setPreferredSize(new java.awt.Dimension(100, 30));
        jlblCodigo.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrdnMasculino)
                                .addGap(41, 41, 41)
                                .addComponent(jrdnFemenino))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jdcNac, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox3, 0, 214, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtxtUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtdir, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)))
                            .addComponent(jcboDistrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel5)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jlblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jcboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtxtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtxtUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrdnMasculino)
                            .addComponent(jrdnFemenino))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtblPaciente.setModel(new javax.swing.table.DefaultTableModel(
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
        jtblPaciente.setMaximumSize(new java.awt.Dimension(300, 64));
        jtblPaciente.setMinimumSize(new java.awt.Dimension(300, 64));
        jtblPaciente.setRowMargin(5);
        jtblPaciente.setRowSelectionAllowed(false);
        jtblPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblPaciente);

        jbtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/guardar.png"))); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.setEnabled(false);
        jbtnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnGuardar.setMaximumSize(new java.awt.Dimension(160, 50));
        jbtnGuardar.setMinimumSize(new java.awt.Dimension(160, 50));
        jbtnGuardar.setPreferredSize(new java.awt.Dimension(160, 50));
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seleccione.png"))); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.setEnabled(false);
        jbtnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnModificar.setMaximumSize(new java.awt.Dimension(160, 50));
        jbtnModificar.setMinimumSize(new java.awt.Dimension(160, 50));
        jbtnModificar.setPreferredSize(new java.awt.Dimension(160, 50));
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/borrar.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setEnabled(false);
        jbtnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnEliminar.setMaximumSize(new java.awt.Dimension(160, 50));
        jbtnEliminar.setMinimumSize(new java.awt.Dimension(160, 50));
        jbtnEliminar.setPreferredSize(new java.awt.Dimension(160, 50));
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnNuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nuevo.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnNuevo.setMaximumSize(new java.awt.Dimension(160, 50));
        jbtnNuevo.setMinimumSize(new java.awt.Dimension(160, 50));
        jbtnNuevo.setPreferredSize(new java.awt.Dimension(160, 50));
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnReporte.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/impresora.png"))); // NOI18N
        jbtnReporte.setText("Reporte");
        jbtnReporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnReporte.setMaximumSize(new java.awt.Dimension(160, 50));
        jbtnReporte.setMinimumSize(new java.awt.Dimension(160, 50));
        jbtnReporte.setPreferredSize(new java.awt.Dimension(160, 50));
        jbtnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReporteActionPerformed(evt);
            }
        });

        jbtnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancelar.png"))); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnCancelar.setMaximumSize(new java.awt.Dimension(160, 50));
        jbtnCancelar.setMinimumSize(new java.awt.Dimension(160, 50));
        jbtnCancelar.setPreferredSize(new java.awt.Dimension(160, 50));
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jrdnNom.setBackground(new java.awt.Color(255, 204, 204));
        jrdnNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdnNom.setText("Nombre");
        jrdnNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnNomActionPerformed(evt);
            }
        });

        jrdnApe.setBackground(new java.awt.Color(255, 204, 204));
        jrdnApe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdnApe.setText("Apellido");
        jrdnApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnApeActionPerformed(evt);
            }
        });

        jrdnDni.setBackground(new java.awt.Color(255, 204, 204));
        jrdnDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdnDni.setText("DNI");
        jrdnDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnDniActionPerformed(evt);
            }
        });

        jtxtFiltro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtFiltro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtFiltroCaretUpdate(evt);
            }
        });

        jchkTodos.setBackground(new java.awt.Color(255, 204, 204));
        jchkTodos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jchkTodos.setText("Todos");
        jchkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jrdnNom)
                .addGap(56, 56, 56)
                .addComponent(jrdnApe)
                .addGap(48, 48, 48)
                .addComponent(jrdnDni)
                .addGap(18, 18, 18)
                .addComponent(jtxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jchkTodos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchkTodos)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrdnNom)
                            .addComponent(jrdnApe)
                            .addComponent(jrdnDni))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        try {
            PacienteC.limpiar();
            jbtnGuardar.setEnabled(true);
            jbtnCancelar.setEnabled(true);
            jbtnNuevo.setEnabled(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar el registro?", "Eliminación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                controlador.eliminar();
                cargarTabla();
                jbtnEliminar.setEnabled(false);
                jbtnModificar.setEnabled(false);
                jbtnNuevo.setEnabled(true);
            }
        } catch (Exception e) {
            System.out.println("Error en PacienteView/jbtnEliminarActionPerformed: " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        try {
            controlador.registrar();
            JOptionPane.showMessageDialog(rootPane, "Registro exitoso", "Registro de Paciente", JOptionPane.INFORMATION_MESSAGE);
            cargarTabla();
            jbtnGuardar.setEnabled(false);
            jbtnNuevo.setEnabled(true);
        } catch (Exception e) {
            System.out.println("Error en PacienteView/jbtnGuardarActionPerformed: " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jrdnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdnMasculinoActionPerformed
        if (jrdnMasculino.isSelected() == true)
            sexo = "M";
    }//GEN-LAST:event_jrdnMasculinoActionPerformed

    private void jrdnFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdnFemeninoActionPerformed
        if (jrdnFemenino.isSelected() == true)
            sexo = "F";
    }//GEN-LAST:event_jrdnFemeninoActionPerformed

    private void jbtnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnReporteActionPerformed

    private void jrdnNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdnNomActionPerformed
        tipo = 2;
        jtxtFiltro.requestFocus();
        jtxtFiltro.setText("");
        jchkTodos.setSelected(false);
    }//GEN-LAST:event_jrdnNomActionPerformed

    private void jrdnApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdnApeActionPerformed
        tipo = 3;
        jtxtFiltro.requestFocus();
        jtxtFiltro.setText("");
        jchkTodos.setSelected(false);
    }//GEN-LAST:event_jrdnApeActionPerformed

    private void jrdnDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdnDniActionPerformed
        tipo = 4;
        jtxtFiltro.requestFocus();
        jtxtFiltro.setText("");
        jchkTodos.setSelected(false);
    }//GEN-LAST:event_jrdnDniActionPerformed

    private void jtxtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDniKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9')
            evt.consume();
    }//GEN-LAST:event_jtxtDniKeyTyped

    private void jtblPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPacienteMouseClicked
        try {
            int fila = jtblPaciente.getSelectedRow();   // verificar si tengo datos en mi tabla
            if (fila >= 0) {
                jbtnModificar.setEnabled(true);
                jbtnEliminar.setEnabled(true);
                jbtnGuardar.setEnabled(false);
                jbtnNuevo.setEnabled(true);
                jlblCodigo.setText(jtblPaciente.getValueAt(fila, 0).toString());
                jtxtNombre.setText(jtblPaciente.getValueAt(fila, 1).toString());
                jtxtApellido.setText(jtblPaciente.getValueAt(fila, 2).toString());
                if (jtblPaciente.getValueAt(fila, 3).toString().equals("M")) {
                    jrdnMasculino.setSelected(true);
                    jrdnFemenino.setSelected(false);
                } else {
                    jrdnMasculino.setSelected(false);
                    jrdnFemenino.setSelected(true);
                }
                jtxtDni.setText(jtblPaciente.getValueAt(fila, 4).toString());
                jdcNac.setDate(Date.valueOf(jtblPaciente.getValueAt(fila, 5).toString()));
                jtxtdir.setText(jtblPaciente.getValueAt(fila, 6).toString());
                jtxtUbigeo.setText(jtblPaciente.getValueAt(fila, 7).toString());
            }

        } catch (Exception e) {
            System.out.println("Error en PacienteView/jtblPacienteMouseClicked: " + e.getMessage());
        }
    }//GEN-LAST:event_jtblPacienteMouseClicked

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas modificar el registro?", "Modificación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                controlador.modificar();
                cargarTabla();
                JOptionPane.showMessageDialog(rootPane, "Actualización exitosa", "Modificación del Paciente", JOptionPane.INFORMATION_MESSAGE);
                jbtnModificar.setEnabled(false);
                jbtnEliminar.setEnabled(false);
                jbtnGuardar.setEnabled(false);
                jbtnNuevo.setEnabled(true);
            }

        } catch (Exception e) {
            System.out.println("Error en PacienteView/jbtnModificar: " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        try {
            jbtnCancelar.setEnabled(false);
            jbtnNuevo.setEnabled(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jtxtFiltroCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtFiltroCaretUpdate
        try {
            dato = jtxtFiltro.getText();
            cargarTabla();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jtxtFiltroCaretUpdate

    private void jchkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkTodosActionPerformed
        try {
            btnGrupoFiltro.clearSelection();
            tipo = 1;
            dato = "";
            jtxtFiltro.setText("");
            cargarTabla();
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jchkTodosActionPerformed

    private void cargarTabla() throws Exception {
        String columna[] = new String[]{"Código", "Nombre", "Apellido", "Sexo", "DNI", "Nacimiento", "Dirreción", "Ubigeo"};
        modeloTabla = new DefaultTableModel(null, columna);
        controlador.listar(modeloTabla, tipo, dato);
        jtblPaciente.setModel(modeloTabla);
    }

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
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PacienteView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(PacienteView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupoFiltro;
    private javax.swing.ButtonGroup btnGrupoSex;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnReporte;
    private javax.swing.JComboBox<String> jcboDistrito;
    private javax.swing.JCheckBox jchkTodos;
    public static com.toedter.calendar.JDateChooser jdcNac;
    public static javax.swing.JLabel jlblCodigo;
    private javax.swing.JRadioButton jrdnApe;
    private javax.swing.JRadioButton jrdnDni;
    public static javax.swing.JRadioButton jrdnFemenino;
    public static javax.swing.JRadioButton jrdnMasculino;
    private javax.swing.JRadioButton jrdnNom;
    private javax.swing.JTable jtblPaciente;
    public static javax.swing.JTextField jtxtApellido;
    public static javax.swing.JTextField jtxtDni;
    private javax.swing.JTextField jtxtFiltro;
    public static javax.swing.JTextField jtxtNombre;
    public static javax.swing.JTextField jtxtUbigeo;
    public static javax.swing.JTextField jtxtdir;
    // End of variables declaration//GEN-END:variables
}
