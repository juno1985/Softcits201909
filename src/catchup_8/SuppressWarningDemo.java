package catchup_8;import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchcked"})

public class SuppressWarningDemo {
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	String s ;
	
	public static void main(String[] args){
		@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
		List<String> myList = new ArrayList();
	}
	
	void test(@SuppressWarnings({"unchcked"})String s) {
		
	}
}
