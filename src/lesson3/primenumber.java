package lesson3;

import java.util.Scanner;

public class primenumber {

	// 判断一个整数是否为质数，是则输出yes，否则输出no

	public static void main(String[] args) {
		// 输入键盘
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		// 判断可不可以被整除
		boolean result = false;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				result = true;

			}
		}
		if (result) {
			System.out.append("No");
		} else {
			System.out.append("Yes");
		}

	}

}