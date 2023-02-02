package com.yedam.oop;

public class Application08 {
	public static void main (String[] args) {
		Person p1 = new Person("12111-1111", "김또치");
//		p1.nation ="미국";
//		p1.ssn= "123-123";
		//개명만 가능함
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// 지구의 반지름
		System.out.println("지구의 반지름: " + StaticCal.EARTH_RADIUS);
		// 지구의 표면적
		System.out.println("지구의 표면적:"  +
				(StaticCal.PI*StaticCal.EARTH_RADIUS*StaticCal.EARTH_RADIUS));
		
		
	}
}
