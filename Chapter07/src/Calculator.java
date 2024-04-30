/*
 * 작성일 : 2024/04/30
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 메인 메소드가 있는 클래스.
 * 		 클래스로부터 객체 생성하여 계산 결과 출력한다
 */
public class Calculator {

	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성.
		PlusMinus pm = new PlusMinus();
		// MultiDiv 클래스로부터 객체 생성.
		MultiDiv md = new MultiDiv();
		
		// 변수 선언.
		String sum, cha, multi, div;
		// pm 객체를 통해 PlusMinus 클래스에 있는 메소드 호출
		sum = pm.plus(10, 20);
		// pm 객체를 통해 PlusMinus 클래스에 있는 메소드 호출
		cha = pm.minus(30, 10);
		
		System.out.println(sum + "\n" + cha);
		
		// md 객체를 통해서 MultiDiv 클래스에 있는 메소드 호출
		multi = md.multi(10, 20);
		System.out.println(multi);
		
		// md 객체를 통해서 더하기 결과 출력
		// 메시지가 요수하는 메소드가 자신의 클래스에 없으면 상위 클래스에서 메소드를 찾는다.
		sum = md.plus(10, 20);
		System.out.println(sum);
		// md 객체를 통해서 더하기 결과 출력
		div = md.div(5, 2);
		System.out.println(div);
	}

}
