package db.dao;

public interface DAOInterface {
	//データを格納する
		public Object insert(Object request)throws Exception;
//		データをすべて表示
		public Object show() throws Exception;
		
//		データのアップデート
		public Object update(Object request)throws Exception;
		
//		データの削除
		public Object delete(Object request)throws Exception;
}
