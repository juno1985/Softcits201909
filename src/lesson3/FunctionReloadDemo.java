package lesson3;

public class FunctionReloadDemo {

	public static void main(String[] args) {

	}
	
	static int multiple(int a) {
		return a*a;
	}
	//与上面的multiple函数同名，但是参数列表不同-》函数重载
	static int multiple(int a, int b) {
		return a*b;
	}

}
