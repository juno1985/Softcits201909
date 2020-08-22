package catchup_5;

import java.util.*;

public class CollectionTest
{
	public static void main(String[] args)
	{
		//声明时， C的类型是Collection
		//运行时, C的类型是ArrayList
		//这种声明和运行时不同的类型，就是多态的表现
		Collection c = new ArrayList();
		// 添加元素
		c.add("张三");
		// 虽然集合里不能放基本类型的值，但Java支持自动装箱
		c.add(6);
		System.out.println("c集合的元素个数为:" + c.size()); // 输出2
		// 删除指定元素
		c.remove(6);
		System.out.println("c集合的元素个数为:" + c.size()); // 输出1
		// 判断是否包含指定字符串
		System.out.println("c集合的是否包含\"张三\"字符串:"
			+ c.contains("张三")); // 输出true
		c.add("软件园IT沙龙");
		System.out.println("c集合的元素：" + c);
		
		// 删除c集合里所有元素
		c.clear();
		System.out.println("c集合的元素：" + c);
	}
}