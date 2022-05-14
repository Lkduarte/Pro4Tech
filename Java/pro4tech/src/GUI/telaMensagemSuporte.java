package GUI;

import DAO.*;
import modelo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
//import javax.swing.JComboBox;

//import java.util.logging.Level;
//import java.util.logging.Logger;

public class telaMensagemSuporte extends javax.swing.JFrame {

    private final Connection connection;
    
    CadastroDAO daoCadastro = login.getDaoCadastro();
    ProjetoDAO daoProjeto = login.getDaoProjeto();
    UsuarioDAO daoUsuario = login.getDaoUsuario();
    
    Projeto projeto = login.getProjeto();
    Mensagem mensagem = login.getMensagem();
    Usuario usuario= login.getUsuario();

    public telaMensagemSuporte() {
        initComponents();
        
        this.connection = new factory.ConnectionFactory().getConnection();
        
        carregaTabela();
        
        selecionarTipo.setSelectedItem("Selecione um meio de contato");
        codProjeto.setText("0");
        codProjeto.setVisible(false);
        projetoName.setVisible(false);
        empresa.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botaoLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaProjeto = new javax.swing.JTable();
        selecionarTipo = new javax.swing.JComboBox<>();
        campoPesquisa = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();
        campoAssunto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoMensagem = new javax.swing.JTextArea();
        codProjeto = new javax.swing.JTextField();
        botaoEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        projetoName = new javax.swing.JTextField();
        empresa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserir Mensagem:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(255, 153, 51));
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Pesquisar:");

        tabelaProjeto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nome do Projeto", "Nome da Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProjeto.getTableHeader().setReorderingAllowed(false);
        tabelaProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProjetoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaProjeto);
        if (tabelaProjeto.getColumnModel().getColumnCount() > 0) {
            tabelaProjeto.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabelaProjeto.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        selecionarTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selecionarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um meio de contato", "WhatsApp", "Email", "SMS", "Microsoft Teams" }));
        selecionarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarTipoActionPerformed(evt);
            }
        });

        campoPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoPesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)));
        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 153, 51));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        campoAssunto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoAssunto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)));
        campoAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAssuntoActionPerformed(evt);
            }
        });

        campoMensagem.setColumns(20);
        campoMensagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoMensagem.setRows(5);
        jScrollPane2.setViewportView(campoMensagem);

        codProjeto.setEditable(false);
        codProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProjetoActionPerformed(evt);
            }
        });

        botaoEnviar.setBackground(new java.awt.Color(255, 153, 51));
        botaoEnviar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoEnviar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEnviar.setText("Enviar");
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Assunto:");

        projetoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projetoNameActionPerformed(evt);
            }
        });

        empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(codProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(projetoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(campoAssunto))
                        .addComponent(selecionarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selecionarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projetoName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        // TODO add your handling code here:
        campoMensagem.setText("");
        campoAssunto.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void tabelaProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProjetoMouseClicked
       
        int index = tabelaProjeto.getSelectedRow();

        try {
            projeto = daoProjeto.ListarProjetos().get(index);
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela " + erro);
            
        }

        codProjeto.setText(String.valueOf(projeto.getCodProjeto()));
        projetoName.setText(projeto.getNomeProjeto());
        empresa.setText(projeto.getEmpresaProjeto());


    }//GEN-LAST:event_tabelaProjetoMouseClicked

    private void campoAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAssuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAssuntoActionPerformed

    private void codProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codProjetoActionPerformed

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed
        
        if (campoMensagem.getText().equals("") || campoAssunto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor, preencher todos os campos");
            return;
        }
        
        mensagem.setConteudoMsg(campoMensagem.getText());
        mensagem.setAssuntoMsg(campoAssunto.getText());
        mensagem.setCodProjeto(Integer.parseInt(codProjeto.getText()));
        mensagem.setTipo(selecionarTipo.getSelectedItem().toString());
        
        if (selecionarTipo.getSelectedItem().equals("Selecione um meio de contato")) {
                JOptionPane.showMessageDialog(null, "Favor, selecionar um meio de contato.");
                return;
        }
        
        if (codProjeto.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Favor, selecionar um projeto.");
            return;
        } 
        
        daoCadastro.cadastroMensagem(mensagem);
        JOptionPane.showMessageDialog(null, "Enviado com sucesso!");
        
        campoMensagem.setText("");
        campoAssunto.setText("");
        selecionarTipo.setSelectedItem("Selecione um meio de contato");              
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaActionPerformed

    private void projetoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projetoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projetoNameActionPerformed

    private void selecionarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecionarTipoActionPerformed

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        
        DefaultTableModel table = (DefaultTableModel)tabelaProjeto.getModel();
        String busca = campoPesquisa.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tabelaProjeto.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(busca));
        
    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        
        menuSuporte sup = new menuSuporte();
        sup.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void carregaTabela() {
        String sqlTabela = "SELECT * FROM projeto;";
        DefaultTableModel modelo = (DefaultTableModel) tabelaProjeto.getModel();
        modelo.setNumRows(0);

        try(PreparedStatement stmt = connection.prepareStatement(sqlTabela)) {
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                
                modelo.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2).toLowerCase(),
                    rs.getString(3).toLowerCase()
                });
                
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela " + erro);
        }
    }

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
            java.util.logging.Logger.getLogger(telaMensagemSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMensagemSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMensagemSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMensagemSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMensagemSuporte().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoAssunto;
    private javax.swing.JTextArea campoMensagem;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JTextField codProjeto;
    private javax.swing.JTextField empresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField projetoName;
    private javax.swing.JComboBox<String> selecionarTipo;
    private javax.swing.JTable tabelaProjeto;
    // End of variables declaration//GEN-END:variables
}