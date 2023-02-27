package com.yedam.admini.service;

import java.sql.Date;

public class Admini {
	
	//관리자 정보
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String memberSex;
	private String memberAddress;
	private String memberPhone;
	private Date memberDate;
	private int membertrainerId;
	private String memberTrainer;
	private Date memberTrainerDate;



	
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberId() {
		return memberId;
	}
	public int getMembertrainerId() {
		return membertrainerId;
	}
	public void setMembertrainerId(int membertrainerId) {
		this.membertrainerId = membertrainerId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	public String getMemberSex() {
		return memberSex;
	}
	public void setMemberSex(String memberSex) {
		this.memberSex = memberSex;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public Date getMemberDate() {
		return memberDate;
	}
	public void setMemberDate(Date memberDate) {
		this.memberDate = memberDate;
	}
	public String getMemberTrainer() {
		return memberTrainer;
	}
	public void setMemberTrainer(String memberTrainer) {
		this.memberTrainer = memberTrainer;
	}
	public Date getMemberTrainerDate() {
		return memberTrainerDate;
	}
	public void setMemberTrainerDate(Date memberTrainerDate) {
		this.memberTrainerDate = memberTrainerDate;
	}
	@Override
	public String toString() {
		return " |회원번호: " + memberId + " |비밀번호: " + memberPw + " |회원이름: " + memberName + " |회원나이: "
				+ memberAge + " |회원성별: " + memberSex + " |회원주소: " + memberAddress + " |전화번호: "
				+ memberPhone + " |시작일자: " + memberDate + " |트레이너 번호: " + membertrainerId
				+ " |트레이너 이름: " + memberTrainer + " |PT시작일자: " + memberTrainerDate ;
	}
	public String toString1() {
		return " |트레이너번호: " + memberId + " |비밀번호: " + memberPw + " |트레이너이름: " + memberName + " |트레이너나이: "
				+ memberAge + " |트레이너성별: " + memberSex + " |주소: " + memberAddress + " |전화번호: "
				+ memberPhone;
	}
	
	
	//회원 기록 정보
	private double recordHeight;
	private double recordWeight;
	private double recordBmi;
	private int recordSquat;
	private int recordSquatQ;
	private int recordBench;
	private int recordBenchQ;
	private int recordDead;
	private int recordDeadQ;
	private int recordTrainer;
	
	public double getRecordHeight() {
		return recordHeight;
	}
	public void setRecordHeight(double recordHeight) {
		this.recordHeight = recordHeight;
	}
	public double getRecordWeight() {
		return recordWeight;
	}
	public void setRecordWeight(double recordWeight) {
		this.recordWeight = recordWeight;
	}
	public double getRecordBmi() {
		return recordBmi;
	}
	public void setRecordBmi(double recordBmi) {
		this.recordBmi = recordBmi;
	}
	public int getRecordSquat() {
		return recordSquat;
	}
	public void setRecordSquat(int recordSquat) {
		this.recordSquat = recordSquat;
	}
	public int getRecordSquatQ() {
		return recordSquatQ;
	}
	public void setRecordSquatQ(int recordSquatQ) {
		this.recordSquatQ = recordSquatQ;
	}
	public int getRecordBench() {
		return recordBench;
	}
	public void setRecordBench(int recordBench) {
		this.recordBench = recordBench;
	}
	public int getRecordBenchQ() {
		return recordBenchQ;
	}
	public void setRecordBenchQ(int recordBenchQ) {
		this.recordBenchQ = recordBenchQ;
	}
	public int getRecordDead() {
		return recordDead;
	}
	public void setRecordDead(int recordDead) {
		this.recordDead = recordDead;
	}
	public int getRecordDeadQ() {
		return recordDeadQ;
	}
	public void setRecordDeadQ(int recordDeadQ) {
		this.recordDeadQ = recordDeadQ;
	}
	public int getRecordTrainer() {
		return recordTrainer;
	}
	public void setRecordTrainer(int recordTrainer) {
		this.recordTrainer = recordTrainer;
	}


	
	}
	
	

