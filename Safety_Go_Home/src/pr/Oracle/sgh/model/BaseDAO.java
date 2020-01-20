package pr.Oracle.sgh.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDAO {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public void getConnect() {
		String url = "jdbc:oracle:thin:@192.168.2.20:1521:XE";
		String id = "hr";
		String pw = "hr";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disConnect() {
		try {
			if (rs != null)		rs.close();
			if (ps != null)		ps.close();
			if (conn != null)	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
