package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		// 추가할 회원의 정보
		String name="덩어리";
		String addt="목동";
		
		// 추가할 회원의 정보를 MemberDto 객체에 담는다.
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addt);
		
		// DB에 저장하기
		new MemberDao().insert(dto);
		
		// DB에 저장된 Data 삭제하기
		int num=7;
		
	}
}
