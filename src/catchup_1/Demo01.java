package catchup_1;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {

		/*
		 * String a = "abc";
		 * 
		 * String b = new String("abc");
		 * 
		 * String b = "abc";
		 * 
		 * System.out.println(a == b);
		 */
		/*
		 * int x = 12;
		 * 
		 * int y = x > 10 ? 10 : 0;
		 * 
		 * if(x > 10) y = 10;
		 * 
		 * else x = 0;
		 * 
		 * 
		 * 
		 * System.out.println(y);
		 */
		
		
		 Scanner scan = new Scanner(System.in);
		 
		 String str = scan.next();
		 switch (str){
		 case "1":
			 System.out.println("abc");
			 break;
		 case "2":
			 System.out.println("def");
		 case "3":
			 System.out.println("ghi");
			 break;
		 default:
			 System.out.println("xyz");
		 }
		 
		 
		 
		 //循环十次
		 
		 for(int i=1; i<=10; i++) {
			 
			 System.out.println(i);
			 
		 }

	}

}
