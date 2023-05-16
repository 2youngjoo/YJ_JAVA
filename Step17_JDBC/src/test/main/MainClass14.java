package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		// 수정할 회원의 정보
		int num=1;
		String name="김구라";
		String addr="독산동";
		
		// 위의 정보를 이용해서 1번 회원의 정보를 수정하고 성공이면 "수정됐습니다"가 출력되도록 해보기
		
		// 수정할 회원 정보를 MemberDto 객체에 담고
		// MemberDao 객체를 생성해서 update() 메소드를 이용해 수정하고 성공 여부 리턴 받기
//		MemberDto dto = new MemberDto();
//		
//		dto.setName(name);
//		dto.setAddr(addr);
//		dto.setNum(num);
		
		// 생성자의 인자로 회원 정보를 전달해서 객체를 생성할 수 도 있다.
		MemberDto dto=new MemberDto(num, name, addr);
		
		boolean isSuccess =new MemberDao().update(dto);
		if(isSuccess) {
			System.out.println("수정됐습니다");
		}
		
	}
}
