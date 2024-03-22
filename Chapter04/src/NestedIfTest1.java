/*
 * 작성일 : 2024/03/22
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 다중 if문 실습
 * 		 점수를 입력받아 학점을 출력하시오.
 * 		 점수는 0~100점 사이 입니다.
 * 		 점수 범위를 벗어나면 "잘못된 점수입니다." 출력하시오.
 * 문제분석 : 입력받은 점수가 0~100 사이인가>
 *          점수가 0~100 사이가 아니면?
 * 			90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 * 			60점 이상이면 D학점
 * 			60점 미만이면 F학점
 * 			점수는 정수로 입력 받는다.
 * 알고리즘 : 1. 점수(정수)를 입력받는다.
 * 			2. if 점수의 범위가 0~100 사이인가?
 * 				1) A
 * 				2) B
 * 				   :
 * 				5) F
 * 			3. else 아닌가?
 * 				1) "잘못된 점수입니다." 출력
 */

import java.util.Scanner;

public class NestedIfTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성
				Scanner stdIn = new Scanner(System.in);
				
				// 1. 정수를 입력 받는다.
				System.out.print("정수입력 : ");
				int num = stdIn.nextInt();
				if(num <= 100 && num>= 0) {// 100~0 사이면
					// 2.90점 이상인지
					if(num>=90) {
						System.out.println("A학점입니다.");
					}
					// 3. 아니면 80점 이상인지
					else if(num>=80) {
						System.out.println("B학점입니다.");
					}
					// 3. 아니면 80점 이상인지
					else if(num>=70) {
						System.out.println("C학점입니다.");
					}
					// 3. 아니면 80점 이상인지
					else if(num>=60) {
						System.out.println("D학점입니다.");
					}
					
					// 4. 아니면(0이다.)
					else {
						System.out.println("F학점입니다.");
					}
				}
				else {//100~0 사이가 아니면
					System.out.println("잘못된 점수 입력입니다.");
				}
				
				

	}

}
