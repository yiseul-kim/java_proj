package Chapter04.ex01.ex01;

import java.util.Scanner;

public class If_Statement {
	public static void main(String[] args) {
		/*
		 	제어문 - if, switch
		 	
		 	 If 문 사용하기
		 	 1. Type 1: 조건이 1개 일때 
		 	 	- if (조건) { 조건이 참일때 실행 블락 };
		 	 2. Type 2: 조건이 2개 일때
		 	 	- if (조건) { 조건이 참일때 실행 블락
		 	 		} else {
		 	 			조건이 거짓일 때 실행하는 블락
		 	 			};
		 	 3. Type 3: 조건이 여러개 일때 
		 	 	- if (조건1) { 조건 1이 참일때 실행하는 블락
		 	 	} else if (조건2) {조건2 가 참일 때 실행하는 블락
		 	 	} else if (조건3) {조건3 가 참일 때 실행하는 블락
		 	 	} else (조건 ..) { 
		 	 		모두 거짓일 때 실행하는 블락};
		 	 	
		 */
		
		//type1 예제 :  조건이 1개 일때 
		
		
		int val1 = 5;
		if (val1>3) {System.out.println("실행1");}
		System.out.println("==============================================");	
			
			
		// 조건이 1개 일때 {}는 생략 가능
		if (val1>3) System.out.println("실행2");
		System.out.println("==============================================");
			
		// type 2 : 조건 2개일때, 삼항 연산자로 처리 가능 : (조건)? 참:거짓 ;	
			if (val1 <3) {
			System.out.println("실행3");  // 조건이 true 일때 실행
			} else {
			System.out.println("실행4");  // 조건이 false 일때 실행
			}
		
		// if ~ else <====> 3 항 연산자로 변환 가능
			System.out.println((val1<3) ? "참":"거짓");
			System.out.println("==============================================");
		
		//Type 3 : 조건이 여러개 일때
			
			int val2 = 55;
					
			if (val2>90) {
			System.out.println("당신은 A학점 입니다.");
				} else if (val2 >80) {
			System.out.println("당신은 B학점 입니다.");
				} else if (val2 >70) {
			System.out.println("당신은 C학점 입니다.");
				} else if (val2 >60) {
			System.out.println("당신은 D학점 입니다.");
				} else {
			System.out.println("당신은 F학점 입니다.");
				}
			
			System.out.println("===조건의 순서를 바꿀 경우 원치않는 내용이 출력 될 수 있다.====");
			
			int val3 = 95 ;		// 조건을 적용할 때 세밀하게 적용해야 할 필요도 있다.
		
			if (val3>=60 && val3<70) {			//True && false==> false
				System.out.println("F 학점");		
			} else if (val3>=70 && val3<80){	//True && false==> false
				System.out.println("D 학점");
			} else if (val3>=80 && val3<90){	//True && false==> false
				System.out.println("B 학점");
			} else if (val3>=90 && val3<100) {	//True && true ==> true
				System.out.println("A 학점");
			} else {
				//위의 조건이 모두 만족 하지 않을때, switch 문의 default	
			}	

			
			System.out.println("==============스캐너랑 함께 사용할 경우================");
			Scanner JJ = new Scanner(System.in);
			
			int val5 ;
			
			System.out.println("당신의 점수를 입력해주세요.");
			val5 = JJ.nextInt();
		
			if (val5>90) {
			System.out.println("당신은 A학점 입니다.");
				} else if (val5 >90) {
			System.out.println("당신은 B학점 입니다.");
				} else if (val5 >80) {
			System.out.println("당신은 C학점 입니다.");
				} else if (val5 >70) {
			System.out.println("당신은 D학점 입니다.");
				} else {
			System.out.println("당신은 F학점 입니다.");
				}
		
		JJ.close();
			
			
		}
	}
