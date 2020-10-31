package catchup_12;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class IntegerUnsafeDemo extends Thread {
	
	static AtomicInteger t = new AtomicInteger(100);
	
//	static Object lock = new Object();

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//	synchronized(lock) {
				if(t.get() <= 0) break;
				System.out.println(Thread.currentThread().getName() + "买了一张票，余票数: " + t.decrementAndGet());
				
		//	}
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		for(int i = 0; i < 5; i++) {
			IntegerUnsafeDemo thread = new IntegerUnsafeDemo();
			thread.start();
		}
		
		while(true) {
	//		synchronized(IntegerUnsafeDemo.lock) {
				Thread.sleep(1000);
				if(IntegerUnsafeDemo.t.get() <= 0) {
					System.out.println("主线程查询余票为零");
					break;
				}
				System.out.println("主线程查询当前余票: " + IntegerUnsafeDemo.t.get());
			}
	//	}
	
		System.in.read();
	}

}
