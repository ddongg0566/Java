package com.yedam.inout;

public class Example {

	public static void main(String[] args) {
		int value =123;
		String name ="상품";
		double price = 10000.10;
		System.out.printf("상품의 가격: %d\n",value);
		System.out.printf("%s의 가격: %d\n", name, value);
		System.out.printf("%s의 가격: %d원, %f\n", name, value, price);
		
		//옵션추가
		value =11;
		System.out.printf("%d\n", value);
		System.out.printf("%6d\n", value);
		System.out.printf("%-6d\n", value);
		System.out.printf("%010d\n", value);

		
		price= 321.1234;
		System.out.printf("%f\n", price);
		System.out.printf("%10.2f\n", price);
		System.out.printf("%-10.2f\n", price);
		System.out.printf("%010.2f\n", price);
	
			
	}
	
	

}
