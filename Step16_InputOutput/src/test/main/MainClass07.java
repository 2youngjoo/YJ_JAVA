package test.main;

import java.io.File;
import java.io.FileWriter;

public class MainClass07 {
	public static void main(String[] args) {
		// 파일에 저장 할 sample 문자 열
		String msg="안녕하세요";
		
		File f=new File("c:/acorn202304/myFolder/diary.txt");
		
		try {
			// 만일 파일이 존재하지 않는다면 
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("diary.txt 파일을 만들었습니다.");
			}
			
			// 파일에 문자 열을 출력할 수 있는 객체의 참조 값 얻어내기
			// new FileWriter( File 객체, append 모드 여부)
			FileWriter fw=new FileWriter(f, true);
			
			fw.write(msg); // 출력 할 준비
			fw.flush(); // 출력
			fw.close(); // 마무리
			System.out.println("diary.txt 파일에 문자 열을 기록 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

