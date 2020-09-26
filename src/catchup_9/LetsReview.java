package catchup_9;


import java.io.*;
import java.util.*;

public class LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner scan = new Scanner(System.in);
    	
    	int num = scan.nextInt();
    	
    	scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	
    	while(num-- > 0) {
    		String str = scan.nextLine();
    		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    		
    		char[] arr = str.toCharArray();
    		
    		StringBuilder even_sb = new StringBuilder();
    		StringBuilder odd_sb = new StringBuilder();
    		
    		for(int i = 0; i < str.length(); i++) {
    			if(i % 2 == 0) even_sb.append(arr[i]);
    			else odd_sb.append(arr[i]);
    		}
    		
    		System.out.println(even_sb.toString() + " " + odd_sb.toString());
    	}
    
    
    }
}