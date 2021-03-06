/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.visao;

import br.edu.ifsul.assistencia.model.Funcionario;
import br.edu.ifsul.assistencia.model.dao.Conexao;
import br.edu.ifsul.assistencia.model.dao.DAOFuncionario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ramon, Jessica
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {

    DAOFuncionario dao = new DAOFuncionario();
    Funcionario f = new Funcionario();
    Conexao conexao = new Conexao();

    public TelaCadastroFuncionario() {
        initComponents();
        carregaTabela();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jRadioButtonTecnico = new javax.swing.JRadioButton();
        jRadioButtonAtendente = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonLocalizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Telefone", "CPF", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionario);

        jPanel1.add(jScrollPane1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionário"));

        jLabelNome.setText("Nome:");

        jLabelCPF.setText("CPF:");

        jLabelTelefone.setText("Telefone:");

        jTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfActionPerformed(evt);
            }
        });

        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });

        jLabelCodigo.setText("Codigo:");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.setFocusable(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonTecnico);
        jRadioButtonTecnico.setText("Técnico");
        jRadioButtonTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTecnicoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonAtendente);
        jRadioButtonAtendente.setText("Atendente");
        jRadioButtonAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAtendenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelCPF)
                    .addComponent(jLabelTelefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButtonTecnico, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButtonAtendente, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldCpf, jTextFieldNome, jTextFieldTelefone});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCPF)
                    .addComponent(jRadioButtonTecnico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jRadioButtonAtendente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonSalvar);

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDeletar);

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonAtualizar);

        jButtonLimpar.setText("Limpar Campos");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonLimpar);

        jButtonLocalizar.setText("Localizar");
        jButtonLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocalizarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonLocalizar);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldCpfActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        boolean valido = true;

        if (jTextFieldNome.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O nome deve ser informado!!");
            jTextFieldNome.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldCpf.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O CPF deve ser informado!!");
            jTextFieldCpf.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldTelefone.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O Telefone deve ser informado!!");
            jTextFieldTelefone.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldCodigo.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Código não informado!!  Uma linha deve ser selecionada");
            valido = false;
            return;
        }

        if (valido == true) {
            f.setCpf(jTextFieldCpf.getText());
            f.setNome(jTextFieldNome.getText());
            f.setTelefone(jTextFieldTelefone.getText());

            if (jRadioButtonAtendente.isSelected()) {

                f.setTipo("Atendente");
            }
            if (jRadioButtonTecnico.isSelected()) {

                f.setTipo("Técnico");
            }
            f.setFuncionario_cod(Integer.parseInt(jTextFieldCodigo.getText()));
            boolean resultado = dao.alterar(f);
            if (resultado) {
                JOptionPane.showMessageDialog(rootPane, "Funcionário alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um problema! Tente novamente");

            }
            carregaTabela();
        }
        //falta pegar o código ou a linha selecionada da tabela!!!
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jRadioButtonAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAtendenteActionPerformed

    }//GEN-LAST:event_jRadioButtonAtendenteActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        boolean valido = true;

        if (jTextFieldNome.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O nome deve ser informado!!");
            jTextFieldNome.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldCpf.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O CPF deve ser informado!!");
            jTextFieldCpf.requestFocus();
            valido = false;
            return;
        }
        if (jTextFieldTelefone.getText().length() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "O Telefone deve ser informado!!");
            jTextFieldTelefone.requestFocus();
            valido = false;
            return;
        }

        if (valido == true) {
            f.setCpf(jTextFieldCpf.getText());
            f.setNome(jTextFieldNome.getText());
            f.setTelefone(jTextFieldTelefone.getText());

            if (jRadioButtonAtendente.isSelected()) {

                f.setTipo("Atendente");
            }
            if (jRadioButtonTecnico.isSelected()) {

                f.setTipo("Tecnico");
            }

            boolean resultado = dao.inserir(f);
            if (resultado) {
                JOptionPane.showMessageDialog(rootPane, "Funcionário inserido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um problema! Tente novamente");

            }
            carregaTabela();
        }
        /*
        dao.inserir(f);    }//GEN-LAST:event_jButtonSalvarActionPerformed
       */
    }
    private void jButtonLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocalizarActionPerformed
        TelaLocalizarFuncionario tela = new TelaLocalizarFuncionario();
        tela.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonLocalizarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        int row = jTableFuncionario.getSelectedRow();
        if (row != -1) {
            int res = JOptionPane.showConfirmDialog(rootPane, "Deseja remover este registro?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (res == JOptionPane.YES_NO_OPTION) {

                int id = (int) jTableFuncionario.getValueAt(row, 0);
                boolean resultado = dao.remover(id);

                if (resultado) {
                    JOptionPane.showMessageDialog(rootPane, "Funcionário deletado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ocorreu um problema! Tente novamente");

                }
                carregaTabela();
                jTextFieldNome.setText("");
                jTextFieldCpf.setText("");
                jTextFieldTelefone.setText("");
                jTextFieldCodigo.setText("");
                buttonGroup1.clearSelection();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Linha a ser deletada não foi selecionada!!");

        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//        TelaPrincipal tela = new TelaPrincipal();
//        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed

        jTextFieldNome.setText("");
        jTextFieldCpf.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldCodigo.setText("");

        buttonGroup1.clearSelection();

        carregaTabela();


    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked
        int index = jTableFuncionario.getSelectedRow();
        if (index != -1) {
            jTextFieldCodigo.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 0).toString());
            jTextFieldCpf.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 3).toString());
            jTextFieldNome.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 1).toString());
            jTextFieldTelefone.setText(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 2).toString());
            jRadioButtonTecnico.setSelected(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 4).equals("Técnico"));
            jRadioButtonAtendente.setSelected(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 4).equals("Atendente"));
        }
    }//GEN-LAST:event_jTableFuncionarioMouseClicked

    private void jRadioButtonTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTecnicoActionPerformed

    }//GEN-LAST:event_jRadioButtonTecnicoActionPerformed
    private void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) jTableFuncionario.getModel();
        modelo.setNumRows(0);
        DAOFuncionario dao = new DAOFuncionario();

        try {

            for (Funcionario f : dao.listar()) {
                modelo.addRow(new Object[]{
                    f.getFuncionario_cod(),
                    f.getNome(),
                    f.getTelefone(),
                    f.getCpf(),
                    f.getTipo(),});
            }
        } catch (Exception e) {
            System.out.println("ERRO SQL: " + e.getLocalizedMessage());
        }
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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonLocalizar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonAtendente;
    private javax.swing.JRadioButton jRadioButtonTecnico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
