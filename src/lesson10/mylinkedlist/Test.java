package lesson10.mylinkedlist;

public class Test {

	public static void main(String[] args) {
		
		MyLinkedList<String> myLinkedList = new MyLinkedList<>();
		
		/*
		 * MyNode<String> mynode1 = new MyNode<String>("aa");
		 * MyNode<String> mynode2 = new MyNode<String>("bb"); 
		 * MyNode<String> mynode3 = new MyNode<String>("cc");
		 * MyNode<String> mynode4 = new MyNode<String>("dd"); 
		 * MyNode<String> mynode5 = new MyNode<String>("ee"); 
		 * MyNode<String> mynode6 = new MyNode<String>("ff");
		 */
		
		myLinkedList.addToLast("aa");
		myLinkedList.addToLast("bb");
		myLinkedList.addToLast("cc");
		myLinkedList.addToLast("dd");
		myLinkedList.addToLast("ee");
		myLinkedList.addToLast("ff");
		
		myLinkedList.traverseFromStart();
		
		System.out.println();
		
		MyLinkedList<Integer> myLinkedList1 = new MyLinkedList<>();
		myLinkedList1.addToLast(123);
		myLinkedList1.addToLast(3212341);
		myLinkedList1.addToLast(111);
		myLinkedList1.traverseFromStart();
	}

}
