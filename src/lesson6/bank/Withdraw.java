package lesson6.bank;

import java.util.Random;

public class Withdraw {
	
	public int queue_up() {
		Random rm = new Random();
				
		return rm.nextInt(100)+1;
	}
	
	public void operation(int number) {
		System.out.println("号码到了: " + number);
		System.out.println("在柜台取钱");
	}
	
	public void comment() {
		System.out.println("业务完毕，对服务进行评价");
	}

}
