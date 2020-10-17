package catchup_10.compare;

public class Student implements Comparable<Student>{

	private String name;
	private Integer score;
	public Student(String name, Integer score) {
		
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
	@Override
	public int compareTo(Student o) {
		if(this.getScore() < o.getScore()) return 1;
		else if(this.getScore() == o.getScore()) return 0;
		else return -1;
	}
	
	
}
