/*
 * 작성일 : 2024/04/30
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : PlusMinus 클래스 생성.
 * 		 더하기, 빼기 계산하는 기능이 있다.
 */
public class PlusMinus {
	// 속성 정의
	// 변수 생성
	int plus, minus;
	
	// 기능(메소드) 정의
	// plus 기능
	// 2개의 정수령 값을 전달 받아 합계를 구한 값을 돌려준다.
	public String plus(int x, int y) {
		plus = x + y;
		return "두 수의 합은 " + plus;
	}
	// minus 기능
	public String minus(int x, int y) {
		minus = x - y;
		return "두 수의 차는 " + minus;
	}
}
