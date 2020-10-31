package catchup_12;

import java.io.IOException;

/**
 * 
 * Notify/ NotifyAll difference
 *
 * 
 * @author thinkpad
 *
 */

public class NotifyAndNotifyAll extends Thread {
	//在此对象进行nofity/notifyAll() & wait()通信
	Object lock;

	//通过构造器传入锁对象
	public NotifyAndNotifyAll(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is waiting for lock");
		synchronized(lock) {
			try {
				System.out.println(Thread.currentThread().getName() + " has obtained the lock, will be waiting ...");
				lock.wait();
				System.out.println(Thread.currentThread().getName() + " has been notified, go on ...");
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Object lock = new Object();
		//创建五个线程
		for(int i = 0; i < 5; i++) {
			NotifyAndNotifyAll thread = new NotifyAndNotifyAll(lock);
			thread.start();
		}
		
		Thread.sleep(1000);
		
		//主线程去唤醒
		synchronized(lock) {
			//lock.notify();
			lock.notifyAll();
		}
		
		//阻塞主线程，使其不能结束，目的是为了让上面的5个子线程运行完
		System.in.read();

	}

}
