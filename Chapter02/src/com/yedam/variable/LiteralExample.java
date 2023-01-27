package com.yedam.variable;

public class LiteralExample {

	public static void main(String[] args) {
		
		//int 사용
		
		int var1 = 0b101101010101010010100010101011; //2진수(0b로 시작)
		int var2 = 0206;//8진수
		int var3 =365; //10진수
		int var4 =0xB3; //16진수(0x로 시작)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		
		// byte -128~127
		
		byte bVa1 =-128;
		byte bVa12 =0;
		byte bVa13=127;
		int bVa14= 500;
		System.out.println(bVa1);
		System.out.println(bVa12);
		System.out.println(bVa13);
		System.out.println(bVa14);
		
		//long 
		long lval=10;
		long lval1=100000000000L; //int 가 가지는 범위를 넘어서 long에 넣게되면, long 타입이라고 표현
 		System.out.println(lval);
		System.out.println(lval1);
		
		
		//char (유니코드)
		char val='A';
		char val12='가';
		char val22= 67;
		char val32= 0x0041;
		System.out.println(val);
		System.out.println(val12);
		System.out.println(val22);
		System.out.println(val32);
		
		
		//String 타입은 참조 타입이다
		String var11="나는 \"자바\"를 좋아합니다.\n";
		String var22="number\tname\tage";
		
		System.out.print(var11);
		System.out.println(var22);
		
		System.out.println("나는 \'개발자\'가 되보고 싶다");
		System.out.println("난 \\김치\\봄\\여름\f갸을");
		//실수 타입
		//float
		float fval=3.14f;
		double dval =3.14;
		System.out.println(fval);
		System.out.println(dval);
		//e 사용하기
		double dva12 = 3e6;
		float fav12=3e6f;
		double dva13=2e-3;
		System.out.println(dva12);
		System.out.println(fav12);
		System.out.println(dva13);

		
		boolean stop =true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("실행합니다.");

		}
	}

}
