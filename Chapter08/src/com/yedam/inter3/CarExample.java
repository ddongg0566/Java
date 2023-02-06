package com.yedam.inter3;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.frt=new HankookTire();
		myCar.run();
	}

}
