package com.yedam.variable;

public class VariableInitial {

	public static void main(String[] args) {
		String value = "value";
			
		String result = value + 010 ;
		
		System.out.print(result+"\n\r");
	
		int hour =5;
		int minute=3;
		
		System.out.print(hour+"시"+minute+"분\n");
		int totalMinute = (hour * 60) + minute;
		System.out.print("총"+totalMinute+"분입니다\n");
	
		
		//swap 하는법
		// x=> 10, y =>3
		int x=3;
		int y=10;
		int z;
		
		//1) x의 테이터 -> z에 담아준다. x =3. z=3
		z = x;
		//2) y의 테이터 -> x에 담아준다. x=10 y=10
		x =y;
		//3) z(x)의 데이터 -> y에 담아준다.  y=3, z=3
		y =z;
		
		
		System.out.println("x:" + x + ", y:" +y);
		
		//변수의 사용 범위(scope)
		int v1 = 15;
		if(v1  >10) {
			int v2;
			v2= v1-10;
		}
		int v3 =0xb3;
		System.out.println(v3);
		
	}

}
