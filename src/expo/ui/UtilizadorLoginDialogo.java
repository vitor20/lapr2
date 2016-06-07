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

    private boolean getUtilizador(String username) {
        for (Utilizador utl : centor.getRegistoUtilizadores().getUtilizadores()) {
            if (utl.getUsername().equals(username) && utl.getRegistado()) {
                this.utl = utl;
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        login_bt = new javax.swing.JButton();
        cancelar_bt = new javax.swing.JButton();
        registar_bt = new javax.swing.JButton();

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        login_bt.setText("Login");
        login_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btActionPerformed(evt);
            }
        });

        cancelar_bt.setText("Cancelar");
        cancelar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btActionPerformed(evt);
            }
        });

        registar_bt.setText("Registar");
        registar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registar_btActionPerformed(evt);
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
                                .addComponent(login_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelar_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username_txt)
                                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(registar_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_bt)
                    .addComponent(cancelar_bt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registar_bt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registar_btActionPerformed
        RegistoUtilizadorUI registoUI = new RegistoUtilizadorUI(centor);
    }//GEN-LAST:event_registar_btActionPerformed

    private void login_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btActionPerformed
        char[] pass = this.password_txt.getPassword();
        String passString = new String(pass);
        
        if (username_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira username.", "Login", JOptionPane.WARNING_MESSAGE);
            username_txt.requestFocus();
        } else if (password_txt.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Insira password.", "Login", JOptionPane.WARNING_MESSAGE);
            password_txt.requestFocus();
        } else if (!(this.centor.utilizadorConfirmado(username_txt.getText()))) {
            JOptionPane.showMessageDialog(this, "Utilizador não existe.\nCaso já se tenha registado, aguarde confirmação.", "Login", JOptionPane.WARNING_MESSAGE);
        } else if (!this.centor.verificaUtilizador(username_txt.getText(), passString)) {
            JOptionPane.showMessageDialog(this, "Dados de Login inválidos.", "Login", JOptionPane.WARNING_MESSAGE);
        } else {
            this.utl = centor.getRegistoUtilizadores().getUtilizadorByID(username_txt.getText());
            JOptionPane.showMessageDialog(rootPane, "Bem-vindo(a) " + username_txt.getText() + ", login efetuado com sucesso!", "Login", JOptionPane.INFORMATION_MESSAGE);
            MenuUI menu = new MenuUI(this.centor, this.utl);
            dispose();
        }
        
    }//GEN-LAST:event_login_btActionPerformed

    private void cancelar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btActionPerformed
        utl = null;
        dispose();
    }//GEN-LAST:event_cancelar_btActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login_bt;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JButton registar_bt;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
