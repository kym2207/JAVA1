/*
 * 작성일 : 2024/04/05
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 알고싶은 단을 입력 받아 구구단을 출력하시오
 * 
 * 문제분석 : 단은 고정이가. 입력 받는다.
 * 			곱하는 수는 1부터 9까지 1씩 증가한다.
 * 			곱셈의 결과는 단 * 수 이다.
 * 			구구단 곱셈의 과정이 하나씩 출력되야 한다.
 * 
 */
import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
				Scanner stdIn = new Scanner(System.in);
				
				// 1. 단을 입력 받는다.
				System.out.print("알고 싶은 단 입력 : ");
				int dan = stdIn.nextInt();
				
				for(int su=1;su<=9;su++) {
					System.out.println(dan + " X " + su + " = " + dan*su);
				}
	}

}
