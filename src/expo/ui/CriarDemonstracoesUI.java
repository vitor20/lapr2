/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.ui;

import expo.controller.CriarDemonstracoesController;
import expo.model.CentroExposicoes;
import expo.model.Exposicao;
import expo.model.Recurso;
import expo.model.Utilizador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author VITOR
 */
public class CriarDemonstracoesUI extends javax.swing.JFrame {

    private CentroExposicoes centro;
    private Utilizador organizador;
    private CriarDemonstracoesController controller;
    private DefaultListModel modeloListaRecursos;
    private DefaultListModel modeloListaRecursosAdicionados;
    private DefaultComboBoxModel<Exposicao> modeloComboBoxExposicao;
    
    public CriarDemonstracoesUI(CentroExposicoes ce,Utilizador utl) {
        initComponents();
        this.centro=ce;
        this.organizador=utl;
        controller=new CriarDemonstracoesController(centro);
        modeloListaRecursosAdicionados= new DefaultListModel();
        modeloListaRecursos= new DefaultListModel();
        jListListaRecursos.setModel(modeloListaRecursos);
        jListRecursosAdicionados.setModel(modeloListaRecursosAdicionados);
        modeloComboBoxExposicao= new DefaultComboBoxModel();
        jComboBoxExposicoes.setModel(modeloComboBoxExposicao);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCriarDemonstracao = new javax.swing.JLabel();
        jLabelSelecionarExposicao = new javax.swing.JLabel();
        jComboBoxExposicoes = new javax.swing.JComboBox();
        jLabelInsiraCodigo = new javax.swing.JLabel();
        jTextFieldCodigoDemonstracao = new javax.swing.JTextField();
        jLabelInsiraDescricaoDemonstracao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricaoDemonstracao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListListaRecursos = new javax.swing.JList();
        jButtonAdicionarRecurso = new javax.swing.JButton();
        jButtonEliminarRecurso = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListRecursosAdicionados = new javax.swing.JList();
        jLabelRecursosAdicionados = new javax.swing.JLabel();
        jLabelListaRecursos = new javax.swing.JLabel();
        jButtonRegistarDemonstracao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCriarDemonstracao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCriarDemonstracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/criar.png"))); // NOI18N
        jLabelCriarDemonstracao.setText("    Criar Demonstração");
        jLabelCriarDemonstracao.setToolTipText("");

        jLabelSelecionarExposicao.setText("Selecione a Exposição pretendida:");

        jComboBoxExposicoes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelInsiraCodigo.setText("Insira codigo da demonstração:");

        jTextFieldCodigoDemonstracao.setText("jTextField1");

        jLabelInsiraDescricaoDemonstracao.setText("Insira a descrição da demonstração:");

        jTextAreaDescricaoDemonstracao.setColumns(20);
        jTextAreaDescricaoDemonstracao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricaoDemonstracao);

        jListListaRecursos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListListaRecursos);

        jButtonAdicionarRecurso.setText(">");
        jButtonAdicionarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarRecursoActionPerformed(evt);
            }
        });

        jButtonEliminarRecurso.setText("<");

        jListRecursosAdicionados.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListRecursosAdicionados);

        jLabelRecursosAdicionados.setText("Recurso adicionados:");

        jLabelListaRecursos.setText("Lista de recursos");

        jButtonRegistarDemonstracao.setText("Registar Demonstração");
        jButtonRegistarDemonstracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarDemonstracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButtonRegistarDemonstracao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCriarDemonstracao)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxExposicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSelecionarExposicao, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelInsiraCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCodigoDemonstracao, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelInsiraDescricaoDemonstracao, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButtonAdicionarRecurso)
                                                    .addComponent(jButtonEliminarRecurso)))
                                            .addComponent(jLabelListaRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelRecursosAdicionados, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCriarDemonstracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSelecionarExposicao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxExposicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInsiraCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigoDemonstracao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInsiraDescricaoDemonstracao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelListaRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRecursosAdicionados, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButtonAdicionarRecurso)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonEliminarRecurso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButtonRegistarDemonstracao)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarRecursoActionPerformed
        boolean listaRecursos = true;
        if(controller.getListaRecursos().getListaRecursos().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem recursos definidos", "Adicionar demonstração", JOptionPane.INFORMATION_MESSAGE);
        }else{
            for(Recurso rec : controller.getListaRecursos().getListaRecursos()){
                this.modeloListaRecursos.addElement(rec.toString());
            
            }
        }
        jButtonAdicionarRecurso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.addRecursoDemonstracao((Recurso)jListListaRecursos.getSelectedValue());
                modeloListaRecursos.removeElement(jListListaRecursos.getSelectedValue());
                modeloListaRecursosAdicionados.addElement(jListListaRecursos.getSelectedValue());
            }
        });
    }//GEN-LAST:event_jButtonAdicionarRecursoActionPerformed

    private void jButtonRegistarDemonstracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarDemonstracaoActionPerformed
        
        controller.setDados(jTextFieldCodigoDemonstracao.getText(),jTextAreaDescricaoDemonstracao.getText());
    }//GEN-LAST:event_jButtonRegistarDemonstracaoActionPerformed
    
     private boolean escolherEvento() {
        boolean escolheeventos = true;

        if (controller.getListaExposiçoesOrganizador(organizador.getID()).isEmpty()) {
            escolheeventos = false;
            JOptionPane.showMessageDialog(null, "Não existem exposições disponíveis!", "Criar Demonstração", JOptionPane.WARNING_MESSAGE);
            dispose();
        } else {
            for (Exposicao exp : controller.getListaExposiçoesOrganizador(organizador.getID())) {
                modeloComboBoxExposicao.addElement(exp);
                jComboBoxExposicoes.setModel(modeloComboBoxExposicao);
                jComboBoxExposicoes.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        controller.setExposicão((Exposicao) jComboBoxExposicoes.getSelectedItem());
                    }
                });
            }
        }
        return escolheeventos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarRecurso;
    private javax.swing.JButton jButtonEliminarRecurso;
    private javax.swing.JButton jButtonRegistarDemonstracao;
    private javax.swing.JComboBox jComboBoxExposicoes;
    private javax.swing.JLabel jLabelCriarDemonstracao;
    private javax.swing.JLabel jLabelInsiraCodigo;
    private javax.swing.JLabel jLabelInsiraDescricaoDemonstracao;
    private javax.swing.JLabel jLabelListaRecursos;
    private javax.swing.JLabel jLabelRecursosAdicionados;
    private javax.swing.JLabel jLabelSelecionarExposicao;
    private javax.swing.JList jListListaRecursos;
    private javax.swing.JList jListRecursosAdicionados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaDescricaoDemonstracao;
    private javax.swing.JTextField jTextFieldCodigoDemonstracao;
    // End of variables declaration//GEN-END:variables
}