package catchup_3;

public class HelloWorld2 extends HelloWorld {
	
	
	
	public HelloWorld2() {
		
	}
	
	public static void main(String[] args) {
		
		/**
		 * 1. 调用父类的构造器HelloWorld()
		 * 2.调用Object的构造器 Object()
		 * 3. 执行完Step2
		 * 4.执行完Step1
		 * 5.初始化对象变量 Integer abc = 1
		 * 6.执行子类的构造器 HelloWorld2()
		 * 
		    *     简单一句话，生成子类对象前要先生成父类对象
		 * 
		 */
		HelloWorld2 w2 = new HelloWorld2();
		
		System.out.println(w2.a = 2);
		
	}


	

}
