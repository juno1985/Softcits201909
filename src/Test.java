import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//2
		int a = scan.nextInt();
		//3
		int b = scan.nextInt();
		
		int c = add(a,b);
		
		System.out.println(c);
	}

	//形式参数
	public static int add(int aa, int bb) {

		return aa+bb;
	}
	
	
}
