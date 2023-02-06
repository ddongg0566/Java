package com.yedam.inherit.homework1;

public class EmpDept extends Employee{
/*		- Employee 클래스를 상속한다.
		- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
		- 추가된 필드의 getter를 정의한다.
		- Employee 클래스의 메소드를 오버라이딩한다.
		(1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
		(2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능
 * 
 */
	//필드
	public String empDept;

	EmpDept (String name, int salary, String empDept){
		super(name,salary);
		this.empDept =empDept;
	}


	
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println(" 부서: " + empDept);
	}

	@Override
	public void print() {
		System.out.println(" 수퍼클래스\n 서브클래스" );
	}
	
}
