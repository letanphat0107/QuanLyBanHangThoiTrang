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
		String url = "jdbc:sqlserver://localhost:1433;databasename = BanHangTT";
=======
		String url = "jdbc:sqlserver://localhost:1433;databasename = QLBHTT";
>>>>>>> 0b3a9eb1008bbcaf0a56c49459fcef7895994c6f
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
