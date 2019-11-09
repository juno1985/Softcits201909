package lesson5.oop.model;

import lesson5.oop.action.AbstractAction;
public class Swimmer extends Human implements AbstractAction {
	
	
	public void swim() {
		System.out.println(this.getName() + " " + this.getGender() + " " + this.getAge() + " is swimming");
	}

}
