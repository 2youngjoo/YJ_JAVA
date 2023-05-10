package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  1. Bike 객체를 담을 수 있는 방 3개짜리 배열 객체를 생성해서 참조 값을
		 *     bike 라는 지역 변수에 담아 보세요.     
		 *     
		 *  2. 배열의 각각의 방(0,1,2번)에 Bike 객체를 생성해서 담아 보세요.
		 *  
		 *  3. 반복문 for을 이용해서 순서대로 배열의 각각의 방에 있는 Bike 객체의 
		 *     ride() 메소드를 호출해 보세요.   
		 */
		
		Bike[] bikes = new Bike[3];
		bikes[0] = new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();
		
		for(int i = 0; i < bikes.length; i++) {
			// i번째 방에 있는 Bike 객체의 참조 값을 얻어와서 임시 변수 tmp에 담기
			Bike tmp=bikes[i];
			// 객체의 참조 값이 들어있는 tmp에 . 찍어서 메소드 호출
			tmp.ride();
		}
		System.out.println("----- 확장 for문을 사용하면 -----");
		for(Bike tmp:bikes) {
			tmp.ride();
		}
		
	}	
}
