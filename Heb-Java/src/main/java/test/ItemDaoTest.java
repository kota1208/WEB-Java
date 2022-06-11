package test;

import java.util.ArrayList;

import bean.ItemBean;
import db.dao.ItemDAO;

public class ItemDaoTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		ItemDAO dao=new ItemDAO();
		ArrayList list=null;
		
		try {
			
			list=(ArrayList)dao.show();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		for(int i=0;i<list.size();i++) {
			ItemBean bean=(ItemBean)list.get(i);
			System.out.println(bean.getItemName());
			System.out.println(bean.getItemPrice());
		}
		
	}

}
