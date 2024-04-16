/*
 * 작성일 : 2024/04/16
 * 작성자 : 202395008 김유민
 * 설명 : 배열에 저장된 값 중 최대값과 최소값을 출력하시오.
 * 
 * 최대값, 최소값
 * 반드시 비교 대상이 필요하다.
 * {34, 23, 56, 12, 77}
 * 
 * 첫번째 값을 기준으로 비교한다. => 0번지에 저장된 값을 기준으로 한다.
 * 비교하여 큰 값은 max변수에 저장한다.
 * 작은 값은 min변수에 저장한다.
 */

public class ArrayTest02 {

	public static void main(String[] args) {
		// 배열 생성 및 초기화
		int num[] = {12,43,9,45,77,84,34,81,34};
		// 비교 기준 설정.
		int max = num[0];
		int min = num[0];
		int i;
		
		// 배열을 반복 하면서 비교하여 최대삾 최소값을 찾는다.
		for(i = 1; i < num.length; i++)
		{
			if(max < num[i]) {
				max=num[i];
			}
			if(min > num[i]) {
				min=num[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

		
		max = num[0];
		min = num[0];
		
		for(int j : num) {
			if(max < j)
				max=j;
			if(min>j)
				min=j;
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);  
	}

}
