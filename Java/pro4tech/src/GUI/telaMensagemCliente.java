package GUI;

import Principal.*;
import modelo.*;

import java.sql.Timestamp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class telaMensagemCliente extends javax.swing.JFrame {


    public telaMensagemCliente() {
        initComponents();
        
        carregaTabela();
        
        codProjeto.setText("0");
        codProjeto.setVisible(false);
        projetoName.setVisible(false);
        empresa.setVisible(false);
        
        campoHistorico.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoEnviar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaProjeto = new javax.swing.JTable();
        campoPesquisa = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();
        campoAssunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoHistorico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoMensagem = new javax.swing.JTextArea();
        codProjeto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        projetoName = new javax.swing.JTextField();
        empresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mensagem");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Mensagens:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(643, 438));

        botaoEnviar.setBackground(new java.awt.Color(255, 153, 51));
        botaoEnviar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoEnviar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEnviar.setText("Enviar");
        botaoEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });

        botaoLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(255, 153, 51));
        botaoLimpar.setText("Limpar");
        botaoLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        tabelaProjeto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabelaProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
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
        tabelaProjeto.setSelectionBackground(new java.awt.Color(255, 204, 153));
        tabelaProjeto.getTableHeader().setReorderingAllowed(false);
        tabelaProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProjetoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaProjeto);
        if (tabelaProjeto.getColumnModel().getColumnCount() > 0) {
            tabelaProjeto.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaProjeto.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelaProjeto.getColumnModel().getColumn(0).setMaxWidth(0);
            tabelaProjeto.getColumnModel().getColumn(1).setResizable(false);
            tabelaProjeto.getColumnModel().getColumn(2).setResizable(false);
        }

        campoPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoPesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)));
        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });
        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });

        botaoVoltar.setBackground(new java.awt.Color(102, 102, 102));
        botaoVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar");
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        campoAssunto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoAssunto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)));
        campoAssunto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAssuntoActionPerformed(evt);
            }
        });

        campoHistorico.setColumns(20);
        campoHistorico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoHistorico.setLineWrap(true);
        campoHistorico.setRows(5);
        campoHistorico.setToolTipText("");
        jScrollPane1.setViewportView(campoHistorico);

        campoMensagem.setColumns(20);
        campoMensagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoMensagem.setLineWrap(true);
        campoMensagem.setRows(5);
        jScrollPane2.setViewportView(campoMensagem);

        codProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProjetoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Assunto:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Pesquisar:");

        projetoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projetoNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Histórico:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Mesagem:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(codProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(projetoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoAssunto)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projetoName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        // TODO add your handling code here:
        campoMensagem.setText("");
        campoAssunto.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void campoAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAssuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAssuntoActionPerformed

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed
        
        if (campoMensagem.getText().equals("") || campoAssunto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Favor, preencher todos os campos.");
            return;
        }
        
        Mensagem mensagem = new Mensagem(
                campoAssunto.getText(),
                new Date(),
                new Timestamp(new Date().getTime()),
                campoMensagem.getText(),
                "Interno",
                Principal.usuarioLogado.getUsuarioId(),
                Integer.parseInt(codProjeto.getText())
        );

        if (codProjeto.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Favor, selecionar um projeto.");
            return;
        } 

        Principal.daoCadastro.cadastroMensagem(mensagem);
        JOptionPane.showMessageDialog(null, "Enviado com sucesso!");
        
        campoMensagem.setText("");
        campoAssunto.setText("");
        carregarHistorico();
        
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void tabelaProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProjetoMouseClicked
        
        carregarHistorico();
        
    }//GEN-LAST:event_tabelaProjetoMouseClicked

    private void codProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codProjetoActionPerformed

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
       
        DefaultTableModel table = (DefaultTableModel)tabelaProjeto.getModel();
        String busca = campoPesquisa.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tabelaProjeto.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(busca));
        
    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed

        if( Principal.usuarioLogado.getPerfilUsuario() == FuncaoUsuario.CLIENTE.getId()){
            new menuCliente().setVisible(true);
        }else{
            new menuAdm().setVisible(true);
        }
        
        dispose();
        
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void projetoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projetoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projetoNameActionPerformed
    
    private void carregarHistorico(){
        int index = tabelaProjeto.getSelectedRow();
        Projeto projeto;

        try {
            projeto = Principal.daoProjeto.ListarProjetos().get(index);
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }

        codProjeto.setText(String.valueOf(projeto.getCodProjeto()));
        projetoName.setText(projeto.getNomeProjeto());
        empresa.setText(projeto.getEmpresaProjeto());

        String listaMensagem = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        for (Mensagem mensagem1 : Principal.daoCadastro.ListarMensagens(projeto.getCodProjeto())) {
            
            listaMensagem += dateFormat1.format(mensagem1.getDataMsg()) + " " + dateFormat.format(mensagem1.getHoraMsg().getTime()) + ": " + mensagem1.getConteudoMsg() + "\n \n";
        
        }
         
        campoHistorico.setText(listaMensagem);
    }
    
    private void carregaTabela() {
        String sqlTabela = "SELECT * FROM projeto;";
        DefaultTableModel modelo = (DefaultTableModel) tabelaProjeto.getModel();
        modelo.setNumRows(0);

        try(PreparedStatement stmt = Principal.conexao.prepareStatement(sqlTabela)) {
            
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
            java.util.logging.Logger.getLogger(telaMensagemCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMensagemCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMensagemCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMensagemCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMensagemCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoAssunto;
    private javax.swing.JTextArea campoHistorico;
    private javax.swing.JTextArea campoMensagem;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JTextField codProjeto;
    private javax.swing.JTextField empresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField projetoName;
    private javax.swing.JTable tabelaProjeto;
    // End of variables declaration//GEN-END:variables
}
