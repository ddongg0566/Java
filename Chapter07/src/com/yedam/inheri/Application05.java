package com.yedam.inheri;

public class Application05 {

	public static void main(String[] args) {
		//parent class
		//child class
		//상속 -> lastName, getInfo()
		//   -> getInfo() = 우리 성씨는 000입니다.
		//개인적으로 가지는 정보
		//lastname , 혈액형, 나이, 취미
		//getInfo() ->우리 성씨는 000입니다
		//          -> 내이름 : 000
		//          -> 혈액형 : 000
		
		
		VIPPerson vip = new VIPPerson();
		vip.memberInfo();
	}

}
