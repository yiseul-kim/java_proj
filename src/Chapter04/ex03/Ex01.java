package Chapter04.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 스캐너로 1~9 까지의 정수를 인풋 받아서 for  문을 사용해서
		 인풋 받은 단수를 출력
		 1. println() 으로 출력
		 2. printf() 
		 */
		Scanner sc = new Scanner(System.in); 
		int num;
		
		// 1. println() 으로 출력
		
		System.out.println("1~9까지의 숫자를 입력하세요 >>>");
		num = sc.nextInt();
		
		for (int i=num, j=1 ; j<10;j++ ) {
			System.out.println(i +" * "+ j + "=" + i * j);
		}
		
		System.out.println("=============================");
		
		// 2. printf() 으로 출력
		
		System.out.println("1~9까지의 숫자를 입력하세요 >>>");
		num = sc.nextInt();		//콘솔로 부터 단수를 입력 받아 i 변수에 값 할당. 
		
		for (int i=num, j=1 ; j<10;j++ ) {
				System.out.printf("%d * %d = %d \n", i, j, i*j);
			}
	
		
		
		
		
		sc.close();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
