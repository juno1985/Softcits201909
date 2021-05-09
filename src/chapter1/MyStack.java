package chapter1;

public class MyStack<T> {
	
	Object[] elementData;
	int elementCount = 0;
	int modCount;
	public MyStack() {
		elementData = new Object[10];
	}

	/**
	 * 
	 * @return num of element 
	 */
	public int size() {
		
		return elementCount;
	}
	
	public T push(T t) {
		
		return t;
		
	}
	
	public T pop() {
		
		return null;
		
	}

}
