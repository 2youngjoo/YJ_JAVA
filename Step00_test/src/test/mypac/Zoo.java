package test.mypac;

public class Zoo {
	public class Lee{
		public void say() {
			System.out.println("안녕! 나는 이영주야");
		}
	}
	
	public class Yeom{
		public void say() {
			System.out.println("안녕! 나는 염이야");
		}
	}
	
	public Lee getLee() {
		return new Lee();
	}
	
	public Yeom getYeom() {
		return new Yeom();
	}
}
