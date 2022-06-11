package context;

import java.util.Map;

public abstract class ContextRequestAbstract {

//	リクエストを格納するコンテキスト
	protected Object request;
//	パラメータを格納
	protected Map<String,String[]>parameter;
	
	public Object getRequest() {
		return request;
	}
	public void setRequest(Object request) {
		this.request = request;
	}
	public Map<String, String[]> getParameter() {
		return parameter;
	}
	
//	処理を行うリクエストを格納
	public abstract void setParameter(Object parameter);


}
