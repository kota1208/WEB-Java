package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bean.ItemBean;
import db.connector.MySQLConnector;
import db.connector.SQLConnector;

public class ItemDAO implements DAOInterface {

	@Override
	public Object insert(Object request) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
//		beanの取得
		ItemBean bean=(ItemBean)request;
		String sql="Insert into item(item_name,item_price)values(?,?)";
		int result=0;
		
		try {
			SQLConnector sqlConnector=new MySQLConnector();
			Connection cn=sqlConnector.getConnection();
			PreparedStatement st=cn.prepareStatement(sql);
			st.setString(1, bean.getItemName());
			st.setInt(2, bean.getItemPrice());
			
//			SQLの実行
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		
		return result;
	}

	@Override
	public Object show() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		ResultSet rs=null;
		
		
		try {
			SQLConnector sqlConnector=new MySQLConnector();
			Connection cn=sqlConnector.getConnection();
			Statement st=cn.createStatement();
			
//			SQLの実行
			rs=st.executeQuery("SELECT*FROM item");
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
//		戻り値用の配列
		ArrayList result=new ArrayList();
//		DBに保存
		while(rs.next()) {
			ItemBean bean=new ItemBean();
			bean.setItemName(rs.getString("item_name"));
			bean.setItemPrice(rs.getInt("item_price"));
			result.add(bean);
		}
		
		return result;
	}

	@Override
	public Object update(Object request) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Object delete(Object request) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
}
