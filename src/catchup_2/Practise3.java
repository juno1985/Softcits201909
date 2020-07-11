package catchup_2;

public class Practise3 {

	
	/**
	 * to be sorted
	 * 49,38,65,97,76,13
	 * 
	 */
	
	public static void main(String[] args) {
		
		Integer[] arr = {49,38,65,97,13,76};
		//最小数的下标
		int min_index = 0;
		//最小数
		int min_value = java.lang.Integer.MAX_VALUE;
		//int min_value = arr[0];
		
		//需要遍历arr.length-1次
		for(int i = 0 ; i< arr.length; i++) {
			//每次遍历找到当前最小
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] != null && arr[j] <= min_value) {
					min_value = arr[j];
					min_index = j;
				}
			}
			System.out.println(min_value);
			//去除当前最小，继续下一次遍历
			arr[min_index] = null;
			min_value = java.lang.Integer.MAX_VALUE;
		}
		
	}


	
	

}
