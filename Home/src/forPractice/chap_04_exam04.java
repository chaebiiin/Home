package forPractice;

public class chap_04_exam04 {

	public static void main(String[] args) {
			while(true) {
				int sum = 0;
		int num1 = (int) (Math.random()*6)+1;
		int num2 = (int) (Math.random()*6)+1;
		sum+= num1+num2;
			if(sum ==5){
				System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆");
				System.out.println(num1+"+"+num2+"의 값은 5 입니다.");				
			}else {
				System.out.println(num1+"+"+num2+"의 값은 5가 아닙니다.");				
			}
			break;
			}//while
	}//main
}// class
