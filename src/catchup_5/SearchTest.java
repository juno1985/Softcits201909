package catchup_5;

import java.util.*;
public class SearchTest
{
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums); // 输出:[2, -5, 3, 0]
		System.out.println(Collections.max(nums)); // 输出最大元素，将输出3
		System.out.println(Collections.min(nums)); // 输出最小元素，将输出-5
		Collections.sort(nums); // 对nums集合排序
		System.out.println(nums); // 输出:[-5, 1, 2, 3]
		//只有排序后的List集合才可用二分法查询，输出index
		System.out.println(Collections.binarySearch(nums , 2));
	}
}

