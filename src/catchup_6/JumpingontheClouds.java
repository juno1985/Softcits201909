package catchup_6;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingontheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {

    	int n = c.length;
    	
    	int steps = 0;
    	int thunderCloud = 0;
    	//当前所在位置
    	int steppedPos = 0;
    	
    	do {
    		
    		steppedPos = (steppedPos + k)%n;
    		steps++;
    		if(c[steppedPos] == 1) thunderCloud++;
    		
    	}while(steppedPos != 0);//The game ends when Aerith lands back on cloud
    	
    	return 100 - steps - 2 * thunderCloud;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
