package command;

import java.util.ArrayList;
import java.util.Map;

import bean.ItemBean;
import context.ContextResponseAbstract;
import context.WEBResponseContext;
import db.dao.DAOInterface;
import factory.DAOFactory;

public class InputItemCommand extends AbstractCommand {

	@Override
	public ContextResponseAbstract execute() throws Exception{
		// TODO 自動生成されたメソッド・スタブ


//		親クラスからパラメータの取得
		Map<String,String[]> parameterMap=(Map<String,String[]>)getParameter();
		
//		パラメータの取得,配列の0番目に入っている
		String name=parameterMap.get("itemName")[0];
		int price=Integer.parseInt(parameterMap.get("itemPrice")[0]);
		
		ItemBean bean=new ItemBean();
		bean.setItemName(name);
		bean.setItemPrice(price);
		
//		DAOのインスタンス化
		DAOInterface dao=DAOFactory.getInstance("ItemDAO");
		
		//DAOの呼び出し Insert
		int count=(int)dao.insert(bean);
		//DAOの呼び出し select*from item;
		ArrayList result=(ArrayList)dao.show();

		
//		結果を格納する
		ContextResponseAbstract response=null;
//		requestからweb,コンソール化を取得
		String environment=getEnvironment();
		if(environment.equals("WEB")) {
			response=new WEBResponseContext();
		}
		
		
		response.setResponse(result);
		response.setTarget("result");
		
//		表示先のJSPを指定
		return response;
	}

}
