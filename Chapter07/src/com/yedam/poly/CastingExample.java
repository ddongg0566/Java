package com.yedam.poly;

public class CastingExample {
	
	public static void method1(Parent parent) {
	if( parent instanceof Child) {
		Child child = (Child) parent;
		System.out.println("Casting 성공");
		
	}else {
		System.out.println("Casting 실패");
	}
	}
	
	public static void method2(Parent parent) {
		Child child=(Child) parent;
		System.out.println("casting 22222성공");
	}
	
	public static void main(String[] args) {
		Parent p1 = new Child();
		method1(p1);
		Parent p2  =new Child02();
		method2(p2);
	}
}
