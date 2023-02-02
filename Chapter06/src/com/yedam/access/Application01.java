package com.yedam.access;

public class Application01 {

	public static void main(String[] args) {
		Access ac= new Access();
		//public
		ac.free = "public";
		ac.parent = "parent";
		ac.basic = "basic";
		//ac.privacy = "privacy"
		
		ac.instead();
		ac.basic();
		
	}

}
