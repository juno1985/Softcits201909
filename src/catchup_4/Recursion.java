package catchup_4;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Recursion {

	// Complete the factorial function below.
	static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return factorial(n - 1) * n;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int result = factorial(n);

		System.out.println(result);

		scanner.close();
	}
}
