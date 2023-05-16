package test.main;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class MainDept02 {
	public static void main(String[] args) {
		String name="Leeyoungjoo";
		String loc="hawaii";
		
		DeptDto dto = new DeptDto();
		DeptDao dao = new DeptDao();
		
		dto.setDname(name);
		dto.setLoc(loc);
		
		boolean isSuccess = dao.insert(dto);
		if(isSuccess) {
			System.out.println("회원 정보 저장했습니다.");
		}
		
	}
}
