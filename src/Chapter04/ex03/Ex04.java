package Chapter04.ex03;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 1. 이중 for 문을 사용해서 1단 19 단까지 출력
		*/
//풀이		
		System.out.println("====1. 1단 ~ 19단까지 출력 ===");
		
		
		for (int a=1; a<20; a++) {
			for (int b=1; b<10; b++) {
				System.out.print(a + "*" + b +"=" + a*b+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("====2. 1단 ~ 19단까지 출력 내용중 3의 배수단만 출력 ===");
		
		for (int a=1; a<20; a++) {
			for (int b=1; b<10; b++) {
				
				if(b%3==0) {
				System.out.print(a + "*" + b +"=" + a*b+"\t");
				}
			}
			System.out.println();
		}
		
// 답안
//1번 문제 
		System.out.println("====1. 1단 ~ 19단까지 출력 - 답 ===");
		for( int i = 1; i < 20; i++) {
			System.out.println(i + "단");
			for (int j = 1; j<10 ; j++) {
				System.out.printf("%d * %d = %d \t", i, j, i*j);
			}
				System.out.println("\n");
		}
//2번-1
		System.out.println("====2. 1단 ~ 19단까지 출력 내용중 3의 배수단만 출력 - 답 ===");
		
		for( int i = 1; i < 20; i++) {
			
		
			if (i % 3 == 0 ) {		//3의 배수 단만 출력
			System.out.println(i + "단");
			for (int j = 1; j<20 ; j++) {
				System.out.printf("%d * %d = %d \t", i, j, i*j);
			}
		}
			if (i %3 == 0) {
				System.out.println("\n\n");
			}
			
//2번-2 :i의 증가값을 적용
			
			System.out.println("====2. 1단 ~ 19단까지 출력 내용중 3의 배수단만 출력 - 답 : i의 증가값을 적용  ===");
			
			for( int c = 0; c < 20; c+=3) {
				System.out.println(c + "단");
				for (int j = 1; j<10 ; j++) {
					System.out.printf("%d * %d = %d \t", c, j, c*j);
				}
					System.out.println("\n");
			}
			
//2번-3 : continue
			
			System.out.println("====2. 1단 ~ 19단까지 출력 내용중 3의 배수단만 출력 - 답 : continue  ===");
			
			// 제어 키워드 : break; continue;
				// 제어 키워드는 일반적으로 if문과 함께 사용됨
				// break ;  <== {} 실행 블락을 탈출
				// continue ; 	<== continue를 만나면 continue; 아래 내용은 실행되지 않고, 증감식을 작동 시킴
			
			for( int d = 1; d < 20; d++) {		//3의 배수가 아닐떄는 continue가 작동->아래코드 실행 안됨
				
				if (d % 3 == 0 ) {	continue; }
				
				System.out.println( d + "단");
				for (int j = 1; j < 20 ; j++) {
					System.out.printf("%d * %d = %d \t", d, j, d*j);
				}
					System.out.println("\n");
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
	
	}
}
