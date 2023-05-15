package chapter05.ex03;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		
		/*
		 배열방 1000개를 생성 , 정수 배열, 
		 4의 배수를 담는데 8의 배수는 담지 않도록 저장
		 
		 출력은 10개씩 끊어서 출력, For문을 사용해서 출력
		 */
		
		/*
		 * int [] arr1 = new int[1000]; int i = 0; int a ;
		 * 
		 * for ( a = 1 ; true ; a++) { if(a % 4 == 0 ) {
		 * 
		 * if ( a % 8 != 0 ) { arr1[i] = a; i++; } } if(i == 1000) break; }
		 * System.out.print(Arrays.toString(arr1)); System.out.println("\n \n");
		 */
		
		//답
		//배열선언
		int[] arr1 = new int[1000];		//배열방 1000개 생성,  index : 0 ~ 999 번 방까지
		
		//각 배열 방에 값을 insert
		for (int i = 0, a = 1 ; true ; a++) {	// i 변수는 방번호, a 변수는 값
			if(i == 1000 ) break;
			
			if( a % 4 == 0 && a % 8 != 0 ) {	// a가 4의 배수이면서 8의 배수가 아닐때
				arr1[i] = a;
				i++;				// i : 999
			}	
		}
			//출력
			for (int i = 0 ; i < arr1.length; i++)	{
				System.out.print(arr1[i] + " ");
				
				if ( (i + 1 ) % 10 == 0 ) {	   //10개씩 나눠 출력하는 구문
					System.out.println();
					
				}
		}
		
				
		
		
		
		
	}
}
