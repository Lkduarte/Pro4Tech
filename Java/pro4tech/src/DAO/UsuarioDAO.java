package DAO;

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
    
    public List<Usuario> ListarUsuarios(){
       List<Usuario> usuarios = new ArrayList<>();
       String sqlSelecionarUsuario = "SELECT * FROM usuario;"; 
       
       try(PreparedStatement stmt = connection.prepareStatement(sqlSelecionarUsuario)){
           
           ResultSet rs = stmt.executeQuery();
           
           while(rs.next()){
               
               Usuario usuario = new Usuario();
               
               usuario.setUsuarioId(rs.getInt(1));
               usuario.setNomeUsuario(rs.getString(2));
               usuario.setEmpresaUsuario(rs.getString(3));
               usuario.setFuncaoUsuario(rs.getString(4));
               usuario.setTelefoneUsuario(rs.getString(5));
               usuario.setEmailUsuario(rs.getString(6));
               usuario.setPerfilUsuario(rs.getInt(7));
               usuario.setSenha(rs.getString(8));
               usuario.setLoginUsuario(rs.getString(9));
               usuario.setCodProjeto(rs.getInt(10));
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
                Usuario usuario = new Usuario();
                
                usuario.setUsuarioId(rs.getInt(1));
                usuario.setNomeUsuario(rs.getString(2));
                usuario.setEmpresaUsuario(rs.getString(3));
                usuario.setFuncaoUsuario(rs.getString(4));
                usuario.setTelefoneUsuario(rs.getString(5));
                usuario.setEmailUsuario(rs.getString(6));
                usuario.setPerfilUsuario(rs.getInt(7));
                usuario.setSenha(rs.getString(8));
                usuario.setLoginUsuario(rs.getString(9));
                usuario.setCodProjeto(rs.getInt(10));
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
    
    public Usuario getUsuarioByUserName(String userName){
        if(!existeUsuario(userName)){
            return null;
        }else{
            return ListarUsuarios().stream().filter(r-> r.getLoginUsuario().equalsIgnoreCase(userName)).findFirst().get();
        }
        
    }
}
