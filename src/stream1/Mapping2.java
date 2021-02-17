package stream1;

import java.util.Arrays;
import java.util.List;

class Student{
	private String name;
	private int KorScore;
	
	public Student(String name, int KorScore) {
		this.name = name;
		this.KorScore = KorScore;
	}
	
	public int getKorScore() {
		return KorScore;
	}
	
	public String getName() {
		return name;
	}
}

public class Mapping2 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("merry",70), new Student("younghee",100),new Student("gildong",90));
		
		list.stream().filter(n -> n.getKorScore() > 80).map(s -> s.getName().length()).forEach(p -> System.out.println(p));
	}

}
