package chap16;

import java.util.Arrays;
import java.util.List;

public class Exam_06 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("도담이", Member.FEMALE, 7, null), 
													new Member("겨울이", Member.MALE, 3, null),
													new Member("모카", Member.FEMALE, 7, null), 
													new Member("라떼", Member.MALE, 4, null),
													new Member("지릉이", Member.MALE, 2, null));
		double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("평균 나이는 : " + avg);
	}

}
