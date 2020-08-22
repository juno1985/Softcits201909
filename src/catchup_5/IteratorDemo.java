package catchup_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("alex");
		set.add("lex");
		set.add("mark");
		set.add("jimmy");
		
		//HashSet生成迭代器
		Iterator<String> it = set.iterator();
		//遍历迭代器
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
