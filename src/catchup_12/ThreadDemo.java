package catchup_12;

public class ThreadDemo extends Thread {
	
	

	@Override
	public void run() {
		System.out.println();
	}

	public static void main(String[] args) {
		
		ThreadDemo td = new ThreadDemo();
		
		td.getName();
		
		Thread.currentThread().getName();

	}

}
