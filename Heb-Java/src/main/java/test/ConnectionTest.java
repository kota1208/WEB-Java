package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import db.connector.MySQLConnector;
import db.connector.SQLConnector;

public class ConnectionTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Connection cn=null;
		SQLConnector mysql=new MySQLConnector();
		try {
			
			cn=mysql.getConnection();
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("SELECT*FROM item");
			
			while(rs.next()) {
				System.out.print(rs.getString("item_name"));
				System.out.println(rs.getInt("item_price"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
