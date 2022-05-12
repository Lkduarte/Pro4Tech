package factory;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionFactory {
    
    public Connection getConnection(){
        try{
            //return DriverManager.getConnection("jdbc:mysql://localhost/pro4tech", "root", "yasmin3155");
            //return DriverManager.getConnection("jdbc:mysql://localhost/pro4tech", "root", "Ssassasse00");
            return DriverManager.getConnection("jdbc:mysql://localhost/pro4tech", "root", "fatec");
            //return DriverManager.getConnection("jdbc:mysql://localhost:3304/pro4tech", "root", "admin");
            //return DriverManager.getConnection("jdbc:mysql://localhost/pro4tech", "root", "81w*&Ykk");
        }
        catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
}
