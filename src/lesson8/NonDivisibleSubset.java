package lesson8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
    // Write your code here

    	Integer [] arr = new Integer[s.size()];
        s.toArray(arr);
        
        if(s.size()==1) return 1;
        
        //放余数的个数，arr1数组的小标 0~k-1 表示余数
        int arr1[]  = new int[k];
        for(int i=0;i<arr.length;i++){
           arr1 [arr[i]%k]++;
        }
        int count = 0;
        //余数是零的情况
        if(arr1[0]>1)count++;
        for(int i=1;i<((k/2)+1);i++){
            if(i!=(k-i)){
                if(arr1[i]>arr1[k-i])count+=arr1[i];
                else count+=arr1[k-i];
            }
        }
        //如果k=4,但是没有余数为2的情况，岂不是下面还+1了？
        if(k%2==0 && arr1[k/2] > 0)count+=1;
         return count;
    }

}

public class NonDivisibleSubset {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
