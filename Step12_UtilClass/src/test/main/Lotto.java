package test.main;
import java.util.Arrays;
import java.util.Random;
/*
 *  1. java 콘솔 창 실행 결과
 *  
 *  로또를 몇개 구입 하시겠어요?
 *  1, 4, 5, 6, 40, 45
 *  3, 4, 10, 15, 16, 20
 *  
 *  단)번호는 오름차순 정렬되어 있어야 한다.
 *    중복복된 번호가 나오면 안된다.
 *    
 *  2. javascript
 *  
 *  - 토끼 잡기 게임을 나름대로 마음대로 만들어 보기
 */
public class Lotto {
	public static void main(String[] args) {
		   int[] numbers = new int[6]; // 로또 번호를 저장할 배열 생성
		   Random rand = new Random(); // 무작위 숫자 생성을 위한 Random 객체 생성

		   // 배열에 로또 번호를 무작위로 할당
		   for (int i = 0; i < 6; i++) {
		      int n = rand.nextInt(45) + 1;
		     if (contains(numbers, n)) {
		         i--;
		      } else {
		         numbers[i] = n;
		      }
		   }

		   // 배열을 오름차순으로 정렬
		   Arrays.sort(numbers);

		   // 결과 출력
		   System.out.print("로또 번호: ");
		   for (int number : numbers) {
		      System.out.print(number + " ");
		   }
		}

		// 배열에 특정 숫자가 포함되어 있는지 확인하는 메소드
		public static boolean contains(int[] arr, int n) {
		   for (int i : arr) {
		      if (i == n) {
		         return true;
		      }
		   }
		   return false;
		}}
