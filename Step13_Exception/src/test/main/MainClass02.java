package test.main;

import java.util.Scanner;

public class MainClass02 {
   public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      
      System.out.print("나눌수 입력:");
      String inputNum1=scan.nextLine();
      System.out.print("나누어 지는수 입력:");
      String inputNum2=scan.nextLine();
      
      int num1=Integer.parseInt(inputNum1);
      int num2=Integer.parseInt(inputNum2);
      
      int result=num2/num1; //몫
      int result2=num2%num1; //나머지
      System.out.print(num2+" 를 "+num1+" 으로 나눈 몫 :"+result);
      System.out.print(num2+" 를 "+num1+" 으로 나눈 나머지:"+result2);
      
      System.out.print("main  메소드가 정상 종료 됩니다.");      
   }
}
