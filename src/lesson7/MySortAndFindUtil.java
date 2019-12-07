package lesson7;

public final class MySortAndFindUtil {

	/**
	 * 
	 * 选择排序， 就是每次选择出一个最大/最小的数
	 * 一共遍历 N次， N为数组的长度
	 * 
	 * 算法复杂度：
	 * O(N*N)
	 * 
	 */
	public static void mySort(Integer[] arr) {
		
		Integer[] result = new Integer[arr.length];
		Integer result_index = 0;
		Integer min = Integer.MAX_VALUE;
		
		Integer index = 0;
		//一共从头走到尾的次数
		for(int j = 0; j < arr.length; j++) {
			//从头走到尾
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != null && arr[i] < min) {
					//标记当前下标，扫描一遍后会记null
					index = i;
					//更新当前最小值
					min = arr[i];
				}
			}
			
			arr[index] = null;
			result[result_index++] = min;
			min = Integer.MAX_VALUE;
		}
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = result[i];
		
	}
	
}
