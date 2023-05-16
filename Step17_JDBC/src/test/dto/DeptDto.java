package test.dto;


public class DeptDto {
	// 필드의 접근 지정자를 private로
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDto(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	// 디폴트 생성자
	public DeptDto() {}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	// 마우스 우 클릭 -> source -> generate 메뉴 -> constructor 와 setter, getter 메소드 생성 가능
		
	
}
