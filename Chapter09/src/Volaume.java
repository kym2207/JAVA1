import java.util.Scanner;

// 박스의 부피 게산하는 클래스
class Box {
	int width, height, depth; // 멤버 변수 - 객체 변수 / 클래스 전역에서 사용 가능
	
	// 생성자. 매개 변수가 3개인 생성자.
	// 3개의 값을 전달 받아 각 변수에 저장한다.
	public Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// 매개 변수가 없는 생성자 - 묵시정 생성자.
	public Box() {
		width = 10;
		height = 20;
		depth = 30;
	}
}

public class Volaume {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("가로 길이 입력 : ");
		int w = stdIn.nextInt();
		System.out.print("세로 길이 입력 : ");
		int h = stdIn.nextInt();
		System.out.print("깊이 길이 입력 : ");
		int d = stdIn.nextInt();
		
		// 매개 변수가 3개인 생성자 호출
		// 생성자가 있는 클래스로부터 객체를 생성하는 경우,
		// 반드시 생성자의 매개변수 형과 개수가 일치해야 한다.
		Box mybox1 = new Box(w, h, d);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("입력 받은 박스의 부피는 : " + vol);
		
		// 매개 변수가 없는 생성자 호출
		Box mybox2 = new Box();
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("입력 받은 박스의 부피는 : " + vol);
	}

}
