package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		// new Drill(){} -> 이것은 Drill type의 참조 값
		useDrill(new Drill() {

			@Override
			public void hole() {
					System.out.println("바닥에 구녕을 뚫어요!");
			}			
		});
		
		// 위에 Override 코드를 줄인 간략한 표현식
		// 추상 메소드가 오직 1개인 인터페이스에 한해서!
		// 직접 전달 하지는 않고 줄인 표현일 뿐이다.
		// 이해만 하고 넘어가기 (크게 중요하진 않다)
		useDrill(()->{
			System.out.println("천장에 구녕을 뚫어요!");
		});
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
		
	}
}
 