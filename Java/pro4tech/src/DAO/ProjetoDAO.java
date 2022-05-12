package DAO;

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
               
                Projeto projeto = new Projeto();

                projeto.setCodProjeto(rs.getInt(1));
                projeto.setNomeProjeto(rs.getString(2));
                projeto.setEmpresaProjeto(rs.getString(3));
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
}
