package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class sec02_FromCollectionExample {
	public static void main(String[] args) {
		List<Student> studentsList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30));
		Stream<Student> stream = studentsList.stream();
		stream.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				System.out.println(t.getName()+"의 점수는 "+t.getScore()+ " 입니다.");
			}
		});
	}
}
