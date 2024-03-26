/*
 * 작성일 : 2024/03/26
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 조건식 연습.
 *		 월을 입력받아 해당 계절을 출력하시오.
 *		 3,4,5원 => 봄 
 *		 6,7,8월 => 여름
 *		 9,10,11월 => 가을
 *		 12,1,2월 겨울
 * 문제 분석: 입력 받아야 할 값은
 *		 	1,2,3,4,5,6,7,8,9,10,11,12이다.
 *		 	0이나 13을 입력하면? => 해당 월은 없습니다 출력하자.
 *
 *			switch ~ case 문 이용
 */

import java.util.Scanner;

public class Switchtest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성
				Scanner stdIn = new Scanner(System.in);
				System.out.print("월 입력(1~12) : ");
				int month = stdIn.nextInt();
				
	
				switch(month)
				{
					case 3 :   case 4 :  case 5:
						System.out.print("봄입니다");
						break;
					case 6 :   case 7 :  case 8:
						System.out.print("여름입니다");
						break;
					case 9 :   case 10 :  case 11:
						System.out.print("여름입니다");
						break;
					case 12 :   case 1 :  case 2:
						System.out.print("겨울");
						break;
					default:
						System.out.println("해당 월은 없습니다.");
						break;
				}
	}

}
