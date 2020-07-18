package catchup_3;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Beautiful_Days_at_the_Movies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
    	
    	int beautifulDay = 0;

    	for(int n=i; n <= j; n++) {
    		
    		int reverse_int = getReverse(n);
    		
    		int abs = n - reverse_int;
    		
    		if(abs < 0) abs *= -1;
    		
    		if(abs % k == 0) beautifulDay++;
    	}

    	return beautifulDay;
    }
    
    static int getReverse(int t) {
    	
    	String reverse = "";
    	
    	// 123 -> "123"
    	String str = Integer.toString(t);
    	char[] arr = str.toCharArray();
    	// back to front
    	for(int i = arr.length-1; i>=0; i--) {
    		/**
    		 * reverse "" 	arr[2]='3'
    		 * 
    		 * reverse="3"
    		 * 
    		 * arr[1]='2'
    		 * 
    		 * reverse="32"
    		 * 
    		 * arr[0]='1'
    		 * 
    		 * reverse="321"
    		 */
    		reverse += arr[i];
    	}
    	//convert String type to Integer
    	return Integer.parseInt(reverse);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

     
        scanner.close();
    }
}
