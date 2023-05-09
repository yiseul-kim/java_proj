package Chapter04.Ex05;

import java.util.Scanner;

public class Do_While_Statement02 {
	public static void main(String[] args) {
		/*
		 do while문을 사용해서 무한 루프를 돌리기 (# 블락 내에서 if를 사용하기)
		 		
		 문제) 	스캐너에서 정수값을 입력받아 아래와 같이 처리가 가능하도록 한다.
		 		4 : 무한 루프를 빠져 나온다.(프로그램을 빠져 나온다.)
		 		1 : "평균 출력"
		 		2 : "합계 출력"
		 		3 : "이름 출력" 
		 		
		*/
		
// 문제풀이
		/*
		Scanner uu = new Scanner(System.in);
		
		int b;
		
		
		System.out.println("=====================================================");
		System.out.println(" 1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
		System.out.println("=====================================================");
		System.out.println("위의 번호를 입력 하세요 >>> ");
		b = uu.nextInt();
			
		 b = 1;
		do {
			System.out.println("평균 출력" + b);
			b++;
		} while (b>1);
	
		 b = 2;
		do {
			System.out.println("합계 출력" + b);
			b++;
		}while (b>1);
		
		 b = 3;
		do {
			System.out.println("이름 출력" + b);
			b++;
		}while (b>1);
		
		 b = 4;
		 do {
			System.out.println(" " + b);
			b++;
		}while (b>1);
		
		 uu.close();
		 */
		 
		
// 답
		 
		  	Scanner sc = new Scanner(System.in);
		
			int a ;
		  	
			do {
				
				System.out.println("=====================================================");
				System.out.println(" 1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
				System.out.println("=====================================================");
				System.out.println("위의 번호를 입력 하세요 >>> ");
				a = sc.nextInt();	// 콘솔에서 정수를 input 받아서 a 변수에 할당.
				
					if ( a==1) { 
						System.out.println("1.평균 출력");
					}else if (a==2) {
						System.out.println("2.합계 출력");
					}else if (a==3) {
						System.out.println("3.이름 출력");
					}else if (a==4) {
						System.out.println("4.프로그램 종료");
						break;
					}else {
						System.out.println("잘못 입력했습니다. (1~4번까지의 정수를 입력하세요.)");
					}
		  	} while ( true );
		  	
			System.out.println("do - While 문을 빠져 나왔습니다. 프로그램이 종료 되었습니다. ");
			
		  	sc.close();		// 윗쪽에서 계속 무한루프가 돌기 때문에 윗쪽에 break;를 넣어줘야 실행 가능
		  
		  
		  
		  
		  
		  
	}
}
