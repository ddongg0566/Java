package com.yedam.inter;

public class Audio implements RemoteControl{
	
	//필드
	private int volume;
	
	//생성자
	
	//메소드
	
	@Override
	public void turnOn() {
	System.out.println("audio 켠다");	// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("audio 끈다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			
		}else {
			//volume:0 <volume<10
			this.volume= volume;
		}
		
		System.out.println("현재 audio 볼륨:" + this.volume);
	}
}
	
	

