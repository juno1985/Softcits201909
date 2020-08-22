package catchup_5;
import java.util.*;
public class SortTest
{
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);

		Collections.sort(nums); // 将List集合元素的按自然顺序排序
		System.out.println(nums); // 输出:[-5, 0, 2, 3]
		
	}
}
