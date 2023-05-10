package test.mypac;

public class MyWeapon extends Weapon{
	
	// 부모 클래스의 추상 메소드를 반드시(강제로) Override 해야한다.
	@Override
	public void attack() {
		// 어디를 공격할지는 프로젝트 상황에 맞게 마음대로 공격하면 된다.
		System.out.println("지상 공격을 해요!");
	}
}
