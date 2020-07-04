package forPractice;

public class chap_04_exam06 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
//				System.out.print("A");
				if (j == i) {
//					System.out.println();
				}//if
			}//for
		}//for
	
		for (int x = 1; x <= 10; x++) {
			for (int y =10; y >=x; y--) {
				System.out.print("A");
				} 
				System.out.println();
			} //for2
	} //main
} //class
