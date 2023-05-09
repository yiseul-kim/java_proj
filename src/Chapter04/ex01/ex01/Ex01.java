package Chapter04.ex01.ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 예제)
		 스캐너로 money를 인풋 받습니다. 
		  0~3000 :  "걸어서 다닙니다."
		  3001 ~ 30000 : "지하철을 타고 다닙니다."
		  30001 ~ 100000 : "택시를 타고 다닙니다."
		  100000 ~ 		 : "비행기를 타고 다닙니다."
		 */
		
		int money;
		
		Scanner JJ = new Scanner(System.in);
		
		System.out.println("당신의 자산을 입력해주세요.");
		
		money = JJ.nextInt();
		
		
		if (money>=0 && money<=3000) {
			System.out.println("걸어서 다닙니다.");
		} else if (money>3000 && money <=30000){
			System.out.println("지하철을 타고 다닙니다.");
		} else if (money>30000 && money <100000) {
			System.out.println("택시를 타고 다닙니다.");
		} else {
			System.out.println("비행기를 타고 다닙니다.");
		}
		
		JJ.close();		//스캐너 종료, 메모리에서 삭제
		
		
		

		
		
		
	}

}
