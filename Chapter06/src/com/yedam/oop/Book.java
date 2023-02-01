package com.yedam.oop;

public class Book {
  // book이라는 클래스는 아래의 정보를 가져야합니다.
	///책이름, 책종류, 가격, 도서번호, 출판사	
	// 생성자는 3개정도 생서
	//1) 기본 생성자
	//2) 모든 데이터를 초기화 할수 있는 생성자
	//3)책이름, 책 가격, 도서번호를 받아노는 생성자
	// 메소드는 getInfo() 메소드를 가지는데, 아무런 기능이 없습니다.
	// getInfo() 메소드를 클래스 외부에서 실행 하였을때
	// 다음과 같은 출력물이 나오돌고 구현
	/*
	 * 책이름 : 혼자 공부하는 자바
	 * #내용
	 * 1)종류:학습서
	 * 2)가격 :24000원
	 * 3)출판사: 한빛 미디어
	 * 4)도서번호: 0001
	 */
		
	//필드
	String name ; 
	String sort;
	int price;
	int isbn;//도서번호
	String company;
	
	
	// 생성자
	// 생성자를 통한 필드 초기화 (객체를 만들때, 필드에 데이터 대입, 입력)
	public Book() {
	}
	
	public Book(String sort, int price, String company, int isbn) {
		
		this.sort=sort;
		this.price=price;
		this.company=company;
		this.isbn=isbn;
	}
	
	public Book(String name, int price, int isbn) {
		this.name = name;
		this.price = price;
		this.isbn = isbn;
	}
	
	
	
	
	// 메소드
	void getInfo() {
		System.out.println("책 이름: 혼자 공부하는 자바");
		System.out.println("#내용");
		System.out.println("1)종류:" + sort);
		System.out.println("2)가격:" +price + "원");
		System.out.println("3)출판사:" +company);
		System.out.printf("4)도서번호: %04d \n", isbn);

	}
	
}
