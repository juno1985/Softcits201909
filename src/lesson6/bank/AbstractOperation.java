package lesson6.bank;

import java.util.Random;

public abstract class AbstractOperation {
	public int queue_up() {
		Random rm = new Random();
				
		return rm.nextInt(100)+1;
	}
	
	public abstract void operation(int number);
	
	
	public void comment() {
		System.out.println("业务完毕，对服务进行评价, 非常好！！！");
	}
	//定义程序流程
	public void operation() {
		int num = queue_up();
		operation(num);
		comment();
	}

}
