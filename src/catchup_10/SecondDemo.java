package catchup_10;

public class SecondDemo extends Thread {
	
	

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++)
		System.out.println(Thread.currentThread().getName() + " --> " + i);
	}

	public static void main(String[] args) {
		//创建第一个线程
		SecondDemo thread1 = new SecondDemo();
		//创建第二个线程
		SecondDemo thread2 = new SecondDemo();
		
		//现成的触发是调用start方法，而非run方法
		thread1.start();
		thread2.start();
	}

}
