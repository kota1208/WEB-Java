package command;

import context.WEBResponseContext;

public class ShowAddCommand extends AbstractCommand {

	@Override
	public WEBResponseContext execute() {
		// TODO 自動生成されたメソッド・スタブ
		WEBResponseContext responseContext=new WEBResponseContext();
		responseContext.setTarget("add");
		return responseContext;
	}


}
