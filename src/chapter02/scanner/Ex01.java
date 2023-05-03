package chapter02.scanner;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Ex01 {
	public static void main(String[] args) {
		//1. Scanner 등록
		//2. 아버님 이름, 어머님 이름, 형제이름, 자신이름	: sc.nect();
		 	//아버님 나이, 어머님 나이, 형제 나이, 자신의 나이	: sc.nextInt();
		//3. 스케너로 받은 변수의 값을 출력
		//4. 전체 나이의 합계, 평균을 구해서 소숫점이하 2 자리까지만 출력
		
		
		
		Scanner fn = new Scanner(System.in);
		
		
		String fan ; //아빠 이름
		String man ; //엄마 이름
		String sin ; //형제 이름 
		String myn ; // 내 이름
		
		int fage ; //아빠 나이
		int mage ; //엄마 나이
		int sage ; //형제 나이
		int mmge ; //내나이
		
		System.out.println("아버님의 이름을 입력하세요>>>");
		fan = fn.next();
		System.out.println("어머님의 이름을 입력하세요>>>");
		man = fn.next();
		System.out.println("형제의 이름을 입력하세요>>>");
		sin = fn.next();
		System.out.println("본인의 이름을 입력하세요>>>");
		myn = fn.next();
		
		
		System.out.println("아버님의 나이를 입력하세요>>>");
		fage = fn.nextInt();
		System.out.println("어머니의 나이를 입력하세요>>>");
		mage = fn.nextInt();
		System.out.println("형제의 나이를 입력하세요>>>");
		sage = fn.nextInt();
		System.out.println("본인의 나이를 입력하세요>>>");
		mmge = fn.nextInt();
		
		int sum = fage + mage + sage + mmge ;
		double avg = sum / 4.0 ;
		
		System.out.printf("%s 님 가족의 나이 합은 %d 이고, 평균은 %4.2f 입니다", myn , sum, avg );
		
		
		
		
		
		
	}
}
