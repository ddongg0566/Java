package com.yedam.access;
// 다음의 조건에 맞추어 member 클래스를 작성 하세요
// 어떠한 사이트 회원에 대한 정보를 담는 객체 생성 용도
// 아이디,비밀번호, 이름, 나이
// 생성자는 기본생성자
//getter setter 활용하여 정보를 읽고 저장할 수있는 메서드
//1)나이를 입력할 때 데이터의 무결성을 지켜주기 위해여 0보다 작은 수가 입력이 되면 0으로 나이를 변경 시켜준다.
//2)나이를 출력할때 입력한 값의 +1 하여 출력

public class Member {
	private String id;
	private String password;
	private String name;
	private int age;


public String getid() {
	return id;
}
public void setid(String id) {
	this.id=id;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getpassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getage() {
	return age +=1;
}
public void setage(int age) {
	
	this.age = (age<=0)? 0:age;
	
}

}