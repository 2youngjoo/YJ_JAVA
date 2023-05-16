package test.main;

import java.util.List;
import java.util.Scanner;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class MainDept06 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("검색할 직원 번호 입력:");
		
		int deptno=scan.nextInt();
		DeptDto dto = new DeptDao().getData(deptno);
		if(dto!=null) {
			System.out.print(deptno+" 번 직원의 이름은:"+dto.getDname()+" 위치는:"+dto.getLoc());
		}else {
			System.out.print(deptno+" 번 직원은 존재 하지 않습니다!");
		}
	}
}
