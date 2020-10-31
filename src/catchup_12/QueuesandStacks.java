package catchup_12;

import java.io.*;
import java.util.*;

public class QueuesandStacks {
    // Write your code here.
	
	Stack<Character> stack = new Stack<>();
	LinkedList<Character> queue = new LinkedList<>();

	private void enqueueCharacter(char c) {
		queue.addLast(c);
		
	}

	private void pushCharacter(char c) {
		stack.push(c);
		
	}
	
	private Object dequeueCharacter() {
		
		return queue.removeFirst();
	}

	private Object popCharacter() {
		return stack.pop();
	}

	
	
	
	
	
	
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesandStacks p = new QueuesandStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

	
}