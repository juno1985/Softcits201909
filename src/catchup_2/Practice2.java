package catchup_2;

public class Practice2 {

	public static void main(String[] args) {
		
		int[] arr = {78,64,35,92,48,98,87,94,80,83};
		
		int even = 0;
		
		for(int i : arr) {
			if(i%2==0) {
				even++;
			}
		}
		
		System.out.println(even);

		
		for(int i : arr) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
		
		/*
		 * for(int i = 0; i< arr.length; i++) { if(arr[i]%2!=0) {
		 * System.out.println(arr[i] + " "); } }
		 */
	}

}
