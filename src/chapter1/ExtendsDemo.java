package chapter1;

public class ExtendsDemo extends Parent{
	
	int b;
	
	public ExtendsDemo() {
		System.out.println("call ExtendsDemo()");
	}

	public ExtendsDemo(int b) {
		this.b = b;
		System.out.println("call ExtendsDemo(b)");
	}



	public static void main(String[] args) {
		//ExtendsDemo ed = new ExtendsDemo();
		ExtendsDemo ed = new ExtendsDemo(1);
	}
}

class Parent{
	
	int a;

	public Parent() {
		System.out.println("call Parent()");
	}

	public Parent(int a) {
		this.a = a;
		System.out.println("call Parent(a)");
	}
	
	
	
}
