package Chapter04.ex02;

public class For_Statement {
	public static void main(String[] args) {
		/*
		 반복문 : for, while, do while 
		 조건이 true 일때 까지 계속 반복, 조건이 false 이면 구문을 빠져나온다.
		 
		 *중요* 
		 for (변수의 초기값;조건;증감식){
		 	// 조건이 True일 동안 반복 실행 블락
		 }
		 
		*/
		
		
		//1. For 문의 기초 : i = 0 값을 할당 함. , i 변수는 for 블락에서 선언 했기 때문에 for문이 끝나면 소멸  
			// 0~9까지 1씩 증가하면서 i 변수의 값을 출력
		for (int i = 0; i <10; i ++) {
			
			System.out.println(i);
		
		}
		
		/*
		// 초기값(i = 100, j=200);조건(i<1000);증감식-실행 구문 작동후 증감식작동(i++, j++) 
		for (int i = 100, j = 200 ; i <1000 ; i++, j++) {
			System.out.printf("변수 i는 : %d, 변수 j : %d \n", i, j);
		}
		
		System.out.println("===============================");
		
		// 전역 변수로 선언 b
		
		/*
		int b;		// 전역 변수 : for 문 블락 밖에서 선언	
		for (b=0;b<100;b+=2) {
			System.out.print(b+" ");
		}
		
		System.out.println("==============================="); //라인 개행
		
		*/
		
		// for 문을 사용해서 0~1000 사이에서 3의 배수만 출력 
		
		 int c;
		for (c=0;c<1000;c+=3) {
			System.out.print(c+" ");
		}
		
		System.out.println("======2단을 println()으로 출력===========");
		
		// for 문을 사용해서 2단
		for (int i=2, j=1; j<10;j++) {
			System.out.println(i +" * "+ j + "=" + i * j);
		}
		
		System.out.println("======2단을 printf()으로 출력===========");
		for (int i=2, j=1 ; j<10;j++ ) {
			System.out.printf("%d * %d = %d \n", i, j, i*j);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
