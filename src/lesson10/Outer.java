package lesson10;

public class Outer {
	
//	b = 2;	
	static int a = 1;
	
	static class Inner{
		//普通内部类不能有静态变量
		static int c = 1;
	//	int b = 1;
		
		void setA() {
			a = 2;
		}
	}

}
