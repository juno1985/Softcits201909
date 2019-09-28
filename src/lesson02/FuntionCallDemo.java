package lesson02;

import java.util.Scanner;

public class FuntionCallDemo {
	
	/**
	 * 
	 *  a + b * c
	 *  
	 *  第一步: 主函数向calculate 传值a,b,c
	 *  第二部：calculate调用函数multiple，并得到b*c的值
	 *  第三部：calculate调用函数add负责a+b*c
	 *  第四部：calculate将结果返回给main函数
	 *  第五步: main函数将结果打印
	 * 
	 *  备注运算符:  +	-	*	/ %
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int answer = calculate(a,b,c);
		System.out.println(answer);
		
		
	}
	
	public static int calculate(int a, int b, int c) {
		int m = multiple(b,c);
		int result = add(a,m);
		return result;
	}
	
	public static int multiple(int a, int b) {
		return a*b;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}

}
