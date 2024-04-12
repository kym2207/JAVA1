/*
 * 작성일 : 2024/04/05
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 1부터 10까지의 합을 출력하시
 */
public class DoWhileTest1 {

	public static void main(String[] args) {
		int sum=0;
		int num=1;
		
		do {
			sum+=num;
			num++;
		}while(num<=10);
		System.out.println("1~10까지의 합은 "+sum+"입니다.");
	}

}
