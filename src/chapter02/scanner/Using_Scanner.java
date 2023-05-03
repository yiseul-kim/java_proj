package chapter02.scanner;

import java.util.Scanner;

public class Using_Scanner {
	public static void main(String[] args) {
	   
		// Scanner : 자바 라이브러리, import를 사용해서 외부 라이브러리를 사용할 수 있다.
		//   콘솔에서 인풋값을 받아서 변수에 할당해서 사용 할 수 있다. 
		
			// 1. 사용할 스캐너 선언 
			Scanner sc = new Scanner(System.in);  // sc는 변수명
				// ctrl + shift + o : 외부 클래스를 import
		
			//2. 변수 선언 , 값은 콘솔에서 넣은(input) 값을 각 변수에 할당 
			String name ;       //이름
			int kor ;			//국어 점수	
			int eng ;			//영어 점수
			int math ;			//수학 점수

			//3. 스캐너를 사용해서 콘솔에서 값을 받아서 변수에 할당.
		
			System.out.println("자신의 이름을 입력 하세요 >>>");
			name = sc.next();		// sc.next(); : 문자열을 콘솔에서 인풋
			System.out.println("국어 점수를 입력 하세요 >>>");
			kor = sc.nextInt();		// sc.nextInt(); : 정수를 콘솔에서 인풋
			System.out.println("영어 점수를 입력 하세요 >>>");
			eng = sc.nextInt();
			System.out.println("수학 점수를 입력 하세요 >>>");
			math = sc.nextInt();
			
			int sum = kor + eng + math ;	// 모든 과목의 합한 점수 : 
			double avg = sum / 3.0 ;		// 평균값은 실수로 출력되어야함.
		
			//4.입력 받은 값을 출력하고 합계 및 평균을 계산 해서 출력 
			System.out.printf("입력한 이름은 %s 이고, 국어점수는  %d 이고, 영어점수는 %d 이고 수학점수는 %d 입니다. \n \n", 
				name, kor, eng, math );
			
			System.out.printf("%s 님의 합계는 %d 이고, 평균은 %5.2f 입니다.", name, sum, avg);
			
		
		
		
		
		
       }
}
