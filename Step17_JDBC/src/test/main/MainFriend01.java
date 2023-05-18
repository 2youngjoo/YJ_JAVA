package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  JDBC ( Java DataBase Connnectivity )
 *  
 *  DataBase에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 *  
 *  Oracle에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar 파일을
 *  사용할 수 있도록 설정 해야한다.
 *  
 *  프로젝트에 마우스 우 클릭 => Build Path => Configure Build Path => Librarys 텝 선택
 *  => classpath 선택 => 우측 Add External jar 버튼을 누른 후 => ojdbc6.jar 파일을 찾은 다음
 *  => Apply
 */
public class MainFriend01 {
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
		// SELECT 작업을 위해서 필요한 객체의 참조 값을 담을 지역 변수 미리 만들기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			// 실행 할 sql 문
			String sql="SELECT num, name, addr"
					+ " FROM friend "
					+ " ORDER BY num ASC ";
			
			// PreparedStatement 객체의 참조 값 얻어오기
			pstmt=conn.prepareStatement(sql);
			// SELECT문 실행하고 결과 값을 ResultSet으로 얻어내기
			rs=pstmt.executeQuery();
			while(rs.next()) { // rs.next = Cursor를 한 칸씩 내려주는 것
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				
				// 콘솔 창에 출력 해보기
				System.out.println(num+" | "+name+" | "+addr);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
