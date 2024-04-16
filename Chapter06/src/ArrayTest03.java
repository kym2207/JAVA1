/*
 * 작성일 : 2024/04/16
 * 작성자 : 202395008 김유민
 * 설명 : 1차원 배열에 정수 값을 저장하여 생성하시오.
 * 		 사용자로부터 정수를 하나 입력받아 그 정수가 어디에 몇개 있는지 출력하시오.
 * 		 입력한 값이 배열에 없다면 "입력한 값이 없습니다."를 출력하시오.
 */

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		int num[] = {1,1,2,3,4,5,5,6,6,9,9,8,8,2,1};
		int c=0;
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);

		System.out.print("찾을 수 입력 : ");
		int su = stdIn.nextInt();
		
		for(int i=0;i<num.length;i++) {
			if(su==num[i]) {
				c++;
				System.out.print("num[" + i + "] ");
			}
		}
		if(c==0) {
			System.out.println("입력한 값이 없습니다.");
		}
		else {
			System.out.println("에 "+c+"개 있습니다.");
		}
	}

}
