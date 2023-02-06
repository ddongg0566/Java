package com.yedam.inherit.homework2;

public class StandardWeightInfo extends Human {

	public StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);

	}
	
	public double getStandardWeight() {
		return (height -100)*0.9;
	}
	@Override
	public void getInformation() {
		
		System.out.printf("%s님의 신장 %.0f , 몸무게 %.0f  표준체중 %.0f 입니다.\n", name, height, weight,getStandardWeight() );
	}
 
	
}