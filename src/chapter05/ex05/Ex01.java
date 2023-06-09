package chapter05.ex05;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 
		 * 		 * 
		 */
		// 1. 배열 변수 선언
		int[][] arr1 = new int[4][200];

		// 열 확인
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println(arr1[2].length);
		System.out.println(arr1[3].length);

		// 2. 배열의 각 행에 값 입력
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				for (int j = 0, a = 5; j < arr1[i].length; j++, a += 5) {
					arr1[i][j] = a;
				}
			} else if (i == 1) {
				for (int j = 0, a = 3; j < arr1[i].length; j++, a += 3) {
					arr1[i][j] = a;
				}
			} else if (i == 2) {				// 주의 j는 for문에서 정의하지 않는다. 
				for (int j = 0, a = 1; j < arr1[i].length; a++) {
					if (a % 7 == 0 || a % 8 == 0) {
						arr1[i][j] = a;
						j++;
					}
				}

			} else if (i == 3) {				// 주의 j는 for문에서 정의하지 않는다. 
				for (int j = 0, a = 1; j < arr1[i].length; a++) {
					if (a % 4 == 0 && a % 7 == 0) {
						arr1[i][j] = a;
						j++;
					}
				}
			}

		}
		// 3. 출력 (For,Enhanced For, Arrays.toString () 3가지 모두 사용 )
			System.out.println("===========FOR==============>>>");
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1[i].length; j++) {
					System.out.print(arr1[i][j] + " ");
				}
				
				System.out.println();
			}	System.out.println("\n");
			
			System.out.println("===========Enhanced==============>>>");
	
			// Enhanced For
			
			for (int[] k : arr1) {
				for (int a : k) {
					System.out.print(a + " ");
				}
				
				System.out.println();
			} 	System.out.println("\n");
			
			System.out.println("========== Arrays.toString ============>>>");
			// Arrays.toString ()		// 방이 많아지면 for문을 돌려서 작성한다.
			
			System.out.println(Arrays.toString(arr1[0]));
			System.out.println(Arrays.toString(arr1[1]));
			System.out.println(Arrays.toString(arr1[2]));
			System.out.println(Arrays.toString(arr1[3]));

	}
}
