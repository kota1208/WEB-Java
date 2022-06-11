package db.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnector implements SQLConnector {

	@Override
	public Connection getConnection()throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Connection cn = null;
		Class.forName("com.mysql.jdbc.Driver");
	    try {
	      cn = DriverManager.getConnection(
	        "jdbc:mysql://localhost/testdatabase?useSSL=false",
	        "root",
	        "password"
	      );

	    }catch(Exception e) {
	    	System.out.println("connection NG");
	    	throw e;
	    }
	    System.out.println("connection OK");
	    
	    return cn;
	}
	

	     
}
