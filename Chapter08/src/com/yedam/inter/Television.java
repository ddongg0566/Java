package com.yedam.inter;

public class Television implements RemoteControl {
	
	
	private int volume;
	
	
	
	@Override
	public void turnOn() {
		System.out.println("tv룰 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("tv룰 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			
		}else {
			//volume:0 <volume<10
			this.volume= volume;
		}
		
		System.out.println("현재 tv 볼륨:" + this.volume);
	}

}
