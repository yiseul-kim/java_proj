package Chapter04.ex03;

public class For_Statement04 {
	public static void main(String[] args) {
		/*
		 for 문에서 요류를 일으키기 쉬운 부분
		 */
				
		
		for (int i = 0 ; i < 10 ; i++){
			System.out.println(i);
		}
		
		// 무한 루프가 발생됨
		System.out.println("==============");
		
		for (int i = 0, j=0 ; i<10 ; j++ ) {
			
			System.out.println(i + ", " + j);	//무한 루프가 돌아가는 구문
		
			if ( j == 1000 ) { break; } //무한 루프를 빠져나오게 하는 장치 -> 안하면 아래 코드가 작동안됨
		}
		
		
		
		System.out.println("무한 루프 발생");
		
		for (int i = 10 ; i < 100 ; i+=10 ) {		// i+=10 <-- i=i+10
			System.out.println(i);
		}
		
		// 전역변수 : for, if, switch, while, do-while {블락} 바깥쪽에서 선언됨
		// 지역변수 : for, if, switch, while, do-while {블락} 안쪽에서 선언됨
		
		// int i, j; 밖과 안에서 중복 선언하면 오류남
		
		for ( int i = 0 ; i < 10 ; i++ ) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
