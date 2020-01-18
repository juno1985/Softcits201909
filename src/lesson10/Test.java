package lesson10;

public class Test {
	
//	int a = 1;

	public static void main(String[] args) {
		
		
		//内部类对象的生成是通过外部类对象生成的
		Outer out = new Outer();
		
		Outer.Inner in = out.new Inner();
		
		System.out.println(out.a);
		
		in.setA();
		
		System.out.println(out.a);
		
//		a=2;

	}

}
