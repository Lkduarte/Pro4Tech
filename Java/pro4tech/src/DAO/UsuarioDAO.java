package DAO;

import Principal.Principal;
import modelo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

 

public class UsuarioDAO {
    
    private final Connection connection;
    
    public UsuarioDAO(){
       this.connection = new factory.ConnectionFactory().getConnection();
   }
    
    public void editarTelefone(Usuario usuario){
        String sql = "UPDATE usuario SET telefoneUsuario = ? WHERE usuarioId = ?;";
        
        try {
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
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
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
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
    }
    
    public List<Usuario> getUsuariosPorNome(String nome){
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario where nomeUsuario like '%" + nome + "%'";
        
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            
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
        if(!existeUsuario(userName)){
            return null;
        }else{
            return ListarUsuarios().stream().filter(r-> r.getLoginUsuario().equalsIgnoreCase(userName)).findFirst().get();
        }
        
    }
    
    /*public void excluirUsuario(){
        String sql = "DELETE FROM usuario WHERE usuarioId = ?;";
        Usuario usuario;
        try {
            
            try(PreparedStatement stmt = connection.prepareStatement(sql)){
                stmt.setInt(1, usuario.getUsuarioId());
                stmt.executeUpdate();
            }
        }catch (SQLException erro){
            throw new RuntimeException(erro);
        } 
    }*/

}