package Chapter07.ex04;

import java.util.Arrays;

public class Ex01 {
	
	// 완료 시간 : 15시 20분(40분)
	// 두 배열의 각 방의 내용을 더해서 출력
	
	public static void arrSum (int[] a, int[] b	) {
		// for 문을 사용해서 각 배열의 방의 값을 더해서 출력
		
		int [] c = new int [71]; // 제일 큰 배열의 방의 크기를 지정함. 두 배열의 더한 값을 저장하는 배열
		
		for(int i=0, j=0 ; i < a.length; i++, j++) {		// a 배열의 index 0 ~ 70 <== i
			if(i > 54 ) {
				c[i] = a[i];					// b 배열의 index 0 ~ 54 <== j
			} else {
				c[i] = a[i] + b[i];					// b 배열의 index 0 ~ 54 <== j				
			}
		 System.out.print(c[i] + " ");
		}System.out.println();
	}
	
	public static void main(String[] args) {

		int[] a ;
		int[] b ;
		a = new int[500/7];
		b = new int[500/9];
		
		//2. 0 ~ 500까지의 7의 배수를 저장 , 방의 크기 : 500/7
		for(int i=0, j=7; i<a.length; i++) {
			a [i] = j;
			System.out.print(a[i] + " ");
			j+=7;
		}
		System.out.println();
		System.out.println(a.length); 		//a 배열 방의 갯수
		System.out.println();
		
		//1. 0 ~ 500까지의 9의 배수를 저장, 방의 크기 : 500/9
		for(int i=0, j=9; i<b.length ; i++) {
			b [i] = j;
			System.out.print(b[i] + " ");
			j+=9;
		} 
		System.out.println();
		System.out.println(b.length);
		System.out.println();
		
		//출력
		arrSum(a, b) ;	//각 방의 내용을 더해서 출력
		
	}
	

}
