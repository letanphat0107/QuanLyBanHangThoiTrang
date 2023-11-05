package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static Connection con = null;
	public static Connect instance = new Connect();
	public static Connect getInstance() {
		return instance;
	}
	
	public void connect() throws SQLException {	

<<<<<<< HEAD
		String url = "jdbc:sqlserver://localhost:1433;databasename = QLBHTT";
=======
		String url = "jdbc:sqlserver://localhost:1433;databasename = QLBHTT_new1";
>>>>>>> 106e326058fd9e217c9a99d268ebda00bac1bbe7
		String user ="sa";
		String password ="sapassword";
		con = DriverManager.getConnection(url, user, password);
		
	}
	public void disconnect() {
		if(con!= null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static Connection getConnection() {
		return con;
		
	}
	
}
