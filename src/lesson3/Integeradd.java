package lesson3;

import java.util.Scanner;

public class Integeradd {

	public static void main(String[] args) {
		// 输入键盘
		Scanner scan = new Scanner(System.in);
	    int a=scan.nextInt();
		
	    //打印 从1至该数的总和
		int i,sum;
		sum = 0;
		for(i=1;i<=a;i++) {
			
			sum+=i;
		
		}

		System.out.println(sum);
	}

}