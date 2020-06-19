package chap16;

import java.util.Arrays;
import java.util.List;

public class sec04_MapAndReduceExample {

	public static void main(String[] args) {
		List<Student> studentsList = Arrays.asList(new Student("홍길동", 10), 
																new Student("신용권", 20),
																new Student("유미선", 30));
		double avg = studentsList.stream().mapToInt(Student ::getScore).average().getAsDouble();
		
		System.out.println("평균점수 : " + avg);
		
		
	}

}
