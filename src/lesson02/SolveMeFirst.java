package lesson02;

import java.util.Scanner;

public class SolveMeFirst {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner scan = new Scanner(System.in);
		//2
		a = scan.nextInt();
		//3
		b = scan.nextInt();

		int c = solveMeFirst(a, b);
		System.out.println(c);
		System.out.println("finished!");
		
	}
	
	public static int solveMeFirst(int m, int n) {
			int c = m+n;
			return c;
	}
	
	
}
