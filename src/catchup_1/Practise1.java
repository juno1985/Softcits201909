package catchup_1;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入税前工资");
		
		int salary = scan.nextInt();
		
		salary -= (int) (salary * 0.2);
		
		salary += 139;
		
		System.out.println(salary);
	}

}
