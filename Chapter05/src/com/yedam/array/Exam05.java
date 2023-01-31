package com.yedam.array;

public class Exam05 {

	public static void main(String[] args) {
		// 최대값 또는 최소값이 위치하는 인덱스 구하기
		int[] array = { 20, 50, 70, 80, 30, 10, 90, 100 };
		int max = array[0];
		int min = array[0];
		int j = 0;
		int q = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];//
				j = i;
			}else if(array[i]<min) {
				q =i ;
			}

		}
		System.out.println(j);//
		System.out.println(q);//
		
		
		for(int i=0; i<args.length; i++) {
			System.out.println("명령문 출력: "+ args[i]);
		}
		
	}
}
