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

	}

}
