package catchup_11.communication;

public class Test {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		ThreadNotify threadNotify = new ThreadNotify(obj, "notify线程");
		ThreadWait threadWait = new ThreadWait(obj, "wait线程");
		
		threadWait.start();
		threadNotify.start();

	}

}
