/*
 * 작성일 : 2024/04/30
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : MutiDiv 클래스 생성.
 * 		 곱하기, 나누기 계산하는 기능이 있다.
 * 		 그리고 더하기, 뺴기 계산하는 기능도 있다.
 */
public class MultiDiv extends PlusMinus {
	// 속성 정의
	int multi;
	double div;
	
	// multi 기능(메소드) 정의
	public String multi(int x, int y) {
		multi = x*y;
		return "두 수의 곱은 " + multi;
	}
	// div 기능(메소드) 정의
	// private = 접근 금지. 캡슐화.
	public String div(int x, int y) {
		div = x/y;
		return "두 수의 나눈 값은 " + div;
	}
}
