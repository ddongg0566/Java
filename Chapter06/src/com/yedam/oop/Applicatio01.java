package com.yedam.oop;

public class Applicatio01 {

	public static void main(String[] args) {
		//클래스 변수 = new 생성자();
		  Car myCar = new Car("kona", 10000);
		 //dot 연산자 => .
//		  myCar.name ="sonata";
//		  myCar.price=1155;
		  myCar.company="volkswagen";
		  myCar.run();
		  Car yourCar = new Car("kona", 10000);
//		  yourCar.name = "kona";
//		  yourCar.price = 50000;
		  //클래스 외부에서 필드를 사용할 경우(출력)
		  System.out.println(yourCar.name);
		  System.out.println(yourCar.price);
		  System.out.println(yourCar.company);
		  
		  
		  //다양한 생성자를 통한 객체 생성
		  Car car01 = new Car(15000, "konaa", "현대" );
		  
		 
	}

}
