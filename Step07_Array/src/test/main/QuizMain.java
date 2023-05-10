package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 *  1. run 했을 때
     	 *	cherry, apple, banana, melon, 7
     	 *	5개의 문자 열 중에서 1개가 랜덤하게 출력되게 해보세요.
		 *
		 */
		
		// 랜덤한 숫자를 얻어내기 위한 객체
		Random ran = new Random();
		// String[] str = {"cherry", "apple", "banana", "melon", "7"};
		String[] str = new String[5];
		str[0]="cherry";
		str[1]="apple";
		str[2]="banana";
		str[3]="melon";
		str[4]="7";
		
		int i = ran.nextInt(5);
		System.out.println(str[i]);
		
	}
}
