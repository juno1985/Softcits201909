package lesson7;

import java.util.Random;

public class MySortDemo {

	public static void main(String[] args) {
		
		Random random = new Random ();
		
		Integer[] toBeSortArr = new Integer[10];
		//初始化一个待排序的数组
		for(int i = 0; i < toBeSortArr.length; i++)
			toBeSortArr[i] = random.nextInt(Integer.MAX_VALUE);
		//排序前是这个样子的
		for(Integer t : toBeSortArr)
			System.out.println(t);
		
		System.out.println("-----------华丽的分隔符-----------");
		
		Long start_time = System.currentTimeMillis();
		
		//调用排序方法
		MySortAndFindUtil.mySort(toBeSortArr);
		
		Long end_time = System.currentTimeMillis();
		
		//遍历排序后的方法并输出
		for(Integer t : toBeSortArr)
			System.out.println(t);
		
		System.out.println("排序用时: " + (end_time-start_time)/1000 + "秒");
		
	}

}
