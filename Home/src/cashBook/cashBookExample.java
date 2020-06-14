package cashBook;

import java.util.Scanner;

public class cashBookExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		cashBook[] cashBooks = new cashBook[100];
		
		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1.내용입력  2.목록 3. ");
			System.out.println("------------------------------------");
			System.out.println("선택 >");
			int menu  = scn.nextInt();
			scn.nextLine();
			if(menu ==1) {
				System.out.println("날짜를 입력하세요.");
				String day = scn.nextLine();
				System.out.println("지출내역을 입력하세요.");
				String product = scn.nextLine();
				System.out.println("가격을 입력하세요.");
				int price = scn.nextInt();
				
				cashBook cash = new cashBook(day, product, price);
				
				for(int i=0; i<cashBooks.length; i++) {
					if(cashBooks[i] == null) {
						cashBooks[i] = cash;
						break;
					}
				}
				System.out.println("내용이 입력 되었습니다.");
				
			} else if (menu == 2) {
				for (cashBook book : cashBooks) {
					if (book != null) {
						System.out.println("날짜 : " + book.getDay() + "지출 내역 : " + book.getProduct() + "가격 :  " + book.getPrice());		
					}
				}
				
			}
		}
	}
}
