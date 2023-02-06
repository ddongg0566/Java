package com.yedam.Example;

public class example {
public static void main(String[] args) {
	WashingMachineA lg = new WashingMachineA();
	lg.start();
	lg.pause();
	System.out.println("속도" + lg.speed(3));
	
}
}
