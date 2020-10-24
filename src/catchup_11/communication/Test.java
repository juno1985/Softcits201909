package catchup_11.communication;

public class Test {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		ThreadNotify threadNotify = new ThreadNotify(obj, "notify线程");
		ThreadWait threadWait1 = new ThreadWait(obj, "wait1线程");
		ThreadWait threadWait2 = new ThreadWait(obj, "wait2线程");
		
		threadWait1.start();
		threadWait2.start();
		threadNotify.start();

	}

}
