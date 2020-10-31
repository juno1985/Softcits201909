package catchup_12.pratice.p2;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Shengchanzhe implements Runnable {
	 private BlockingQueue<Xiaoxi> Xx;
     
	    public Shengchanzhe(BlockingQueue<Xiaoxi> q){
	        this.Xx=q;
	    }
	    @Override
	    public void run() {
	        for(int i=0; i<50; i++){
	            Xiaoxi xx = new Xiaoxi(""+i);
	            try {
	                Thread.sleep(500);
	                Xx.put(xx);
	                System.out.println("生产者 "+xx.getXiangying());
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        Integer num;
	        Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			if(num != null) {
				new Thread(MyArrayBlockingQueue.Shengchanzhe).notifyAll();

	    }
}
}
