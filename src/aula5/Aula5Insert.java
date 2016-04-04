package aula5;

import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Aula5Insert {

    public static void main(String[] args) throws SQLException {

        try (
                Connection connection = new ConnectionFactory().getConnection()) {

            Statement stmt = connection.createStatement();
            {
                int regAlterados;
                regAlterados = stmt.executeUpdate("insert into estilo values ('Rock');");
                System.out.println("Foram alterados " + regAlterados + " registros");
                stmt.close();
            }
        }

        System.out.println("Conexão aberta no BD MYSQL!");
    }
}
