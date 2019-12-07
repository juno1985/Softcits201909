package lesson7;

public class Demo {

	public static void main(String[] args) {
		
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println(p1.getId());
		System.out.println(p2.getId());
		
		//类.静态方法
		Person.getNum();
		//对象.普通方法
		p1.getId();
		//虽然编译器不报错，但是绝对不赞成
		p1.getNum();
		//普通方法绝对不可以用类去直接调用，必须通过对象
		Person.getId();

	}

}
