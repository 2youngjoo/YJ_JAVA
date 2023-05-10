package test.main;

import test.mypac.SkyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		Weapon w1=new SkyWeapon();
		w1.prepare();
		w1.attack(); // 이 메소드가 공중 공격을 하도록 프로그래밍 해보세요
	}
}
