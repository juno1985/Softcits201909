package catchup_8.intergration.business;

import catchup_8.intergration.aop.TradeTransaction;

public class Business implements BusiessInter{

	@TradeTransaction
	public void trade(Boolean flag) {
		System.out.println("存进支付宝");

		System.out.println("从支付宝扣取金额");

		if (flag) {
			
				// 模拟系统发生意外错误
				throw new RuntimeException("系统发生意外错误");
			
		}

		System.out.println("支付宝转移同等资金到余额宝");
	}

}
