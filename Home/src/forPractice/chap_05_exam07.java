package forPractice;

public class chap_05_exam07 {
	public static void main(String[] args) {
		int max = 0;
		int sum = 0;
		double avg = 0.0;
		int[] array = { 1, 5, 3, 8, 2 }; // 배열 생성

		for (int i = 0; i <array.length; i++) { // 배열에 들어 있는 값의 길이만큼
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max =" + max);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			sum +=array[i];
		}
		System.out.println("배열의 합은 = "+sum);
		System.out.println();
		for (int i = 0; i <= array.length; i++) {
			if(i%2!=0) {
				System.out.println("배열의 홀수는:  "+ i);
			}
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			avg = sum/array.length;
		}
		System.out.println("배열의 평균은:  "+avg);
	}
}
