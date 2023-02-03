package com.yedam.inheri;

public class Application04 {

	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		
		//이륙
		sa.takeOff();
		//비행모드 확인 ->자식클래스
		sa.fly();
		//비행모드 변경 -> NORMAL ->SUPERSONIC
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		//비행보드 확인-> 자식 클래스
		sa.fly();
		//비행모드 변경 
		sa.flyMode = SuperSonicAirPlane.NORMAL;
		//비행모드 확인 ->자식 클래스
		sa.fly();
		//착륙
		sa.land();
				
	}

}
