package aula5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/colecaocd",
					"root", "adm290578");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
