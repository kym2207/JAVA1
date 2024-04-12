import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		int month;
		
		do {
			System.out.print("월 입력하시오(종료:0) : ");
			month = stdIn.nextInt();
			switch(month)
			{
				case 3 :   case 4 :  case 5:
					System.out.print("봄입니다\n");
					break;
				case 6 :   case 7 :  case 8:
					System.out.print("여름입니다\n");
					break;
				case 9 :   case 10 :  case 11:
					System.out.print("가을입니다\n");
					break;
				case 12 :   case 1 :  case 2:
					System.out.print("겨울입니다\n");
					break;
				case 0:
					System.out.println("프로그램 종료!");
					break;
				default:
					System.out.println("해당 월은 없습니다.");
					break;
			}
		}while(month!=0);

	}

}
