package lesson04;

import java.util.Scanner;

public class Practicse02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		
		int result[] = accumulate(d);

	}
	
	public static  int add(int X) {
		int result = 0;
		for(int i=1;i<=X;i++)
		{
			//result = result + i;
			result += i;
		}
		return result;
	}
	
	public static int[] accumulate(int X) {
		int[] result = new int[X+1];
		
		for(int i=0; i<X;i++) {
			result[i] = add(i);
		}
		
		return result;
	}

}
