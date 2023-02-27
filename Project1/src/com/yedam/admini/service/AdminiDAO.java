	package com.yedam.admini.service;



import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;



public class AdminiDAO extends DAO {

	//싱글톤
	
	private static AdminiDAO aDao= new AdminiDAO();
	//관리자 정보
	private AdminiDAO() {
		
	}
	public static AdminiDAO getInstance(){
		if(aDao == null)
		{
			aDao=new AdminiDAO();
		}
		
		
		return aDao;
	}
	public Admini login(String id) {
		Admini ad = null;
		try {
			conn();
			String sql = "SELECT* \r\n"
					+" FROM member\r\n"
					+" WHERE member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				ad=new Admini();
				ad.setMemberId(rs.getString("member_id"));
				ad.setMemberName(rs.getString("member_name"));
				ad.setMemberPw(rs.getString("member_pw"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return ad;
	}
	public List<Admini> getMemberList() { 
		
		List<Admini>list=new ArrayList<>();
		Admini admem = null;
		try{
			conn();
			String sql = " Select *\r\n"
					+ "FROM MEMBER\r\n"
					+ "WHERE MEMBER_id like 'm%'";
				
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		while(rs.next()) {
//				private String memberName;
//				private int memberAge;
//				private String memberSex;
//				private String memberAddress;
//				private String memberPhone;
//				private Date memberDate;
//				private String memberTrainer;
//				private Date memberTrainerDate;
			
				admem = new Admini();
				admem.setMemberId(rs.getString("MEMBER_ID"));
				admem.setMemberPw(rs.getString("MEMBER_PW"));
				admem.setMemberName(rs.getString("MEMBER_NAME"));
				admem.setMemberAge(rs.getInt("MEMBER_AGE"));
				admem.setMemberSex(rs.getString("MEMBER_SEX"));
				admem.setMemberAddress(rs.getString("MEMBER_ADDRESS"));
				admem.setMemberPhone(rs.getString("MEMBER_PHONE"));
				admem.setMemberDate(rs.getDate("MEMBER_DATE"));
				admem.setMembertrainerId(rs.getInt("MEMBER_TRAINERID"));
				admem.setMemberTrainer(rs.getString("MEMBER_TRAINER"));
				admem.setMemberTrainerDate(rs.getDate("MEMBER_TRAINERDATE"));
				
			
			 list.add(admem);
			}
			//statement 경우
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
		}
	
		return list;
	}
	
public List<Admini> gettrainerList() { 
		
		List<Admini>list=new ArrayList<>();
		Admini admem = null;
		try{
			conn();
			String sql = " Select *\r\n"
					+ "FROM MEMBER\r\n"
					+ "WHERE MEMBER_id like 't%'";
				
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		while(rs.next()) {
//				private String memberName;
//				private int memberAge;
//				private String memberSex;
//				private String memberAddress;
//				private String memberPhone;
//				private Date memberDate;
//				private String memberTrainer;
//				private Date memberTrainerDate;
			
				admem = new Admini();
				admem.setMemberId(rs.getString("MEMBER_ID"));
				admem.setMemberPw(rs.getString("MEMBER_PW"));
				admem.setMemberName(rs.getString("MEMBER_NAME"));
				admem.setMemberAge(rs.getInt("MEMBER_AGE"));
				admem.setMemberSex(rs.getString("MEMBER_SEX"));
				admem.setMemberAddress(rs.getString("MEMBER_ADDRESS"));
				admem.setMemberPhone(rs.getString("MEMBER_PHONE"));
								
			
			 list.add(admem);
			}
			//statement 경우
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
		}
	
		return list;
	}
	
	public Admini getAdmember(String admemNo) {
		Admini admem = null;
		try {
			conn();
			String sql = "select * from member where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  admemNo);
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				admem = new Admini();
				admem.setMemberId(rs.getString("MEMBER_ID"));
				admem.setMemberPw(rs.getString("MEMBER_PW"));
				admem.setMemberName(rs.getString("MEMBER_NAME"));
				admem.setMemberAge(rs.getInt("MEMBER_AGE"));
				admem.setMemberSex(rs.getString("MEMBER_SEX"));
				admem.setMemberAddress(rs.getString("MEMBER_ADDRESS"));
				admem.setMemberPhone(rs.getString("MEMBER_PHONE"));
				admem.setMemberDate(rs.getDate("MEMBER_DATE"));
				admem.setMembertrainerId(rs.getInt("MEMBER_trainerID"));
				admem.setMemberTrainer(rs.getString("MEMBER_TRAINER"));
				admem.setMemberTrainerDate(rs.getDate("MEMBER_TRAINERDATE"));
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
		}
		
				
		
		
		return admem;

}
	public int insertAdmem(Admini admem) {
		int result =0;
		try {
			conn();
			String sql = "insert into member values(?,?,?,?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, admem.getMemberId());
			pstmt.setString(2, admem.getMemberPw());
			pstmt.setString(3, admem.getMemberName());
			pstmt.setInt(4, admem.getMemberAge());
			pstmt.setString(5, admem.getMemberSex());
			pstmt.setString(6, admem.getMemberAddress());
			pstmt.setString(7, admem.getMemberPhone());
			pstmt.setDate(8, admem.getMemberDate());
			pstmt.setInt(9, admem.getMembertrainerId());
			pstmt.setString(10, admem.getMemberTrainer());
			pstmt.setDate(11, admem.getMemberTrainerDate());
			
			result =pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
		}
		
				
		
		
		return result;
	
	
	}
	public int modifyAdmem(Admini admem) {
		int result =0;
		try {
			conn();
			String sql = "update member set member_name = ?,member_age=?,member_sex=?,member_address=?, member_phone=?,member_date=?,member_trainerid=?,member_trainer=?,member_trainerdate=?                  \r\n"
					+ "where member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(10, admem.getMemberId());
			
			pstmt.setString(1, admem.getMemberName());
			pstmt.setInt(2, admem.getMemberAge());
			pstmt.setString(3, admem.getMemberSex());
			pstmt.setString(4, admem.getMemberAddress());
			pstmt.setString(5, admem.getMemberPhone());
			pstmt.setDate(6, admem.getMemberDate());
			pstmt.setInt(7, admem.getMembertrainerId());
			pstmt.setString(8, admem.getMemberTrainer());
			pstmt.setDate(9, admem.getMemberTrainerDate());
			result =pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
		}
		
				
		
		
		return result;
	}
	public int deleteAdmem(Admini admem) {
		int result =0;
		try {
			conn();
			String sql="DELETE FROM member WHERE member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, admem.getMemberId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
	}
		
				return result;
	}
	
	
	public int modifytrain(Admini admem) {
		int result =0;
		try {
			conn();
			String sql = "update member set member_name = ?,member_age=?,member_sex=?,member_address=?, member_phone=?,member_date=? \r\n"
					+ "where member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(10, admem.getMemberId());
			
			pstmt.setString(1, admem.getMemberName());
			pstmt.setInt(2, admem.getMemberAge());
			pstmt.setString(3, admem.getMemberSex());
			pstmt.setString(4, admem.getMemberAddress());
			pstmt.setString(5, admem.getMemberPhone());
			pstmt.setDate(6, admem.getMemberDate());
			
			result =pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
		}
		
				
		
		
		return result;
	}

	//회원 기록 정보
	public Admini getRecord(String recordKey) {
		Admini record  = null;
		try { conn();
		String sql = "SELECT member_id, record_height, record_weight, record_squat, record_squat_q, record_bench, record_bench_q,record_dead, record_dead_q\r\n"
				+ "FROM record\r\n"
				+ "WHERE member_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, recordKey);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			record = new Admini();
			record.setMemberId(rs.getString("member_id"));
			record.setRecordHeight(rs.getDouble("record_height"));
			record.setRecordWeight(rs.getDouble("record_weight"));
			record.setRecordSquat(rs.getInt("record_squat"));
			record.setRecordSquatQ(rs.getInt("record_squat_q"));
			record.setRecordBench(rs.getInt("record_bench"));
			record.setRecordBenchQ(rs.getInt("record_bench_q"));
			record.setRecordDead(rs.getInt("record_dead"));
			record.setRecordDeadQ(rs.getInt("record_dead_q"));
			
		}
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		disconn();
	}
	
	return record;	
	}
	public Admini getBmi(String bmiKey) {
	
		Admini record  = null;
		
		try { conn();
		String sql = "SELECT member_id, record_height, record_weight, record_Bmi\r\n"
				+ "FROM record\r\n"
				+ "WHERE member_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, bmiKey);
		
		rs = pstmt.executeQuery();
			
		if(rs.next()) {
			record = new Admini();
			record.setMemberId(rs.getString("member_id"));
			record.setRecordHeight(rs.getDouble("record_height"));
			record.setRecordWeight(rs.getDouble("record_weight"));
			record.setRecordBmi(rs.getDouble("record_Bmi"));
	
		}
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		disconn();
	}
	
	return record;	
	
	}
	public void UpdateBmi(double bmiKey) {
	try {
		conn();
		String sql = "UPDATE record\r\n"
				+"SET record_bmi =? \r\n"
				+"WHERE member_id = ?";
	
		pstmt = conn.prepareStatement(sql);
		pstmt.setDouble(1, bmiKey);
		pstmt.setString(2, AdminiService.adminiInfo.getMemberId());
		pstmt.executeUpdate();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		disconn();
	}
	}
	public Admini getExercise(String exerciseKey) {
    Admini record  = null;
		
		try { conn();
		String sql = "SELECT member_id, record_squat, record_squat_q, record_bench , record_bench_q, record_dead, record_dead_q\r\n"
				+ "FROM record\r\n"
				+ "WHERE member_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, exerciseKey);
		
		rs = pstmt.executeQuery();
			
		if(rs.next()) {
			record = new Admini();
			record.setMemberId(rs.getString("member_id"));
			record.setRecordSquat(rs.getInt("record_squat"));
			record.setRecordSquatQ(rs.getInt("record_squat_q"));
			record.setRecordBench(rs.getInt("record_bench"));
			record.setRecordBenchQ(rs.getInt("record_bench_q"));
			record.setRecordDead(rs.getInt("record_dead"));
			record.setRecordDeadQ(rs.getInt("record_dead_q"));
		}
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		disconn();
	}
	
	return record;	
	
	}
	public int updateRecord(Admini record) {
		int result =0;
		try{ conn();
			String sql = "UPDATE record set record_weight=?, record_squat=?, record_squat_q=?, record_bench=?, record_bench_q=?, record_dead=?, record_dead_q=?\r\n"
						+ "WHERE member_id=?";
					
					pstmt = conn.prepareStatement(sql);
			System.out.println(record.getMemberId());
			pstmt.setDouble(1, record.getRecordWeight());
			pstmt.setInt(2, record.getRecordSquat());
			pstmt.setInt(3, record.getRecordSquatQ());
			pstmt.setInt(4, record.getRecordBench());
			pstmt.setInt(5, record.getRecordBenchQ());
			pstmt.setInt(6, record.getRecordDead());
			pstmt.setInt(7, record.getRecordDeadQ());
			pstmt.setString(8, record.getMemberId());
			
			result =pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
		}
		
				
		
		
		return result;
		}
	
	
	//트레이너 긴
	public List<Admini> getmemberList(String deptNo){
		List<Admini> list = new ArrayList<>();
		Admini depart = null;
		try {
			conn();
			String sql = "SELECT *\r\n"
					+ "FROM member \r\n"
					+"WHERE member_Trainer=?";
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  deptNo);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				depart = new Admini();
				depart.setMemberTrainer(rs.getString("member_Trainer"));
				depart.setMemberName(rs.getString("member_Name"));
				depart.setMemberAge(rs.getInt("member_Age"));
				depart.setMemberSex(rs.getString("member_Sex"));
				depart.setMemberAddress(rs.getString("member_Address"));
				depart.setMemberPhone(rs.getString("member_Phone"));
				list.add(depart);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list	;
	}
	
		public Admini getmembercount(int deparmentKey) {
			Admini depart = null;
			try {
				conn();
				String sql = "select Count(*) from member WHERE member_Trainer=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, deparmentKey);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					depart = new Admini();
					depart.setMemberTrainer(rs.getString("member_Trainer"));
				}
			}catch(Exception e) {
				e.printStackTrace();
				
			}finally {
				disconn();
			}
			
			return depart;		
		}

		
		public Admini popular() {
			
		}
	

}
		

	



