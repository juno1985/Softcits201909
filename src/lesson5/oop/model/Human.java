package lesson5.oop.model;

import lesson5.oop.action.AbstractAction;


public class Human extends Creature implements AbstractAction{
	
	@Override
	public void run() {
		System.out.println( this.getName() + " is running");
	}

	@Override
	public void breath() {
		System.out.println("ÓÃ·ÎºôÎü");
	}
	
}
