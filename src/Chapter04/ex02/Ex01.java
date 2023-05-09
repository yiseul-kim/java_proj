package Chapter04.ex02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 switch 문으로 작성
		 1. Scanner로 정수 1,2,3을 인풋 받아서
		 	1: "금메달 입니다."
		 	2: "은메달 입니다."
		  	3: "동메달 입니다."
		  	그외 정수를 인풋 받으면 : "매달이 없습니다."
		  	
		  	===========================================
		  2. Scanner 로 문자열 "gold", "silver", "bronze"
		  "gold"	: "금메달 입니다."
		  "silver" 	: "은메달 입니다."
		  "bronze" 	: "동메달 입니다."
		  그외 정수를 인풋 받으면 : " 메달이 없습니다."
		  
		 */
		
		// switch 문으로 작성
		Scanner sc = new Scanner(System.in);
		
		int dd;
		System.out.println("정수값 하나를 입력하세요>>>");
		
		dd = sc.nextInt();		
		switch (dd) { 		
		case 1 :
			System.out.println("금메달 입니다.");
			break;
		case 2:
			System.out.println("은메달 입니다.");
			break;
		case 3:
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");	
		}
		
		System.out.println("====================================================");
				
		String uu;
		System.out.println("gold, silver, bronze 중 하나의 문자열을 입력하세요.>>>");
		
		uu = sc.next();
		switch (uu) { 		
		case "gold" :  case "Gold" : case "GOLD" :
			System.out.println("금메달 입니다.");
			break;
		case "silver": case"Silver" : case "SILVER" :
			System.out.println("은메달 입니다.");
			break;
		case "bronze": case"Bronze" : case "BRONZE":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");	
		}
		
		
		
		sc.close();
		
		
		
			
		
		
		
	}
}
