package catchup_10;

public class FirstDemo {
	
	static void print() {
		for(int i = 1; i <= 10; i++)
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}

	public static void main(String[] args) {
		print();

	}

}
