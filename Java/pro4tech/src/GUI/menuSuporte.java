/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Victoria
 */
public class menuSuporte extends javax.swing.JFrame {

    /**
     * Creates new form menuInicial
     */
    public menuSuporte() {
        initComponents();
        //cadastroUsuario.setVisible(false);
        //relatorios.setVisible(false);
        
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
        botaoPerfil = new javax.swing.JButton();
        botaoMensagem = new javax.swing.JButton();
        botaoProjeto = new javax.swing.JButton();
        botaoCadastrarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Suporte");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botaoPerfil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoPerfil.setForeground(new java.awt.Color(255, 153, 51));
        botaoPerfil.setText("Perfil");
        botaoPerfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
        botaoPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPerfil.setFocusPainted(false);
        botaoPerfil.setFocusable(false);
        botaoPerfil.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                botaoPerfilComponentResized(evt);
            }
        });
        botaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPerfilActionPerformed(evt);
            }
        });

        botaoMensagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoMensagem.setForeground(new java.awt.Color(255, 153, 51));
        botaoMensagem.setText("Mensagens ");
        botaoMensagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
        botaoMensagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMensagem.setFocusPainted(false);
        botaoMensagem.setFocusable(false);
        botaoMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMensagemActionPerformed(evt);
            }
        });

        botaoProjeto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoProjeto.setForeground(new java.awt.Color(255, 153, 51));
        botaoProjeto.setText("Projetos");
        botaoProjeto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
        botaoProjeto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoProjeto.setFocusPainted(false);
        botaoProjeto.setFocusable(false);
        botaoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProjetoActionPerformed(evt);
            }
        });

        botaoCadastrarCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoCadastrarCliente.setForeground(new java.awt.Color(255, 153, 51));
        botaoCadastrarCliente.setText("Cadastrar Cliente");
        botaoCadastrarCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
        botaoCadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrarCliente.setFocusPainted(false);
        botaoCadastrarCliente.setFocusable(false);
        botaoCadastrarCliente.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                botaoCadastrarClienteComponentResized(evt);
            }
        });
        botaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoEsticada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botaoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(botaoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPerfilActionPerformed
//        telaDadosUsuarios usuarios = new telaDadosUsuarios();
//        usuarios.setVisible(true);
//        dispose();
    }//GEN-LAST:event_botaoPerfilActionPerformed

    private void botaoMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMensagemActionPerformed
  
        telaMensagemSuporte inserir = new telaMensagemSuporte();
        inserir.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoMensagemActionPerformed

    private void botaoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProjetoActionPerformed
        
        telaProjetos projetos = new telaProjetos();
        projetos.setVisible(true);
        dispose();

    }//GEN-LAST:event_botaoProjetoActionPerformed

    private void botaoPerfilComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_botaoPerfilComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPerfilComponentResized

    private void botaoCadastrarClienteComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarClienteComponentResized

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed

        telaCadastroCliente cliente = new telaCadastroCliente();
        cliente.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed
    
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
            java.util.logging.Logger.getLogger(menuSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuSuporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarCliente;
    private javax.swing.JButton botaoMensagem;
    private javax.swing.JButton botaoPerfil;
    private javax.swing.JButton botaoProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}