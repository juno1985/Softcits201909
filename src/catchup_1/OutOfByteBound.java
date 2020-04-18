package catchup_1;

public class OutOfByteBound {

	public static void main(String[] args) {
		
		byte limit = 127;
		
		byte i = 1;
		
		
		
		while ((byte)(i * 7) < 127) {
			System.out.println( (byte)(i * 7) );
			i++;
		}

	}

}
