package catchup_11;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {
	
	static final int corePoolSize = 2;
	static final int maximumPoolSize = 4;
	static final long keepAliveTime = 1000L;
	static final TimeUnit timeunit = TimeUnit.NANOSECONDS;

	public static void main(String[] args) {
		
		ThreadFactory threadFactory = new MyThreadFactory();
		RejectedExecutionHandler handler = new MyRejectedExecutionHandler();
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
		ThreadPoolExecutor threadPoolExecutor = new
				ThreadPoolExecutor(corePoolSize,
					                maximumPoolSize,
					                keepAliveTime,
					                timeunit,
					                workQueue,
					                threadFactory,
					                handler);
	
		threadPoolExecutor.prestartAllCoreThreads(); // 预启动所有核心线程
		
		//创建8个线程
		for(int i = 1; i <= 8; i++) {
			MyTask myTask = new MyTask("thread-" + i);
			threadPoolExecutor.execute(myTask);
		}
		
		
		// 阻塞主线程
		/*
		 * Scanner scan = new Scanner(System.in);
		 *  scan.nextLine();
		 */
	}
	
	static class MyThreadFactory implements ThreadFactory{

		@Override
		public Thread newThread(Runnable r) {
			Thread thread = new Thread(r);
			return thread;
		}
		
	}
	
	static class MyTask implements Runnable{
		//记录线程名字
		private String threadName;

		public MyTask(String threadName) {
			
			this.threadName = threadName;
		}


		@Override
		public void run() {
			
			System.out.println(this.threadName + "处理开始");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.threadName + "处理完成");
		}


		@Override
		public String toString() {
			
			return this.threadName;
		}
		
		
		
	}
	
	static class MyRejectedExecutionHandler implements RejectedExecutionHandler{

		@Override
		public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
			
			System.out.println(r.toString() + " 被拒绝了");
			
		}
		
	}

}
