package catchup_10.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	static private List<Student> list = new ArrayList<>();
	
	static {
		Student s1 = new Student("Mark", 60);
		Student s2 = new Student("Juno", 80);
		Student s3 = new Student("Alex", 90);
		Student s4 = new Student("Jimmy", 20);
		Student s5 = new Student("Wanda", 40);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
	}

	public static void main(String[] args) {
		System.out.println("使用外部排序器");
		useExternalComparator();
		System.out.println("使用内部排序器");
		useInternalComparable();

	}
	//使用外部排序器
	public static void useExternalComparator() {
		StudentComparator sc = new StudentComparator();
		Collections.sort(list, sc);
		
		System.out.println(list);
	}
	
	//使用内部排序器
	public static void useInternalComparable() {
		Collections.sort(list);
		System.out.println(list);
	}

}
