/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.ui;

import expo.controller.CriarExposicaoController;
import expo.model.CentroExposicoes;
import expo.model.Exposicao;
import expo.model.Utilizador;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuno
 */
public class DadosOrganizadorUI extends javax.swing.JFrame {

    private CentroExposicoes ce;
    private Exposicao expo;
    private Utilizador uti;
    private CriarExposicaoController controller;
    
    /**
     * Creates new form DadosOrganizadorUI
     * @param ce
     * @param expo
     * @param uti
     * @param controller
     */
    public DadosOrganizadorUI(CentroExposicoes ce, Exposicao expo, Utilizador uti, CriarExposicaoController controller){
        this.ce = ce;
        this.expo = expo;
        this.uti = uti;
        this.controller = controller;
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        adicionar_bt = new javax.swing.JButton();
        concluido_bt = new javax.swing.JButton();
        cancelar_bt = new javax.swing.JButton();
        ajuda_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Organizador");

        jLabel1.setText("Username:");

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("OU");

        jLabel3.setText("E-Mail:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addOrganizer.png"))); // NOI18N
        jLabel4.setText("   Adicionar Organizador");

        adicionar_bt.setText("Adicionar");

        concluido_bt.setText("Concluído");
        concluido_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluido_btActionPerformed(evt);
            }
        });

        cancelar_bt.setText("Cancelar");
        cancelar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btActionPerformed(evt);
            }
        });

        ajuda_bt.setBorderPainted(false);
        ajuda_bt.setContentAreaFilled(false);
        ajuda_bt.setFocusPainted(false);
        ajuda_bt.setOpaque(false);
        ajuda_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help.png"))); // NOI18N
        ajuda_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajuda_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email_txt)
                                    .addComponent(username_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adicionar_bt)
                                .addGap(18, 18, 18)
                                .addComponent(concluido_bt)
                                .addGap(18, 18, 18)
                                .addComponent(cancelar_bt))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(ajuda_bt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ajuda_bt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionar_bt)
                    .addComponent(concluido_bt)
                    .addComponent(cancelar_bt))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ajuda_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajuda_btActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Permite adicionar Organizadores de uma dada Exposição.\nObrigatório inserir Username OU E-Mail.", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ajuda_btActionPerformed

    private void cancelar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btActionPerformed
        dispose();
    }//GEN-LAST:event_cancelar_btActionPerformed

    private void concluido_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluido_btActionPerformed
        if(this.username_txt.getText().equals("") || this.email_txt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Existem dados por adicionar!", "Erro", JOptionPane.ERROR_MESSAGE);
            if(!this.username_txt.getText().equals("")){
                this.username_txt.requestFocus();
            }else if(!this.email_txt.getText().equals("")){
                this.email_txt.requestFocus();
            }
        }else if(this.expo.getListaOrganizadores().getListaOrganizadores().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Não foi introduzido nenhum Organizador!", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            dispose();
        }
    }//GEN-LAST:event_concluido_btActionPerformed

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
            java.util.logging.Logger.getLogger(DadosOrganizadorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosOrganizadorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosOrganizadorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosOrganizadorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new DadosOrganizadorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar_bt;
    private javax.swing.JButton ajuda_bt;
    private javax.swing.JButton cancelar_bt;
    private javax.swing.JButton concluido_bt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
