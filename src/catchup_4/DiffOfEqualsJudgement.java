package catchup_4;

public class DiffOfEqualsJudgement {

	public static void main(String[] args) {
		
		Person p1 = new Person("Alex");
		Person p2= new Person("Alex");
		
		System.out.println(p1==p2);//true //false
		System.out.println(p1.equals(p2));//false	//true //false
		
		
		int a = 1;
		int b = 1;
		System.out.println(a==b);

	}

}
