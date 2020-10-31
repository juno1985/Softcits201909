package catchup_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	public static void main(String[] args) throws Exception {
		// 创建一个具有固定线程数（6）的线程池
		//ExecutorService pool = Executors.newFixedThreadPool(2);
		// 创建一个具有单线程数的线程池
		//ExecutorService pool = Executors.newSingleThreadExecutor();
		// 创建一个最大具有Integer.MAX_VALUE/最小为0的线程池
		ExecutorService pool = Executors.newCachedThreadPool();
		// 向线程池中提交两个线程-匿名类
		pool.submit(new Runnable() {

			@Override
			public void run() {
				Thread.currentThread().setName("子线程1");
				for (int i = 0; i < 10; i++) {
					System.out.println(
							Thread.currentThread().getName() + " 执行次数: " + i);
				}

			}
		});

		pool.submit(new Task());
		// 关闭线程池
		pool.shutdown();
	}
}

class Task implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setName("子线程2");
		for (int i = 0; i < 15; i++) {
			System.out.println(
					Thread.currentThread().getName() + " 执行次数: " + i);
		}
		
	}
	
}
