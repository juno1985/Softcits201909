package catachup_13;

public class LiuHuan_Homework2 {

	// 用三个线程，按顺序打印1~30，要求线程1打印1~3，然后线程2打印4~6，线程3打印7~9，线程1打印10~12，线程2打印13~15

	public static void main(String[] args) {
		MyThread t1 = new MyThread("线程一", 0);
		MyThread t2 = new MyThread("线程二", 1);
		MyThread t3 = new MyThread("线程三", 2);
		t1.start();
		t2.start();
		t3.start();

	}
}

class MyThread extends Thread {

	static int num = 1;
	static volatile int i = 0;

	int order;
	// 建立线程间通信的对象
	static Object key = new Object();

	public MyThread(String name, int order) {

		super(name);
		this.order = order;

	}

	public void run() {

		synchronized (key) {

			for (; i < 10; i++) {
				// 判断哪个线程去执行
				while (this.order != i % 3) {

					try {
						key.wait();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (i >= 10)
					return;
				for (int j = 0; j < 3; j++) {
					System.out.println(
							Thread.currentThread().getName() + " -> " + num++);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}

				key.notifyAll();

			}

		}
	}

}