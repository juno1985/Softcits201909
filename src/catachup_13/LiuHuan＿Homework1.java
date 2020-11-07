package catachup_13;

public class LiuHuan＿Homework1 {

	// flag==true时，打印数字；

	boolean flag = true;

	// 要打印数字的起始数

	int num = 1;
	//在condition上建立线程通信
	Object condition = new Object();

	// 打印数字
	public void printNumber() throws InterruptedException {

		synchronized (condition) {
			// flag=true的时候继续执行，打印数字
			// false则wait
			while (flag == false) {

				condition.wait();

			}

			System.out.print(num++);

			flag = false;

			condition.notify();
		}

	}

	public void printChar(int i) throws InterruptedException {

		synchronized (condition) {
			while (flag) {

				condition.wait();

			}

			System.out.print((char) ('a' + i));

			flag = true;

			condition.notify();
		}
	
	}

	public static void main(String[] args) {

		LiuHuan＿Homework1 print = new LiuHuan＿Homework1();

		new Thread(new Runnable() {

			@Override

			public void run() {

				for (int i = 0; i < 26; i++) {

					try {

						print.printNumber();

					} catch (InterruptedException e) {

						e.printStackTrace();

					}

				}

			}

		}).start();

		new Thread(new Runnable() {

			@Override

			public void run() {

				for (int i = 0; i < 26; i++) {

					try {

						print.printChar(i);

					} catch (InterruptedException e) {

						e.printStackTrace();

					}

				}

			}

		}).start();

	}

}
