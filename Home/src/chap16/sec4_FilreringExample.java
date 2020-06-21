package chap16;

import java.util.Arrays;
import java.util.List;

public class sec4_FilreringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");
		//중복 제거하고 list에 담긴 것들 출력
		names.stream().distinct().forEach(n ->System.out.println(n));
		System.out.println();
		//"신"이 들어가는 문자열 출력
		names.stream().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));
		System.out.println();
		//"신"이 들어간 문자열 중복제거해서 출력
		names.stream().distinct().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));
	}
}
