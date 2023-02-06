package com.yedam.inter3;

public class Car {
	Tire flt = new KumhoTire();
	Tire frt = new KumhoTire();
	Tire blt = new KumhoTire();
	Tire brt =new KumhoTire();
	
	
	void run() {
		flt.roll();
		frt.roll();
		blt.roll();
		brt.roll();
	}
}
