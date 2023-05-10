package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass00 {
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      Random rdom = new Random();
      String[] M = { "가위", "바위", "보" };
      System.out.println("(가위:0), (바위:1), (보:2) 입력하세요 : ");
      int a = scan.nextInt();
      int b = rdom.nextInt(3);

      if (a == 0 || a == 1 || a == 2) {
         System.out.println("나 : " + M[a] + "  vs  Com : " + M[b]);

         if (a == b) {
            System.out.println("비겼습니다.");
         } else if ((a + 1) % 3 == b) {
            System.out.println("졌습니다.");
         } else {
            System.out.println("이겼습니다.");
         }
      } else {
         System.out.println("잘못 입력 하였습니다.");
      }
   }
}