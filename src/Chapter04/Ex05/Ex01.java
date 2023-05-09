package Chapter04.Ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 스캐너로 번호를 인풋 받아서 4. 번을 누를때까지는 무한 루프
		// do while, if , for-for
		
		
// 문제 풀이		
		/*
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		
		do {
		
			System.out.println("==============================================================");
			System.out.println(" 1. 구구단 출력 | 2. 19단 출력 | 3. 19단중 7배수단 출력 | 4. 프로그램 종료");
			System.out.println("==============================================================");
			System.out.println("위의 번호를 입력 하세요 >>> ");
			a = sc.nextInt();
		
			if ( a==1) { 
				int i,j;
				for (i=1; i<10 ; i++) {
					System.out.println(i + "단 출력" );
					System.out.println("==================");
					
					for (j=1 ; j<10 ; j++) {
						System.out.print (i + "*"+j +"="+i*j+"\t");
					}
				System.out.println();
			}} else if (a==2) {
				int i=1;
				int j=1;
	
				for (i=1; i<20 ; i++) {
					System.out.println(i + "단 출력" );
					System.out.println("==================");
					
					for (j=1 ; j<20 ; j++) {
						System.out.print (i + "*"+j +"="+i*j+"\t");
					}
				System.out.println();
				
			}}else if (a==3) {
				int i,j;
				for (i=1; i<20 ; i++) {
					System.out.println(i + "단 출력" );
					System.out.println("==================");
					
					for (j=0 ; j<20 ; j+=7) {
						System.out.print (i + "*"+j +"="+i*j+"\t");
					}
				System.out.println();
				
			}} else if (a==4) {
				System.out.println("4.프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력했습니다. (1~4번까지의 정수를 입력하세요.)");
			}
		} while ( true );
		
	System.out.println("do - While 문을 빠져 나왔습니다. 프로그램이 종료 되었습니다. ");

	sc.close();
		*/
		
// 답
		// 단축키 : ctrl + shift + F = 코드를 자동 정렬
		// 단축키 : ctrl + alt + 화살표(down) = 선택된 라인을 복사
		// 단축키 : alt + up/down : 선택 라인이동
		
		
		int a;
		
		
		do {
		
			System.out.println("==============================================================");
			System.out.println(" 1. 구구단 출력 | 2. 19단 출력 | 3. 19단중 7배수단 출력 | 4. 프로그램 종료");
			System.out.println("==============================================================");
			System.out.println("위의 번호를 입력 하세요 >>> ");
			a = sc.nextInt();
			
			if ( a==1 ) {
				System.out.println("1. 구구단 출력");
				System.out.println("==========================================================");
				for (int i=1; i<10; i++) {	// 단수를 출력 하는 for, i : 단
					System.out.println(i+" 단");
					for (int j =1; j<10 ; j++ ) {
						System.out.printf("%d * %d = %d \t", i, j, i*j);
					}
					System.out.println();  // 단수를 출력 후 enter
				}
				
			}else if ( a == 2 ) {
				System.out.println("2. 19단 출력");
				System.out.println("===========================================================");
				for (int i=1; i<20; i++) {	// 단수를 출력 하는 for, i : 단
					System.out.println(i+" 단");
					for (int j =1; j<20 ; j++ ) {
						System.out.printf("%d * %d = %d \t", i, j, i*j);
					}
					System.out.println();  // 단수를 출력 후 enter
				}
				
			}else if ( a == 3 ) {
				System.out.println("3. 19단중 7배수단 출력");
				
				for (int i =1; i<20 ; i++ ) {
					if (i % 7 == 0) {
					System.out.println(i+" 단");
					for (int j =1; j<20 ; j++ ) {
						System.out.printf("%d * %d = %d \t", i, j, i*j);
					}
					System.out.println();  // 단수를 출력 후 enter
				}}
			}else if ( a == 4 ) {
				System.out.println(" 4. 프로그램 종료");
				break;
			}else {
				System.out.println("경고 : 1~4까지의 정수만 입력하세요. ");				
			}
		
		
		
		} while (true);
		
		System.out.println("While 문 탈출 - 프로그램 종료됨");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
