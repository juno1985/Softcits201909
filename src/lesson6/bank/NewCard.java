package lesson6.bank;

import java.util.Random;

public class NewCard extends AbstractOperation{

	@Override
	public void operation(int number) {
		System.out.println("拿到号码: " + number);
		System.out.println("办理新的银行卡...");
	}
	
}
