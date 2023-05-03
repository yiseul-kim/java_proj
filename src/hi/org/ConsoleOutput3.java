package hi.org;

import javax.xml.transform.sax.SAXSource;

public class ConsoleOutput3 {
	public static void main(String[] args) {
		// 코드는 main 메소드 내에서 작성
		
		//변수 선언 : Java 와 JavaScript는 완전히 별개의 언어
		  // 자바:<자료형><변수명> = <변수에 들어가는 초기값>;	
		String fatherName = "홍길동";
		String motherName = "홍길순";
		String myName = "홍당무";
		
		// 정수형 자료 : int
		int age = 30;
		
		// int age2 = 77.7;  // 정수 변수선언에 실수를 개입해서 오류
		
		// 실수형 자료형 : double
		double weith = 70.5;
		double weith2 = 50; // 오류발생 안됨 : 정수 => 실수 자동 변환
		
		// int age = 50;  //오류 발생 age 변수를 새롭게 선언
		System.out.println(age);  // 30
		
		age = 60;         // age값 수정
		System.out.println(age);  // 60
		
		System.out.println("=======================");
		
		
		age = 25;
		
		// 예제) 우리 아버님 이름은 "홍길동" 이고, 우리 어머니 이름은 "홍길순" 입니다.
		// 나의 이름은 "홍당무" 이고, 나이는 "25"살이고 몸무게는 "70.5"입니다. 
		//1. println(); 으로 출력
		//System.out.println("우리 아버님 이름은 "+ fatherName ,"이고, 우리 어머니 이름은 "+ motherName ,"입니다.");
		
		System.out.println("우리 아버님 이름은 " + fatherName + " 이고, 우리 어머니 이름은 " + motherName + "입니다.");
		System.out.println("나의 이름은 " + myName +" 이고, 나이는 "+age+"살이고 몸무게는 " + weith+"입니다.");
		
		
		System.out.println("=======================");
		//2. print();
		System.out.println("우리 아버님 이름은 " + fatherName + " 이고, 우리 어머니 이름은 " + motherName + "입니다.\n"+"나의 이름은 " + myName +" 이고, 나이는 "+age+"살이고 몸무게는 " + weith+"입니다.\n");
		
		
		System.out.println("=======================");
		//3. printf();
		System.out.printf("우리 아버님 이름은 %s이고, 우리 어머니 이름은 %s 입니다. \n", fatherName, motherName);
		System.out.printf("나의 이름은 %s 이고, 나이는 %d살이고 몸무게는 %2.1f 입니다.", myName, age, weith );

		
		
		
		
		
		
	}
}
