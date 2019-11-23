package lesson6;

public class Person {

	public String name;
	
	
	//如果该类中有带参的构造函数，就必须显式写明无参的构造函数
	public Person() {
		
	}


	//如果显式写了带参构造函数，就会覆盖掉默认的无参构造函数
	public Person(String name) {
		this.name = name;
	}
	
	// p1.isEqual(p2)  --> true
	
	public boolean isEqual(Person p) {
		
	 return this.name	 == p.name;
		
	}

}
