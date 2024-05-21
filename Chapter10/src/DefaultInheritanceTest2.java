/*
 * 작성일 : 2024/05/21
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 상속과 생성자
 */
class DB1 {
	public double d1;
	public DB1() {  // 묵시적 생성자.
		System.out.println("클래스 DB1의 묵시적 생성자 수행");
		d1 = 10*10;
		
	}
}

class DB2 extends DB1 {
	public double d2;
	public DB2() { // 묵시적 생성자.
		System.out.println("클래스 DB2의 묵시적 생성자 수행");
		d2 = 10*10*10;
	}
	// d2, DA2(), d1을 가지고 있다.
	public DB2(double d) {
		System.out.println("클래스 DB2의 명시적 생성자 수행");
		d2 = d * d * d;
	}
}

class DB3 extends DB2 {
	public double d3;
	public DB3() { // 묵시적 생성자.
		System.out.println("클래스 DB3의 묵시적 생성자 수행");
		d2 = 10*10*10*10;
	}
	// d2, DA2(), d1을 가지고 있다.
	public DB3(double d) {
		System.out.println("클래스 DB2의 명시적 생성자 수행");
		d3 = d * d * d * d;
	}
}

public class DefaultInheritanceTest2 {

	public static void main(String[] args) {
		DB3 db3 = new DB3(5);  //매개변수에 값 전달.
		
	}

}
