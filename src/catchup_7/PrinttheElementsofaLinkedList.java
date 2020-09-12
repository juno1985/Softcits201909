package catchup_7;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrinttheElementsofaLinkedList {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	static void printLinkedList(SinglyLinkedListNode head) {

		/*
		 * SinglyLinkedListNode node = head;
		 * 
		 * while(node != null) 
		 * { System.out.println(node.data); 
		 * node = node.next; }
		 */
		////////////////

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

		System.out.println("--------------------------------------------");
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SinglyLinkedList llist = new SinglyLinkedList();

		int llistCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < llistCount; i++) {
			int llistItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			llist.insertNode(llistItem);
		}
		
		SinglyLinkedListNode node = llist.head;

		printLinkedList(node);
		printLinkedList(node);

		scanner.close();
	}
}