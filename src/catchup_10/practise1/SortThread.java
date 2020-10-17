package catchup_10.practise1;

import java.util.Collections;

public class SortThread extends Thread {

	public SortThread(Integer num) {
		Data.getList().add(num);
	}

	@Override
	public void run() {
		
		Data.sort();
		
	}
	

	

}
