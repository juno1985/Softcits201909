package catchup_9;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

    	double tip_double = tip_percent * (double)1.0 / 100;
    	double tax_double = tax_percent * (double)1.0 / 100;
    	
    	double result = meal_cost + meal_cost * tip_double + meal_cost * tax_double;
    	//整数部分
    	int digits = (int) result;
    	//获得小数部分
    	double decimals = result - digits;
    	
    	int first_decimal = (int)(decimals * 10);
    	
    	if(first_decimal > 4) digits++;
    	
    	System.out.println(digits);
    	
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
