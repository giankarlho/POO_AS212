package view;

import services.CalculadoraS;

public class Calculadora extends javax.swing.JFrame {

    char operador = 0;
    Double nro1,nro2 = 0.0;

    // Esto es el constructor, 1er. método que se ejecuta en una clase
    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtHistoria = new javax.swing.JTextArea();
        jLblResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBtn0 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnMasMenos = new javax.swing.JButton();
        jBtnBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBtnSumar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnProducto = new javax.swing.JButton();
        jBtnDivision = new javax.swing.JButton();
        jBtnRestar = new javax.swing.JButton();
        jBtnIgual = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jBtnPrimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Mia");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jTxtHistoria.setColumns(20);
        jTxtHistoria.setRows(5);
        jScrollPane1.setViewportView(jTxtHistoria);

        jLblResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLblResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 102), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtn0.setForeground(new java.awt.Color(255, 51, 0));
        jBtn0.setText("0");
        jBtn0.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtn0.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtn0.setPreferredSize(new java.awt.Dimension(80, 80));
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtn1.setForeground(new java.awt.Color(255, 51, 0));
        jBtn1.setText("1");
        jBtn1.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtn1.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtn1.setPreferredSize(new java.awt.Dimension(80, 80));
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtn2.setForeground(new java.awt.Color(255, 51, 0));
        jBtn2.setText("2");
        jBtn2.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtn2.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtn2.setPreferredSize(new java.awt.Dimension(80, 80));
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtn3.setForeground(new java.awt.Color(255, 51, 0));
        jBtn3.setText("3");
        jBtn3.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtn3.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtn3.setPreferredSize(new java.awt.Dimension(80, 80));
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtn4.setForeground(new java.awt.Color(255, 51, 0));
        jBtn4.setText("4");
        jBtn4.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtn4.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtn4.setPreferredSize(new java.awt.Dimension(80, 80));
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtn5.setForeground(new java.awt.Color(255, 51, 0));
        jBtn5.setText("5");
        jBtn5.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtn5.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtn5.setPreferredSize(new java.awt.Dimension(80, 80));
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtn6.setForeground(new java.awt.Color(255, 51, 0));
        jBtn6.setText("6");
        jBtn6.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtn6.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtn6.setPreferredSize(new java.awt.Dimension(80, 80));
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtn7.setForeground(new java.awt.Color(255, 51, 0));
        jBtn7.setText("7");
        jBtn7.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtn7.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtn7.setPreferredSize(new java.awt.Dimension(80, 80));
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtn8.setForeground(new java.awt.Color(255, 51, 0));
        jBtn8.setText("8");
        jBtn8.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtn8.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtn8.setPreferredSize(new java.awt.Dimension(80, 80));
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtn9.setForeground(new java.awt.Color(255, 51, 0));
        jBtn9.setText("9");
        jBtn9.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtn9.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtn9.setPreferredSize(new java.awt.Dimension(80, 80));
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnMasMenos.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jBtnMasMenos.setForeground(new java.awt.Color(51, 51, 255));
        jBtnMasMenos.setText("+/-");
        jBtnMasMenos.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtnMasMenos.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtnMasMenos.setPreferredSize(new java.awt.Dimension(80, 80));

        jBtnBorrar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtnBorrar.setForeground(new java.awt.Color(51, 51, 255));
        jBtnBorrar.setText("<-");
        jBtnBorrar.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtnBorrar.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtnBorrar.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMasMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnMasMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jBtnSumar.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jBtnSumar.setText("+");
        jBtnSumar.setMaximumSize(new java.awt.Dimension(60, 60));
        jBtnSumar.setMinimumSize(new java.awt.Dimension(60, 60));
        jBtnSumar.setPreferredSize(new java.awt.Dimension(60, 60));
        jBtnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSumarActionPerformed(evt);
            }
        });

        jBtnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jBtnLimpiar.setText("C");
        jBtnLimpiar.setMaximumSize(new java.awt.Dimension(60, 60));
        jBtnLimpiar.setMinimumSize(new java.awt.Dimension(60, 60));
        jBtnLimpiar.setPreferredSize(new java.awt.Dimension(60, 60));
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jBtnProducto.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jBtnProducto.setText("*");
        jBtnProducto.setMaximumSize(new java.awt.Dimension(60, 60));
        jBtnProducto.setMinimumSize(new java.awt.Dimension(60, 60));
        jBtnProducto.setPreferredSize(new java.awt.Dimension(60, 60));
        jBtnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProductoActionPerformed(evt);
            }
        });

        jBtnDivision.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jBtnDivision.setText("/");
        jBtnDivision.setMaximumSize(new java.awt.Dimension(60, 60));
        jBtnDivision.setMinimumSize(new java.awt.Dimension(60, 60));
        jBtnDivision.setPreferredSize(new java.awt.Dimension(60, 60));
        jBtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivisionActionPerformed(evt);
            }
        });

        jBtnRestar.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jBtnRestar.setText("-");
        jBtnRestar.setMaximumSize(new java.awt.Dimension(60, 60));
        jBtnRestar.setMinimumSize(new java.awt.Dimension(60, 60));
        jBtnRestar.setPreferredSize(new java.awt.Dimension(60, 60));
        jBtnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRestarActionPerformed(evt);
            }
        });

        jBtnIgual.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jBtnIgual.setText("=");
        jBtnIgual.setMaximumSize(new java.awt.Dimension(60, 60));
        jBtnIgual.setMinimumSize(new java.awt.Dimension(60, 60));
        jBtnIgual.setPreferredSize(new java.awt.Dimension(60, 60));
        jBtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jBtnPrimo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnPrimo.setText("Primo");
        jBtnPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPrimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jBtnPrimo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jBtnPrimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRestarActionPerformed
        operador = '-';
        nro1 = Double.parseDouble(jLblResultado.getText());
        jLblResultado.setText("");
    }//GEN-LAST:event_jBtnRestarActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        jLblResultado.setText("");
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        jLblResultado.setText(jLblResultado.getText() + jBtn7.getText());
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        jLblResultado.setText(jLblResultado.getText() + jBtn8.getText());
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        jLblResultado.setText(jLblResultado.getText() + jBtn9.getText());
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        jLblResultado.setText(jLblResultado.getText() + jBtn4.getText());
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        jLblResultado.setText(jLblResultado.getText() + jBtn5.getText());
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        jLblResultado.setText(jLblResultado.getText() + jBtn6.getText());
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        jLblResultado.setText(jLblResultado.getText() + jBtn1.getText());
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        jLblResultado.setText(jLblResultado.getText() + jBtn2.getText());
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        jLblResultado.setText(jLblResultado.getText() + jBtn3.getText());
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        jLblResultado.setText(jLblResultado.getText() + jBtn0.getText());
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSumarActionPerformed
        operador = '+';
        nro1 = Double.parseDouble(jLblResultado.getText());
        jLblResultado.setText("");
    }//GEN-LAST:event_jBtnSumarActionPerformed

    private void jBtnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProductoActionPerformed
        operador = '*';
        nro1 = Double.parseDouble(jLblResultado.getText());
        jLblResultado.setText("");
    }//GEN-LAST:event_jBtnProductoActionPerformed

    private void jBtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivisionActionPerformed
        operador = '/';
        nro1 = Double.parseDouble(jLblResultado.getText());
        jLblResultado.setText("");
    }//GEN-LAST:event_jBtnDivisionActionPerformed

    private void jBtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIgualActionPerformed
        nro2 = Double.parseDouble(jLblResultado.getText());
        CalculadoraS calculadora = new CalculadoraS();
        calculadora.calcular(nro1, operador, nro2);
        jLblResultado.setText(String.valueOf(calculadora.dobResultado));
    }//GEN-LAST:event_jBtnIgualActionPerformed

    private void jBtnPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPrimoActionPerformed
        CalculadoraS calculadora = new CalculadoraS();  
        calculadora.validarPrimo(Integer.parseInt(jLblResultado.getText()));
        jLblResultado.setText(calculadora.strResultado);
    }//GEN-LAST:event_jBtnPrimoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnBorrar;
    private javax.swing.JButton jBtnDivision;
    private javax.swing.JButton jBtnIgual;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnMasMenos;
    private javax.swing.JButton jBtnPrimo;
    private javax.swing.JButton jBtnProducto;
    private javax.swing.JButton jBtnRestar;
    private javax.swing.JButton jBtnSumar;
    private javax.swing.JLabel jLblResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtHistoria;
    // End of variables declaration//GEN-END:variables
}
