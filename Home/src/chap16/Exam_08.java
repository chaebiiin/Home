package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.javafx.collections.MappingChange.Map;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Exam_08 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("홍길동", Member.MALE, 20, "개발자"), new Member("김나리",  Member.FEMALE, 22, "디자이너"),
				new Member("김자바", Member.FEMALE, 24, "개발자"));
		Map<String, List<String>> groupingMap = (Map<String, List<String>>) list.stream().collect(Collectors.groupingBy(Member::getJob, Collectors.mapping(Member::getName, Collectors.toList())));
	
		groupingMap.get("개발자").stream
		
	}
}
