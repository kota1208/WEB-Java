package command;

import context.WEBResponseContext;

public class ProductCommand extends AbstractCommand {

	@Override
	public WEBResponseContext execute() {
		// TODO 自動生成されたメソッド・スタブ
		WEBResponseContext responseContext=new WEBResponseContext();
		responseContext.setTarget("product2");
		return responseContext;
	}

}
