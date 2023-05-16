package test.main;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class MainDept04 {
	public static void main(String[] args) {
		int num=0;
		
		DeptDto dto = new DeptDto();
		DeptDao dao = new DeptDao();
		
		dto.setDeptno(num);
		
		boolean isSuccess = dao.delete(num);
		if(isSuccess) {
			System.out.println("회원 정보 저장했습니다.");
		}
		
	}
}
