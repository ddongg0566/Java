package com.yedam.inherit.homework2;

public class ObesityInfo extends StandardWeightInfo {

	ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
		// TODO Auto-generated constructor stub
	}
	 public String getObesity() {
		 double getObesity = ((weight- super.getStandardWeight())/super.getStandardWeight()*100);
	
		if (getObesity >= 50.00) {
			return " 고도비만 입니다." ;
		}else if(getObesity >= 30.00) { 
			return " 중도비만 입니다.";
		}else if(getObesity >= 20.00) {
			return "경도비만 입니다.";
		}else{
			return "과체중 입니다.";
			
		}
		
		
		 
}
	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %.0f , 몸무게 %.0f,  %s\n", name, height, weight, getObesity());
	}
	
}
