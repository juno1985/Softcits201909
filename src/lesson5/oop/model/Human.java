package lesson5.oop.model;

import lesson5.oop.action.AbstractAction;

// 面向对象的三大特性
//第一个： 封装
public class Human extends Creature implements AbstractAction{
	
	@Override
	public void run() {
		System.out.println( this.getName() + " is running");
	}
	
	
}
