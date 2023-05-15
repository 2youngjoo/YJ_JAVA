package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass03 {
	public static void main(String[] args) {
		// DB 연결 객체를 담을 지역 변수 만들기
		Connection conn=null;		
		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 DB의 정보 @IP주소 : Port번호 : db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			// 계정 비밀번호를 이용해서 Connection 객체의 참조 값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "tiger");
			// 예외가 발생하지 않고 여기까지 실행 순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 3번 회원의 주소를 동물원으로 수정 하고자 한다.
		int num=3;
		String addr="에버랜드";
		
		PreparedStatement pstmt=null;
		try {
			String sql = "UPDATE member"
					+ " SET addr = ? "
					+ " WHERE num = ?";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, addr);
			pstmt.setInt(2, num);
			
			// sql 문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원 정보를 저장 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
