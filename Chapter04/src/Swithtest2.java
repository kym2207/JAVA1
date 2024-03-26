import java.util.Scanner;

public class Swithtest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("월을 입력 하세요(영문자) : ");
		String month = stdIn.next();
		String MtoS;
		switch (month)
		{
		
			case "December":
			case "January":
			case "February":
				MtoS="겨울입니다.";
				break;
			case "March":
			case "April":
			case "May":
				MtoS = "봄입니다.";
			break;
			case "June":
			case "July":
			case "August":
				MtoS = "여름입니다.";
				break;
			case "September":
				System.out.print("멋진 9월과 ");
			case "October":
				System.out.print("아름다운 10월과 ");
			case "November":
				System.out.print("낙엽의 11월은 ");
				MtoS = "가을입니다.";
			break;
			default:
				MtoS = "1~12월을 벗어난 달입니다.";
				break;
		}
				System.out.println(MtoS);
	}

}
