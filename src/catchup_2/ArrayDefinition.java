package catchup_2;


public class ArrayDefinition {
	public static void main(String[] args){
		//静态初始化
		int[] intArr;
		intArr = new int[]{1, 2, 3, 4, 5, 6, 9, 22, 10, 89, -1, -99, 0};
		
		System.out.println(intArr.length);
		

		String[] strArr;
		strArr = new String[] {"abc","efg"};
		System.out.println(strArr.length);
		
		
		//此外还可以简化写法
		String[] objArr2 = {"we","are","learning","JAVA", "."};
		
		//声明数组变量是固定长度
		int[] intArr2 = new int[5];
		for(int i = 0; i < intArr2.length; i++) {
			intArr2[i] = i + 1;
		}
		
		for(int i = 0; i < intArr2.length; i++)
			System.out.println(intArr2[i]);
		
		for(int a : intArr2)
			System.out.println(a);
		
		
		
		
		/*
		 * String[] strArr3 = new String[5];
		 * 
		 * for(String s : strArr3) System.out.println(s);
		 */
		
		System.out.println("---------------------------------------------");
		
		intArr = intArr2;
		
		System.out.println(intArr2[0]);
		
		intArr[0] = 100;
		
		System.out.println(intArr2[0]);
		
		
		System.out.println("---------------------------------------------");
		
		int a = 1;
		int b = 2;
		
		a = b;
		
		b = 100;
		
		System.out.println(a);
		
		
	}
}