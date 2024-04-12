/*
 * 작성일 : 2024/04/05
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 정수를 입력받아 1개부터 입력받은 정수까지 차례대로 ★ 출력
 * 
 * 문제분석:
 * 		정수입력
 * 		1부터 정수까지 한줄씩 ★출력
 * 알고리즘:
 * 		1. 정수입력
 * 		2. 1부터 정수까지 i를 증가시키며 반복
 * 			2-1. 1부터 i까지 j를 증가시키며 반복
 * 				2-1-1. ★출력
 * 			2-2. 줄바꿈
 */
import java.util.Scanner;

public class estedLoopTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력 하시오 : ");
		int num = stdIn.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j =1;j<=i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=num;i>=1;i--) {
			for(int j =i;j>=1;j--)
			{
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
