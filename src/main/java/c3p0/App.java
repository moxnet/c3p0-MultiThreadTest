package c3p0;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			Thread t = new Thread(new Work());
			t.start();
			System.out.println("Thread " + i + " Start!");
		}
		
		
		
//		DataSource ds = DSPool.PoolFactory().getDS();
//		String sql = new String("UPDATE demo SET id = id + 1");
//		Connection conn = null;
//		Statement stmt = null;
//		try {
//			conn = ds.getConnection();
//			stmt = conn.createStatement();
//			int num = stmt.executeUpdate(sql);
//		} catch (SQLException e) {
//		} finally {
//			if (stmt != null) {
//				try {
//					stmt.close();
//				} catch (SQLException e) {
//					//
//				}
//			}
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					//
//				}
//			}
//		}
	}

}
