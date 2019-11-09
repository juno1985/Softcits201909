package lesson5;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		byte n = scan.nextByte(); 
	
		 if(n%2!=0) System.out.println("Weird");
		 else if(n>=2 && n<=5) System.out.println("Not Weird");
		 else if(n>=6 && n<=20) System.out.println("Weird");
		 else System.out.println("Not Weird");
		 
		 
		scan.close();
	}

}
