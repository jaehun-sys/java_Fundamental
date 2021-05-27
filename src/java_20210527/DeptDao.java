package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDao {
	//singleton
	private static DeptDao single;
	private DeptDao(){
		//1.드라이버를 로드한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static DeptDao getInstance() {
		if(single == null) {
			single = new DeptDao();
		}
		return single;
	}
	
	public boolean insert(DeptDto dto) {
		boolean success = false;

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//2.데이터베이스와 연결할 수 있는 Connection 객체를 생성
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1212");
			
			//3.SQL을 전송할 수 있는 PreparedStatement 객체를 생성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO DEPT(deptno,dname,loc) ");
			sql.append("VALUES(?,?,?) ");
			
			pstmt = con.prepareStatement(sql.toString());
			//4.바인딩 변수를 설정
			int index = 1;
			pstmt.setInt(index++, dto.getNo());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getLoc());
			
			//5.SQL문을 전송
			pstmt.executeUpdate();
			success = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//6.모든 자언을 반납
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
		return success;	
	}
	
	public boolean update(DeptDto dto) {
		boolean success = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//2.데이터베이스와 연결할 수 있는 Connection 객체를 생성
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1212");
			
			//3.SQL을 전송할 수 있는 PreparedStatement 객체를 생성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE DEPT ");
			sql.append("SET dname = ?, ");
			sql.append("loc = ? ");
			sql.append("WHERE deptno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			//4.바인딩 변수를 설정
			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getLoc());
			pstmt.setInt(index++, dto.getNo());
			
			//5.SQL문을 전송
			pstmt.executeUpdate();
			success = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//6.모든 자언을 반납
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
		return success;
	}
	
	public boolean delete(int num) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1212");
			
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM DEPT ");
			sql.append("WHERE deptno = ? ");
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++, num);
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return success;
	}
	
	public ArrayList select(int start, int len) {
		ArrayList<DeptDto> list = new ArrayList<DeptDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1212");
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM DEPT ");
			sql.append("ORDER BY deptno DESC ");
			sql.append("LIMIT ?,? ");

			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index++, len);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				index = 1;
				int no = rs.getInt(index++);
				String name = rs.getString(index++);
				String loc = rs.getString(index++);
				list.add(new DeptDto(no,name,loc));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
				if(rs!=null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}
}
