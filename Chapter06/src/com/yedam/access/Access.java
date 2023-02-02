package com.yedam.access;

public class Access {
	/* 사용 : 필드, 메소드, 클래스, 인터페이스 등 앞에 사용가능
	 * public 어디서든 누구나 다 접근 가능 -> 필드 -> 누구나 다 쓸수 있다
	 * protected 상속이라는 관계 맺은다음에 부모 -자식 사용(패키지가 달라도 사용)
	 * 			같은 패키지에서만 접근 가능, 서로 다른 패키지면 접근 불가능
	 * default 서로 다른 패키지면 접근 불가, 같은 패키지에서만 접근 가능
	 * private 내가 속한 클래스에서만 사용 가능
	 *
	 */
	public String free;
	protected String parent;
	private String privacy;
	String basic;
	
	//생성자
	public Access() {
		
	}
	//메소드
	
	private void info() {
		System.out.println("private 메소드를 출력합니다");
	}
	public void instead() {
		info();
	}
	protected void parent() {
		System.out.println("protected 메소드");
	}
	void basic() {
		System.out.println("basic 출력");
	}
	
}
