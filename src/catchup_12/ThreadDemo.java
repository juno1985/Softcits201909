package catchup_12;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		System.out.println(getName());
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		ThreadDemo td = new ThreadDemo();
		
		td.start();
		

	}

}
