package assignment;



public class non {


public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			/* 해당 부분 코딩 */
			
			//answer 의 숫자의 갯수 -> counter 인덱스 매칭
			// amswer에서 데이터 (값)이 나왔을때
			// ->counter의 인덱스로 바꾼다
			//answer ->1
			//counter[0] = counter [0]+1
			//answer -> 4
			//counter[3] =counter [3]+1
			counter[answer[i]-1]++;
		}
		for (int i = 0; i < counter.length; i++) {
			for(int j =0 ; j< counter[i]; j++)
			{System.out.print("*");}
			System.out.println();
		}
	}

}