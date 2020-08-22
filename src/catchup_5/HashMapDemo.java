package catchup_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> hashMap = new HashMap<>();
		//添加键值对
		hashMap.put(1, "Mark");
		hashMap.put(2, "Alex");
		//通过KEY得到VALUE
		String name = hashMap.get(1);
		System.out.println(name);
		
		//得到HashMap的key，即为HashSet
		Set<Integer> hashSet = hashMap.keySet();
		
		//遍历HashSet
		for(Integer t : hashSet) {
			System.out.println(t);
		}
		
		//判断HashSet是否含值
		System.out.println(hashSet.contains(1));
		System.out.println(hashSet.contains(3));
		
		//判断HashMap中的key是否含值
		System.out.println(hashMap.containsKey(1));
		System.out.println(hashMap.containsKey(3));
		//判断HashMap中的value是否含值
		System.out.println(hashMap.containsValue("Mark"));
		System.out.println(hashMap.containsValue("Juno"));
		

	}

}
