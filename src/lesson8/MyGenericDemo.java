package lesson8;

public class MyGenericDemo<T> {
	
	Object[] arr = {};

	public MyGenericDemo(T[] arr) {
		this.arr = arr;
	}
	
	public void printArr() {
		for(T t : (T[])arr)
			System.out.println(t);
	}
	
	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3};
		MyGenericDemo<Integer> integer_demo = new MyGenericDemo<Integer>(arr);
		integer_demo.printArr();
		
		String[] arr_str = {"abc", "def", "ghi"};
		MyGenericDemo<String> str_demo = new MyGenericDemo<String>(arr_str);
		str_demo.printArr();
		
		
		
	}
	
	

}
