package lesson5.oop;

/*import lesson5.oop.model.Human;
import lesson5.oop.model.Animal;*/

import lesson5.oop.model.*;

public class Oop {

	public static void main(String[] args) {
		
		Swimmer swimmer = new Swimmer();
		
		swimmer.setAge(30);
		swimmer.setGender("Male");
		swimmer.setName("Jason");
		
		swimmer.run();
		
		swimmer.swim();
		
	}

}
