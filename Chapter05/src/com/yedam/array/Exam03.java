package com.yedam.array;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 한 학생의 국영수 성적을 보관하는 배열
		//배열생성
		int [] point = new int[3];
		//첫번째 : 국어
		System.out.println("국어점수>");
		point[0] = Integer.parseInt(sc.nextLine());
		//두번째 : 영어
		System.out.println("영어점수>");
		point[1] = Integer.parseInt(sc.nextLine());
		//세번째 : 수학
		System.out.println("수학점수>");
		point[2] = Integer.parseInt(sc.nextLine());
		
		
		//점수의 총합계
		int sum = 0;
		for(int i=0; i<point.length; i++) {
			sum += point[i];
		}
		System.out.println("점수의 총합계: " + sum);
		
		
		//점수의 평균(실수)
		double avg =0;
		avg = (double)sum / point.length;
		System.out.printf("점수의 평균: %5.2f\n" , avg);
	
		//최대값 구하기
		int max =0;
		int min = point[0];
			for(int i = 0; i<point.length; i++) {
			if(point[i]>max) {
				max = point[i];
			}else if(point[i]<min) {
				min = point[i];
			}
			
	}
			System.out.println("최대값: "+ max);
			System.out.println("최소값: "+ min);
			System.out.println("===================================================");
			
			
		
			
			
			
			
	
	}

}
