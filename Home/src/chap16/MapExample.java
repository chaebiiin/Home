package chap16;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<Student> studentlist = Arrays.asList( new Student("홍길동", 10),
				new Student("신용권", 20), new Student("유미선", 30));
		
		studentlist.stream().mapToInt(Student :: getScore).forEach(score -> System.out.println(score));
	}

}
