package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.mypac.Member;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		// 수정 할 회원의 정보
		int num=1;
		String name="호빵";
		String addr="독산동";
		
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		dto.setNum(num);
		// update() 메소드의 매개변수에 전달해서 회원 정보가 수정되도록 한다.
		
		update(dto);
	}
	
	// 회원 한 명의 정보를 수정하는 메소드
	public static void update(MemberDto dto) {
		Connection conn=null;
        PreparedStatement pstmt=null;
        try {
        	// Connection 객체의 참조 값 얻어오기
        	conn=new DBConnect().getConn();
        	
        	//실행할 미완성의 sql문
        	String sql="UPDATE member"
					+ " SET name = ? "
					+ " , addr = ? "
					+ " WHERE num = ?";
        	
        	//미완성의 sql 문을 전달하면서 PreparedStatement 객채의 참조값 얻어내기
        	pstmt=conn.prepareStatement(sql);
         
        	//PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(?에 값 바인딩하기)
        	pstmt.setString(1, dto.getName());
        	pstmt.setString(2, dto.getAddr());
        	pstmt.setInt(3, dto.getNum());
        	
        	//sql 문 실행하기
        	pstmt.executeUpdate();
        	System.out.println("회원 정보를 저장했습니다.");
        } catch (Exception e) {
        	e.printStackTrace();
        }	
	}
}
