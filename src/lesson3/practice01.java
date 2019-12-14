package lesson3;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		for (int c = 1; c <= x; c++) {

			for (int b = x - c; b > 0; b--) {

				System.out.print(" ");
			}
			for (int b = 1; b <= c; b++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}
}
