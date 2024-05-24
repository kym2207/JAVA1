class AAA1{
	 public int a = 10;
	 @Override
	 public String toString() {
		 return "AAA1 클래스 객체 속성 a 같은 : "+ a;
	 }
}
public class ObjectMethodTest2 {

	public static void main(String[] args) {
		AAA1 aa = new AAA1();
		System.out.println(aa.toString());
		System.out.println(aa);
	}

}
