package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exam_07 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("도담이", Member.FEMALE, 7, "고양이"),
				new Member("겨울이", Member.MALE, 3, "고양이"), new Member("신용권", Member.MALE, 30, "개발자"));
		List<Member> developers = list.stream().filter(m -> m.getJob().equals("개발자")).collect(Collectors.toList());
		developers.stream().forEach(m ->System.out.println(m.getName()));
	}
}
