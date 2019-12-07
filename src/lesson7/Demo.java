package lesson7;

public class Demo {

	public static void main(String[] args) {
		
		/*
		 * Math math = new Math(); 
		 * math.sqrt(9);
		 */
		//工具类
		Math.sqrt(9);
		
		String str = "ab,cd,ef,gh";
		//取子串
		System.out.println(str.substring(1, 6));
		//
		System.out.println(str.substring(6));
		
		//取间隔符
		String[] result = str.split(",");
		/*
		 * result[0] "ab" 
		 * result[1] "cd" ..
		 */
		for(String s : result) {
			System.out.println(s.length() + " " + s);
		}
		
		
		System.out.println(str.toUpperCase());
		
		long ll = 12378753217391231L;
		
		System.out.println(String.valueOf(ll));
		
		/*
		 * Man man1 = new Man(); Man man2 = new Man();
		 */
	}

}
