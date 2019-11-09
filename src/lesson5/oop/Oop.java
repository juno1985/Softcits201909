package lesson5.oop;

/*import lesson5.oop.model.Human;
import lesson5.oop.model.Animal;*/

import lesson5.oop.model.*;

public class Oop {

	public static void main(String[] args) {
		
		
		//h1
		Human wang = new Human();
		
		wang.setName("Xiao Wang");
		wang.setGender("male");
		wang.setAge(30);
	
		//h2
		Human zhang = wang;
	
		wang.setAge(40);
	
		System.out.println(zhang.getName());
		System.out.println(zhang.getGender());
		System.out.println(zhang.getAge());
		
		System.out.println("wang's age: " + wang.getAge());
		
		int int1 = 2;
		int int2 = int1;
		int1 = 3;
		
		System.out.println(int2);
		
		String str1 = "abc";
		String str2 = str1;
		str1 = "def";
		
		System.out.println(str2);
		
		Integer integer1 = 2;
		Integer integer2 = integer1;
		integer1 = 3;
		
		System.out.println(integer2);
		
		char[] c_array1 = {'a','b','c'};
		
		char[] c_array2 = c_array1;
		//rbc
		c_array1[0]='r';
		
		//abc ? rbc
		//System.out.println(c_array2);
		for(int i=0;i<3;i++)
			System.out.println(c_array1[i]);
	}

}
