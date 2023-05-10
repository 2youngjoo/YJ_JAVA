package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 ArrayList<Integer> 객체를 생성해서 참조 값을 지역 변수 nums에 담기
		ArrayList<Integer> nums = new ArrayList<>();
		
		// ArrayList 객체에 10, 20, 30 숫자 3개를 담아 보세요.
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		// 일반 for 문
		 for(int i = 0; 1 < nums.size(); i++) {
			Integer tmp = nums.get(i);
			System.out.println(tmp);
		}
		
		System.out.println("--- 확장 for 문 ---");
		
		// 확장 for 문을 이용해서 저장된 정수를 순서대로 콘솔 창에 출력하기
		// for(Integer tmp : nums);{} => Integer 대신에 int를 넣어도 된다.
		for(int tmp : nums) {
			System.out.println(tmp);
		}
	}
}
