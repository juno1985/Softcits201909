package lesson7;

public interface Creature {
	
	void walk();
	//默认方法-有方法体的
	default void breath() {
		System.out.println("I can breathe ...");
	}

}
