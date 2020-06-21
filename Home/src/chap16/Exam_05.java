package chap16;

import java.util.Arrays;
import java.util.List;

public class Exam_05 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("This is a java book ", "Lamda Expressions", "Java8 supports lamda expressions");
		list.stream().filter(a -> a.toLowerCase().contains("java")).forEach(s -> System.out.println(s));
	}
}
