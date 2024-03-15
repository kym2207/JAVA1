/*
 * 작성일 : 2024/03/15
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 3항 연산자.
 * 		 정수를 입력 받아 짝수인지 확인하는 프로그램
 */

import java.util.Scanner;

public class TernaryOpTest {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		boolean result; // true, false
		result = (num % 2 == 0) ? true : false;
		
		System.out.print(num + "은 짝수입니까? ");
		System.out.println(result);
		
	}

}
