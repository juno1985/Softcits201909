package catchup_9;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loops {



    private static final Scanner scanner = new Scanner(System.in);
    
    private static final int num = 10;

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        
        for(int i = 1; i <= num; i++) {
        	System.out.println(n + " x " + i + " = " + n * i);
        }
        
        
        
    }
}
