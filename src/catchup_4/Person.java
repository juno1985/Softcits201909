package catchup_4;

public class Person {
	
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	

	public String getName() {
		return name;
	}



	@Override
	public boolean equals(Object obj) {
	
		return this.name.equals(((Person)obj).getName());
	}
	
	

}
