package DAO;

import modelo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class CadastroDAO {
    private final Connection connection;
    
    public CadastroDAO(){
        this.connection = new factory.ConnectionFactory().getConnection();
    }
    
    public void cadastroMensagem(Mensagem mensagem){
        String sql = "INSERT INTO mensagem(conteudoMsg,assuntoMsg,tipo,dataMsg,horaMsg,codProjeto) VALUES (?,?,?,?,?,?)";
        
        java.util.Date date=new java.util.Date();
        java.sql.Date sqlDate=new java.sql.Date(date.getTime());
        java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
        
        try {
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, mensagem.getConteudoMsg());
                stmt.setString(2, mensagem.getAssuntoMsg());
                stmt.setString(3, mensagem.getTipo());
                stmt.setDate(4, sqlDate);
                stmt.setTimestamp(5,sqlTime);
                stmt.setInt(6, mensagem.getCodProjeto());
                stmt.executeUpdate();
                
            }
        }catch (SQLException erro){
            throw new RuntimeException(erro);
        } 
    }
    
    public void cadastroUsuario(Usuario usuario){
        String sqlUsuario = "INSERT INTO usuario(nomeUsuario,empresaUsuario,funcaoUsuario,telefoneUsuario,emailUsuario,perfilUsuario,senhaUsuario,loginUsuario) VALUES (?,?,?,?,?,?,?,?)";
        
        try{
            
            try(PreparedStatement stmt2 = connection.prepareStatement(sqlUsuario)){
                stmt2.setString(1, usuario.getNomeUsuario());
                stmt2.setString(2, usuario.getEmpresaUsuario());
                stmt2.setString(3, usuario.getFuncaoUsuario());
                stmt2.setString(4, usuario.getTelefoneUsuario());
                stmt2.setString(5, usuario.getEmailUsuario());
                stmt2.setInt(6, usuario.getPerfilUsuario());
                stmt2.setString(7, usuario.getSenha());
                stmt2.setString(8, usuario.getLoginUsuario());
                stmt2.executeUpdate();
            }
            
        }catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
//    public void cadastroAdm (Usuario usuario){
//        String sql = "INSERT INTO usuario(nomeUsuario,empresaUsuario,funcaoUsuario,telefoneUsuario,emailUsuario,perfilUsuario,senhaUsuario,loginUsuario) VALUES (?,?,?,?,?,?,?,?)";
//        
//        try {
//
//            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//                
//                stmt.setString(1, usuario.getNomeUsuario());
//                stmt.setString(2, usuario.getEmpresaUsuario());
//                stmt.setString(3, usuario.getFuncaoUsuario());
//                stmt.setString(4, usuario.getTelefoneUsuario());
//                stmt.setString(5, usuario.getEmailUsuario());
//                stmt.setString(6, usuario.getPerfilUsuario());
//                stmt.setString(7, usuario.getLoginUsuario());
//                stmt.setString(8, usuario.getSenha());
//                stmt.executeUpdate();
//                
//            }
//            
//        }catch (SQLException erro){
//            throw new RuntimeException(erro);
//        }
//    }
     
//    public void cadastroCliente(Usuario usuario){
//        String sqlUsuario = "INSERT INTO usuario(nomeUsuario,empresaUsuario,funcaoUsuario,telefoneUsuario,emailUsuario,perfilUsuario,senhaUsuario,loginUsuario) VALUES (?,?,?,?,?,?,?,?)";
//        
//        try{
//            
//            try(PreparedStatement stmt2 = connection.prepareStatement(sqlUsuario)){
//                stmt2.setString(1, usuario.getNomeUsuario());
//                stmt2.setString(2, usuario.getEmpresaUsuario());
//                stmt2.setString(3, usuario.getFuncaoUsuario());
//                stmt2.setString(4, usuario.getTelefoneUsuario());
//                stmt2.setString(5, usuario.getEmailUsuario());
//                stmt2.setString(6, usuario.getPerfilUsuario());
//                stmt2.setString(7, usuario.getSenha());
//                stmt2.setString(8, usuario.getLoginUsuario());
//                stmt2.executeUpdate();
//            }
//            
//        }catch (SQLException erro){
//            throw new RuntimeException(erro);
//        }
//    }
    
    public List<Mensagem> ListarMensagens(Integer id){
       List<Mensagem> mensagens = new ArrayList<>();
       String sqlListarMensagem = "SELECT * FROM mensagem where codProjeto = ?;";
        
       try(PreparedStatement stmt = connection.prepareStatement(sqlListarMensagem)){
           stmt.setInt(1, id);
           ResultSet rs = stmt.executeQuery();
           
           while(rs.next()){
               Mensagem mensagem = new Mensagem();
                
               mensagem.setHoraMsg(rs.getTimestamp("horaMsg"));
               mensagem.setDataMsg(rs.getDate("dataMsg"));
               mensagem.setConteudoMsg(rs.getString("conteudoMsg"));
               mensagens.add(mensagem);
               
            }
           
       }catch (SQLException erro){
           throw new RuntimeException(erro);
       }
       
       return mensagens;
    }
    
}
