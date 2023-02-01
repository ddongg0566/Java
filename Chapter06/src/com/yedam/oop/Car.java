package com.yedam.oop;

public class Car {
	//필드 : 객체로 만들었을때 , 정보를 담아주는 역할
	String name;//차이름
	int price; //차가격
	String company = "현대"; //차 브랜드
	
	//생성자:객체로 만들 때 내가 하고 싶은 행위를 정의
	//생성자 정의 -> 클래스의 이름과 동일
	//기본생성자(Basic)	
	// 생성자를 통한 필드 초기화 (객체를 만들때, 필드에 데이터 대입, 입력)
	//
	public Car( String name, int price) {
		this.name = name;
		this.price =price ;
	}
	public Car(String name) {
		this.name = name;
	}
	public Car (int price) {
		this.price = price;
	}
	
	public Car (int price, String name, String company) {
		this.name = name;
		this.price= price;
		this.company= company;
	}
	//메소드: 객체로 만들었을때,기능 구현.
	void run() {
		System.out.println("자동차가 달립니다.");
		System.out.println(name);
		System.out.println(price);
		System.out.println(company);
	}
	
	
}
