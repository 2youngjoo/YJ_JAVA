package test.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		Calc add1 = new Calc() {

			@Override
			public double execute(double num1, double num2) {				
				return num1+num2;
			}
			
		};
		
		// 위 Override 코드를 줄인 표현식		
		Calc add2 = (num1, num2)->{
			return num1+num2;
		};
		
		Calc add = (num1, num2) -> num1+num2;
		Calc sub = (num1, num2) -> num1-num2;
		Calc mul = (num1, num2) -> num1/num2;
		
		double result1 = add.execute(10, 20);
		double result2 = sub.execute(10, 20);
		double result3 = mul.execute(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
}
