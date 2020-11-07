package catachup_13;

public class Wei_Homework1 {

	public static void main(String[] args)  {
		Object object = new Object();
		new Printnumber(object).start();
		new PrintAlphabet(object).start();
		
	}
}

class Printnumber extends Thread {
	Object object;
	public Printnumber(Object object) {
		this.object=object;
	}
	public void run() {
		synchronized(object) {
			
			for(int i=1;i<=10;i++) {
				object.notifyAll();
				System.out.print(i);					
				try {
					object.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class PrintAlphabet extends Thread{
	Object object;
	public PrintAlphabet(Object object) {
		this.object=object;
	}
	public void run() {
		synchronized(object) {
			
			for(char c= 'a';c<='j';c++) {
				object.notifyAll();
				System.out.print(c);
				/*
				 * 为避免造成死等，等线程打印完成跳出循环，打印字母线程执行完run方法后死亡，线程自然也就释放了锁；
				 * 打印数字的线程继续被唤醒不再等待，并且执行完run方法后死亡。
				 */
				if(c=='j') {
					break;
				}
				try {
					object.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}	
}



