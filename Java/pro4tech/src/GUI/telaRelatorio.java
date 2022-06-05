package GUI;

import Principal.Principal;
import java.awt.HeadlessException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class telaRelatorio extends javax.swing.JFrame {

    public telaRelatorio() {
        initComponents();
        atualizarTipoTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloRelatório = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botãoTipoDeRelatório = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        botaoDownload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(853, 451));
        setPreferredSize(new java.awt.Dimension(853, 451));

        jPanel1.setPreferredSize(new java.awt.Dimension(853, 451));

        tituloRelatório.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloRelatório.setForeground(new java.awt.Color(255, 153, 51));
        tituloRelatório.setText("Relatórios");

        botaoVoltar.setBackground(new java.awt.Color(102, 102, 102));
        botaoVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar");
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar.setMinimumSize(new java.awt.Dimension(72, 30));
        botaoVoltar.setPreferredSize(new java.awt.Dimension(72, 30));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botãoTipoDeRelatório.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botãoTipoDeRelatório.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipos de relatório", "Cliente", "Projeto" }));
        botãoTipoDeRelatório.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botãoTipoDeRelatórioMouseClicked(evt);
            }
        });
        botãoTipoDeRelatório.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoTipoDeRelatórioActionPerformed(evt);
            }
        });

        tabelaRelatorio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabelaRelatorio.getTableHeader().setResizingAllowed(false);
        tabelaRelatorio.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaRelatorio);

        botaoDownload.setBackground(new java.awt.Color(255, 153, 51));
        botaoDownload.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoDownload.setForeground(new java.awt.Color(255, 255, 255));
        botaoDownload.setText("Download");
        botaoDownload.setPreferredSize(new java.awt.Dimension(99, 30));
        botaoDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDownloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 714, Short.MAX_VALUE)
                .addComponent(botaoDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(tituloRelatório, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botãoTipoDeRelatório, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloRelatório, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botãoTipoDeRelatório, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        
        menuAdm adm = new menuAdm();
        adm.setVisible(true);
        dispose();

    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botãoTipoDeRelatórioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botãoTipoDeRelatórioMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_botãoTipoDeRelatórioMouseClicked

    private void botãoTipoDeRelatórioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoTipoDeRelatórioActionPerformed
       
        atualizarTipoTabela();
        lerTabela();
        
    }//GEN-LAST:event_botãoTipoDeRelatórioActionPerformed

    private void botaoDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDownloadActionPerformed
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH mm");
        Date data = new Date();
        
        try {
            
            File file = new File("C:\\Users\\Victoria\\Desktop\\"+ dateFormat.format(data).replaceAll(" ", "") + " - relatório.txt");
            
            if (!file.exists()) {
                file.createNewFile();
            }

            try (FileWriter fw = new FileWriter(file.getAbsoluteFile()); BufferedWriter bw = new BufferedWriter(fw)) {
                    
                bw.write("--------------------------------Relatório--------------------------------");
                bw.write("\r\n");
                bw.write("\r\n");

                for(Object[] dados : lerTabelaCliente()){
                    String nomeUsuario = dados[0] + "";
                    int quantidade = Integer.parseInt(dados[1] + "");
                    String nomeProjeto = dados[2] + "";

                    bw.write("O usuário " + nomeUsuario + " enviou " + quantidade + " mensagem(s) no projeto " + nomeProjeto);
                    bw.write("\r\n");
                    bw.write("\r\n");
                }

                bw.write("-------------------------------------------------------------------------");
                bw.write("\r\n");
                bw.write("\r\n");

                for(Object[] dados : lerTabelaProjeto()){
                    String nomeProjeto = dados[0] + "";
                    int quantidadeMensagem = Integer.parseInt(dados[1] + "");
                    int quantidadeUsuario = Integer.parseInt(dados[2] + "");

                    bw.write("O projeto " + nomeProjeto + " possui " + quantidadeMensagem + " mensagem(s), com um total de " + quantidadeUsuario + " usuário(s) participativo(s)");
                    bw.write("\r\n");
                    bw.write("\r\n");
                }
                    
            }
            
            botãoTipoDeRelatório.setSelectedItem("Tipos de relatório");
            atualizarTipoTabela();
            
            JOptionPane.showMessageDialog(null,"Dados exportados com sucesso!");
        } catch (HeadlessException | IOException ex) {
            System.out.println("Erro ao exportar dados da tabela!");
        }
        
       
        
    }//GEN-LAST:event_botaoDownloadActionPerformed

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
            java.util.logging.Logger.getLogger(telaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaRelatorio().setVisible(true);
            }
        });
    }
    
    private void atualizarTipoTabela(){
        
        String ComboBox = botãoTipoDeRelatório.getSelectedItem()+ "";
        DefaultTableModel modelo = (DefaultTableModel) tabelaRelatorio.getModel();
        modelo.setNumRows(0);
        
        tabelaRelatorio.getColumnModel().getColumn(0).setHeaderValue(" ");
        tabelaRelatorio.getColumnModel().getColumn(1).setHeaderValue(" ");
        tabelaRelatorio.getColumnModel().getColumn(2).setHeaderValue(" ");
        
        if (ComboBox.equalsIgnoreCase("Cliente")){
            tabelaRelatorio.getColumnModel().getColumn(0).setHeaderValue("Nome do Cliente");
            tabelaRelatorio.getColumnModel().getColumn(1).setHeaderValue("Quantidade");
            tabelaRelatorio.getColumnModel().getColumn(2).setHeaderValue("Nome do Projeto");
        }else if (!ComboBox.equals("Tipos de relatório")){
            tabelaRelatorio.getColumnModel().getColumn(0).setHeaderValue("Nome do Projeto");
            tabelaRelatorio.getColumnModel().getColumn(1).setHeaderValue("Quantidade de mensagens");
            tabelaRelatorio.getColumnModel().getColumn(2).setHeaderValue("Quantidade de usuários");
        }
        
        tabelaRelatorio.getTableHeader().repaint();
        
    }

    public void lerTabela(){
        
        String ComboBox = botãoTipoDeRelatório.getSelectedItem()+ "";
        DefaultTableModel modelo = (DefaultTableModel) tabelaRelatorio.getModel();
        
        if (ComboBox.equals("Cliente")){
            for(Object[] dados : lerTabelaCliente()){
                modelo.addRow(dados);
            }
        }else if (!ComboBox.equals("Tipos de relatório")){
            for(Object[] dados : lerTabelaProjeto()){
                modelo.addRow(dados);
            }
        }
        
    }
    
    public List<Object[]> lerTabelaCliente(){
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaRelatorio.getModel();
        List<Object[]> lista = new ArrayList<>();
        
        modelo.setNumRows(0);
        for(Projeto projeto: Principal.daoProjeto.ListarProjetos()){
            
            int id = projeto.getCodProjeto();
            HashMap<Usuario,Integer> tortinha = Principal.daoUsuario.getCountUsuario(id);
           
            
            for(Usuario usuario: tortinha.keySet()){
                
                int count = tortinha.get(usuario);
                
                lista.add(new Object[]{
                        usuario.getNomeUsuario(),
                        count,
                        projeto.getNomeProjeto()
                });
            }
        }
        return lista;
    }
    
    public List<Object[]> lerTabelaProjeto(){
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaRelatorio.getModel();
        List<Object[]> lista = new ArrayList<>();
        
        modelo.setNumRows(0);
        
        for(Projeto projeto: Principal.daoProjeto.ListarProjetos()){
           
            int id = projeto.getCodProjeto();
            int[] tortinha = Principal.daoProjeto.getCountProjeto(id);
            
            int count = tortinha[0];
            int count2 = tortinha[1];

             lista.add(new Object[]{
                projeto.getNomeProjeto(),
                count,
                count2
            });
            
        }
        return lista;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDownload;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox<String> botãoTipoDeRelatório;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRelatorio;
    private javax.swing.JLabel tituloRelatório;
    // End of variables declaration//GEN-END:variables
}
