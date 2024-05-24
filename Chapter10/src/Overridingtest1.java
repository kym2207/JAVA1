/*
 * 메소드 오버라이딩 1
 */

class OT1a{
	//매개 변수가 1개인 메소드 생성.
	public void show(String str) {
		System.out.println("상위 클래스 메소드 show(String str) 수행 : " + str);
		
	}
}
class OT1b extends OT1a{
	//매개 변수가 1개인 메소드 생성.
	public void show() {
		System.out.println("하위 클래스 메소드 show(String str) 수행 : ");
		
	}
}


public class Overridingtest1 {

	public static void main(String[] args) {
		OT1b otb = new OT1b();
		otb.show("처음 시작하는 자바");
	}

}