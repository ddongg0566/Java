package com.yedam.inter4;

public class Example {

	public static void main(String[] args) {
		ImpelementsC impl = new ImpelementsC();
		//interface A~C 까지 impl을 활용해서 호출
		
		//1) interface A
		InterfaceA ia = impl;
		ia.method01();
		//2)interface B
		InterfaceB ib =impl;
		ib.method02();
		//3)interface C
		InterfaceC ic= impl;
		ic.method01();

		ic.method02();
		ic.method03();
}

}
