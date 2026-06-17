package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/advance_java";
		String un = "root";
		String pwd = "sum@23ma@45";
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,un,pwd);
			System.out.println("Connection established");
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connection not Established");
		}
		return con;
	}
	

}
