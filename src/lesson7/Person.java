package lesson7;

public class Person implements Creature {
	//static修饰的变量属于类级别，所以所有的对象都共有该变量
	private Integer num = 0;
	
	private Integer id;// 1,2,3....
	private String name;
	
	public static Integer getNum() {
		return num;
	}
	
	public Person() {
		this.setId(++num);
	}

	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
