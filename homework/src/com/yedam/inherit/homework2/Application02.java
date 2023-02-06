package com.yedam.inherit.homework2;

public class Application02 {

	public static void main(String[] args) {
		StandardWeightInfo human = new StandardWeightInfo( "홍길동", 168, 45);
		human.getInformation();
		ObesityInfo human1 = new ObesityInfo("박둘이", 168, 90);
		human1.getInformation();
		
		
	}

}