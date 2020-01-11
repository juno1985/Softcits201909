package lesson9.mylinkedlist;

public class MyNode<E> {
	//保存元素内容
	private E element;
	//指向下一个元素
	public MyNode<E> next;
	//指向前一个元素
	public MyNode<E> prev;
	
	
	
	
	public MyNode(E element) {
		this.element = element;
		this.prev = null;
		this.next = null;
	}


	public MyNode(E element, MyNode<E> next, MyNode<E> prev) {
		this.element = element;
		this.next = next;
		this.prev = prev;
	}


	public E getElement() {
		return element;
	}


	public void setElement(E element) {
		this.element = element;
	}
	
	

}
