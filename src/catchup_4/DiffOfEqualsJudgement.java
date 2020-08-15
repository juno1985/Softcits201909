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
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1==str2); // true	//false
		System.out.println(str1.equals(str2)); // false	//true
		
		System.out.println(str1.hashCode());
		
		System.out.println("p1 hash code: " + p1.hashCode());
		p1 = new Person("Alex");
		System.out.println("p1 hash code: " + p1.hashCode());
		
		
		
		System.out.println("str1 hash code: " + str1.hashCode());
		str1 += "def";
		System.out.println("str1 hash code: " + str1.hashCode());
		
		System.out.println("-------------------------");
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		sb.append("abc");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		sb.append("def");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());

	}

}
