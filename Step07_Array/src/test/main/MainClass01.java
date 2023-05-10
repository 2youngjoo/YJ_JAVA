package test.main;
/*
 *  Java에서 배열도 객체
 *  배열은 참조 데이터 type이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		
		//int num = null;
		
		// int type 배열
		//int[] nums = null;
		
		// javascript 에서는 let num2 = []; 이거와 비슷하다 생각하면 된다.
		//int[] nums2 = {10, 20, 30, 40, 50}; 
		
		//String a = null;

		
		
		// int type 5개를 저장하고 있는 배열 객체 생성해서 참조 값을 nums 라는 지역 변수에 담기
		int[] nums = {10, 20, 30, 40, 50};
		
		// double type 5개를 저장하고 있는 배열
		double[] nums2 = {10.1, 10.2, 10.3, 10.4, 10.5};
		
		// boolean type 5개를 저장하고 있는 배열
		boolean[] truth = {true, false, false, true, true};
		
		// String type (참조 데이터 type) 5개를 저장하고 있는 배열
		String[] names = {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		
		// 배열 객체는 .clone() 이라는 메소드와 .length 라는 필드가 있다.
		// 이 메소드는 거의 사용되지 않는다.
		int[] result=nums.clone();
		
		// 배열의 크기 얻어내기
		int size=nums.length;
		
		// 배열은 순서가 있는 데이터 이다. 특정 index의 item 참조하는 방법
		int first=nums[0];
		int second=nums[1];
		int third=nums[2];
	}
}
