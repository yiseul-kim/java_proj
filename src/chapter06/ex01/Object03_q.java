package chapter06.ex01;

class student {			//외부 클래스, 같은 클래스에서 public은 하나만 올 수 있다. 
	
	//기본 생성자 : 생략 가능
	public student() {}
	
	//필드 선언
	String name ;
	int kor;
	int eng;
	int meth;
	
	// 메소드 선언 : prit 메소드 호출시 메모리의 내용을 출력 
	public void print () {
		System.out.println("이름 : "+ name);
		System.out.println("국어점수 : "+ kor);
		System.out.println("영어점수 : "+ eng);
		System.out.println("수학점수 : "+ meth);
	}
	
}
class s1 {			//외부 클래스, 같은 클래스에서 public은 하나만 올 수 있다. 
	// s1 객체 생성 : 홍길동 , 80, 90, 100
	
	//기본 생성자 : 생략 가능
	public s1() {}
	
	//필드 선언
	String name = "홍길동";
	int kor = 80;
	int eng = 90;
	int meth = 100;
	
	// 메소드 선언 : print 메소드 호출시 메모리의 내용을 출력 
	public void print () {
		System.out.println("이름 : "+ name);
		System.out.println("국어점수 : "+ kor);
		System.out.println("영어점수 : "+ eng);
		System.out.println("수학점수 : "+ meth);
	}
	
}
class s2 {			//외부 클래스, 같은 클래스에서 public은 하나만 올 수 있다. 
	// s2 객체 생성 : 이순신 , 60, 88, 70
	
	//기본 생성자 : 생략 가능
	public s2() {}
	
	//필드 선언
	String name = "이순신";
	int kor = 60;
	int eng = 88;
	int meth = 70;
	
	// 메소드 선언 : print 메소드 호출시 메모리의 내용을 출력 
	public void print () {
		System.out.println("이름 : "+ name);
		System.out.println("국어점수 : "+ kor);
		System.out.println("영어점수 : "+ eng);
		System.out.println("수학점수 : "+ meth);
	}
	
}
class s3 {			//외부 클래스, 같은 클래스에서 public은 하나만 올 수 있다. 
	// s3 객체 생성 : 킹세종 , 90, 99, 88
	
	//기본 생성자 : 생략 가능
	public s3() {}
	
	//필드 선언
	String name = "킹세종";
	int kor = 90;
	int eng = 99; 
	int meth = 88;
	
	// 메소드 선언 : pribt 메소드 호출시 메모리의 내용을 출력 
	public void print () {
		System.out.println("이름 : "+ name);
		System.out.println("국어점수 : "+ kor);
		System.out.println("영어점수 : "+ eng);
		System.out.println("수학점수 : "+ meth);
	}
	
}
class s4 {			//외부 클래스, 같은 클래스에서 public은 하나만 올 수 있다. 
	// s4 객체 생성 : 신사임 , 77, 88, 99
	
	//기본 생성자 : 생략 가능
	public s4() {}
	
	//필드 선언
	String name = "신사임";
	int kor = 77;
	int eng = 88;
	int meth= 99;
	
	// 메소드 선언 : print 메소드 호출시 메모리의 내용을 출력 
	public void print () {
		System.out.println("이름 : "+ name);
		System.out.println("국어점수 : "+ kor);
		System.out.println("영어점수 : "+ eng);
		System.out.println("수학점수 : "+ meth);
	}
	
}

public class Object03_q {
	public static void main(String[] args) {
			// s1 객체 생성 : 홍길동 , 80, 90, 100
			// s2 객체 생성 : 이순신 , 60, 88, 70
			// s3 객체 생성 : 킹세종 , 90, 99, 88
			// s4 객체 생성 : 신사임 , 77, 88, 99
		
			// 각 개체에 print 메소드 호출
			s1 a = new s1();
			s2 b = new s2();
			s3 c = new s3();
			s4 d = new s4();
		
			a.print();
			System.out.println();
			b.print();
			System.out.println();
			c.print();
			System.out.println();
			d.print();
			
	}

}
