package context;

public abstract class ContextResponseAbstract {
	
//結果を格納
	protected Object response;
	
//	遷移先の指定
	private String target;
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	
//	結果を格納する
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}

}
