package com.yedam.inheri;

public class Cellphone {
	//핸드폰 기본 기능을 여기서 구현
 	//부모 클래스
	//필드
	String model;
	String color;
	
	//생성자(기본)
	public Cellphone(){
		
	}
	public Cellphone(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void HangUp() {
		System.out.println("전화를 끕니다");
	}
}