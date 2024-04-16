/*
 * 작성일 : 2024/04/16
 * 작성자 : 202395008 김유민
 * 설명 : 1차원 배열을 생성하고, 묵시적 초기값을 출력한다.
 * 		사용자로부터 값을 입력받아 배열에 저장하고, 합과 평균을 출력하시오.
 */

import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		int i, sum =0;
		double avg;
		int num[] = new int[5]; // 배열 선언 및 생성.
		
		System.out.println("배열의 길이 : " + num.length);
		
		System.out.println("배열에 저장된 초기값");
		for(i = 0;i < 5; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
		
		// 사용자로부터 값 입력받아 배열에 저장.
		System.out.println("사용자로부터 값 입력받아 배열에 저장");
		for(i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "] 번지에 데이터 입력 : ");
			num[i] = stdIn.nextInt();

		}
		System.out.println();
		//배열에 저장된 값 출력
		System.out.println("배열에 저장된 값");
		for(i = 0;i < 5; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
		
		// 배열에 저장된 값들의 합과 평균 계산하여 출력
		for(i = 0;i < num.length; i++) {
			sum+=num[i];
		}
		System.out.println("배열에 저장된 값의 합 : "+sum);
		avg=(double)sum/num.length;
		System.out.println("배열에 저장된 값의 평균 : "+avg);
		
	}

}
