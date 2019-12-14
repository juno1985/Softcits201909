package lesson3;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		for (int i = 1; i <= a; i++) {
			b = i * a;

			System.out.println();
		}
		System.out.println(a * b);

	}
}
