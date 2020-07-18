import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

    	

    }
    
    /**
     * 
     * 	1234 % 10
			shang  yu
				123	4
		123 % 10
				12	3
		12 % 10
				1	2
		1 % 10
				0 	1
     * 
     */
    
    static int getReverse(int t) {
    	String s = "";
    	while(t > 0) {
    		s = s + t%10;
    		t /= 10;
    	}
    	
    	s= "4321";
    	int result = 1 + 2*10 + 3 * 10 ^ 2 + 4 * 10 ^3;
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
