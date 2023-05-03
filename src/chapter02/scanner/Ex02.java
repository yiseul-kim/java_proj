package chapter02.scanner;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		 //Ex02
		//1. 스캐너 등록
		//2. 우리 가족의 이름(String) 및 몸무게(double)를 인풋 받고
		//3. 몸무게의 합과 평균을 구해서 출력하는 프로그램을 작성
			// sc.nextDouble(); : 실수값을 받을때
		
		Scanner fw = new Scanner(System.in);
		
		String fn ;
		String mn ;
		String sn ;
		String m ;
		
		Double ffw ;
		Double mmw ;
		Double ssw ;
		Double mw ;
		
		System.out.println("아버지의 성함을 입력하세요>>>");
		fn = fw.next();
		System.out.println("어머니의 성함을 입력하세요>>>");
		mn = fw.next();
		System.out.println("형제의 성함을 입력하세요>>>");
		sn = fw.next();
		System.out.println("본인의 성함을 입력하세요>>>");
		m = fw.next();
		
		
		System.out.println("아버지의 몸무게를 입력하세요>>>");
		ffw = fw.nextDouble();
		System.out.println("어머니의 몸무게를 입력하세요>>>");
		mmw = fw.nextDouble();
		System.out.println("형제의 몸무게를 입력하세요>>>");
		ssw = fw.nextDouble();
		System.out.println("본인의 몸무게를 입력하세요>>>");
		mw = fw.nextDouble();
		
		double sum = ffw + mmw + ssw + mw ;
		double avg = sum / 4.0 ;
		
		System.out.printf("%s 님 가족의 몸무게 합은 %4.0f 이며, 평균은 %3.2f 입니다. "
				, mw, sum, avg);
				
	}
	
}
