package lesson3;

public class DataTypeDemo {

	/**
	 * 
	 * byte，占用1个字节(8 bits)（-2的7次方到2的7次方-1）
	 * 
	 * short，占用2个字节(16 bits)（-2的15次方到2的15次方-1）
	 * 
	 * int，占用4个字节(32 bits)（-2的31次方到2的31次方-1）
	 * 
	 * long，占用8个字节(64 bits)（-2的63次方到2的63次方-1）
	 */

	public static void main(String[] args) {

		byte a = -1;
		byte b = 2;
		// 变量
		a = 1;
		a = 3;
		// 常量
//		System.out.println(5);

		short c = 5;
		// long类型的使用
		long d = 6666666666666L;

//		java.lang.Byte.MIN_VALUE;

		// final 修饰的变量在变量定义后就不能再赋值了
		// java.lang.Byte.MAX_VALUE=100;

		// System.out.println(java.lang.Byte.MAX_VALUE);

		/*
		 * java.lang.Short.MAX_VALUE; java.lang.Short.MIN_VALUE;
		 * 
		 * java.lang.Integer.MAX_VALUE; java.lang.Integer.MIN_VALUE;
		 * 
		 * java.lang.Long.MAX_VALUE; java.lang.Long.MIN_VALUE;
		 */

		String str1 = "Hello World ";

		String str2 = " konitiwa";

		String str3 = "abc127ABC*^%%$O))JNB%こにちは你好啊";

		int int1 = 1;

		int int2 = 2147483647;

		long long1 = 2147483648L;

		// System.out.println((int)long1);

		// System.out.println(java.lang.Integer.MAX_VALUE);

		/*
		 * System.out.println(int2+long1);
		 * 
		 * System.out.println(int1+int2);
		 */

		/*
		 * System.out.println(str1+int1+int2);
		 * 
		 * System.out.println(int1+int2+str1);
		 * 
		 * System.out.println(int1+str1+int2);
		 */
		// 类型转换 int->String + String
		// System.out.println(str1+int1);

		char c1 = 'a';
		// 强制类型转换
		/*
		 * System.out.println((int) c1);
		 * 
		 * System.out.println((char)98);
		 * 
		 * System.out.println((int)'c');
		 */
		char c2 = '0';
	//	int int3=0;
		
		/*
		 * System.out.println((int)c2); 
		 * System.out.println((char)((int)c1+10));
		 */
		
	
		
		/*
		 * if(flag) { System.out.println("flag is true"); } else {
		 * System.out.println("flag is false"); }
		 */
		
		//System.out.println(1==1);
		
		/**
		 * 判断是否相等 ==
		 * 判断是否不等 !=
		 * 判断大于  >
		 * 判断小于 <
		 * 判断大于等于 >=
		 * 判断小于等于 <=
		 * 或运算 ||
		 * 与运算 &&
		 */
		
		boolean flag1 = true;
		boolean flag2 = false;
		
		
		int int3 = 1;
		int int4 = 2;
		
		if(int3 == int4) {
			System.out.println("int3 equals to int4");
		}
		else if(int3 > int4) {
			System.out.println("int3 is bigger than int4");
		}
		else {
			System.out.println("int3 is smaller than int4");
		}

		
	}

}
