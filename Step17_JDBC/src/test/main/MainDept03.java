package test.main;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class MainDept03 {
	public static void main(String[] args) {
		int num=0;
		String name="youngjoo";
		String loc="London";
		
		DeptDto dto = new DeptDto();
		DeptDao dao = new DeptDao();
		
		dto.setDname(name);
		dto.setLoc(loc);
		dto.setDeptno(num);
		
		boolean isSuccess = dao.update(dto);
		if(isSuccess) {
			System.out.println("회원 정보 삭제 했습니다.");
		}
		
	}
}
