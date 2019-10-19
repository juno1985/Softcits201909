package lesson3;

public class DataTypeDemo {

	/**
	 * 
	 * byte，占用1个字节(8 bits)（-2的7次方到2的7次方-1） 

		short，占用2个字节(16 bits)（-2的15次方到2的15次方-1）

		int，占用4个字节(32 bits)（-2的31次方到2的31次方-1）

		long，占用8个字节(64 bits)（-2的63次方到2的63次方-1）
	 */
	
	public static void main(String[] args) {

		byte a = -1;
		byte b = 2;
		//变量
		a = 1;
		a = 3;
		//常量
//		System.out.println(5);
	
		short c = 5;
		//long类型的使用
		long d = 6666666666666L;
		
		
//		java.lang.Byte.MIN_VALUE;
		
		
		//final 修饰的变量在变量定义后就不能再赋值了
	//	java.lang.Byte.MAX_VALUE=100;
		
		System.out.println(java.lang.Byte.MAX_VALUE);
		
		
		/*
		 * java.lang.Short.MAX_VALUE; java.lang.Short.MIN_VALUE;
		 * 
		 * java.lang.Integer.MAX_VALUE; java.lang.Integer.MIN_VALUE;
		 * 
		 * java.lang.Long.MAX_VALUE; java.lang.Long.MIN_VALUE;
		 */
		
		String str1 = "Hello World";
		
		String str2 = " konitiwa";
		
		String str3 = "abc127ABC*^%%$O))JNB%こにちは你好啊";
		
		
		System.out.println(str1+str2+"               "+str3);
		
	}
	

}
