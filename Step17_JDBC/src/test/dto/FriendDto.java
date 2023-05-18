package test.dto;


public class FriendDto {
	// 필드의 접근 지정자를 private로
	private int num;
	private String name;
	private String addr;
	
	public FriendDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	
	// 디폴트 생성자
	public FriendDto() {}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	// 마우스 우 클릭 -> source -> generate 메뉴 -> constructor 와 setter, getter 메소드 생성 가능
		
}
