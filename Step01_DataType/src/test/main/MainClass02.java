package test.main;
/*
 * 주석에 표기된것 대로 코딩을 완성해 보세요.
 */
public class MainClass02 {
	public static void main(String[] args) {
		// 1. 콘솔 창에 "main 메소드가 시작되었습니다."를 출력해 보세요.
		System.out.println("main 메소드가 시작 되었습니다.");
		// 2. 국어 점수 95를 kor 이라는 변수에 담아 보세요.
		int kor = 95;
		// 3. 영어 점수 100을 eng 라는 변수에 담아 보세요.
		int eng = 100;
		// 4. 국어 점수와 영어 점수의 평균을 구해서(연산자 활용) avg라는 변수에 담아 보세요.
		double avg = (kor + eng)/2f;
		// 5. 콘솔 창에 avg 변수 안에 담긴 내용을 출력해 보세요.
		System.out.println("국어점수" + kor + " 영어점수" + eng + "의 평균점수는 " + avg + "입니다.");
	}
}
