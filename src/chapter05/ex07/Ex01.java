package chapter05.ex07;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 	main 메소드 args로 다음의 값을 넘깁니다. 
	index	1	2	3	4	5	6	7	8	9
		 	국어 60 영어 70 수학 80 음악 90 과학 70
		 	
		 	을 만들어서 합계 & 평균 구하기

		 */
		//풀이 
		for( int i = 0 ; i < args.length; i++) {
				
			System.out.print( args[i] + " ");		// String의 각 방의 내용을 출력
		}
		System.out.println(" == for 문을 사용해서 각 과목의 정수를 int 형으로 변환후 출력 : 합계 : 평균 ==");
		
		// 방번호가 홀수있것만 정수로 선언
		int count = 0;
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			if( i == 1 || i==3 || i==5 || i==7 ) {		//i가 짝수가 아닐때
			sum += Integer.parseInt(args[i]);		//args를 모두 더해라 sum = sum + 정수
			count++;
			}
		}
		System.out.printf(" 모든 과목의 합계는 %d 이고 평균은 : %.2f 입니다. ", sum , ((double) sum / count));
		
		
		/* 답안
		 * String a1 = args[0]; String a2 = args[1]; String a3 = args[2]; String a4 =
		 * args[3]; String a5 = args[4]; String a6 = args[5]; String a7 = args[6];
		 * String a8 = args[7]; String a9 = args[8];
		 * 
		 * System.out.println(a1+a2+a3+a4+a5+a6+a7+a8+a9);
		 * System.out.println("==========================");
		 * 
		 * int b1 = Integer.parseInt(args[1]); int b2 = Integer.parseInt(args[3]); int
		 * b3 = Integer.parseInt(args[5]); int b4 = Integer.parseInt(args[7]);
		 * 
		 * System.out.println(b1+b2+b3+b4);
		 * 
		 * int sum = b1+b2+b3+b4; double avg = sum/4;
		 * 
		 * System.out.printf("합계는 %d이고, 평균은 %4.2f이다", sum, avg );
		 */
	
				
		
		
		
		
		
		
		
	}
}
