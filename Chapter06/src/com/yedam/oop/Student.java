package com.yedam.oop;

public class Student {
	
	//정보 - 학생이름, 학번, 국어 , 영어 수학 점수
	
	//기본 생성자, 모든 데이터를 초기화 생성자
	
	//학생의 정보를 출력해주는 getInfo()
	/* 
	 * 학생의 이름: 김또치
	 * 학번 : 20230201
	 * 총점: 
	 * 평균:
	 */
	//필드
	String name;
	int number;
	int korean;
	int english;
	int math;
	int sum;
	double avg;
	
	//생성자
	public Student() {
		
	}
	public Student(String name, int number, int korean, int english, int math) {
		this.name = name;
		this.number=number;
		this.korean=korean;
		this.english=english;
		this.math=math;
	}
	
	//메소드
	
	
	int sum(){
		int result = korean+english+math;
		return result;
	}
	double avg() {
		double result1 = (double) sum() / 3;
		return result1;
	}
	void getInfo() {
		System.out.println("=========================");
		System.out.println("학생의 이름: " + name);
		System.out.println("학번: " + number);
		System.out.println("총점: " + sum());
		System.out.printf("평균: %4.2f \n" , avg());
		System.out.println("=========================");
	}
}
