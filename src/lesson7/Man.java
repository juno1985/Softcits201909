package lesson7;

public class Man extends Person {
	//静态初始化代码块
	 {
		System.out.println("Man 中的静态代码块被执行了 。。。");
	}
	//显式写出默认构造器
	public Man() {
		System.out.println("Man 中的默认构造器被执行了 。。。");
	}

}
