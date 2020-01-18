package lesson10.strategyPattern;
//银行取钱算法
public class Withdraw implements AbstractStrategy {

	@Override
	public void action() {
		
		System.out.println("插入银行卡");
		System.out.println("输入密码");
		System.out.println("输入取钱金额");

	}

}
