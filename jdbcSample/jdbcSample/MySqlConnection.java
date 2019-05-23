package jdbcSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	private static final String USERNAME = "favour";
	private static final String PASSWORD = "@favour2017";
	private static final String CONN = "jdbc:mysql://localhost/EMPLOYEE?useSSL=false";
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(CONN,USERNAME ,PASSWORD );
			System.out.println("Connected");
		} catch (SQLException e) {
			System.err.print(e);
			// TODO: handle exception
		}
		finally {
			if (con != null){
				con.close();
			}
		}
	}

}
