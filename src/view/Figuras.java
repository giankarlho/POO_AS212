package view;

import java.awt.BorderLayout;
import java.awt.Component;
import jpanels.jpCirculo;
import jpanels.jpCuadrado;
import jpanels.jpPentagono;
import jpanels.jpTriangulo;

public class Figuras extends javax.swing.JFrame {

    // El constructor, es el 1er. mètodo que se ejecuta en una clase
    // Es public, tiene el mismo nombre de la Clase
    public Figuras() {
        initComponents();
        jbgFiguras.add(jrdCirculo);
        jbgFiguras.add(jrdCuadrado);
        jbgFiguras.add(jrdPentagono);
        jbgFiguras.add(jrdTriangulo);
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgFiguras = new javax.swing.ButtonGroup();
        jpnOpciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbFiguras = new javax.swing.JComboBox<>();
        jrdCirculo = new javax.swing.JRadioButton();
        jrdCuadrado = new javax.swing.JRadioButton();
        jrdTriangulo = new javax.swing.JRadioButton();
        jrdPentagono = new javax.swing.JRadioButton();
        jpnFiguras = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 600));
        setMinimumSize(new java.awt.Dimension(720, 600));
        setPreferredSize(new java.awt.Dimension(720, 600));

        jpnOpciones.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Selecciona:");

        jcbFiguras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcbFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Circulo", "Cuadrado", "Triangulo", "Pentagono" }));

        jrdCirculo.setBackground(new java.awt.Color(204, 255, 204));
        jrdCirculo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jrdCirculo.setText("Circulo");
        jrdCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdCirculoActionPerformed(evt);
            }
        });

        jrdCuadrado.setBackground(new java.awt.Color(204, 255, 204));
        jrdCuadrado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jrdCuadrado.setText("Cuadrado");
        jrdCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdCuadradoActionPerformed(evt);
            }
        });

        jrdTriangulo.setBackground(new java.awt.Color(204, 255, 204));
        jrdTriangulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jrdTriangulo.setText("Triángulo");
        jrdTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdTrianguloActionPerformed(evt);
            }
        });

        jrdPentagono.setBackground(new java.awt.Color(204, 255, 204));
        jrdPentagono.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jrdPentagono.setText("Pentágono");
        jrdPentagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdPentagonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnOpcionesLayout = new javax.swing.GroupLayout(jpnOpciones);
        jpnOpciones.setLayout(jpnOpcionesLayout);
        jpnOpcionesLayout.setHorizontalGroup(
            jpnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrdCirculo)
                .addGap(18, 18, 18)
                .addComponent(jrdCuadrado)
                .addGap(18, 18, 18)
                .addComponent(jrdTriangulo)
                .addGap(18, 18, 18)
                .addComponent(jrdPentagono)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnOpcionesLayout.setVerticalGroup(
            jpnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrdCirculo)
                    .addComponent(jrdCuadrado)
                    .addComponent(jrdTriangulo)
                    .addComponent(jrdPentagono))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnFiguras.setBackground(new java.awt.Color(204, 255, 255));
        jpnFiguras.setMaximumSize(new java.awt.Dimension(700, 500));
        jpnFiguras.setMinimumSize(new java.awt.Dimension(700, 500));
        jpnFiguras.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/area.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("jpnFiguras");

        javax.swing.GroupLayout jpnFigurasLayout = new javax.swing.GroupLayout(jpnFiguras);
        jpnFiguras.setLayout(jpnFigurasLayout);
        jpnFigurasLayout.setHorizontalGroup(
            jpnFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFigurasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnFigurasLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnFigurasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(242, 242, 242))))
        );
        jpnFigurasLayout.setVerticalGroup(
            jpnFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnFigurasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnFiguras, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                    .addComponent(jpnOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrdCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdCirculoActionPerformed
        jpCirculo circulo = new jpCirculo();
        circulo.setSize(700, 500);
        circulo.setLocation(0, 0);
        mostrar(circulo);
//        jpnFiguras.removeAll();
//        jpnFiguras.add(circulo, BorderLayout.CENTER);
//        jpnFiguras.revalidate();
//        jpnFiguras.repaint();
    }//GEN-LAST:event_jrdCirculoActionPerformed

    private void jrdCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdCuadradoActionPerformed
        jpCuadrado cuadrado = new jpCuadrado();
        cuadrado.setSize(700, 500);
        cuadrado.setLocation(0, 0);
        mostrar(cuadrado);
//        jpnFiguras.removeAll();
//        jpnFiguras.add(cuadrado, BorderLayout.CENTER);
//        jpnFiguras.revalidate();
//        jpnFiguras.repaint();
    }//GEN-LAST:event_jrdCuadradoActionPerformed

    private void jrdTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdTrianguloActionPerformed
        jpTriangulo triangulo = new jpTriangulo();
        triangulo.setSize(700, 500);
        triangulo.setLocation(0, 0);
        mostrar(triangulo);
//        jpnFiguras.removeAll();
//        jpnFiguras.add(triangulo, BorderLayout.CENTER);
//        jpnFiguras.revalidate();
//        jpnFiguras.repaint();
    }//GEN-LAST:event_jrdTrianguloActionPerformed

    private void jrdPentagonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdPentagonoActionPerformed
        jpPentagono pentagono = new jpPentagono();
        pentagono.setSize(700, 500);
        pentagono.setLocation(0, 0);
        mostrar(pentagono);
//        jpnFiguras.removeAll();
//        jpnFiguras.add(pentagono, BorderLayout.CENTER);
//        jpnFiguras.revalidate();
//        jpnFiguras.repaint();
    }//GEN-LAST:event_jrdPentagonoActionPerformed

    public void mostrar(Object object) {
        jpnFiguras.removeAll();
        jpnFiguras.add((Component) object, BorderLayout.CENTER);
        jpnFiguras.revalidate();
        jpnFiguras.repaint();
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
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Figuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.ButtonGroup jbgFiguras;
    private javax.swing.JComboBox<String> jcbFiguras;
    private javax.swing.JPanel jpnFiguras;
    private javax.swing.JPanel jpnOpciones;
    private javax.swing.JRadioButton jrdCirculo;
    private javax.swing.JRadioButton jrdCuadrado;
    private javax.swing.JRadioButton jrdPentagono;
    private javax.swing.JRadioButton jrdTriangulo;
    // End of variables declaration//GEN-END:variables
}
