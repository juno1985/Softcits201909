package catchup_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("bbb");
		list.add("bbb");
		list.add("ccc");
		
		
		//删除list中所有含有bbb的字符串
		/*
		 * for(int i = 0; i <list.size(); i++) 
		 * { 
		 * 	System.out.println(i + "->" +
		 * 	list.size()); if(list.get(i).equals("bbb")) 
		 * 	list.remove(i); 
		 * }
		 * 
		 * System.out.println(list);
		 */
		
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().equals("bbb")) 
				it.remove();
				//list.remove("bbb");
		}

		System.out.println(list);
	}

}
