package lesson10.mylinkedlist;

public class MyLinkedList<E> {
	
	private MyNode<E> first;
	
	private MyNode<E> last;
	//链表的长度
	private int size = 0;
	
	static class MyNode<E> {
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


	public void addToLast(E e) {
		
		MyNode<E> node = new MyNode<>(e);
		
		//如果当前链表为空
		if(size == 0) {
			first = node;
			last = node;
			size++;
		}
		//当前链表不为空,则在最后元素后面添加
		else {
			
			MyNode<E> last_node = last;
			//新添加元素为当前最后元素的后一个
			last_node.next = node;
			//新添加元素的前一个为之前最后一个
			node.prev = last_node;
			//更新最后一个元素为新添加的元素
			last = node;
			size++;
		}
	}	
	//返回当前链表长度-元素的个数
	public int size() {
		return this.size;
	}
	//从前向后遍历
	public void traverseFromStart() {
		
		MyNode<E> node = first;
		
		while(node != null) {
			//toString() 待讲
			System.out.print(node.getElement().toString() + " -> ");
			node = node.next;
		}
	}
	
	
	public void insertAtPosition(int index, MyNode<E> node) {
		//如果插入位置异常
		if(index < 0 || index > size) throw new IndexOutOfBoundsException();
		
		if(index == 0 ) addFirst(node);
		else {
			MyNode<E> succ = getNodeAfterIndex(index);
			
			succ.prev.next = node;
			node.next = succ;
			node.prev = succ.prev;
			succ.prev = node;
			
			size++;
		}
	}
	//在第一个元素之前插入新的元素
	public void addFirst(MyNode<E> node) {
		node.next = first;
		first.prev = node;
		first = node;
		size++;
	}
	//找到待插入位置的下一个元素
	private MyNode<E> getNodeAfterIndex(int index){
		MyNode<E> node = first;
		for(int i=0;i<index;i++)
			node = node.next;
		return node;
	}
	//删除指定位置的元素
	public void removeAtIndex(int index) {
		
	}
}
