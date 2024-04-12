/*
 * 작성일 : 2024/04/12
 * 작성자 : 컴공부 202395008 김유민
 * 설명 : 
 */

public class BreakTest2 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<10;i++) {
			for(j=1;j<i;j++) {
				if(j>6) {
					break;
				}
				System.out.print("♥ ");
			}
			System.out.println();	
		}

	}

}
