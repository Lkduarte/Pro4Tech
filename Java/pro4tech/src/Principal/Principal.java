package Principal;

import DAO.*;
import modelo.*;

import GUI.login;
import factory.ConnectionFactory;
import java.sql.Connection;


public class Principal {
    
    public static CadastroDAO daoCadastro;
    public static ProjetoDAO daoProjeto;
    public static UsuarioDAO daoUsuario;
    
    public static Usuario usuarioLogado;
    
    public static Connection conexao;
    
    public static void main(String[] args) {
        try{
            conexao = new ConnectionFactory().getConnection();
        }catch(Exception e){
            System.out.println("Erro de conexão");
            System.exit(0);
            return;
        }
        
        daoCadastro = new DAO.CadastroDAO();
        daoProjeto = new DAO.ProjetoDAO();
        daoUsuario = new DAO.UsuarioDAO();
        
        new login().setVisible(true);
        
    }
    
}
