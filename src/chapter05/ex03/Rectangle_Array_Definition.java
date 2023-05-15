package chapter05.ex03;

public class Rectangle_Array_Definition {
	public static void main(String[] args) {
		
		/*
		 * 다차원 배열 : 2차원
		 	- 정방형 배열 (2차원) : 행(row) , 열(column, filed) 이 동일한 배열
		 	- 비정방형 배열 (2차원) : 행과 열이 동일하지 않는 배열
		 	
		 */
		
		//1. 2차원 배열 선언
		int[][]arr1 = new int[3][4] ; 	//3 : 행의 갯수, 4 : 열의 갯수
		
		//2. 2차원 배열에 값 넣기
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[0][3] = 40;
//		arr1[0][4] = 50;		//오류 [=예외]	: 컴파일 오류(이클립스), 실행시 오류 (실행)
								// 없는방 만들면 오류남
		
		arr1[1][0] = 100;
		arr1[1][1] = 200;
		arr1[1][2] = 300;
		arr1[1][3] = 400;
		
		arr1[2][0] = 1000;
		arr1[2][1] = 2000;
		arr1[2][2] = 3000;
		arr1[2][3] = 4000;
	
		// 직접 방번호를 넣어서 출력 함. 
		System.out.println(arr1[2][2]);
		
		// For 문을 사용해서 출력 
			// arr1.length 		<== !중요! 1차원 배열 일때는 열의 갯수를 출력 
//								<==	!중요! 2차원 배열 일때는 행의 갯수를 출력
//			   arr1[0].length	<==	0  행의 열의 갯수 ;
		System.out.println(arr1.length); 		// 행의 갯수 , 2차원 배열일때 
		System.out.println(arr1[0].length); 	// 0번 행의 열의 갯수 
		System.out.println(arr1[1].length); 	// 1번 행의 열의 갯수 
		System.out.println(arr1[2].length); 	// 2번 행의 열의 갯수 
		
		System.out.println("====== 2. 2차원 배열을 for문을 사용해서 출력 =========");

//		- 2차원 배열을 엑셀 형식으로 보는 방법 -
		
//		fOR 문을 사용해서 arr1 배열의 값을 출력 하기  : for - for 문을 사용해서 출력
//			for (행을 루프) : 바깥쪽 for, arr1.length 사용
//			for (열을 루프) : 안쪽 for, arr1[i].length 사용
		
		for( int i = 0 ; i < arr1.length; i++ ) { 			// i : 행의 index번호 (행 -> 열 순서)
			for ( int j = 0; j < arr1[i].length; j++) {		// j : 열의 index번호
				System.out.print( arr1 [i] [j] + "\t");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
