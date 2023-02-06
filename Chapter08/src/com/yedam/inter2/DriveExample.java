package com.yedam.inter2;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		Vehicle v1= new Bus();
		v1.run();
		
		
		
		Bus bus = (Bus)v1;
		
		
		
		bus.run();
		bus.checkFare();
		
	};

}
