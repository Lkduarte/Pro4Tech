package DAO;

import Principal.Principal;
import modelo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ProjetoDAO {
    
    private final Connection connection;
    
    public ProjetoDAO(){
        this.connection = new factory.ConnectionFactory().getConnection();
    }
    
    public void adicionaProjeto(Projeto projeto){
        String sqlProjeto = "INSERT INTO projeto(nomeProjeto, empresaProjeto) VALUES (?,?)";
        
        try{
            
            try(PreparedStatement pstm = connection.prepareStatement(sqlProjeto)){
                pstm.setString(1, projeto.getNomeProjeto());
                pstm.setString(2, projeto.getEmpresaProjeto());
                pstm.executeUpdate();
            }
            
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
   
    public List<Projeto> ListarProjetos(){
        List<Projeto> projetos = new ArrayList<>();
        String sqlListarProjeto = "SELECT * FROM projeto;";
        
        try(PreparedStatement stmt = connection.prepareStatement(sqlListarProjeto)){
           ResultSet rs = stmt.executeQuery();
           
           while(rs.next()){
               
                Projeto projeto = new Projeto(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3)
                );
                
                projetos.add(projeto);
               
           }

        }catch (SQLException erro){
           JOptionPane.showMessageDialog(null, erro);
        }
        
        return projetos;
    }
    
    public boolean existeProjeto(String nomeProjeto){
        return ListarProjetos().stream().anyMatch(r -> r.getNomeProjeto().equalsIgnoreCase(nomeProjeto));
    }
    
    public int[] getCountProjeto(int id){
        
        int[] listaProjeto = new int[2]; 
        
        try {
            PreparedStatement stmt = Principal.conexao.prepareStatement("select codProjeto, count(codProjeto), count(distinct(usuarioId)) from mensagem where codProjeto = ?;");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                int usuarioId = rs.getInt("codProjeto");
                int count = rs.getInt("count(codProjeto)");
                int count2 = rs.getInt("count(distinct(usuarioId))");

                listaProjeto[0] = count;
                listaProjeto[1] = count2;
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaProjeto;
    }
}
