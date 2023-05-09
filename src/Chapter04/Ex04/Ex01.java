package Chapter04.Ex04;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 	1000부터 1까지 5씩 감소하면서 출력 : for, while 문으로 출력
		*/
		
// 풀이
		System.out.println("==== For 문으로 출력 =====");
		
			for (int a = 1000 ; a > 0 ; a-=5 ) {
				System.out.println(a);
			}
		
		
		
		System.out.println("==== while 문으로 출력 =====");
			
			int y = 1000;				// 초기값 : while 밖에서 선언
			while ( y > 0 ) {			// 조건	
				System.out.println(y);	// 조건이 true 일동안 실행
				y-=5;					// 증감식
			}
	}
}
