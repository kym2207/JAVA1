/*
 * 작성일 : 2024/03/26
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 조건식 연습.
 *		 숫자와 연산자를 입력 받아
 *		 사칙연산 프로그램을 작성하시오.
 *		 입력 방식 : 3 + 4 (띄어쓰기로 구분)
 *
 * [문제분석 및 알고리즘]
 * 		숫자 연산자 숫자를 입력 받아
 * 		해당 산자에 따은 결과를 출력한다.
 */

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// Scanner 객체 생성
				Scanner stdIn = new Scanner(System.in);
				int num1 = stdIn.nextInt();
				char op = stdIn.next().charAt(0);
				int num2 = stdIn.nextInt();
				switch(op)
				{
				case '+':
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
				case '-':
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
				case '/':
					if(num2 != 0)
						System.out.println(num1 + " / " + num2 + " = " + (num1/(double)num2));
					else
						System.out.println("0으로는 나눌수 없습니다.");
					break;
				case '*':
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
					break;
				default:
					System.out.println("잘못된 연산자 입니다");
					break;
				}
	}

}
