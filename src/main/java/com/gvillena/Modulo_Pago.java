/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

/**
 *
 * @author CHRISTIAN
 */
public class Modulo_Pago extends javax.swing.JFrame {

    /**
     * Creates new form Modulo_Pago
     */
    public Modulo_Pago() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txt_modulopago = new javax.swing.JLabel();
        txt_tarjeta = new javax.swing.JLabel();
        rb_Visa = new javax.swing.JRadioButton();
        rb_Mastercard = new javax.swing.JRadioButton();
        rb_AmericanExprees = new javax.swing.JRadioButton();
        txt_nombre = new javax.swing.JLabel();
        tf_NombreTitular = new javax.swing.JTextField();
        txt_numero = new javax.swing.JLabel();
        tf_NumeroTarjeta = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JLabel();
        tf_CodigoSeguridad = new javax.swing.JTextField();
        txt_caducidad = new javax.swing.JLabel();
        sp_mes = new javax.swing.JSpinner();
        sp_año = new javax.swing.JSpinner();
        btn_confirmar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        img_visa = new javax.swing.JLabel();
        img_mastercard = new javax.swing.JLabel();
        img_american = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_modulopago.setBackground(new java.awt.Color(51, 51, 255));
        txt_modulopago.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_modulopago.setText("Modulo de Pago");

        txt_tarjeta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_tarjeta.setText("Tarjeta:");

        rb_Visa.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        rb_Visa.setText("VISA");
        rb_Visa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_VisaActionPerformed(evt);
            }
        });

        rb_Mastercard.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        rb_Mastercard.setText("MASTER CARD");
        rb_Mastercard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_MastercardActionPerformed(evt);
            }
        });

        rb_AmericanExprees.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        rb_AmericanExprees.setText("AMERICAN EXPRESS");
        rb_AmericanExprees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_AmericanExpreesActionPerformed(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_nombre.setText("Nombre del Titular:");

        txt_numero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_numero.setText("Numero de Tarjeta:");

        tf_NumeroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NumeroTarjetaActionPerformed(evt);
            }
        });

        txt_codigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_codigo.setText("CVV(Codigo de Seguridad):");

        tf_CodigoSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CodigoSeguridadActionPerformed(evt);
            }
        });

        txt_caducidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_caducidad.setText("Fecha de caducidad de Tarjeta:");
        txt_caducidad.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_caducidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_confirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_confirmar.setText("CONFIRMAR PEDIDO");
        btn_confirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });

        btn_atras.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_atras.setText("Atras");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        img_visa.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHRISTIAN\\Desktop\\220px-Old_Visa_Logo.svg.png")); // NOI18N

        img_mastercard.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHRISTIAN\\Desktop\\mastercard.jpg")); // NOI18N
        img_mastercard.setText("jLabel1");

        img_american.setIcon(new javax.swing.ImageIcon("C:\\Users\\CHRISTIAN\\Desktop\\180px-American_Express_logo.svg.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(txt_modulopago, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tarjeta)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_caducidad)
                                            .addGap(27, 27, 27)
                                            .addComponent(sp_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rb_Visa)
                                                .addComponent(img_visa))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(rb_Mastercard)
                                                    .addGap(18, 18, 18))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(img_mastercard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(31, 31, 31)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rb_AmericanExprees)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(31, 31, 31)
                                                    .addComponent(img_american)))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sp_año, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_codigo)
                                        .addComponent(txt_numero)
                                        .addComponent(txt_nombre))
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_CodigoSeguridad, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(tf_NumeroTarjeta)
                                        .addComponent(tf_NombreTitular)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(109, 109, 109)
                                    .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(361, 361, 361))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txt_modulopago)
                .addGap(33, 33, 33)
                .addComponent(txt_tarjeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Visa)
                    .addComponent(rb_Mastercard)
                    .addComponent(rb_AmericanExprees))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img_american, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(img_mastercard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_visa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre)
                    .addComponent(tf_NombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_numero)
                    .addComponent(tf_NumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo)
                    .addComponent(tf_CodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_caducidad, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(sp_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(376, 376, 376))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        MainForm al = new MainForm();
        al.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void rb_VisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_VisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_VisaActionPerformed

    private void rb_MastercardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_MastercardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_MastercardActionPerformed

    private void tf_NumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NumeroTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NumeroTarjetaActionPerformed

    private void tf_CodigoSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CodigoSeguridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CodigoSeguridadActionPerformed

    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed
        // TODO add your handling code here:
        Recibo pago= new Recibo();
        pago.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_confirmarActionPerformed

    private void rb_AmericanExpreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_AmericanExpreesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_AmericanExpreesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Modulo_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modulo_Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel img_american;
    private javax.swing.JLabel img_mastercard;
    private javax.swing.JLabel img_visa;
    private javax.swing.JRadioButton rb_AmericanExprees;
    private javax.swing.JRadioButton rb_Mastercard;
    private javax.swing.JRadioButton rb_Visa;
    private javax.swing.JSpinner sp_año;
    private javax.swing.JSpinner sp_mes;
    private javax.swing.JTextField tf_CodigoSeguridad;
    private javax.swing.JTextField tf_NombreTitular;
    private javax.swing.JTextField tf_NumeroTarjeta;
    private javax.swing.JLabel txt_caducidad;
    private javax.swing.JLabel txt_codigo;
    private javax.swing.JLabel txt_modulopago;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_numero;
    private javax.swing.JLabel txt_tarjeta;
    // End of variables declaration//GEN-END:variables
}
