package com.yedam.oop;

public class Application03 {

	public static void main(String[] args) {
		Bycle bycle = new Bycle();
		
		bycle.setGas(5); //Bycle로 생생한 객체에 필드값(gas) 데이터 입력
		boolean gasState = bycle.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			bycle.run();
		}
		
		if(bycle.isLeftGas()) {
			System.out.println("gas를 주입할 필요 없음");
		}else {
			System.out.println("gas를 주입할 필요함.");
		}

	Book bok = new Book("학습서", 24000, "한빛 미디어", 0001);
	bok.getInfo();
	
	Student std = new Student("이대규" , 9906, 96,89,59 );
	std.getInfo();
}

}