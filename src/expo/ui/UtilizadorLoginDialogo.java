/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.ui;

import expo.model.CentroExposicoes;
import expo.model.RegistoUtilizadores;
import expo.model.Utilizador;
import javax.swing.JOptionPane;

/**
 *
 * @author Afonso S
 */
public class UtilizadorLoginDialogo extends javax.swing.JDialog {

    private CentroExposicoes centor;
    private Utilizador utl;

    public UtilizadorLoginDialogo(CentroExposicoes ce) {
        this.centor = ce;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Utilizador");
        setVisible(true);

    }
        private boolean getUtilizador() {
        boolean IsUtilizador = false;
        for (Utilizador utl : centor.getRegistoUtilizadores().getUtilizadores()) {
            if (utl.getUsername().equals(jTextField1.getText())) {
                this.utl = utl;
                IsUtilizador = true;
                break;
            }
        }
        return IsUtilizador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Registar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new RegistoUtilizadorUI(centor);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RegistoUtilizadorUI registoUI = new RegistoUtilizadorUI(centor);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira username.", "Login", JOptionPane.WARNING_MESSAGE);
            jTextField1.requestFocus();
        } else if (jPasswordField1.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Insira password.", "Login", JOptionPane.WARNING_MESSAGE);
            jPasswordField1.requestFocus();
        } else if (!getUtilizador()) {
            JOptionPane.showMessageDialog(this, "Utilizador não existe.", "Login", JOptionPane.WARNING_MESSAGE);
        } else if (!utl.getPassword().equals(new String(jPasswordField1.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Password incorreta.", "Login", JOptionPane.WARNING_MESSAGE);
        } else {
            dispose();
        }
//        boolean b = true;
//        u = ru.getUtilizadorByID(jTextField1.getText());
//        if (u != null) {
//            String pwd = null;
//            String pwd2 = u.getPassword();
//            System.out.println(pwd2);
//            if (u.getNumeroTabela() == -1) {
//                System.out.println("yes");
//                pwd = jPasswordField1.getText();
//
//                System.out.println(pwd);
//            } else {
//                CodificacaoAritmetica cA = new CodificacaoAritmetica(jPasswordField1.getText(), filePath);
//                cA.codifica();
//                String encripted = "";
//                int id = -1;
//                if (cA.isEncripted()) {
//                    pwd = cA.getValue();
//                }
//            }
//            if (pwd2 != null) {
//                if (pwd.length() == pwd2.length()) {
//                    for (int i = 0; i < pwd2.length(); i++) {
//                        if (pwd.charAt(i) != pwd2.charAt(i)) {
//                            b = false;
//                            u = null;
//                            break;
//                        }
//                    }
//                } else {
//                    b = false;
//                    u = null;
//                }
//            }
//            if (b) {
//                dispose();
//            } else {
//                JOptionPane.showMessageDialog(this, "Password Incorrecta!");
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(this, "Utilizador Inexistente!");
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        utl = null;
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


//    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
//
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
