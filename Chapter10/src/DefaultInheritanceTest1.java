/*
 * 작성일 : 2024/05/21
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 상속과 생성자
 */
class DA1 {
	public double d1;
	public DA1() {  // 클래스 DA1의 묵시적 생성자.
		System.out.println("클래스 DA1의 묵시적 생성자 수행");
		d1 = 10*10;
		
	}
}

class DA2 extends DA1 {
	public double d2;
	public DA2() { // 클래스 DA2의 묵시적 생성자.
		System.out.println("클래스 DA2의 묵시적 생성자 수행");
		d2 = 10*10*10;
	}
	// d2, DA2(), d1을 가지고 있다.
}
class DA3 extends DA2 {
	public double d3;
	public DA3() { // 클래스 DA2의 묵시적 생성자.
		System.out.println("클래스 DA3의 묵시적 생성자 수행");
		d3 = 10*10*10*10;
	}
	// d3. DA3(), d2, d1을 가지고 있다
	// 생성자는 상속되지 않는다.
}
public class DefaultInheritanceTest1 {

	public static void main(String[] args) {
		DA3 da3 = new DA3(); // 객체 생성. => DA3()묵시적 생성자 수행.
		// 상위 클래스의 묵시적 생성자가 우선 수행된다.
		
		System.out.println("----------------------");
		DA2 da2 = new DA2();
	}

}
/*
 * 상속 관계에서 하위 클래스
 * 
 */