package lesson10;

public class Test {
	
//	int a = 1;

	public static void main(String[] args) {
		
		
		//内部类对象的生成是通过外部类对象生成的
		Outer out = new Outer();
		//静态内部类对象可以直接生成，不需要通过外部类对象
		Outer.Inner in = new Outer.Inner();
		
	//	Outer.Inner in1 = new Outer().new Inner();
		
		System.out.println(out.a);
		
		in.setA();
		
		System.out.println(out.a);
		
//		a=2;

	}

}
