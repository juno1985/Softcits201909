package lesson7;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EqualizetheArray {

	// Complete the equalizeArray function below.
	static int equalizeArray(int[] arr) {
		int max = 0;
		int[] x = new int[100];
	
		//先遍历arr数组然后叠加到x数组中
		for(int i=0;i<arr.length;i++)
		{
			x[arr[i]-1]++;
		}
		int update_max = 0;
		//再遍历一次x数组找到最大值
		for(int i=0;i<x.length;i++) {
			if(x[i] > update_max) update_max = x[i];
		}
		
		
		return arr.length - update_max;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int result = equalizeArray(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
