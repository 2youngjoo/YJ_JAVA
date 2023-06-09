package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		// HandPhone 객체를 생성해서 나온 참조 값을 Object type p3라는 지역 변수에 담아보기
		Object p3 = new HandPhone();
		
		// Object type p3 변수에 담긴 값을 Phone type p2라는 변수에 담기
		// casting (Phone) 해주면 성립 가능
		Phone p2 = (Phone)p3;
		
		// Object type p3 변수에 담긴 값을 HandPhone type p1이라는 변수에 담기
		HandPhone p1 = (HandPhone)p3;
	}
}
