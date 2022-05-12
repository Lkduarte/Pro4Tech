package factory;

import java.sql.Connection;

public class TestaConexao {

    public static void main(String[] args) {
        Connection conexao = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
    }
    
}
