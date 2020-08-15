package catchup_4;

public class TelephoneTest {

	public static void main(String[] args) {
		
		for(TelephoneEnum phone : TelephoneEnum.values()) {
			if(phone.getName() == "Android" && phone.getPrice() >=2000 && phone.getPrice() <= 3000) {
				System.out.println(phone.toString());
			}
			
			phone.getName() == "Android"
					
			phone.getName().equals("Android");
		}

	}

}
