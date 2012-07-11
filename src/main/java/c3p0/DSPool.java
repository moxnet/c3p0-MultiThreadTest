package c3p0;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DSPool {
	private static DSPool dspool = new DSPool();
	private ComboPooledDataSource ds = new ComboPooledDataSource();
	
	private DSPool() {
		init();
	}
	
	private void init() {
		try {
			ds.setDriverClass("com.mysql.jdbc.Driver");
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		ds.setJdbcUrl("jdbc:mysql://localhost/test");
		ds.setUser("root");
		ds.setPassword("");
		
		ds.setMinPoolSize(3);
		ds.setAcquireIncrement(5);
		ds.setMaxPoolSize(10);
		ds.setInitialPoolSize(3);
	};
	
	public static DSPool PoolFactory() {
		return dspool;
	}
	public DataSource getDS() {
		return ds;
	}
}
