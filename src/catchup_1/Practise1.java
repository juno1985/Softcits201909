package catchup_1;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入税前工资");
		
		int salary = scan.nextInt();
		
		int earning = grossEarning(salary);
		
		System.out.println("税后工资: " + earning);
	
	}
	
	public static int grossEarning(int salary) {
		
		salary -= (int) (salary * 0.2);
		
		salary += 139;
		
		return salary;
	}

}
