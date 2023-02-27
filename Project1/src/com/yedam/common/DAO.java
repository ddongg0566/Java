package com.yedam.common;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DAO {
	// JAVA -> DB 연결할때 쓰는 객체(connection)
		protected Connection conn =null;
		
		//Query 문 (SQL, 질의) 을 가지고 Query 문 실행하는 객체
		protected PreparedStatement pstmt =null;
		
		//Query 문 (SQL, 질의) 을 가지고 Query 문 실행하는 객체
		protected Statement stmt = null;
		
		//SELECT(조회) 결과 값을 반환 받는 객체
		protected ResultSet rs =null;
		
		
		Properties pro = new Properties();
		//DK 계정 접속
		
		String driver=null;
		String url =null;
		String id = null;
		String pw = null;
		
		public void conn() {
			//1.드라이버 로딩
			
			
			
			try {
				//db.properties ㅢㅇ 정보 loading
				getProperties();
				
				Class.forName(driver);
				//2. DB 연결
				conn = DriverManager.getConnection(url,id,pw);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		public void disconn() {
			try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		//DB 접속 정보 호출 메소드
		//프로그램 안에 DB 관련 정보를 넣지 않기 위해서
		// 프로그램 실행 중 db가 변경이 된다면,,, 원래 프로그램 껏다가 내용 수정후 켜야하는데.
		// 메모장 같은 곳에 내용을 불러와서 쓴다면/.. 프로그램이 돌아가고 있는 도중에도 apahwkddp Tms
		//내용을 불러가기 때문에, 프로그램 종료하지 않고 수정된 DB 관련 내용을 적용시킬수 있다.
		
		private void getProperties() {
			try {
			FileReader resource = new FileReader("src/config/db.properties");
			pro.load(resource);
			driver= pro.getProperty("driver");
			url =pro.getProperty("url");
			id = pro.getProperty("id");
			pw = pro.getProperty("pw");
			}
			catch(Exception e) {
				e.printStackTrace();
			}

}
}
