/*
 * 작성일 : 2024/04/12
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 점수를 입력 받아 합계와 평균을 출력하시오.
 * 		음수가 입력되면 점수 입력이 종료됩니다.
 * 		100점 초과의 점수는 계산에 포함되지 않습니다.
 * 
 * 문제분석 :
 * 		계속해서 점수를 입력 받는다. => 무한반복
 * 		입력받은 수가 음수면 입력 종료
 * 		100점 초과이면 합계 누적시키지 않고 처음으로 돌아간다		
 *  
 * 알고리즘 :
 * 		1. 무한 반복
 * 			1-1. 점수(정수)를 입력 받는다.
 * 			1-2. 만약 정수가 음수이면 break.
 * 			1-3. 만약 정수가 100점 초과이면 continue.
 * 			1-4. 점수합계 구하기.
 * 			1-5. 증가값 증가.
 *		2. 평균 출력(합계 나누기 증가값)
 */

import java.util.Scanner;

public class ContinueBreak1 {

	public static void main(String[] args) {
		int c=0,s=0;
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		while(true) {

			System.out.print("점수 입력(음수입력시 종료) : ");
			int score = stdIn.nextInt();
			if(score<0) {
				break;
			}
			if(score>100) {
				continue;
			}
			s+=score;
			c++;
			
			
		}
		System.out.printf("평균은 : %d",s/c);
		

	}

}
