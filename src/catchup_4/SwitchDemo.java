package catchup_4;

public class SwitchDemo {

	public static void main(String[] args) {
		
		getSeason(5);

	}
	
	public static void getSeason(int num) {
		
		switch(num) {
			case 1: System.out.println("Spring");
			case 2: System.out.println("Summer");
			case 3: System.out.println("Fall"); break;
			case 4: System.out.println("Winter");
			default: System.out.println("No match");
		}
	}

}
