package test.main;

import java.util.Random;

public class QuizMain2 {
	public static void main(String[] args) {
		/*
		 *  2. run 했을 때
		 *     5개의 문자 열 중에서 3개가 한 줄에 한번에 랜덤하게 출력되게 해보세요.
		 *     예) cherry | apple | cherry
		 *         7 | apple | melon
		 *         7 | 7 | 7
		 */
		
		String[] items= {"cherry", "apple", "banana", "melon", "7"};
		// 랜덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		
		/*
		int items1 = ran.nextInt(5);
		int items2 = ran.nextInt(5);
	    int items3 = ran.nextInt(5);
	
		System.out.print(items[items1]);
		System.out.print(" | ");
		System.out.print(items[items2]);
		System.out.print(" | ");
		System.out.print(items[items3]);
		*/
		
		// 3회 반복하면서
		for(int i = 0; i < 3; i++) {
			// 0~4 사이의 랜덤한 숫자를 하나 얻어내서
			int ranNum=ran.nextInt(5);
			// 배열의 인덱스로 활용해서 문자 열 출력하기
			System.out.print(items[ranNum]);
			if(i < 2) {
				System.out.print(" | ");
			}
		}
	}
}
