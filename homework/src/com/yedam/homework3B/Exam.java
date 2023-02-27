package com.yedam.homework3B;

public class Exam {

	public static void main(String[] args) {
		KeyPad game = new RPGgame();
		game.leftUpButton();
		game.leftDownButton();
		game.changeMode();
		game.rightUpButton();
		game.rightDownButton();
		game.leftDownButton();
		game.changeMode();
		game.rightDownButton();
		System.out.println("==============");
		KeyPad game1 = new ArcadeGame();
	
		game1.leftUpButton();
		game1.leftDownButton();
		game1.changeMode();
		game1.rightUpButton();
		game1.rightDownButton();
		game1.leftDownButton();
		game1.changeMode();
		game1.rightDownButton();
	}

}
