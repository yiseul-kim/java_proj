package Chapter04.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 스캐너로 월을 인풋 받습니다. (1~12월 까지 정수를 인풋 받습니다. )
		 "해당 월은 0 월 이고, 0일까지 존재합니다. "
		 
		 참고 : 1,3,5,7,8,10,12 월은 31일까지 존재
		 		2월 28일까지
		 	 	그 외 30일 까지 존재
		 	 	
		*/
		
		
		Scanner sc= new Scanner(System.in);
		int month ;   //스캐너로 월을 인풋 받습니다. 
		int day = 30;  //day 변수에 초기 값을 30으로 할당

		
		System.out.println("1~12월 중 하나의 정수를 입력하세요>>>");
		month = sc.nextInt();
		
		switch (month) {
		case 1 :case 3:case 5:case 7:case 8:case 10: case 12:
			System.out.printf("해당월은 %d월 이고, %d일까지 존재합니다.\n\n", month, day+1);
			break;
		case 2 :
			System.out.printf("해당월은 %d월 이고, %d일까지 존재합니다.\n\n", month, day-2);
			break;
		default:
			System.out.printf("해당월은 %d월 이고, %d일까지 존재합니다.\n\n", month, day);
		}
		
		System.out.println("===2. case 문 밖에서 출력 ====");
		System.out.printf("해당월은 %d월 이고, %d일까지 존재합니다.\n\n", month, day-2);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
