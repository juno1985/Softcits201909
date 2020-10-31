package catchup_12.pratice.p2;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyArrayBlockingQueue {

	public static final Runnable Shengchanzhe = null;

	public static void main(String[] args) {
		
		
		BlockingQueue<Xiaoxi> Xx = new ArrayBlockingQueue<>(5);
        Shengchanzhe scz = new Shengchanzhe(Xx); 
       
        
        Xiaofeizhe xfz = new Xiaofeizhe(Xx);
        
        new Thread(scz).start();
        new Thread(xfz).start();
        
        	
	}
				
}
	
