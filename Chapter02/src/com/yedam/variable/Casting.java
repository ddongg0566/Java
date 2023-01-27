package com.yedam.variable;

public class Casting {
	public static void main(String[] args) {
		int iVar=65;
		byte bVar=(byte)iVar;
		System.out.println(bVar);
		
		char cVar=(char) iVar;
		System.out.println(cVar);
				
		double dVar=9.1568;
		iVar = (int) dVar;
		System.out.println(iVar);	
		dVar = iVar;
		System.out.println(dVar);
		
		
		byte x=10;
		byte y=20;
		
		System.out.println(x+y);
		
		
		long z=100000L;
		int t=20;
		long result1 = z+t;
		System.out.println(result1);
		
		
		
	}


}

