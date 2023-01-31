package com.yedam.reference;

public class Exam02 {

	public static void main(String[] args) {
		// new 연산자가 없는 String
		//memory leak -> 메모리 누수, 메모리 부족
				
		String name1 = "신용권";
		String name2 = "신용권";
		String name3 = new String ("신용권");
		String name4 = new String ("신용권");
		System.out.println("===========일반 스트링 비교==========================\n");
		if(name1==name2) {
			System.out.println("name1과 name2는 메모리 주소 같음");
		}else {
			System.out.println("name1과 name2는 메모리 주소 다름");
		}
		if(name1.equals(name2))	{
			System.out.println("name1과 name2는 데이터 같다\n");
		}else {
		System.out.println("name1과 name2는 데이터가 다르다\n");
		}
		System.out.println("==========스트링과 new 스트링 비교====================\n");
		if(name2==name3) {
			System.out.println("name2과 name3는 메모리 주소 같음");
		}else {
			System.out.println("name2과 name3는 메모리 주소 다름");
		}
		if(name2.equals(name3))	{
			System.out.println("name2과 name3는 데이터 같다\n");
		}else {
		System.out.println("name2과 name3는 데이터가 다르다\n");
		}
		System.out.println("==========new스트링과 new 스트링 비교=================\n");
		if(name3==name4) {
			System.out.println("name3과 name4는 메모리 주소 같음");
		}else {
			System.out.println("name3과 name4는 메모리 주소 다름");
		}
		if(name3.equals(name4))	{
			System.out.println("name3과 name4는 데이터 같다");
		}else {
		System.out.println("name3과 name4는 데이터가 다르다");
		}
	}

}
