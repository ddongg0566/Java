package com.yedam.opeartor;

public class Operator {

	public static void main(String[] args) {
		//증감연산자
		int a = 0;
		System.out.println(a++);
		System.out.println(++a);;

		
		int x =-100;
		
		System.out.println("x:  "+ x);
		System.out.println("-x  "+ (-x));
		
		byte b = 100;
		int result =-b;
		System.out.println(result);
		
		//논리 부정 연산자(!,not)
		boolean flag = false;
		if(!flag) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
		//이항 연산자
		int v1 =10;
		int v2=4;
		System.out.println(v1+v2);
		System.out.println(v1-v2);
		System.out.println(v1*v2);
		System.out.println(v1/v2);
		System.out.println(v1%v2);
		
		//비교연산자
		int num1=10;
		int num2=20;
		System.out.println(num1==num2); //T
		System.out.println(num1 != num2);  //F
		System.out.println(num1 >= num2);  //T
		
		//기본타입의 값을 비ㅛ(==)
		//문자열의 값을 비교 (문자열.equals)
		
		String str ="test";
		String str1="baby";
		
		if(str.equals(str1)) {
			System.out.println("test입니다.");
		}else {
			System.out.println("baby입니다");
		}
		
		
		//대문자, 숫자, 비교 하는 연산자
		//대문자 확인
		
		int charCode= 'A'; //65 //z=90
		
		if(charCode>=65 && charCode<=90) {
			System.out.println("대문자");
		}
		
		//논리 부정 연산자 + 비교 연산자
		//'0' -> 48 , '9' -> 57
		//charCode >= 48 && charCode <= 57
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9입니다");
					
		}
		
		//삼항 연산자
		
		int scores  = 85;
		char grade = (scores >90) ? 'A' : 'B';
	
		char grade2;
		if (scores >90) {
			grade2 ='A';
		}else{
				grade2 = 'B';
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
