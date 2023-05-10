package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  현재 존재하거나 존재하지 않는 파일, 폴더를 제어할 수 있는 File 객체를 생성해
		 *  참조 값을 f라는 지역 변수에 대입
		 */
		File f = new File("c:/acorn202304/myFolder/memo.txt");
		
		// File 객체의 메소드를 활용해서
		// 실제 memo.txt 파일이 존재하지 않으면 파일을 만들고
		// 존재하면 memo.txt 파일을 삭제하도록 프로그래밍 해보기
		
		if(f.exists() == false) {
			try {
				f.createNewFile();
				System.out.println("memo 파일을 생성 했습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			f.delete();
			System.out.println("memo 파일을 삭제 했습니다.");
		}
		System.out.println(f.exists());
	}
}
