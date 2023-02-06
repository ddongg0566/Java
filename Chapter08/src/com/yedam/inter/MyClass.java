package com.yedam.inter;

public class MyClass {
	//인터페이스 사용할 수있는 공간
	//1. 필드
	
	RemoteControl rc = new Television();
	
	//2. 생성자
	public MyClass() {
		//String str = "문자열";
	}
	
	public MyClass(RemoteControl rc) {
		//rc =tv,  rc =audio
		this.rc =rc;
		rc.turnOn();
		rc.turnOff();
	}
	// 메소드
	public void methodA() {
		//로컬 변수
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(2);                                           
	}
}
