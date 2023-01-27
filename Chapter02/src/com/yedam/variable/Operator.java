package com.yedam.variable;

public class Operator {

	public static void main(String[] args) {
		//정수 자동 타입 변환
		byte x=10;
		byte y=20;
		int result = x+y;
			
		
		System.out.println(result);
		
		byte result2= (byte)(x+y);
		System.out.println(result2);
		System.out.println(x+y);
		//데이터 타입 크기에 따른 연산
//		long +int =long
//	    byte+int =int
//	    long or int + double or float =실수 데이터 타입
		
		
		byte bVar=10;
		int iVar1= 100;
		long IVar=10000L;
		long result3= bVar+iVar1+IVar;
		System.out.println(result3);
		
		double dvar12= 3.144444;
		double dResult= result3 +dvar12;
		System.out.println(dResult);
					
		int iResult= (int)dvar12 +iVar1;
		System.out.println(iResult);
		
		int iVa12=30;
		double dVa13=iVa12/4f;
		System.out.println(dVa13);
		
		//string +연산
		String str1= 10+2+"8";
		System.out.println("str1: "+str1);
		String str2 = 10+"2"+8;
		System.out.println("str2: "+str2);
		String str3 = "10" + (2+8);
		System.out.println("str3: "+str3);


		String iNo="10";
		String bNo="8";
		String dNO="3.222";
		
		int sNo = Integer.parseInt(iNo);
		byte sNo2 = Byte.parseByte(bNo);
		double sNo3= Double.parseDouble(dNO);
		System.out.println(sNo);
		System.out.println(sNo2);
		System.out.println(sNo3);
		
		
		//숫자 ->문자열
		String str5=String.valueOf(sNo);
		String str6=String.valueOf(sNo2);
		String str7=String.valueOf(sNo3);
		System.out.println(str5+str6+str7);
	
	}	

}
