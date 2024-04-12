/*
 * 작성일 : 2024/04/05
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 정수를 입력받아 그 수의 약수를 출력히시오
 * 
 * 문제분석 : 어떤 정수를 나누었을때 나누어 떨어지는수
 * 			정수를 입력 받는다.
 * 			1부터 수를 입력받은 정수까지 반복하면서 수를 1 증가시킨다
 * 			입력받은 정수를 수로 나누었을 때 나누어 떨어지면 약수
 * 알고리즘 : 
 * 		1. 정수를 입력 받는다.
 * 		2. 수를 1부터 입력받은 정수까지 반복하면서 수를 1씩 증가
 * 			2-1. 만약 0으로 나누어 떨어지면
 * 			
 */

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		// Scanner 객체 생성
				Scanner stdIn = new Scanner(System.in);
				// 1. 알고싶은 단을 입력 받는다.
				System.out.print("약수를 구할 정수 입력 : ");
				int num = stdIn.nextInt();
				System.out.print(num+"의 약수 : ");
				for(int su=1;su<=num;su++) {
					if(num%su==0) {
						System.out.print(su+" ");
					}
				}
	}

}
