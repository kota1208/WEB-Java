package factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import db.dao.DAOInterface;
import exception.CreateException;

public class DAOFactory {
	public static DAOInterface getInstance(String instanceName)throws CreateException {
		DAOInterface dao=null;

		try {
			Properties properties=new Properties();
		    String filePath="C:\\Users\\kota\\git\\HelloWeb\\PropertiesFolder\\dao.properties";

			properties.load(new FileInputStream(filePath));
			String className=properties.getProperty(instanceName);

			Class c=Class.forName(className);
			dao=(DAOInterface)c.newInstance();

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			throw new CreateException(e);
		} catch (FileNotFoundException e2) {
			// TODO: handle exception
			throw new CreateException("システムのえラーです。エラー内容:プロパティファイルが見つかりませんでした");
		} catch (Exception e3) {
			// TODO: handle exception
			throw new CreateException(e3);
		}

		return dao;
	}
}
