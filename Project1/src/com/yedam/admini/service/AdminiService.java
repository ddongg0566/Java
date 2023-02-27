package com.yedam.admini.service;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;


public class AdminiService {
	public static Admini adminiInfo = null;
	
	Scanner sc = new Scanner(System.in);
	//1.로그인
	//관리자 정보
    public void login() {
		Admini adm = null;
		System.out.println("ID>");
		String MemberID = sc.nextLine();
		System.out.println("PW>");
		String MemberPw = sc.nextLine();
		
		adm = AdminiDAO.getInstance().login(MemberID);
		
		//id를 통해서 회원 정보를 조회하고, 조회 된 결과에 따라서 login 여부를 결정
		//1. id를 통해 조회가 되었다 -> 회원의 정보가 존재한다.
		//따라서, 입력한 비밀번호와 회원의 정보에서의 비밀번호가 동일 => login 진행
		//memberInfo에 조회된 회원의 정보 대입
		
		//id를 통해 조회가 되지 않았다. -> 회원의 정보가 없다.
		//따라서, login 실패
		//memberInfo에는 null이 유지
		
		if(adm != null) { //데이터가 조회 되었다.
			if(MemberID.contains("king")) {
					
		
				if(adm.getMemberPw().equals(MemberPw)) {
				
				System.out.println("정상 로그인 되었습니다.");
				System.out.println( "관리자님 환영합니다.🎉🎉");
				adminiInfo = adm;
				} else {
				System.out.println("비밀번호가 틀립니다.");}
		
			}
			
			else if(MemberID.contains("m")) {
				
				if(adm.getMemberPw().equals(MemberPw)) {
				
				System.out.println("정상 로그인 되었습니다.");
				System.out.println(adm.getMemberName() + "회원님 환영합니다.🎉🎉");
				adminiInfo=adm;
				} else {
			    System.out.println("비밀번호가 틀립니다.");}
			
			}
			
			else if(MemberID.contains("t")) {
				
				if(adm.getMemberPw().equals(MemberPw)) {
				System.out.println("정상 로그인 되었습니다.");
				System.out.println(adm.getMemberName() + "트레이너님 환영합니다.🎉🎉");
				adminiInfo=adm;
				} else {
				
				System.out.println("비밀번호가 틀립니다.");}
			}
			
		}
	     	else {
			System.out.println("해당 아이디는 존재하지 않습니다.");
		}
}
	public void getMember() {
		
		List<Admini>list= AdminiDAO.getInstance().getMemberList();
		for(int i =0; i<list.size(); i++) {
		
		System.out.println(list.get(i).toString());
	
	}
	}
	public void gettrainer() {
			
			List<Admini>list= AdminiDAO.getInstance().gettrainerList();
			for(int i =0; i<list.size(); i++) {
			
			System.out.println(list.get(i).toString1());
		
		}
	}
	

	public void getAdmember() {
	System.out.println("회원번호>");
	String admemNo = sc.nextLine();
	Admini admem= AdminiDAO.getInstance().getAdmember(admemNo);
	if(admem ==null) {
		System.out.println("조회된 결과 없음");
	}else if (admem.getMemberId().contains("m")){
		System.out.println("회원 번호: " + admem.getMemberId());
		System.out.println("비밀 번호: " + admem.getMemberPw());
		System.out.println("회원 이름: " + admem.getMemberName());
		System.out.println("회원 나이: " + admem.getMemberAge());
		System.out.println("회원 성별: " + admem.getMemberSex());
		System.out.println("회원 주소: " + admem.getMemberAddress());
		System.out.println("회원 전번: " + admem.getMemberPhone());
		System.out.println("시작 일자: " + admem.getMemberDate());
		System.out.println("트레이너 번호: " + admem.getMembertrainerId());
		System.out.println("트레이너 이름: " + admem.getMemberTrainer());
		System.out.println("pt 시작: " + admem.getMemberTrainerDate());
	}else if (admem.getMemberId().contains("t")) {
		System.out.println("트레이너조회로 들어가세요");
	}

	
}
	public void getAdTrainer() {
	System.out.println("트레이너번호>");
	String admemNo = sc.nextLine();
	Admini admem= AdminiDAO.getInstance().getAdmember(admemNo);
	if(admem ==null) {
		System.out.println("조회된 결과 없음");
	}else if (admem.getMemberId().contains("t")){
		System.out.println("트레이너 번호: " + admem.getMemberId());
		System.out.println("비밀 번호: " + admem.getMemberPw());
		System.out.println("트레이너 이름: " + admem.getMemberName());
		System.out.println("트레이너 나이: " + admem.getMemberAge());
		System.out.println("트레이너 성별: " + admem.getMemberSex());
		System.out.println("트레이너 주소: " + admem.getMemberAddress());
		System.out.println("트레이너 전번: " + admem.getMemberPhone());
		System.out.println("입사 일자: " + admem.getMemberDate());
		
	}else if (admem.getMemberId().contains("m")) {
		System.out.println("회원조회로 들어가세요");
	}

	
}

	
	
	
	public void insertAdmem() {
	Admini admem = new Admini();
	
	System.out.println("🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍새로운 멤버🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍");
	while (true) {
	System.out.println("회원번호>");
	admem.setMemberId(sc.nextLine());
		
	if(admem.getMemberId().contains("m")==false) {
	System.out.println("회원번호는 m으로 시작해야합니다.");
	return;
	}
		
	System.out.println("비밀번호>");
	admem.setMemberPw( sc.nextLine());
	System.out.println("회원이름>");
	admem.setMemberName(sc.nextLine());
	System.out.println("회원 나이>");
	admem.setMemberAge(Integer.parseInt(sc.nextLine()));
	System.out.println("회원 성별>");
	admem.setMemberSex(sc.nextLine());
	System.out.println("회원 주소>");
	admem.setMemberAddress(sc.nextLine());
	System.out.println("회원 전번");
	admem.setMemberPhone(sc.nextLine());
	System.out.println("시작 일자");
	admem.setMemberDate(Date.valueOf(sc.nextLine()));
	System.out.println("트레이너 번호");
	admem.setMembertrainerId(Integer.parseInt(sc.nextLine()));
	System.out.println("트레이너 이름");
	admem.setMemberTrainer( sc.nextLine());
	System.out.println("pt 시작일자");
	admem.setMemberTrainerDate(Date.valueOf(sc.nextLine()));
		
	int result =AdminiDAO.getInstance().insertAdmem(admem);
	
	if(result>0) {
		System.out.println("회원등록완료");
		System.out.println("👍👍👌🤞");
	}else {
		System.out.println("회원등록실패");
		System.out.println("😂😢😂🤣😂😢😂🤣");;
	}
	}
}
	public void insertTrainer() {
		Admini admem = new Admini();
		
		System.out.println("🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍새로운 트레이너🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍");
		while (true) {
		System.out.println("트레이너번호>");
		admem.setMemberId(sc.nextLine());
			
		if(admem.getMemberId().contains("t")==false) {
		System.out.println("트레이너번호는 t로 시작해야합니다.");
		return;
		}
			
		System.out.println("비밀번호>");
		admem.setMemberPw( sc.nextLine());
		System.out.println("트레이너이름>");
		admem.setMemberName(sc.nextLine());
		System.out.println("트레이너 나이>");
		admem.setMemberAge(Integer.parseInt(sc.nextLine()));
		System.out.println("트레이너 성별>");
		admem.setMemberSex(sc.nextLine());
		System.out.println("트레이너 주소>");
		admem.setMemberAddress(sc.nextLine());
		System.out.println("트레이너 전번");
		admem.setMemberPhone(sc.nextLine());
		System.out.println("입사 일자");
		admem.setMemberDate(Date.valueOf(sc.nextLine()));

			
		int result =AdminiDAO.getInstance().insertAdmem(admem);
		
		if(result>0) {
			System.out.println("트레이너등록완료");
			System.out.println("👍👍👌🤞");
		}else {
			System.out.println("트레이너등록실패");
			System.out.println("😂😢😂🤣😂😢😂🤣");;
		}
		}
	}
    
	
	
	
	
    public void modifytrain() { 
    	
    	System.out.println("🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍트레이너 수정🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍");
    	Admini admem = new Admini();
    	while (true) {
    		System.out.println("수정트레이너번호>");
    		admem.setMemberId(sc.nextLine());
    			
    		if(admem.getMemberId().contains("t")==false) {
    		System.out.println("트레이너번호는 t로 시작해야합니다.");
    		return;
    		}
    	System.out.println("트레이너 이름>");
    	String MemberName = sc.nextLine();
    	System.out.println("트레이너 나이>");
    	int MemberAge = Integer.parseInt(sc.nextLine());
    	System.out.println("성별>");
    	String  MemberSex= sc.nextLine();
    	System.out.println("주소>");
    	String  MemberAddress= sc.nextLine();
    	System.out.println("전번");
    	String  MemberPhone= sc.nextLine();
    	System.out.println("입사 일자");
    	Date MemberDate = Date.valueOf(sc.nextLine());
    	
    	
    	
    	
    	admem.setMemberName(MemberName);
    	admem.setMemberAge(MemberAge);
    	admem.setMemberSex(MemberSex);
    	admem.setMemberAddress(MemberAddress);
    	admem.setMemberPhone(MemberPhone);
    	admem.setMemberDate(MemberDate);
   
    	
    	int result = AdminiDAO.getInstance().modifyAdmem(admem);
    	
    	if(result > 0) {
    		System.out.println("트레이너 수정 완료");
    	}else {
    		System.out.println("트레이너 수정 실패");
    	}}
    }
    public void modifyAdmem() {
	System.out.println("🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍회원 수정🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍");
	Admini admem = new Admini();
	while (true) {
		System.out.println("수정회원번호>");
		admem.setMemberId(sc.nextLine());
			
		if(admem.getMemberId().contains("m")==false) {
		System.out.println("회원번호는 m으로 시작해야합니다.");
		return;
		}
	System.out.println("회원이름>");
	String MemberName = sc.nextLine();
	System.out.println("회원 나이>");
	int MemberAge = Integer.parseInt(sc.nextLine());
	System.out.println("회원 성별>");
	String  MemberSex= sc.nextLine();
	System.out.println("회원 주소>");
	String  MemberAddress= sc.nextLine();
	System.out.println("회원 전번");
	String  MemberPhone= sc.nextLine();
	System.out.println("시작 일자");
	Date MemberDate = Date.valueOf(sc.nextLine());
	System.out.println("트레이너 번호");
	int MembertrainerId = Integer.parseInt(sc.nextLine());
	System.out.println("트레이너 이름");
	String MemberTrainer = sc.nextLine();
	System.out.println("pt 시작일자");
	Date MembertrainerDate = Date.valueOf(sc.nextLine());
	

	
	admem.setMemberName(MemberName);
	admem.setMemberAge(MemberAge);
	admem.setMemberSex(MemberSex);
	admem.setMemberAddress(MemberAddress);
	admem.setMemberPhone(MemberPhone);
	admem.setMemberDate(MemberDate);
	admem.setMembertrainerId(MembertrainerId);
	admem.setMemberTrainer(MemberTrainer);
	admem.setMemberTrainerDate(MembertrainerDate);
	
	int result = AdminiDAO.getInstance().modifyAdmem(admem);
	
	if(result > 0) {
		System.out.println("회원 수정 완료");
	}else {
		System.out.println("회원 수정 실패");
	}
}}
    

    public void deleteAdmem() {
	System.out.println("🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍회원 삭제🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍");
	Admini admem = new Admini();
	while (true) {
		System.out.println("삭제회원번호>");
		admem.setMemberId(sc.nextLine());
			
		if(admem.getMemberId().contains("m")==false) {
		System.out.println("회원번호는 m으로 시작해야합니다.");
		return;
		}
	String admNo = sc.nextLine();

	admem.setMemberId(admNo);
	
	int result = AdminiDAO.getInstance().deleteAdmem(admem);
	
	if(result > 0) {
		System.out.println("회원 삭제 완료");
	}else {
		System.out.println("회원 삭제 실패");
	}}
}
    public void deletetrainer() {
    	System.out.println("🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍회원 삭제🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍🐱‍🏍");
    	Admini admem = new Admini();
    	while (true) {
    		System.out.println("삭제트레이너번호>");
    		admem.setMemberId(sc.nextLine());
    			
    		if(admem.getMemberId().contains("t")==false) {
    		System.out.println("트레이너번호는 t으로 시작해야합니다.");
    		return;
    		}
    	String admNo = sc.nextLine();

    	admem.setMemberId(admNo);
    	
    	int result = AdminiDAO.getInstance().deleteAdmem(admem);
    	
    	if(result > 0) {
    		System.out.println("트레이너 삭제 완료");
    	}else {
    		System.out.println("트레이너 삭제 실패");
    	}}
    }
	
    
    //회원 기록 정보
    public void getRecord() {
    	
		Admini rec = AdminiDAO.getInstance().getRecord(adminiInfo.getMemberId());
	
		System.out.println("==============================");
		if(rec == null) {
			System.out.println("조회된 결과 없음.");
		} else {
			System.out.println("회원번호 : " + rec.getMemberId());
			System.out.println("회원 키: " + rec.getRecordHeight() + "cm");
			System.out.println("회원 몸무게 : " + rec.getRecordWeight()+ "kg");
			System.out.print("스쿼트 무게 : " + rec.getRecordSquat()+ "kg\t");
			System.out.println(rec.getRecordSquatQ()+ "개");
			System.out.print("벤치프레스 무게 : " + rec.getRecordBench()+ "kg\t");
			System.out.println(rec.getRecordBenchQ()+ "개");
			System.out.print("데드리프트 무게 : " + rec.getRecordDead()+ "kg\t");
			System.out.println(rec.getRecordDeadQ()+ "개");
			}
		System.out.println("==============================");
	}
    public void getBmi() {
    	Admini rec = AdminiDAO.getInstance().getRecord(adminiInfo.getMemberId());
    	if(rec == null) {
			System.out.println("조회된 결과 없음.");
		} else if(rec != null){
			System.out.println("회원번호 : " + rec.getMemberId());
			System.out.println("회원 키: " + rec.getRecordHeight() + "cm");
			System.out.println("회원 몸무게 : " + rec.getRecordWeight()+ "kg");
			Double RecordBmi= ((rec.getRecordWeight()/ ((rec.getRecordHeight()/10)* (rec.getRecordHeight()/10)))*100);		
			System.out.printf("회원 bmi : "+RecordBmi);
			
			if(RecordBmi>=50) {
				System.out.println("고도비만 입니다.");
			}else if(RecordBmi>=30) {
				System.out.println("중등도비만 입니다.");
			}else if(RecordBmi>=20) {
				System.out.println("경도비만 입니다.");
			}else if(RecordBmi>=10) {
				System.out.println("과체중 입니다.");
			}else{
				System.out.println("비만이 아닙니다.");
			}
			
			AdminiDAO.getInstance().UpdateBmi(RecordBmi);
			
			
		}
	System.out.println("==============================");
}
    public void getExercise() {
    	Admini rec = AdminiDAO.getInstance().getExercise(adminiInfo.getMemberId());
    	
		System.out.println("==============================");
		if(rec == null) {
			System.out.println("조회된 결과 없음.");
		} else {
			
			System.out.println("---회원님의 현재수치---" );
			System.out.println("회원번호 : " + rec.getMemberId());
			System.out.print("스쿼트 무게 : " + rec.getRecordSquat()+ "kg\t");
			System.out.println(rec.getRecordSquatQ()+ "개");
			System.out.print("벤치프레스 무게 : " + rec.getRecordBench()+ "kg\t");
			System.out.println(rec.getRecordBenchQ()+ "개");
			System.out.print("데드리프트 무게 : " + rec.getRecordDead()+ "kg\t");
			System.out.println(rec.getRecordDeadQ()+ "개");
			
			System.out.println("---회원님의 다음 목표---" );
			System.out.println("스쿼트: " +(rec.getRecordSquat()+2 +"kg\t 무게 증가 혹은")+(rec.getRecordSquatQ()+2)+ "개 만큼 횟수를 늘리세요" );
			System.out.println("벤치프레스: " +(rec.getRecordBench()+2 +"kg\t 무게 증가 혹은")+(rec.getRecordBenchQ()+2)+ "개 만큼 횟수를 늘리세요" );
			System.out.println("데드리프트: " +(rec.getRecordDead()+2 +"kg\t 무게 증가 혹은")+(rec.getRecordDeadQ()+2)+ "개 만큼 횟수를 늘리세요" );
		}
		System.out.println("==============================");
	}
    
    public void updateRecord() {
    	Admini rec = AdminiDAO.getInstance().getRecord(adminiInfo.getMemberId());
    	
		System.out.println("==============================");
		if(rec == null) {
			System.out.println("기록이 없습니다.");
		} else {
			System.out.println("당신의 변화된 몸무게를 입력하세요");
			double weight= Double.parseDouble(sc.nextLine());
			System.out.println("향상된 스쿼트 무게를 입력하세요");
			int squat = Integer.parseInt(sc.nextLine());
			
			System.out.println("향상된 스쿼트 개수를 입력하세요");
			int squatQ = Integer.parseInt(sc.nextLine());
			System.out.println("향상된 벤치프레스 무게를 입력하세요");
			int bench = Integer.parseInt(sc.nextLine());
			System.out.println("향상된 벤치프레스 개수를 입력하세요");
			int benchQ = Integer.parseInt(sc.nextLine());
			System.out.println("향상된 데드리프트 무게를 입력하세요");
			int dead = Integer.parseInt(sc.nextLine());
			System.out.println("향상된 데드리프트 개수를 입력하세요");
			int deadQ = Integer.parseInt(sc.nextLine());
			
			
			Admini record = new Admini();
			record.setRecordWeight(weight);
			record.setRecordSquat(squat);
			record.setRecordSquatQ(squatQ);
			record.setRecordBench(bench);
			record.setRecordBenchQ(benchQ);
			record.setRecordDead(dead);
			record.setRecordDeadQ(deadQ);
			record.setMemberId(rec.getMemberId());
			int result = AdminiDAO.getInstance().updateRecord(record);
			if(result > 0) {
				System.out.println("회원 수정 완료");
			}else {
				System.out.println("회원 수정 실패");
			}
						
		
		
		}
		
		
		
    }
    
    //트레이너 회원 보기
    public void getmemberList() {
    	System.out.println("트레이너 본인 이름을 적어주세요>");
		String deptNo = sc.nextLine();
		
		List<Admini> list = AdminiDAO.getInstance().getmemberList(deptNo);
		System.out.println("==============================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("회원 이름 : " +list.get(i).getMemberName() );
			System.out.println("회원 나이 : " + list.get(i).getMemberAge());
			System.out.println("회원 성별 : " + list.get(i).getMemberSex());
			System.out.println("회원 주소 : " + list.get(i).getMemberAddress());
			System.out.println("회원 전번 : " + list.get(i).getMemberPhone());
			System.out.println("==============================");
		}
		System.out.println(deptNo +"가 관리하는 회원수는 총 "+list.size() +"명 입니다.");
			if (list.size() >=10) {
				System.out.println("관리자와 연봉협상을 다시 하십시오");
			}else {
				System.out.println("당신의 월급은 회원수를 체우지 못하고 있습니다. 분발하세요");
				System.out.println("월급을 더 올리고 싶으면 적어도" + (10-list.size()) + "명 이상의 회원을 확보하세요");
			}
		}
    
    Public Void popular() {
    	
    }
		
    }

    
    
   