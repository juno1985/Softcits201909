package catchup_2;

public class Practice2 {

	public static void main(String[] args) {
		
		int[] arr = {78,64,35,92,48,98,87,94,80,83};
		
		int[] odd = new int[arr.length];
		
		int odd_num = 0;
		
		int even = 0;
		
		for(int i : arr) {
			if(i % 2 == 0) {
				even++;
			}
			else {
				odd[odd_num] = i;
				odd_num++;
			}
		}
		
		//print num of even
		System.out.println(even);

		//print sequence of odd
		for(int i = 0; i < odd_num; i++)
		{
			System.out.println(odd[i]);
		}
	}

}
