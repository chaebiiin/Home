package chap16;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class sec2_FromIntRangeExample {
	public static int sum = 0;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);

//람다 표현식
//		stream.forEach(a -> sum += a);
//		System.out.println("총합은 :  " + sum);

		stream.forEach(new IntConsumer() {

			@Override
			public void accept(int value) {
				System.out.println(value);
				System.out.println();
				
				sum += value;
				System.out.println(sum);
			}
		});
	}

}
