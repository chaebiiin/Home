package chap16;

import java.util.Arrays;
import java.util.List;

public class sec3_StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("홍길동", Member.MALE, 30, null), new Member("김나리", Member.FEMALE, 20, null),
				new Member("신용권", Member.MALE, 45, null), new Member("박수미", Member.FEMALE, 27, null));
	
		Double ageAvg = list.stream().filter(m -> m.getSex() == Member.MALE).mapToInt(Member :: getAge).average().getAsDouble();
		
		
		System.out.println("남자 평균 나이는 :  " + ageAvg);
		
	}
}