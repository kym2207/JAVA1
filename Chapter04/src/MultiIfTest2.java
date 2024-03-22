/*
 * 작성일 : 2024/03/19
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 다중 if문 실습
 * 		 점수를 입력받아 학점을 출력하시오.
 * 문제분석 : 90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 * 			60점 이상이면 D학점
 * 			60점 미만이면 F학점
 * 알고리즘 : 1. 점수(정수)를 입력 받는다.
 * 			2. 점수가 90점 이상인가?
 * 				2-1. A학점입니다. 출력
 * 			3. 아니면 점수가 80점 이상인가?
 * 				3-1. B학점입니다. 출력
 * 			4. 아니면 점수가 70점 이상인가?
 * 				4-1. C학점입니다. 출력
 * 			5. 아니면 점수가 60점 이상인가?
 * 				5-1. D학점입니다. 출력
 * 			6. 아니면(나머지는)
 * 				6-1. F학점입니다. 츨력
 */

import java.util.Scanner;

public class MultiIfTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력 받는다.
		System.out.print("정수입력 : ");
		int num = stdIn.nextInt();
		
		// 2.90점 이상인지
		if(num>=90 && 100 >=num) {
			System.out.println("A학점입니다.");
		}
		// 3. 아니면 80점 이상인지
		else if(num>=80 && 100 >=num) {
			System.out.println("B학점입니다.");
		}
		// 3. 아니면 80점 이상인지
		else if(num>=70 && 100 >=num) {
			System.out.println("C학점입니다.");
		}
		// 3. 아니면 80점 이상인지
		else if(num>=60 && 100 >=num) {
			System.out.println("D학점입니다.");
		}
		
		// 4. 아니면(0이다.)
		else if(num>=0 && 100 >=num) {
			System.out.println("F학점입니다.");
		}
		else {
			System.out.println("잘못된 점수 입력입니다.");
		}
	}

}
