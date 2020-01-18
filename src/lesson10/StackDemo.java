package lesson10;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.add("aa");
		stack.add("bb");
		stack.add("cc");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
