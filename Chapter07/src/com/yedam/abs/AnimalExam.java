package com.yedam.abs;

public class AnimalExam {
	public static void main(String[] args) {
		Dog dog =new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("---------------");
		
//		Animal animal =null;
//		animal = new Dog();
//		animal.sound();
//		animal = new Cat();
//		animal.sound();
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	//매개변수의 다형성을 활용한 추상 클래스 사용
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	

}
