package chapter1;

public class VariableDemo {
	
	public void demo() {
		//类型隐式转换, 类型提升
		byte a = 5;
		
		System.out.println(a + 123);
	}
	
	public void strDemo() {
		String a = "aaa";
	
		String b = "bbb";
		
		a = a + b;//"aaabbb"
	}
	
	public int and() {
		int a = 4;
		int b = 1;
		return a & b;
	}
	
	public int or() {
		int a = 4;
		int b = 1;
		return a | b;
	}
	
	public int multiple() {
		int a = 4;
		
		return a << 1;
		
	}
	
	public int div() {
		int a = 4;
		return a >> 1;
	}
	
	public void floatDemo() {
		float f = 1.0f;
		System.out.println(f/2);
	}
	
	public static void main(String[] args) {
		VariableDemo vd = new VariableDemo(); 
		//System.out.println(vd.or());
		//System.out.println(vd.div());
		//vd.floatDemo();
		/*
		 * VariableDemo vd = new VariableDemo(); 
		 * vd.demo();
		 */
		/*
		 * VariableDemo vd = new VariableDemo(); vd.strDemo();
		 * 
		 * 
		 * byte[][] arr = new byte[2][2];
		 * 
		 * arr[0][0] = 1; arr[0][1] = 2; arr[1][0] = 3; arr[1][1] = 4;
		 * 
		 * byte[] arr1 = arr[0]; byte[] arr2 = arr[1];
		 */
		/*
		 * arr1[0] //1 
		 * arr1[1] //2
		 */		
		
		boolean aa = false;
		boolean bb = false;
		
		int[] arr = {1,2,3};
		System.out.println("for cycle");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//foreach
		System.out.println("foreach cycle");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		
		final int t = 5;
		t = 6;
		
		final int[] int_arr = {1,2,3};
		int_arr[0] = 2;
		
		int_arr= new int[2];
		
	}
	
	
}
