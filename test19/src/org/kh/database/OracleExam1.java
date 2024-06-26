package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam1 {

	public static void main(String[] args) {
		Connection con = null;
		// 연결할때 사용
		PreparedStatement pstmt = null;
		// 상태 변경 (On/Off) 하고, SQL 문장실행
		ResultSet rs = null;
		// 검색(Select문)의 결과를 반환받음
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "select * from student";
		List<Student> stList = new ArrayList<>();
		
		try {
			Class.forName(driver);
			// 현재 클래스에 드라이버 로딩
			try {
				  con = DriverManager.getConnection(url, userid, userpw);
				  // 데이터베이스 연결이
				  pstmt = con.prepareStatement(sql);
				  // 논리적 채널 연결
				  rs = pstmt.executeQuery();
				  // sql 구문이 select 문장인 경우에는 commit이 필요없으므로 executeQuery() 메소드를 사용하며, 결과 반환은 레코드 셋 (ResultSet)이다.
				  while(rs.next()) {
					  Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
					  stList.add(st);
				  }
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 구문 실행 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("데이터베이스 로딩 실패");
			e.printStackTrace();
		} finally {
			if (rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
			} 
			if(pstmt!=null) {
				try {
						pstmt.close();
				} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
			} 
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		for(Student s:stList) {
				System.out.println(s.toString());
		}
	}
}
