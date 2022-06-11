package db.connector;

import java.sql.Connection;

public interface SQLConnector {
	//dbに接続を行うインターフェース
	Connection getConnection()throws Exception;
}
