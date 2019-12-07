package lesson7;


/**
 * @author thinkpad
 *
 */
public class PrimaryTypeAndReferranceType {
	
	
	public static void changeInt(int a )
	{
		a = a * a;
	}
	
	public static void changeIntArr(int[] a) {
		a[0] = 9;
	}
	

	public static void main(String[] args) {
		
		int a = 2;
		changeInt(a);
		System.out.println(a);
		
		int[] arr = new int[1];
		arr[0]=0;
		changeIntArr(arr);
		System.out.println(arr[0]);
	}

}
