package chapter05.ex05;

import java.util.Arrays;

public class Rectangle_Array_Output {

	public static void main(String[] args) {
		/*
		 * 2차원 - 정방향 배열 출력 방법 - For - For - Enhanced For - Enhanced For -
		 * Arrays.toString(배열 변수)
		 * 
		 */
		// <문제>
		// 배열 : 행 : 3 , 열 : 100 ( index : 0 ~ 99 ) : for - for
		// 0 행 - 1 ~ 100 까지 정수
		// 1 행 - 2의 배수
		// 2 행 - 3의 배수

		int[][] arr1 = new int[3][100]; // 배열 선언

		System.out.println(arr1.length); // 행의 갯수 (2차원)
		System.out.println(arr1[0].length); // 0 행의 열의 갯수 100개
		System.out.println(arr1[1].length); // 1 행의 열의 갯수 100개
		System.out.println(arr1[2].length); // 2 행의 열의 갯수 100개

		
		// 2. 배열의 각 방에 값 넣기

		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				for (int j = 0, a = 1; j < arr1[i].length; j++, a++) {
					// 값을 넣을 변수
					arr1[i][j] = j + 1;
					// arr1[i][j] = a ;
				}
			} else if (i == 1) { // 2의 배수
				for (int j = 0, a = 2; j < arr1[i].length; j++, a += 2) {

					arr1[i][j] = a;
				}

			} else if (i == 2) {
				for (int j = 0, a = 3; j < arr1[i].length; j++, a+=3) {
							
					arr1[i][j] = a;
		
				}

			}
		}
//		출력
		System.out.println("===== 1. 이중 For 문을 이용 2차원 정방형 배열 출력 =========");
		for ( int i = 0 ; i < arr1.length ; i++) {	
			for( int j = 0; j < arr1[i].length; j++) {
				
				if ( j < arr1[1].length -1 ) {
					System.out.print(arr1[i][j] + ",");
				} else {
					System.out.println(arr1[i][j]);
				}
				
			}
			System.out.println(); 
		}
		
		System.out.println("===== 2. Enhance For =========");
		for (int[] k : arr1 ) {
			for ( int a : k )	{
				System.out.print( a + " ");
			
			}
			System.out.println();
		}

		System.out.println("===== 3. Arrays.toString()=========");
		
		System.out.println(Arrays.toString(arr1));

	}

}
