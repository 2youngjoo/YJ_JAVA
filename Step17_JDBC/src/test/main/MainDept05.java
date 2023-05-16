package test.main;

import java.util.List;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class MainDept05 {
	public static void main(String[] args) {
		List<DeptDto> list = new DeptDao().getList();
		for(DeptDto tmp:list){
			System.out.println(tmp.getDeptno()+" | "+tmp.getDname()+" | "+tmp.getLoc());
		}
	}
}
