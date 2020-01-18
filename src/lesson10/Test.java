package lesson10;

public class Test {

	public static void main(String[] args) {
		
		//内部类对象的生成是通过外部类对象生成的
		Outer out = new Outer();
		
		Outer.Inner in = out.new Inner();
		
		Outer.Inner in1 = new Outer().new Inner();

	}

}
