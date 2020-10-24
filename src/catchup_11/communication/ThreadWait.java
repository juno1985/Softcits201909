package catchup_11.communication;

public class ThreadWait extends Thread {
	
	Object obj;
	

	public ThreadWait(Object obj) {
		this.obj = obj;
	}




	@Override
	public void run() {
		//锁住obj
		synchronized(obj) {
			System.out.println(getName() + "进入synchronized代码块");
			
			try {
				System.out.println(getName() + " 线程进入WAITING状态");
				//wait会释放线程当前持有的锁
				obj.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(getName() + " 被唤醒了，并继续执行");
			
		}
	}
	
	

}
