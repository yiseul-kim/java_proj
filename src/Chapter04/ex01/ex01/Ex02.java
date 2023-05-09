package Chapter04.ex01.ex01;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Ex02 {
	public static void main(String[] args) {
		
		
		// 1. Scanner 등록( <ctrl + shif +0 > )
		 Scanner sc = new Scanner(System.in);
		 
		 
		// 프로그램 선택 변수
		 int select ;  //1. 학점의 합꼐/평균 , 2. 홀수/ 짝수 확인, 3. 같은 이름을 식별
		 
		// 국어/ 영어/ 수학 점수를 인풋 받는 변수 
		 int kor;
		 int eng;
		 int meth;
		 
		// 정수 값을 인풋 받아서 홀수/짝수 인지 확인 하는 프로그램에 사용하는 변수 
		 int a ;
		 
		 
		// 두 변수의 값을 받아서 같은 이름 인지 확인하는 프로그램
		 String aName;
		 String bName;
		
		 
		 
		 System.out.println("===============================================");
		 System.out.println("1. 학점의 합계/평균 | 2. 홀수/짝수  | 3. 같은 이름을 식별");
		 System.out.println("===============================================");
		 
		 
		 
		// 사용자로부터 프로그램 선택
		 System.out.println("위 프로그램 번호를 입력 하세요>>>");
		 select = sc.nextInt();
		 
		 
		 
		 
		// if 조건으로 프로그램을 실행
		 if (1 == select ) {
			 // 스캐너로 부터 국어/영어/수학 인풋 받아서 합계와 평균을 출력.
			 System.out.println("1번 항목을 출력합니다. ");
			 System.out.println("국어 점수를 입력하세요.>>>");
			 kor = sc.nextInt();
			 System.out.println("영어 점수를 입력하세요.>>>");
			 eng = sc.nextInt();
			 System.out.println("수학 점수를 입력하세요.>>>");
			 meth = sc.nextInt();
			 
			 int sum = kor+eng+meth;		//sum 지역 변수 : 블락 네에서만 사용됨
			 double avg = sum/3.0 ;			//avg 평균 : double
			 
			 System.out.printf("학점의 합계는 %d이며, 평균은 %5.2f 입니다. \n\n", sum, avg);
		 } else if (2==select) {
		 	
			 
			 // 정수 값을 인풋 받아서 홀수인지 짝수인지 출력
			 System.out.println("정수 값을 입력하세요.");
			 a = sc.nextInt();
			 if (a%2==0) {
				System.out.println("짝수입니다."); 
			 } else {
				System.out.println("홀수입니다.");
			 }
		 } else if (3== select )  {
	
			// aName, bName 두 변수의 문자열을 인풋 받아서 같은 이름인지 식별
			 System.out.println("3번 항목을 출력합니다.");
			 System.out.println("첫번째 이름을 입력하세요.>>>");
			 aName = sc.next();
			 
			 System.out.println("두번째 이름을 입력하세요.>>>");
			 bName = sc.next();
			 
			 if(aName.equals(bName)) {			//String 에서 두 값을 비교하는 것이 equals <==비교구문
				 System.out.println("이름이 동일합니다.");
			 } else {
				 System.out.println("이름이 다릅니다.");
			 }
		 }
	
		sc.close();
		// 스캐너 종료 : 사용후 메모리에서 제거
		 
		
		 // 12시 20분까지
 }
}
		 