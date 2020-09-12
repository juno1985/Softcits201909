package catchup_7;

import java.util.ArrayList;
import java.util.List;

public class PassParamDemo {
	
	static void change(List<String> list) {
		list.set(0, "Jimmy");
	}

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Mark");
		
		System.out.println(list);
		
		change(list);
		
		System.out.println(list);

	}

}