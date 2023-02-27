package com.yedam.exe;

import java.util.Scanner;

import com.yedam.admini.service.AdminiService;


public class ExeApp {
	AdminiService as = new AdminiService();
	
	Scanner sc = new Scanner(System.in);

	String menu = "";
	String bar = "";
	boolean run = true;

	public ExeApp() {
		run();
	}

	private void run() {
		// 내정보 조회, 탈퇴, 수정
		// static -> 로그인, 로그아웃
		String menu = "";
		
		while (run) {
			// 1. 로그인이 되어 있을 때 메뉴창
			// 2. 로그인이 되어 있지 않을때 메뉴창
			if (AdminiService.adminiInfo != null ) { // 로그인 되었다.
				// 로그인 후 메뉴
				
				if(AdminiService.adminiInfo.getMemberId().contains("king")) {
					adminiloginMenu();
				}else if(AdminiService.adminiInfo.getMemberId().contains("m")) {
					loginMenu();
				}else if(AdminiService.adminiInfo.getMemberId().contains("t")) {
					tloginMenu();
				}
				
			} else if (AdminiService.adminiInfo == null) { // 로그인 안되었다.
				// 로그인 전 메뉴
				logoutMenu();
			}
		}
	}
			private void adminiloginMenu() {
				// 내정보 조회, 탈퇴, 수정
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("--------1.전체회원조회 | 2.특정회원 조회  | 3.회원추가 | 4.회원수정 | 5.회원삭제 |---------");
				System.out.println("6.전체트레이터조회| 7.특정트레이너조회 | 8. 트레이너 추가 | 9. 트레이터수정 | 10.트레이너삭제 | ");
				System.out.println("--------------------------11.로그인 화면으로 나가기------------------------------");
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("입력>");
				menu = sc.nextLine();

				switch (menu) {
				case "1":
					//전체 회원조회
					as.getMember();
			
					break;
				case "2":
					//특정 회원조회
					as.getAdmember();
			
					break;
				case "3":
					//회원추가
					as.insertAdmem();
			
					break;
				
				
				case "4":
					//회원추가
					as.modifyAdmem();
					
					break;
				case "5":
					//회원수정
					as.deleteAdmem();
					break;
				case "6":
					as.gettrainer();
			
					break;
				case "7":
					as.getAdTrainer();
			
					break;
				case "8":
					as.insertTrainer();
			
					break;	
				case "9":
					as.modifytrain();
					break;
				case "10":
					as.deletetrainer();
					break;
				case "11":
					logoutMenu();
					break;
				}
				

			}
			
			
			private void loginMenu() {
				// 내정보 조회, 탈퇴, 수정
				System.out.println("=======================================================================================================");
				System.out.println("=1.나의기록보기 | 2.나의 BMI수치 비만도 확인  | 3.나의 3대운동 기록보기 | 4. 나의 운동기록, 및 몸무게 수정 | 5.로그인 화면으로 나가기= ");
				System.out.println("=======================================================================================================");
				System.out.println("입력>");
				bar = sc.nextLine();

				switch (bar) {
				case "1":
					
					as.getRecord();
			
					break;
				case "2":
					as.getBmi();
							
					break;
				
				
				case "3":
					as.getExercise();
					;
					
					break;
				case "4":
					as.updateRecord();
					;
					
					break;
				
				case "5" :
					logoutMenu();
					break;
				}
			}
			
			
			
			private void tloginMenu() {
				// 내정보 조회, 탈퇴, 수정
				System.out.println("====================================================");
				System.out.println("=1.나의 회원명단|2.나의 근무일수확인하기|3. 로그인 화면으로 나가기 |=");
				System.out.println("====================================================");
				System.out.println("입력>");
				bar = sc.nextLine();

				switch (bar) {
				case "1":
					
					as.getmemberList();
			
					break;
				case "2":
					as.getBmi();
					
			
					break;
				
				
				case "3":
					logoutMenu();
					break;
					
				
				}
			}


			private void logoutMenu() {
				System.out.println("1. 로그인 | 2. 종료");
				System.out.println("입력>");
				menu = sc.nextLine();
				if (menu.equals("1")) {
					as.login();
				} else if (menu.equals("2")) {
					run = false;
					System.out.println("프로그램 종료");
				}

			}

		}
	

