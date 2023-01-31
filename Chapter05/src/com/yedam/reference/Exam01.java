package com.yedam.reference;

public class Exam01 {

	public static void main(String[] args) {
		//참조타입
		int intVal = 10;
		int [] array = {1,2,3};
		int [] array2 = {1,2,3};
		int [] array3 = null;
		int a;
		
		System.out.println(intVal);
		System.out.println(array);
		System.out.println(array2.length);
		System.out.println(array == array2); // 스택영역에 있다 데이터를 비교
		System.out.println(array[1] == array2[1]); //[]안에 값을 비교
		System.out.println(array3); 
		
		//memory leak -> 메모리 누수, 메모리 부족
		String name1 = new String ("신용권");
		String name2 = "신용권";
		String name3 = "신용권";
		System.out.println(name1 == name2);
		System.out.println(name2 == name3);
		boolean result = name1.equals(name2);
		System.out.println(result);
		
	}

}
