package lesson5.oop.model;

import lesson5.oop.action.AbstractAction;

public class Animal extends Creature implements AbstractAction{
	
	
	//具体什么动物
	private String category;
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	public void run() {
		
		System.out.println(this.category + " " + this.getName() + " is running");
	}
	@Override
	public void breath() {
		System.out.println("用鳃呼吸");
		
	}
	

}
