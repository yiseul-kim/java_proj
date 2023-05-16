package chapter06.ex01;

class Student2 {
	//기본생성자
	public Student2() {}
	
	//필드
	String sName;	//학생이름
	int sAge;		//학생나이
	String sAddR;	//학생주소
	String sEmail;	//학생메일주소
	
	//메소드 : 필드의 내용을 출력 하는 메소드
	public void print() {
		System.out.println("이름 :" + sName);
		System.out.println("나이 :" + sAge);
		System.out.println("주소 :" + sAddR);
		System.out.println("메일주소 :" + sEmail);
	}
}
class student3 {
	public student3() {}
	//필드
		String sName;	//학생이름
		int sAge;		//학생나이
		String sAddR;	//학생주소
		String sEmail;	//학생메일주소
		
		//메소드 : 필드의 내용을 출력 하는 메소드
		public void print() {
			System.out.printf("반가워요 나의 이름은 %s입니다.",sName);
			System.out.printf("나의 나이는 %d이구요.", sAge);
			System.out.printf("제가 사는 곳은 %s입니다. ", sAddR);
			System.out.printf("메일주소는 %s로 연락주시면 감사하겠습니다.", sEmail);
		}
}
public class Object06 {
	public static void main(String[] args) {
		// kim 객체 : 김길동/20/서울/aaa@aaa.com
		// lee 객체 : 이순신/30/부산/bbb@bbb.com
		// hong 객체 : 홍길동/45/광주/ccc@ccc.com
		
		
		// kim 객체 : 김길동/20/서울/aaa@aaa.com
		Student2 kim = new Student2();
		
		kim.sName = "김길동";
		kim.sAge = 20;
		kim.sAddR = "서울";
		kim.sEmail = "aaa@aaa.com";
		
		kim.print();
		System.out.println("========================");
		// lee 객체 : 이순신/30/부산/bbb@bbb.com
		Student2 lee = new Student2();
		
		lee.sName = "이순신";
		lee.sAge = 30;
		lee.sAddR = "부산";
		lee.sEmail = "bbb@bbb.com";
		
		lee.print();
		System.out.println("========================");
		// hong 객체 : 홍길동/45/광주/ccc@ccc.com
		Student2 hong = new Student2();
		
		hong.sName = "홍길동";
		hong.sAge = 45;
		hong.sAddR = "광주";
		hong.sEmail = "ccc@ccc.com";
		
		hong.print();
		System.out.println("========================");
		

		// 각 객체의 필드의 값 입력후, 배열에 넣어서 저장후 끄집어 내어서 다시 출력 ...
		
		Student2[] arr1 = new Student2[3];  //아래와 같이 선언+배열 저장 가능
//		Student2[] arr1 = new Student2() { kim, lee, hoing } ;
//		arr1[0]; = kim;
//		arr1[1]; = lee;
//		arr1[2]; = hong;
//		
		System.out.println(arr1);
		System.out.println("=== 배열로 출력하기 ====");
		
		arr1[0] = kim;		//arr1 0번째 방에 kim 객체를 저장
		arr1[1]	= lee;		//arr1 1번째 방에 lee 객체를 저장
		arr1[2] = hong;		//arr1 2번째 방에 dog 객체를 저장
		
		Student2 q1 = arr1[0];
		Student2 q2 = arr1[1];
		Student2 q3 = arr1[2];
		
		q1.print();
		System.out.println("========================");
		q2.print();
		System.out.println("========================");
		q3.print();
		
		
		System.out.println("=== 각 객체의 필드의 값 출력 : print () ===");
		
		kim.print();
		lee.print();
		hong.print();
		
		System.out.println("===배열을 선언후 객체를 배열에 저장 ====");
		
		//2. 배열을 선언하면서 바로 배열에 값을 할당
		
		
		
		
		
		
		
		
		
		
	}
}
