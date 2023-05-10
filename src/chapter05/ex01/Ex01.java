package chapter05.ex01;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 배열 방 100개 생성 후 3의 배수만 저장 후 출력
		 
		*/
		
		System.out.println("==배열 방 100개 생성 후 3의 배수만 저장 후 출력==");
		
		int[] arr1 = new int[100];
		 
		for(int i = 0 ; i<100 ; i++) {
			arr1[i] = i;
			if (i % 3 == 0) {
				System.out.print(arr1[i]+" ");
			}
			}
		System.out.println();
		System.out.println("===========================================");

		
		
// 풀이
		
		int c = 100;
		int[] arr2 = new int [c];
		System.out.println(arr2.length);
		
		int a = 0;
		
		// arr2 배열의 각 방에 값을 저장하는 for
		for ( int i = 0 ; i < arr2.length ; i++ ) {
			a += 3;
			arr2[i] = a;
		}
		
		// arr1 배열의 각 방에 값을 출력 하는 for
		System.out.println("===========for 문을 사용해서 출력=============");
		for ( int i = 0 ; i < arr2.length ; i++) {
			System.out.println("arr2 ["+i+"]의 값은 : "+arr2[i]);
		}
		
		System.out.println("=========== Enhanced For : 향상된 For =============");
		// 배열의 첫 번째 방부터 마지막 방까지 자동으로 그 값을 출력 할 때 사용
		
		for ( int k : arr2 ) {
			System.out.println( k + " ");
		}
		System.out.print("\n \n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
