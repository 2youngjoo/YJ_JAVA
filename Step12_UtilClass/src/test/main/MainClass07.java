package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainClass07 {
	public static void main(String[] args) {
		/*
		 *  세명의 회원 정보(번호, 이름, 주소)를 HashMap 객체에 각각 담아서
		 *  
		 *  ArrayList 객체에 누적 시켜 보세요
		 *  
		 *  반복문 돌면서 ArrayList 객체에 누적된 회원 정보를 콘솔 창에 순서대로 출력하기
		 *  
		 *  (HashMap 객체3개, ArrayList 객체1개가 생성이 되어야 한다.)
		 *  
		 *  ArrayList 객체 안에 HashMap을 담을 예정이니
		 *  
		 *  List<HashMap<String, Object>> type이 필요합니다.
		 */
		
		List<HashMap<String, Object>> list = new ArrayList<>();
		
		HashMap<String, Object>map1 = new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		
		HashMap<String, Object>map2 = new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "행신동");
		
		HashMap<String, Object>map3 = new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		map3.put("addr", "상도동");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		// for(int i=0; i<list.size(); i++){
		// System.out.println(list.get(i));	
		// }
		for(HashMap<String, Object>tmp:list) {
			
			// 번호
			int num = (int)tmp.get("num");
			
			// 이름
			String name = (String)tmp.get("name");
			
			// 주소
			String addr = (String)tmp.get("addr");
			
			System.out.println("회원번호:"+num+", 회원이름:"+name+", 회원주소:"+addr);
		}
	}
}
 