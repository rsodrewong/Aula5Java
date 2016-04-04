package aula5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Aula5Select {

    public static void main(String[] args) throws SQLException {
        // Instancia a classe ConnectionFactory.java abrindo conexão com banco de dados
        try ( Connection connection = new ConnectionFactory().getConnection()) {
            //Inicia a comunicação com o banco de dados
            Statement stmt = connection.createStatement();
            {
                ResultSet rs = stmt.executeQuery("select * from estilo;");
                while (rs.next()) {
                    System.out.println("Estilo: " + rs.getString("nome"));
                }
            }

            System.out.println("Conexão aberta no BD MYSQL!");
        }
    }

}
