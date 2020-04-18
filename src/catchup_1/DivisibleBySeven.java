package catchup_1;

public class DivisibleBySeven {

	public static void main(String[] args) {
		
		long limit = 9223372036854775807L;
		
		long i = 1;
		
		while(i * 7 > 0 && i * 7 <= limit) {
			System.out.println(i * 7);
			i++;
		}

	}

}
