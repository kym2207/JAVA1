/*
 * 메소드 오버라이딩 2
 */

class OT2a{
	//매개 변수가 1개인 메소드 생성.
	public void show(String str) {
		System.out.println("상위 클래스 메소드 show(String str) 수행 : " + str);
		
	}
}
class OT2b extends OT2a{
	//메소드 이름이 같고, 매개변수의 타입과 개수가 같다.
	// 오버라이딩 => 상위 클래스의 메소드를 재정한ㅅ것
	public void show(String s) {
		System.out.println("하위 클래스 메소드 show(String str) 수행 : "+s);
		// 해당 클래스는 매개변수가 잇는 메소드와 매개변수가 없는 메소드 2대가 있다.
	}
}


public class OverridingTest2 {

	public static void main(String[] args) {
		OT2b otb = new OT2b();
		otb.show("쉽다. 자바");// 상위 클래스의 메소드를 사용하지 모함.
							 // 하위 클래스에서 재정의 한 메소드 호출
		OT2a ota = new OT2a();
		ota.show("어렵다. 자바");//상위 클래스 메소드 호출
	}

}