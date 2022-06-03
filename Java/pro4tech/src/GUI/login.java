package GUI;

import Principal.*;
import java.awt.event.KeyEvent;
import modelo.*;

import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    
    public login() {
        
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        botaoEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        campoLogin.setBackground(new java.awt.Color(255, 153, 51));
        campoLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoLogin.setForeground(new java.awt.Color(255, 255, 255));
        campoLogin.setToolTipText("");
        campoLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoLogin.setSelectionColor(new java.awt.Color(255, 255, 255));
        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });
        campoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoLoginKeyPressed(evt);
            }
        });

        campoSenha.setBackground(new java.awt.Color(255, 153, 51));
        campoSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoSenha.setForeground(new java.awt.Color(255, 255, 255));
        campoSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        campoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaKeyPressed(evt);
            }
        });

        botaoEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoEntrar.setBorderPainted(false);
        botaoEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoEntrar.setFocusPainted(false);
        botaoEntrar.setFocusable(false);
        botaoEntrar.setRequestFocusEnabled(false);
        botaoEntrar.setRolloverEnabled(false);
        botaoEntrar.setVerifyInputWhenFocusTarget(false);
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSenha)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 548, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed

        if(campoLogin.getText().isEmpty() || new String(campoSenha.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }
        
        if(!Principal.daoUsuario.existeLoginUsuario(campoLogin.getText())){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }

        Usuario usuario = Principal.daoUsuario.getUsuarioByUserName(campoLogin.getText());

        if(usuario == null){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }

        if(!usuario.getSenha().equals(new String(campoSenha.getPassword()))){

            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }

        if(usuario.getPerfilUsuario() == FuncaoUsuario.CLIENTE.getId()){
            new menuCliente().setVisible(true);
        }
        if(usuario.getPerfilUsuario() == FuncaoUsuario.SUPORTE.getId()){
            new menuSuporte().setVisible(true);
        }
        if(usuario.getPerfilUsuario() == FuncaoUsuario.ADMINISTRADOR.getId()){
            new menuAdm().setVisible(true);
        }

        Principal.usuarioLogado = usuario;

        dispose();
        
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLoginActionPerformed

    private void campoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLoginKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            if(campoLogin.getText().isEmpty() || new String(campoSenha.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }
        
        if(!Principal.daoUsuario.existeLoginUsuario(campoLogin.getText())){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }

        Usuario usuario = Principal.daoUsuario.getUsuarioByUserName(campoLogin.getText());

        if(usuario == null){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }

        if(!usuario.getSenha().equals(new String(campoSenha.getPassword()))){

            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }

        if(usuario.getPerfilUsuario() == FuncaoUsuario.CLIENTE.getId()){
            new menuCliente().setVisible(true);
        }
        if(usuario.getPerfilUsuario() == FuncaoUsuario.SUPORTE.getId()){
            new menuSuporte().setVisible(true);
        }
        if(usuario.getPerfilUsuario() == FuncaoUsuario.ADMINISTRADOR.getId()){
            new menuAdm().setVisible(true);
        }

        Principal.usuarioLogado = usuario;

        dispose();
        }
    }//GEN-LAST:event_campoLoginKeyPressed

    private void campoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            if(campoLogin.getText().isEmpty() || new String(campoSenha.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }
        
        if(!Principal.daoUsuario.existeLoginUsuario(campoLogin.getText())){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }

        Usuario usuario = Principal.daoUsuario.getUsuarioByUserName(campoLogin.getText());

        if(usuario == null){
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }

        if(!usuario.getSenha().equals(new String(campoSenha.getPassword()))){

            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            return;
        }

        if(usuario.getPerfilUsuario() == FuncaoUsuario.CLIENTE.getId()){
            new menuCliente().setVisible(true);
        }
        if(usuario.getPerfilUsuario() == FuncaoUsuario.SUPORTE.getId()){
            new menuSuporte().setVisible(true);
        }
        if(usuario.getPerfilUsuario() == FuncaoUsuario.ADMINISTRADOR.getId()){
            new menuAdm().setVisible(true);
        }

        Principal.usuarioLogado = usuario;

        dispose();
        }
                                  
    }//GEN-LAST:event_campoSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
