package DAO;

import Principal.Principal;
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
        String sql = "INSERT INTO mensagem(assuntoMsg,dataMsg,horaMsg,conteudoMsg,tipo,usuarioId,codProjeto) VALUES (?,?,?,?,?,?,?)";
        
        try {
            
            try (PreparedStatement stmt = Principal.conexao.prepareStatement(sql)) {
                stmt.setString(1, mensagem.getAssuntoMsg());
                stmt.setDate(2, new java.sql.Date(mensagem.getDataMsg().getTime()));
                stmt.setTimestamp(3, new java.sql.Timestamp(mensagem.getHoraMsg().getTime()));
                stmt.setString(4, mensagem.getConteudoMsg());
                stmt.setString(5, mensagem.getTipo());
                stmt.setInt(6, mensagem.getUsuarioId());
                stmt.setInt(7, mensagem.getCodProjeto());
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
    
    public List<Mensagem> ListarMensagens(Integer id){
       List<Mensagem> mensagens = new ArrayList<>();
       String sqlListarMensagem = "SELECT * FROM mensagem where codProjeto = ?;";
        
       try(PreparedStatement stmt = connection.prepareStatement(sqlListarMensagem)){
           stmt.setInt(1, id);
           ResultSet rs = stmt.executeQuery();

           while(rs.next()){
               
                Mensagem mensagem = new Mensagem(
                    rs.getInt("codMensagem"),
                    rs.getString("assuntoMsg"),
                    rs.getDate("dataMsg"),
                    rs.getTimestamp("horaMsg"),
                    rs.getString("conteudoMsg"),
                    rs.getString("tipo"),
                    rs.getInt("usuarioId"),
                    rs.getInt("codProjeto")
                );
               
                mensagens.add(mensagem);
               
            }
           
       }catch (SQLException erro){
           throw new RuntimeException(erro);
       }
       
       return mensagens;
    }
    
    public List<MensagemIndividual> ListarMensagensIndividual(int idEnviou, int idRecebeu){
       List<MensagemIndividual> mensagens = new ArrayList<>();
       String sqlListarMensagem = "SELECT * FROM mensagemIndividual where quemRecebeu = ? and quemEnviou = ?;";
        
       try(PreparedStatement stmt = Principal.conexao.prepareStatement(sqlListarMensagem)){
           stmt.setInt(1, idRecebeu);
           stmt.setInt(2, idEnviou);
           ResultSet rs = stmt.executeQuery();

           while(rs.next()){
               
                MensagemIndividual mensagem = new MensagemIndividual(
                    rs.getInt("codMensagemIndividual"),
                    rs.getString("assuntoMsgIndividual"),
                    rs.getDate("dataMsgIndividual"),
                    rs.getTimestamp("horaMsgIndividual"),
                    rs.getString("conteudoMsgIndividual"),
                    rs.getInt("quemEnviou"),
                    rs.getInt("quemRecebeu")
                );
               
                mensagens.add(mensagem);
               
            }
           
       }catch (SQLException erro){
           throw new RuntimeException(erro);
       }
       
       return mensagens;
    }
    
    public void cadastroMensagemIndividual(MensagemIndividual mensagemIndividual){
        String sql = "INSERT INTO mensagemIndividual(assuntoMsgIndividual,dataMsgIndividual,horaMsgIndividual,conteudoMsgIndividual,quemEnviou,quemRecebeu) VALUES (?,?,?,?,?,?)";
            
        try (PreparedStatement stmt = Principal.conexao.prepareStatement(sql)) {
            stmt.setString(1, mensagemIndividual.getAssuntoMsgIndividual());
            stmt.setDate(2, new java.sql.Date(mensagemIndividual.getDataMsgIndividual().getTime()));
            stmt.setTimestamp(3, new java.sql.Timestamp(mensagemIndividual.getHoraMsgIndividual().getTime()));
            stmt.setString(4, mensagemIndividual.getConteudoMsgIndividual());
            stmt.setInt(5, mensagemIndividual.getQuemEnvia() );
            stmt.setInt(6, mensagemIndividual.getQuemRecebe());
            stmt.executeUpdate();
                
            
        }catch (SQLException erro){
            throw new RuntimeException(erro);
        } 
        
    }
    
    public void excluirMensagem(int id){
        String sql = "delete from mensagem where codMensagem = ?";
        
        try(PreparedStatement stmt = Principal.conexao.prepareStatement(sql)){
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public void excluirMensagemIndividual(int id){
        String sql = "delete from mensagemIndividual where codMensagemIndividual = ?";
        
        try(PreparedStatement stmt = Principal.conexao.prepareStatement(sql)){
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public List<MensagemIndividual> ListarMensagensUsuarios(int id){
       List<MensagemIndividual> mensagens = new ArrayList<>();
       
       String sqlListarRecebeu = "SELECT * FROM mensagemIndividual where quemRecebeu = ?;";
       String sqlListarEnviou = "SELECT * FROM mensagemIndividual where quemEnviou= ?;";
        
       try{
            PreparedStatement stmt = Principal.conexao.prepareStatement(sqlListarRecebeu);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){

                 MensagemIndividual mensagem = new MensagemIndividual(
                     rs.getInt("codMensagemIndividual"),
                     rs.getString("assuntoMsgIndividual"),
                     rs.getDate("dataMsgIndividual"),
                     rs.getTimestamp("horaMsgIndividual"),
                     rs.getString("conteudoMsgIndividual"),
                     rs.getInt("quemEnviou"),
                     rs.getInt("quemRecebeu")
                 );

                 mensagens.add(mensagem);

             }
            
            PreparedStatement stmt1 = Principal.conexao.prepareStatement(sqlListarEnviou);
            stmt1.setInt(1, id);
            ResultSet rs1 = stmt1.executeQuery();

            while(rs1.next()){

                 MensagemIndividual mensagem = new MensagemIndividual(
                     rs1.getInt("codMensagemIndividual"),
                     rs1.getString("assuntoMsgIndividual"),
                     rs1.getDate("dataMsgIndividual"),
                     rs1.getTimestamp("horaMsgIndividual"),
                     rs1.getString("conteudoMsgIndividual"),
                     rs1.getInt("quemEnviou"),
                     rs1.getInt("quemRecebeu")
                 );

                 mensagens.add(mensagem);

             }
           
       }catch (SQLException erro){
           throw new RuntimeException(erro);
       }
       
       return mensagens;
    }
    
}
