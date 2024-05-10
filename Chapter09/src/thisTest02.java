class Box2{
	int width, height, depth;
	
	// 생성자.
	// 매개변수의 의미가 명확해 졌다.
	// 객체변수와 매개변수의 이름이 같다. => 문제있다.
	public Box2(int width, int height, int depth) {
		// 자신의 변수에 자신의 값을 저장한다.
		// 생성자 메소드 내의 변수로만 취급된다.
		width = width;
		height = height;
		depth = depth;
	}
}
public class thisTest02 {

	public static void main(String[] args) {
		Box2 mybox = new Box2(1,2,3);
		System.out.println(mybox.width);
		// 의미없는 0이 출력된다.
	}

}
