package Chapter04.Ex05;

public class Do_While_Statement {

	public static void main(String[] args) {
		/*
		 do while 문 : 조건과 상관없이 첫 1회는 무조건 '실행블락'을 실행 시킴, 조건을 확인 후 반복.
		  
		< while 문 : 실행블락은 조건이 true일 때만 실행됨 >    
				초기값
				while (조건) {
					- 실행 블락
					- 증감식
				 }
				 
		< do while 문 : 조건과 상관없이 첫 1회는 무조건 실행, 조건 확인 후 반복. >
		  		초기값
		  		do {
		  			- 실행블락
		  			- 증감식
		  		}while (조건);
		  
		 */
			
		//1. while 문 
		
				System.out.println("===== while 문 ====== \n");
				int a = 0;
				while ( a < 0 ) {			// false이므로 실행 안됨.
					System.out.print(a + " " );
				}
		
		//2. do while 문 
				
				System.out.println("===== do-while 문 ====== ");
				do {						// false이므로 1회 실행됨.(조건과 상관없이)
					System.out.print(a+ " ");
				} while (a < 0 );
				
				System.out.println("\n");
				
		//3. 반복 횟수가 10번인 경우 : while 문 vs do-while 문 비교
				
				System.out.println("== 반복 횟수가 10번인 경우 : while 문 vs do-while 문 비교==\n");
				
				System.out.println("1. while 문");
				
					a = 0 ;		// 변수의 값을 변경 - int 선언만 안하면 괜찮다.
					while ( a < 10 ) {					// 0~9까지 10번 출력
						System.out.print( a + " ");
						a++;
					}
					
					System.out.println();	
				System.out.println("2. do-while 문");
				
					a = 0 ;	
					do {
						System.out.print(a + " ");
						a++;
					}while ( a < 10);
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}

}
