package Chapter10.ex06;

class Student {
	String name;
	
	// 합계와 평균을 출력하는 메소드 : 부모 클래스의 메소드 : 실행 코드가 없음, 자식 클래스에서 오버라이딩해서 구현 코드를 만듬
	void sum_avg() {
		System.out.println(name);
	}
}
class Student_sub extends Student{
	int kor;
	int eng;
	int math;
	
	//1. 생성자로 매개변수 값을 받아서 각 필드에 값을 할당. name, kor, eng, math
//	Student c1 = (Student_sub) ; 
	
	//2. 필드의 값을 모두 합하고, 평균을 출력, 각 객체의 점수의 합계와 평균을 구하는 메소드 
	@Override
	void sum_avg() {
	 int sum = kor+eng+math;
	 int avg = sum/3;
	 System.out.println("총 합계는 : "+sum+" 입니다.");
	 System.out.println("총 평균은 : "+avg+" 입니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		// 각 객체의 필드에 값 할당은 생성자 호출시 매개변수로 값을 넣도록 하세요. 
			/*
			  홍길동 70 88 77
			  이순신 80 68 87
			  김똘돌 60 86 87
			  홍길순 77 56 80
			  강감찬 55 66 77
			*/

		Student_sub s1 = new Student_sub();
		s1.name = "홍길동";
		s1.kor = 70;
		s1.eng = 88;
		s1.math = 77;
		
		Student_sub s2 = new Student_sub();
		//이순신 80 68 87
		s2.name = "이순신";
		s2.kor = 80;
		s2.eng = 68;
		s2.math = 87;
		
		Student_sub s3 = new Student_sub();
		//김똘돌 60 86 87
		s3.name = "김똘돌";
		s3.kor = 60;
		s3.eng = 86;
		s3.math = 87;
		Student_sub s4 = new Student_sub();
		//홍길순 77 56 80
		s4.name = "홍길순";
		s4.kor = 77;
		s4.eng = 56;
		s4.math = 80;
		Student_sub s5 = new Student_sub();
		//강감찬 55 66 77
		s5.name = "강감찬";
		s5.kor = 55;
		s5.eng = 66;
		s5.math = 77;
		
		// Student 타입의 sum_avg() 호출시 오버라이딩된 메소드 호출
		Student ss1 = new Student_sub();
		ss1.name = "홍길동";
		
		ss1.sum_avg();
		
		
	}
}
