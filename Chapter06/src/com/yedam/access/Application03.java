package com.yedam.access;

public class Application03 {

	public static void main(String[] args) {
		Member mem =new Member();
		mem.setid("google");
		mem.setPassword("*******");
		mem.setName("김또치");
		mem.setage(19);
		System.out.println("아이디: "+mem.getid());
		System.out.println("아이디: "+mem.getpassword());
		System.out.println("아이디: "+mem.getName());
		System.out.println("아이디: "+mem.getage());
	}

}
