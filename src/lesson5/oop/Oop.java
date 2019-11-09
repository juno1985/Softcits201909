package lesson5.oop;

/*import lesson5.oop.model.Human;
import lesson5.oop.model.Animal;*/

import lesson5.oop.model.*;

public class Oop {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.setName("wang");
		
		Animal a1 = new Animal();
		a1.setCategory("dog");
		a1.setName("wang cai");
	
		h1.run();
		a1.run();
	}

}
