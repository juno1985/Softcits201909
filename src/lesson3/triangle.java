package lesson3;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// 键盘输入
		Scanner scan = new Scanner(System.in);
	    int a=scan.nextInt();

		for(int i=0;i<a;i++){
			//打印空格
			for(int j=a-i;j>0;j--){

				System.out.print(" ");
			}
			//打印*

			for(int j=1;j<=i+1;j++){

				System.out.print("*");

			}
			//打印回车
			System.out.println();
		}

	}

}