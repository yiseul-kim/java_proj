package chapter05.ex07;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 main method 의 배열 변수 args 로 실수 값 넣어서 계싼 하기
		 args : 합게 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
		 	for 문을 사용해서 처리
		 		합계 : <실수를 더한 합계 >
		 */
		// 1. for 문을 사용해서 배열로 들어오는 전체 내용을 출력 
		for( int i = 0 ; i < args.length; i++) {
			
			System.out.print( args[i] + " ");		// String의 각 방의 내용을 출력
		}
		
		System.out.println("==================================");
		System.out.println(" == for 문을 사용해서 각 과목의 정수를 int 형으로 변환후 출력 : 합계 : 평균 ==");
		
		double count = 0;
		double sum = 0;
		
		for( int i = 1 ; i < args.length; i++) {
			
			sum += Double.parseDouble(args[i]);
			count++;
			}		// String의 각 방의 내용을 출력
		
			System.out.printf(" 합계는 : %.3f 입니다.", sum);
		
	}

}
