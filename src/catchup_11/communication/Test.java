package catchup_11.communication;

public class Test {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		ThreadNotify threadNotify = new ThreadNotify(obj);
		ThreadWait threadWait = new ThreadWait(obj);
		
		threadWait.start();
		threadNotify.start();

	}

}
