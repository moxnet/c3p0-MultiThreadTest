package c3p0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class Work implements Runnable {

	@Override
	public void run() {
		DataSource ds = DSPool.PoolFactory().getDS();
		String sql = new String("UPDATE demo SET id = id + 1");
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			for (int i = 0; i < 10000; i++) {
				int num = stmt.executeUpdate(sql);
			}
		} catch (SQLException e) {
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					//
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					//
				}
			}
		}
	}
}
