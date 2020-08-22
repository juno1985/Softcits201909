package catchup_5;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayDS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	
    	int result = java.lang.Integer.MIN_VALUE;
    	
    	for(int row = 0; row <= 3; row++) {
    		for(int col = 0; col <=3; col++) {
    			int tmp = getSumOfHourGlass(row, col, arr);
    			if(tmp > result) result = tmp;
    		}
    	}

    	return result;

    }
    //以左上角的坐标为标准，形成的漏斗的计算合
    static int getSumOfHourGlass(int upper_left_row, int upper_left_col, int[][] arr) {
    	//第一行三个元素
    	int sum = arr[upper_left_row][upper_left_col] + arr[upper_left_row][upper_left_col + 1] + arr[upper_left_row][upper_left_col + 2];
    	//第二行一个元素
    	sum += arr[upper_left_row + 1][upper_left_col + 1];
    	//第三行三个元素
    	sum += arr[upper_left_row + 2][upper_left_col] + arr[upper_left_row + 2][upper_left_col + 1] + arr[upper_left_row + 2][upper_left_col + 2];
    	return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
