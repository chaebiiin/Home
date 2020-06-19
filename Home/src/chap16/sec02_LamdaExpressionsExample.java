package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class sec02_LamdaExpressionsExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 90),
				new Student("신용권", 92));
	
		Stream<Student> stream = list.stream();
		
		//람다
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + ", " + score);
		});
		
//		list.stream().forEach(new Consumer<Student>() {
//
//			@Override
//			public void accept(Student t) {
//				String name = t.getName();
//				int score = t.getScore();
//				System.out.println(name + ", " + score);
//			}
//		});
	}

}
