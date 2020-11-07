package catachup_13;

public class ThreadLocalDemo {
	
	// int count = 0;

	//使用ThreadLocal可以让每个线程获得一个变量副本的拷贝
	static ThreadLocal<Integer> count = ThreadLocal.withInitial(() -> {
		return 0;
	});

	public static void main(String[] args) {
		
		Counter th1 = new Counter();
		Counter th2 = new Counter();
		
		th1.start();
		th2.start();

	}

	static class Counter extends Thread {

		@Override
		public void run() {

			for (int i = 0; i < 5; i++) {
				
				int tmp = count.get();
				tmp++;
				System.out.println(Thread.currentThread().getName() + " -> "  + tmp);
				count.set(tmp);
			}
				
		}
	}

}