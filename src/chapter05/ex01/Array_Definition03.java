package chapter05.ex01;

public class Array_Definition03 {
	public static void main(String[] args) {
		
		
		/*
		 	1차원 배열 선언 방법 3가지
		 */
		
		System.out.println("1. 방법 1");
		
			int[] arr1;		// 변수 선언
			arr1 = new int[3]; 		// 방 생성
			
			int arr4[] ;	// 변수 선언
			arr4 = new int[3];		// 방 생성
			
			int[] arr2 = new int[3];	// 변수 선언 + 방 생성
	
			int arr3[] = new int[3];	// 변수 선언 + 방 생성2
		
		
		System.out.println("2. 방법 2");
		// 배열을 선언과 동시에 값을 할당.
		
			int[] arr5 = new int[] {10,20,30};	//선언+  할당
			
			int[] arr6; 	// 선언후 값 할당
			arr6 = new int[] {10,20,30};
			
			System.out.println("3. 방법 3");
		
		
		//선언과 동시에 값을 바로 할당
			int[] arr7 = {10,20,30};
			
			// 오류 발생
			int[] arr8;
			// arr8 = {10,20,30};   // 오류
			arr8 = new int[] {10,20,30};
			
		
		
		
	}
}
