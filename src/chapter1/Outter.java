package chapter1;

public class Outter {

	public static void main(String[] args) {
		
		/*
		 * Inner in = new Outter().new Inner();
		 * 
		 * Inner in1 = new Inner();
		 */
		
		Inner in2 = new Outter.Inner();
	}
	
	public static class Inner{
		public void test() {
			System.out.println("test");
		}
	}

}
