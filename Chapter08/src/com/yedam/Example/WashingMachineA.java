package com.yedam.Example;

import java.util.Scanner;

public class WashingMachineA implements WashingMachine{

	@Override
	public void dryStart() {
		System.out.println("건조기 중지");
		
	}

	@Override
	public void start() {
		System.out.println("세탁기 실행");
	}

	@Override
	public void pause() {
		System.out.println("세탁기 중지");

	}

	@Override
	public void stop() {
		System.out.println("세탁기 정지");

	}

	@Override
	public int speed(int speed) {
		
		int nowSpeed = 0;
		switch(speed){
		case 1:
			nowSpeed =20;
			break;
		case 2:
			nowSpeed =50;
			break;
		case 3:
			nowSpeed =100;
			break;
		}
		return nowSpeed;
}
}