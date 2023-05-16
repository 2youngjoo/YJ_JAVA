package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class test {
	public static void main(String[] args) {
		int num=12;
		
		MemberDto dto=new MemberDto();
		dto.setNum(num);
		boolean isSuccess = new MemberDao().delete(num);
		
		if(isSuccess) {
			System.out.println("삭제했습니다");
		}
	}
}
