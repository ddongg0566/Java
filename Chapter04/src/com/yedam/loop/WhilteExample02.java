package com.yedam.loop;

import java.util.Scanner;

public class WhilteExample02 {

	public static void main(String[] args) {
		//오락실 
		// 투입한 금액만큼 반복문을 진행
		//while문을 활용해서
		//투입한 금액대비 게임을 몇번 할수있을까?
		//예시) 10000 ->20번 5,000원 ->10번
		Scanner sc =new Scanner(System.in);
		int money;
		System.out.println("====insert coin=====");
		//돈투입
		money=Integer.parseInt(sc.nextLine());
			//투입한금액을 500으로 나눴을때 0보다크면 게임을 계속 할수있다는 뜻
		
		while(money/500 > 0) {
			//한판에 500원
			System.out.println((money/500) + "판 남음");
			System.out.println("1.가위바위보 | 2.Up & Down |3. 종료");
			System.out.println("입력>");
			int gameNo= Integer.parseInt(sc.nextLine());
			
			switch (gameNo) {
			case 1:
				System.out.println("가위바이보 실행");
				money -= 500;
				break;
				
			case 2:
				System.out.println("up&down 실행");
				money -= 500;
				break;
			case 3:
				System.out.println("종료");
				System.out.println("남은금액"+ money);
				money = 0 ; //money/500>0
				break;
			}
		}
		
		
	}

}
