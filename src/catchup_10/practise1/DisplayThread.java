package catchup_10.practise1;

public class DisplayThread extends Thread {

	@Override
	public void run() {
		
		for(Integer it : Data.getList()) {
			System.out.print(it + " ");
			
		}
		System.out.println();
	}	
	
}
