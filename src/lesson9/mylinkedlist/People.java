package lesson9.mylinkedlist;

public class People {
	
	String id;
	Integer age;
	
	public People(String id, Integer a) {
		this.id = id;
		this.age = a;
	}

	@Override
	public String toString() {
		return this.id + " " + this.age;
	};
	
	

}
