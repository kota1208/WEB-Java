package context;

import javax.servlet.http.HttpServletResponse;


public class WEBResponseContext extends ContextResponseAbstract{
	private HttpServletResponse httpResponse;
	public HttpServletResponse getHttpResponse() {
		return httpResponse;
	}
	

	
//	Dispatcher先の指定
	private String target;
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}


}
