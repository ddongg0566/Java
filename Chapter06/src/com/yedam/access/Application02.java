package com.yedam.access;

public class Application02 extends Access{

	public static void main(String[] args) {
		Student std = new Student();
		
		std.setStdName("김또치");
		std.setStdgrade("2학년");
		std.setMajor("컴퓨터공학과");
		std.setProgramming(-100);
		std.setDataBase(90);
		std.setOS(100);
		
		System.out.println("이름: " + std.getStdName());
		System.out.println("학년: " + std.getStdgrade());
		System.out.println("전공: " + std.getMajor());
		System.out.println("프로그래밍: " + std.getProgramming());
		System.out.println("데이타베이스: " + std.getDataBase());
		System.out.println("OS: " + std.getOS());
	}

}
