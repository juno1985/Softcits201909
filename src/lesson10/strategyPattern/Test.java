package lesson10.strategyPattern;
//策略模式
public class Test {

	public static void main(String[] args) {
		
		AbstractStrategy withDraw = new Withdraw();
		
		AbstractStrategy cashTransfer = new CashTransfer();
		
		Concret concret = new Concret();
		
		concret.setStrategy(withDraw);
		concret.execute();
		
		concret.setStrategy(cashTransfer);
		concret.execute();

	}

}
