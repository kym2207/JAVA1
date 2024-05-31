/*
 * 작성일 : 2024/05/31
 * 작성자 : 컴공부 202395008 김유민
 * Calculator_class 클래스를 작성하세요.
	이 클래스는 두 개의 정수와 실수를 더하고 빼는 메소드를 가집니다.
	
	int add(int a, int b): 두 정수의 합을 반환합니다.
	double add(double a, double b): 두 실수의 합을 반환합니다.
	int subtract(int a, int b): 두 정수의 차를 반환합니다.
	double subtract(double a, double b): 두 실수의 차를 반환합니다.
	
	Calculator 클래스
	main 메소드 : calculator_class로부터 객체를 생성하고,
				두 정수를 입력 받아 합과 차를 출력합니다.
	[출력결과]
	첫 번째 정수 입력: 3
	두 번째 정수 입력: 5
	두 정수의 합계: 8
	두 정수의 차: -2
	첫 번째 실수 입력: 7.3
	두 번째 실수 입력: 5.5
	두 실수의 합계 : 12.8
	두 실수의 차 : 1.7999999999999998
 */

import java.util.Scanner;

class Culculator_class {
	public int add(int a, int b) { return a+b;}
	public double add(double a, double b) { return a+b;}
	public int subtract(int a, int b) { return a-b;}
	public double subtract(double a, double b) { return a-b;}
}
public class Calculator1 {

	public static void main(String[] args) {
		// 객체 생성
		Culculator_class calc = new Culculator_class();
		
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 2개의 정수를 입력 받아 결과 출력
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = stdIn.nextInt();

		System.out.println("두 번째 정수의 합 : "+ calc.add(num1,  num2));
		System.out.println("두 번째 정수의 차 : "+ calc.subtract(num1,  num2));
		
		System.out.print("첫 번째 정수 입력 : ");
		double num3 = stdIn.nextDouble();
		System.out.print("두 번째 정수 입력 : ");
		double num4 = stdIn.nextDouble();

		System.out.println("두 번째 정수의 합 : "+ calc.add(num1,  num2));
		System.out.println("두 번째 정수의 차 : "+ calc.subtract(num1,  num2));
	}

}
