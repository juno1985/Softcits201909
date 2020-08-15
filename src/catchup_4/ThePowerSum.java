package catchup_4;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ThePowerSum {

    // Complete the powerSum function below.
    static int powerSum(int X, int N) {

    
    	return findWays(X, 1, N);
    

    }
    
    static int findWays(int sum, int num, int power) {
    
    	//如果有num
    	int remains = sum - (int)Math.pow(num, power);
    
    	if(remains == 0) return 1;
    	else if(remains < 0) return 0;
    	else {
    		return findWays(remains, num+1, power) 
    				+ findWays(sum, num+1, power);
    	}
    	
    }
  

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
