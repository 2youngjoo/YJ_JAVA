package test.main;

import test.mypac.LeeRemocon;
import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.TvRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		// 다형성 확인
		MyRemocon r1 = new MyRemocon();
		Remocon r2=r1;
		Object r3=r1;
		
		// 직접 클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon() 메소드를 여기서 호출해 보세요.
		// useRemocon(new LeeRemocon());
		// Remocon r = new LeeRemocon();
		// useRemocon(r);
		
		TvRemocon r4 = new TvRemocon();
		useRemocon(r4);
		// 나만의 기능도 호출해 보기
		r4.reserve();
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		
		// 만일 여기서 reserve() 메소드를 활용하고 싶으면 방법이 없을까?
		TvRemocon r2=(TvRemocon)r; // -> r이 TvRemocon type이라는 확신이 있을 때 가능
		r2.reserve();
		
	}
}
