package lesson5.oop;

/*import lesson5.oop.model.Human;
import lesson5.oop.model.Animal;*/

import lesson5.oop.model.*;

public class Oop {

	public static void main(String[] args) {
		
		String a = "accvc";
		
		
		Human h1 = new Human();
		
		System.out.println(h1.getGender());
		
		h1.setGender("male");
		
		System.out.println(h1.getGender());
		
		Human h2 = new Human();
		
		h2.setGender("female");
		
	}

}
