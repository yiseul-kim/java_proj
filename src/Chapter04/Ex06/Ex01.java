package Chapter04.Ex06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 스캐너로 번호를 입력 받고 각 프로그램을 출력 하는 프로그램을 작성 ( 17:50)
		 for 문 블락 내에서 scanner를 인풋 받는다. 
		 */
		
		Scanner sc = new Scanner(System.in);
		 
		int a;
		
		do {
			System.out.println("==========================================");
			System.out.println("1. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램");
			System.out.println("2. 10 이하의 정수를 입력받아 정수만큼 \\\"JAVA 프로그래밍\\\"이라고 출력하는 프로그램");
			System.out.println("3. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
			System.out.println("4. 입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램 ");
			System.out.println("5. 프로그램 종료");
			System.out.println("==========================================");
			System.out.println("위의 번호를 입력 하세요 >>> ");
			a = sc.nextInt();
			if ( a==1 ) {
				System.out.println("1. 1부터 20까지의 홀수를 차례대로 출력하는 프로그램");
						for (int i=1 ; i<21; i++ ) {
							if (i%2==1)
							System.out.print(i+" / ");
						} System.out.println();
			}
			else if ( a == 2 ) {
				System.out.println("2. 10 이하의 정수를 입력받아 정수만큼 \"JAVA 프로그래밍\"이라고 출력하는 프로그램");
				
					int b;
					System.out.println("10이하의 정수를 입력해주세요 >>>");
					b = sc.nextInt();
					for( int j = 1 ; j < 10; j++ ) {
						System.out.println("JAVA 프로그래밍");
						if(j == b) {
							break;} 
				
			}
			} else if ( a == 3 ) {	
				
				System.out.println("3. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
				
				int input;
				int even, odd;
				even = odd = 0;
				System.out.println("10개의 정수를 공백을 이용해서 입력해주세요.");
				
				for( int i=1; i<=10; i++) {
					input = sc.nextInt();
					if (input%2==0) {
						even++; //짝수
					}else {
						odd++; //홀수
					}
				}
				System.out.printf("짝수는 %d개, 홀수는 %d개 입니다.\n", even, odd);
				System.out.println();
				
			}else if ( a == 4 ) {	
				
				System.out.println("4. 입력받은 정수만큼 성적을 입력받아서 총점과 평균을 출력하는 프로그램 ");
				
				int aa, bb, cc, tot;
				
				double avg;
				
				System.out.print("세 과목 점수를 공백을 이용해서 입력하시오 : \n");
		        aa = sc.nextInt();
		        bb = sc.nextInt();
		        cc = sc.nextInt();
		        
		        tot = aa+bb+cc;
				avg = tot/3;
		        
		        System.out.printf("당신의 총점은 %d점 이고, 당신의 평균은  %3.2f점 입니다. \n\n", tot, avg);
		        
			} else if ( a==5 ) { 
				System.out.println("5. 프로그램 종료 ");
				break; 
			}else {
				System.out.println("잘못 입력 하셨습니다. ");
			}
				 
		} while (true);
				
		sc.close();
		
		
		
		
		
	}
}


