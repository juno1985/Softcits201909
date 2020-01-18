package lesson10.strategyPattern;
//银行转账算法
public class CashTransfer implements AbstractStrategy {

	@Override
	public void action() {
		
		System.out.println("输入出账账户");
		System.out.println("输入入账账户");
		System.out.println("输入转账金额");

	}

}
