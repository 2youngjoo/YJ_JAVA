package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Lee;
import test.mypac.Zoo.Yeom;

public class MainClass1 {
	public static void main(String[] args) {
		Zoo z1 = new Zoo();
		
		Lee l1 = z1.getLee();
		l1.say();
		
		Zoo z2 = new Zoo();
		
		Yeom y1 = z2.getYeom();
		y1.say();
	}
}
 