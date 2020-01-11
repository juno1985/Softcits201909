package lesson9.mylinkedlist;

public class Test {

	public static void main(String[] args) {
		
		MyLinkedList<String> myLinkedList = new MyLinkedList<>();
		
		MyNode<String> mynode1 = new MyNode<String>("aa");
		MyNode<String> mynode2 = new MyNode<String>("bb");
		MyNode<String> mynode3 = new MyNode<String>("cc");
		MyNode<String> mynode4 = new MyNode<String>("dd");
		MyNode<String> mynode5 = new MyNode<String>("ee");
		MyNode<String> mynode6 = new MyNode<String>("ff");
		
		myLinkedList.addToLast(mynode1);
		myLinkedList.addToLast(mynode2);
		myLinkedList.addToLast(mynode3);
		myLinkedList.addToLast(mynode4);
		myLinkedList.addToLast(mynode5);
		myLinkedList.addToLast(mynode6);
		
		myLinkedList.traverseFromStart();
		
		System.out.println();
		
		MyNode<String> mynode7 = new MyNode<String>("gg");
		
		myLinkedList.insertAtPosition(2, mynode7);

		myLinkedList.traverseFromStart();
		
		System.out.println();
		
		MyNode<String> mynode8 = new MyNode<String>("hh");
		
		myLinkedList.insertAtPosition(0, mynode8);
		
		myLinkedList.traverseFromStart();
		
		System.out.println();
		
		MyLinkedList<People> myLinkedList1 = new MyLinkedList<>();
		People p1 = new People("123213131", 12);
		People p2 = new People("223faffda", 30);
		People p3 = new People("123fdafafda", 21);
		People p4 = new People("123adfafa", 50);
		
		MyNode<People> mp1 = new MyNode<People>(p1);
		MyNode<People> mp2 = new MyNode<People>(p2);
		MyNode<People> mp3 = new MyNode<People>(p3);
		MyNode<People> mp4 = new MyNode<People>(p4);
		
		myLinkedList1.addToLast(mp1);
		myLinkedList1.addToLast(mp2);
		myLinkedList1.addToLast(mp3);
		myLinkedList1.addToLast(mp4);
		
		myLinkedList1.traverseFromStart();
	}

}
