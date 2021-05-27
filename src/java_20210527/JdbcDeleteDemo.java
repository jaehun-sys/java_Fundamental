package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		
		try {
			//1.드라이버를 로드한다.
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//2.데이터베이스와 연결할 수 있는 Connection 객체를 생성
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",	//주소
					"kpc12",	//아이디
					"kpc1212");	//패스워드
			
			//3.SQL을 전송할 수 있는 PreparedStatement 객체를 생성
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM member ");	//끝에 띄어쓰기 꼭 할 것! 
			sql.append("WHERE num = ? ");		//끝에 띄어쓰기 꼭 할 것!
			pstmt = con.prepareStatement(sql.toString());//매개변수는 문자열!
			
			//4.바인딩 변수를 설정
			int index = 1;
			//pstmt.setInt(index, 11);
			pstmt.setString(index, String.valueOf(11));
			
			//5.SQL문을 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수: " + resultCount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//6.모든 자원을 반납
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
