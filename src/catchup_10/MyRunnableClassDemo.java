package catchup_10;

public class MyRunnableClassDemo {

	public static void main(String[] args) {
		
		MyRunnableClass myRunnable = new MyRunnableClass();
		//两个线程可以共享同一个Runnabe具体实现类的实例的变量
		Thread th1 = new Thread(myRunnable, "thread-1");
		Thread th2 = new Thread(myRunnable, "thread-2");
		
		th1.start();
		th2.start();

	}

}
