package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  java.util 패키지에 있는 Random 클래스 사용해 보기
		 */
		Random ran=new Random();
	    
		// 0~9 사이의 랜덤한 정수를 얻어내서 ranNum 이라는 지역 변수에 담아 보세요
		int ranNum = ran.nextInt(0,9);
		System.out.println(ranNum);
		
		// ranNum 지역 변수에 담기 내용을 콘솔 창에 출력해 보세요

	}
}
