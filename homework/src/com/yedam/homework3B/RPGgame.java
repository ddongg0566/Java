package com.yedam.homework3B;

public class RPGgame implements KeyPad{
//-현재 모드를 값으로 가지는 필드를
	private int currentMode;
//생성자를 이용하여 값을 초기화한후 "RPGgmae 실행"을 출력한다..
//( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )
	
	public RPGgame() {
		currentMode = KeyPad.NORMAL_MODE;
		System.out.println("RPGgame 실행");
	}
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
		
	}

	
/*
 * 	(3) public abstract void rightUpButton()
		- NORMAL_MODE : "캐릭터가 한칸단위로 점프한다."를 출력한다.
		- HARD_MODE : "캐릭터가 두칸단위로 점프한다."를 출력한다.
 */
	
	
	
	@Override
	public void rightUpButton() {
		
		if(currentMode == KeyPad.NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다");
		}else if(currentMode == KeyPad.HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
	}
	}
	/*
	 * (4) public abstract void rightDownButton()
		- NORMAL_MODE : "캐릭터가 일반 공격."를 출력한다.
		- HARD_MODE : "캐릭터가 HIT 공격."를 출력한다.
	 */
		
	@Override
	public void rightDownButton() {
		switch(currentMode) {
		case KeyPad.NORMAL_MODE:
			System.out.println("캐릭터가 일반 공격");
			break;
		case KeyPad.HARD_MODE:
			System.out.println("캐릭터가 HIT 공격");
			break;
		}
		}
		
/*public abstract void changeMode() :
 *  모드를 바꾸고 현재 모드를 출력하는 기능 
 * ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
 * 
 */
	@Override
	public void changeMode() {
		if(currentMode == KeyPad.NORMAL_MODE) {
			currentMode = KeyPad.HARD_MODE;
			System.out.println("현대모듸 HardMode");
		}else if(currentMode == KeyPad.HARD_MODE) {
			currentMode = KeyPad.NORMAL_MODE;
			System.out.println("현대모듸 NormalMode");
		
	}
	}
	
	
}
