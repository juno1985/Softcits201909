package catchup_11.communication;

public class ThreadNotify extends Thread {
	
	Object obj;

	public ThreadNotify(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		//锁住obj
		synchronized(obj) {
			System.out.println(getName() + "进入synchronized代码块");
			try {
				//间隔1秒再去唤醒
				sleep(5000);
				System.out.println(getName() + " 调用notifyAll方法");
				obj.notifyAll();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
