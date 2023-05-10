package test.mypac;

public class Zoo {
	public class Monkey{
		public void say() {
			System.out.println("안녕! 나는 원숭이야");
		}
	}
	
	// 내부 클래스
	public class Tiger{
		public void say() {
			System.out.println("안녕! 나는 호랑이야");
		}
	}
	
	// 메소드
	public Monkey getMonkey() {
		// 내부 클래스로 객체를 생성해서 리턴 해주기
		return new Monkey();		
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}
