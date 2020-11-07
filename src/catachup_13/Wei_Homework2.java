package catachup_13;
/*
 * 用三个线程，按顺序打印1~30，要求线程1打印1~3，然后线程2打印4~6，线程3打印7~9，线程1打印10~12，线程2打印13~15 。。。
 * 以此类推
 */

import java.util.concurrent.atomic.AtomicInteger;

public class Wei_Homework2 {

	public static void main(String[] args) {
		AtomicInteger controler=new AtomicInteger();
		AtomicInteger number=new AtomicInteger(1);
		new Sequentialprinting(controler,number,30).start();
		new Sequentialprinting(controler,number,24).start();
		new Sequentialprinting(controler,number,27).start();
	}
}

class Sequentialprinting extends Thread{
	AtomicInteger controler;
	AtomicInteger number;
	int max;
	static final String Threadname[]= {"Thread-0","Thread-1","Thread-2"};
	public Sequentialprinting(AtomicInteger controler,AtomicInteger number,int max) {
		this.controler=controler;
		this.number=number;
		this.max=max;
	}
	public void run() {
		synchronized(controler) {
			while(number.get()<=max-2) {
				while(!Threadname[controler.get()%3].equals(this.getName())) {								
					try {
						controler.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}					
				}
				if(number.get()<=max) {											
					System.out.print(Thread.currentThread().getName()+"打印：");
					for(int n=1;n<=3;n++) {
						
						System.out.print(number+" ");
						number.getAndIncrement();						
					}
					System.out.println("");
				}																
				controler.getAndIncrement();
				controler.notifyAll();
			}
		}
	}	
}
