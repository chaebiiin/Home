package forPractice;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
//			else {
//				System.out.println(i);
			
		} // end for
	} // end main
} // end class
