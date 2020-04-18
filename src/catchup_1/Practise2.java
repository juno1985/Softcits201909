package catchup_1;

public class Practise2 {
	/**
	 * 下面的函数会输出所有比limit小的并且可以被7整除的数字
	 * @param limit
	 */
	public static void divisibleBySeven(int limit) {
		int i = 1;
		while(i <= limit) {
			if(i%7 == 0)
				System.out.println(i);
			
			i++;
		}
	}

	public static void main(String[] args) {
	
		
		divisibleBySeven(100);
	}
}
