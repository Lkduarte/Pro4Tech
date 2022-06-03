package DAO;

import Principal.Principal;
import modelo.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

 

public class UsuarioDAO {
    
    public void editarTelefone(Usuario usuario){
        String sql = "UPDATE usuario SET telefoneUsuario = ? WHERE usuarioId = ?;";
        
        try {
            
            try (PreparedStatement stmt = Principal.conexao.prepareStatement(sql)) {
                stmt.setString(1, usuario.getTelefoneUsuario());
                stmt.setInt(2, usuario.getUsuarioId());
                stmt.executeUpdate();
                
            }
        }catch (SQLException erro){
            throw new RuntimeException(erro);
        } 
    }
    
    public void editarSenha(Usuario usuario){
        String sql = "UPDATE usuario SET senhaUsuario = ? WHERE usuarioId = ?;";
        
        try {
            
            try (PreparedStatement stmt = Principal.conexao.prepareStatement(sql)) {
                stmt.setString(1, usuario.getSenha());
                stmt.setInt(2, usuario.getUsuarioId());
                stmt.executeUpdate();
                
            }
        }catch (SQLException erro){
            throw new RuntimeException(erro);
        } 
    }
    
    public List<Usuario> ListarUsuarios(){
       List<Usuario> usuarios = new ArrayList<>();
       String sqlSelecionarUsuario = "SELECT * FROM usuario;"; 
       
       try(PreparedStatement stmt = Principal.conexao.prepareStatement(sqlSelecionarUsuario)){
           
           ResultSet rs = stmt.executeQuery();
           
           while(rs.next()){
               
                Usuario usuario = new Usuario(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getInt(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getInt(10)
                );
               
               usuarios.add(usuario);
               
            }
       }catch (SQLException erro){
           JOptionPane.showMessageDialog(null, erro);
       }
       
       return usuarios;
    }
    
    public List<Usuario> getUsuariosPorNome(String nome){
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario where nomeUsuario like '%" + nome + "%'";
        
        try(PreparedStatement stmt = Principal.conexao.prepareStatement(sql)){
            
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                
                Usuario usuario = new Usuario(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getInt(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getInt(10)
                );
                
                usuarios.add(usuario);
            }
           
        }catch(SQLException e){
            e.printStackTrace();
        }

        return usuarios;
    }
    
    public boolean existeUsuario(String nomeUsuario){
        return ListarUsuarios().stream().anyMatch(r -> r.getNomeUsuario().equalsIgnoreCase(nomeUsuario));
    }
    
    public boolean existeLoginUsuario(String login){
        return ListarUsuarios().stream().anyMatch(r -> r.getLoginUsuario().equalsIgnoreCase(login));
    }
    
    public Usuario getUsuarioByUserName(String userName){
        if(!existeLoginUsuario(userName)){
            return null;
        }else{
            return ListarUsuarios().stream().filter(r-> r.getLoginUsuario().equalsIgnoreCase(userName)).findFirst().get();
        }
        
    }
    
    public void excluirUsuario(int id){
        String sql = "DELETE FROM usuario WHERE usuarioId = ?";
        try {
            
            try(PreparedStatement stmt = connection.prepareStatement(sql)){
                stmt.setInt(1, id);
                stmt.executeUpdate();
            }
        }catch (SQLException erro){
            throw new RuntimeException(erro);
        } 
    }

   /* public List<Usuario> ListarUsuariosExcluir(int id){
       List<Usuario> usuarios = new ArrayList<>();
       String sqlSelecionarUsuario = "SELECT * FROM usuario;"; 
       
       try(PreparedStatement stmt = connection.prepareStatement(sqlSelecionarUsuario)){
           
           ResultSet rs = stmt.executeQuery();
           
           while(rs.next()){
               
                Usuario usuario = new Usuario(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getInt(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getInt(10)
                );
               
               usuarios.add(usuario);
               
            }
       }catch (SQLException erro){
           JOptionPane.showMessageDialog(null, erro);
       }
       
       return usuarios;
    }*/
    
    public HashMap<Usuario,Integer> getCountUsuario(int id){
        
        HashMap<Usuario,Integer> hash = new HashMap<>();
        try {
            PreparedStatement stmt = Principal.conexao.prepareStatement("select usuarioId, count(*) from mensagem where codProjeto = ? group by usuarioId;");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                int usuarioId = rs.getInt("usuarioId");
                int count = rs.getInt("count(*)");

                Usuario usuario = Principal.daoUsuario.getUsuarioById(usuarioId);
                
                if(usuario != null){
                    hash.put(usuario, count);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return hash;
    }
    
    
    //TUDO AQUI É TESTE
    
    public boolean existeUsuario(int idUsuario){
        return ListarUsuarios().stream().anyMatch(r -> r.getUsuarioId() == idUsuario);
    }
    
    public Usuario getUsuarioById(int Id){
        
        try{
            PreparedStatement stmt = Principal.conexao.prepareStatement("select * from usuario where usuarioId = ?;");
            
            stmt.setInt(1, Id);
            
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                
                Usuario usuario = new Usuario(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getInt(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getInt(10)
                );
                
                return usuario;
            }
            
        } catch (SQLException e){
            
        }
        return null;
    }
    
}