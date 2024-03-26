/*
 * 작성일 : 2024/03/26
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 세자리수 십진수를 입력 받아 홀수인지 짝수인지 구분하는 프로그램
 *
 * [문제분석]
 * 		짝수는 2로 나눈 나머지가 0이다.
 * 		홀수는 2로나눈 나머지가 1이다.(0이 아니다.)
 * 		세자리 수 : 100~999
 * 		예를들어, 123을 입력 했다면
 * 		100의 자리 1은 홀수입니다.
 * 		10의 자리 2는 짝수입니다.
 * 		1의 자리 3은 홀수입니다.
 *      출력.
 * [알고리즘]
 * 		1. 세자리 정수 입력
 * 			1-1. 100~999 사이가 아니면 "잘못 입력하셨습니다."출력후 종료
 * 		2. 각 자릿수 저장
 * 		3. 100의 자리수가 짝수면?
 * 			 100의 자리 0은 짝수입니다.
 * 			3-1.아니면?
 * 			 100의 자리 0은 홀수입니다.
 * 		4. 10의 자리수가 짝수면?
 * 			 10의 자리 0은 짝수입니다.
 * 			4-1.아니면?
 * 			 10의 자리 0은 홀수입니다.
 * 		5. 1의 자리수가 짝수면?
 * 			 1의 자리 0은 짝수입니다.
 * 			5-1.아니면?
 * 			 1의 자리 0은 홀수입니다.
 * 			
 * 
 */

import java.util.Scanner;

public class SelectedTest {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("세자리 수인 정수를 입력하시오.(100~999) : ");
		int num = stdIn.nextInt();//정수입력
		if(num >= 100 && num <= 999) { // 100~999 사이인가
			int num1,num2,num3;
			num1=num/100; // 100의 자리수 저장
			num2=num%100/10; // 10의 자리수 저장
			num3=num%100%10; // 1의 자리수 저장
			if(num1%2==0) { 
				System.out.println("100의 자리 "+num1+"은 짝수입니다.");
			}
			else
				System.out.println("100의 자리 "+num1+"은 홀수입니다.");
			
			if(num2%2==0) {
				System.out.println("100의 자리 "+num2+"은 짝수입니다.");
			}
			else
				System.out.println("100의 자리 "+num2+"은 홀수입니다.");
			
			if((num3/100)%2==0) {
				System.out.println("100의 자리 "+num3+"은 짝수입니다.");
			}
			else
				System.out.println("100의 자리 "+num3+"은 홀수입니다.");

		}
		else {
			System.out.print("잘못 입력하셨습니다.");
		}
					

	}

}
