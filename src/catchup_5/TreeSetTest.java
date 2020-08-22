package catchup_5;


import java.util.*;

public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet nums = new TreeSet();
		// 向TreeSet中添加四个Integer对象
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		// 输出集合元素，看到集合元素已经处于排序状态
		System.out.println(nums);
		// 输出集合里的第一个元素
		System.out.println(nums.first()); // 输出-9
		// 输出集合里的最后一个元素
		System.out.println(nums.last());  // 输出10

	}
}
