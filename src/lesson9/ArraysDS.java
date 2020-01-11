package lesson9;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArraysDS {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {

    	 for (int i = 0; i < a.length/2; i++) {
         	int b=a[i]; 
         	a[i] = a [a.length - 1 - i];
         	a [a.length - 1 - i]=b;
         }
    	 return a;
    	 
    	
		/*
		 * int[] result = new int[a.length]; 
		 * for (int i = a.length - 1; i >= 0; i--) {
		 * result[a.length - 1 - i] = a[i]; } 
		 * return result;
		 */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
