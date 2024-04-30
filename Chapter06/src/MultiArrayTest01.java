/*
 * 작성일 : 2024/04/30
 * 작성자 : 202395008 김유민
 * 설명 : 
 */
import java.util.Arrays;
import java.util.Random;

public class MultiArrayTest01 {

	public static void main(String[] args) {
		// 2차원 배열 생성
		// 줄, 칸
		int[][] num = new int[4][4];
		int jul, kan, sum = 0;
		
		// 랜덤으로 값 초기화를 하기위해 랜덤 객체 생성
		Random random = new Random();
		
		// 랜덤으로 2차원 배열에 값 저장
		for(jul=0;jul<4;jul++) {
			for(kan=0;kan<4;kan++) {
				num[jul][kan] = random.nextInt(10);
			}
		}
		// 2차원 배열 값 출력
		for(jul=0;jul<4;jul++) {
			for(kan=0;kan<4;kan++) {
				System.out.print(num[jul][kan]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		// 2차원 배열의 내용을 문자열로 출력
		System.out.println(Arrays.deepToString(num));
		
		// 각 줄의 칸의 값들을 합하여 출력하시오.
		/*
		 * 0번줄의 0,1,2,3칸의 합을 계산한다.
		 * 1번줄의 0,1,2,3칸의 합을 계산한다.
		 * 2번줄의 0,1,2,3칸의 합을 계산한다.
		 * 3번줄의 0,1,2,3칸의 합을 계산한다.
		 * 줄을 기준으로 각 칸의 합을 계산하고, 각 줄에 합을 출력한다.
		 * 한 줄의 합이 계산되어 출력되면 다음 줄의 합을 계산하기 위해
		 * sum = 0 으로 다시 초기화 한다
		 */
		for(jul=0; jul < num.length; jul++) {
			sum=0;
			for(kan=0; kan < num[jul].length; kan++) {
				sum+=num[jul][kan];
				System.out.print(num[jul][kan] + " ");
			}
			System.out.println("합 : " + sum);
		}
	}

}
