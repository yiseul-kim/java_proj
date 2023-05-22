package Chapter10.ex04;
// 상속, 업캐스팅, 다운캐스팅

// 부모 클래스 
class Human {
	String name;
	int age;
}

class Student extends Human {

	int kor; // 국어 점수
	int eng; // 영어 점수
	int math; // 수학 점수

}

public class Ex01 {
	// 메소드 : Student 객체를 매개변수로 받아서 배열에 저장하는 객체이고,
	// 인풋으로 Student 객체를 받아서 배열에 저장하는 메소드


	Human[] arr = null;
	void arrMethod(Human h1, Human h2, Human h3) {		// Human 타입으로 자동 업캐스팅 됨.
		// 1. h1, h2, h3 객체를 arr 배열 변수 안에 넣는다.
		// sumKor(arr); "배열에 저장된 객체의 국어 점수는 00점 입니다. "
		// sumEng(arr); "배열에 저장된 객체의 영어 점수는 00점 입니다. "
		// sumMath(arr); "배열에 저장된 객체의 수학 점수는 00점 입니다. "
		
		arr = new Human[] {h1, h2, h3};

		sumKor(arr);
		sumEng(arr);
		System.out.println("배열에 저장된 객체의 수학 점수는 " + sumMath(arr) + "점 입니다.");

	}

	void sumKor(Human[] h1) { // 각 객체의 국어 점수를 더해서 결과를 출력 하는 메소드, Student로 다운캐스팅 한 후 국어 점수를 모두 더해서 출력

		Student[] s1 = new Student[h1.length];

		for (int i = 0; i < h1.length; i++) {
			s1[i] = (Student) h1[i];
		}

		int a = 0;
		for (int i = 0; i < s1.length; i++) {
			a += s1[i].kor;
		}

		System.out.println("배열에 저장된 객체의 국어 점수는 " + a + "점 입니다.");
	}

	void sumEng(Human[] h1) { // 각 객체의 영어 점수를 더해서 결과를 출력 하는 메소드, Student로 다운캐스팅 한 후 영어 점수를 모두 더해서 출력
		Student[] s1 = new Student[h1.length];

		for (int i = 0; i < s1.length; i++) {
			s1[i] = (Student) h1[i];
		}

		int a = 0;
		for (int i = 0; i < s1.length; i++) {
			a += s1[i].eng;
		}

		System.out.println("배열에 저장된 객체의 영어 점수는 " + a + "점 입니다.");
	}

	int sumMath(Human[] h1) {
		Student[] s1 = new Student[h1.length];

		for (int i = 0; i < s1.length; i++) {
			s1[i] = (Student) h1[i];
		}

		int a = 0;
		for (int i = 0; i < s1.length; i++) {
			a += s1[i].math;
		}
		return a; // 배열에 들어온 수학점수를 모두 더해서 return으로 돌려줌.
	}

	public static void main(String[] args) {
		// 객체 생성
		Student s1 = new Student(); // 홍길동 / 30 / 60,70,80
		s1.name = "홍길동";
		s1.age = 30;
		s1.kor = 60;
		s1.eng = 70;
		s1.math = 80;
		Student s2 = new Student(); // 이순신 / 40 / 66,77,88
		s2.name = "이순신";
		s2.age = 40;
		s2.kor = 66;
		s2.eng = 77;
		s2.math = 88;
		Student s3 = new Student(); // 강감찬 / 50 / 77,88,99
		s3.name = "강감찬";
		s3.age = 50;
		s3.kor = 77;
		s3.eng = 88;
		s3.math = 99;

		// 메소드 호출
		Ex01 e1 = new Ex01();
		e1.arrMethod(s1, s2, s3);
		// "배열에 저장된 객체의 국어 점수는 00점 입니다. "

	}
}
