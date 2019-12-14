package lesson8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingtheRecords {

	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {

		//保存破纪录的结果
		// x_arr[0] 保存打破最好记录次数
		// x_arr[1] 保存打破最差记录次数
		int[] x_arr = new int[2];
		
		int a = 0, b = 0, min = scores[0], max = scores[0];
		//遍历成绩数组
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
				a++;
			}
			if (scores[i] > max) {
				max = scores[i];
				b++;
			}
		}
		x_arr[1] = a;

		x_arr[0] = b;

		return x_arr;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] scores = new int[n];

		String[] scoresItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int[] result = breakingRecords(scores);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
