package lesson6;

public class Demo {

	public static void main(String[] args) {
		//默认构造方法
		Person p1 = new Person();
		p1.name="xiao wang";
		
		
		Person p2 = new Person("xiao wang");
		
	//	System.out.println( p1 == p2 );	// false ? true ?
		
		System.out.println(
				p1.isEqual(p2)
				); // true
	
	}

}
