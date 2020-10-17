package catchup_10;

public class VisitFieldDemo {

	public static void main(String[] args) {
		
		SecondDemo thread1 = new SecondDemo();
		thread1.s = "thread1 String";
		SecondDemo thread2 = new SecondDemo();
		thread2.s = "thread2 String";
		
		System.out.println(thread1.s);
		System.out.println(thread2.s);

	}

}
