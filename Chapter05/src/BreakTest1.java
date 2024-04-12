/*
 * 작성일 : 2024/04/12
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 1부터 입력받은 수까지 합계를 구하는 프로그램
 * 
 * 문제분석 : 초기값: 1
 * 			조건식: 입력 받은 수
 * 			증강식: 1씩 증가
 * 			1씩 증가하면서 무한 반복(while(true),for(;;))을 사용하여 프로그램 작성
 * 알고리즘 :
 * 		1. 초기값 (c=1) 합계 (s=0) 
 * 		2. 정수입력(num)
 * 		3. while 무한반복
 * 			2-1 if( num < c) break; 만약 초기값이 입력 받은 정수보다 크면 break
 * 			2-2 합(s) s+=c 초기값을 합계에 더함.
 * 			2-3 c++ 초기값 증강
 * 		4.합계 출력
 */

import java.util.Scanner;

public class BreakTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		int c=1,s=0; // 초기값,합계
		System.out.print("1부터의 합을 구하고싶은 정수 입력: ");
		int num = stdIn.nextInt();
		
		while(true) { // 무한반복
			if(num < c) break; //초기값이 입력받은 수보다 크면 break 탈출
			s+=c; // 합계구하기
			c++; // 증강식
		}
		System.out.printf("1부턴 %d까지의 합은 %d입니다.",num,s);
		
	}

}
