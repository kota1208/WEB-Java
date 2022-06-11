package command;
import context.ContextResponseAbstract;

public abstract class AbstractCommand {

//	それぞれの環境に合わせて、リクエストを格納
	private Object request;
	
	private String environment;
	
	
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public Object getRequest() {
		return request;
	}
	public void setRequest(Object request) {
		this.request=request;
	}
	
	
	private Object parameter;
	public Object getParameter() {
		return parameter;
	}
	public void setParameter(Object parameter) {
		this.parameter = parameter;
	}
	

	public abstract ContextResponseAbstract execute()throws Exception;
}
