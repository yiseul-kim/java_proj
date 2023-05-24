package Chapter12.ex01;

abstract class A {
	 // 인스턴스 필드  :  객체화, Heap 
	int a = 10;
	int b = 20;
	
	// 일반 메소드
	void print () {
		
	}
	// 추상 메소드 : 구현부({}실행)가 없는 메소드 --> abstract 를 앞에 붙여줘야함.
	abstract void run() ; 
 }

class cat extends A {		// 콘크리트 클래스 : 추상클래스에서 선언 해놓은 추상 메소드를 구현하는 클래스
	
	@Override
	void run() {
		System.out.println("고양이는 달립니다. ");		
	}
}
class Dog extends A {
	@Override
	void run() {
		System.out.println("개는 껑충껑충 달립니다. ");			
	}
}
class Egle extends A {
	@Override
	void run() {
		System.out.println("독수리는 하늘을 날읍니다. ");		
	}
}



public class Abstract_Method {

	public static void main(String[] args) {
		/*
		 	추상 메소드 (Abstract Method)
		 		- 구현부({})가 존재하지 않는 메소드, 선언만 되어 있는 메소드
		 			=  abstract		void abc() ; 
		 		- 추상 메소드가 클래스 블락에 1개라도 존재하면 반드시 그 클래스는 추상 클래스가 되어야 함.
		 		 	= abstract class A {		}
		 		- 자식 클래스에서 추상 클래스의 추상 메소드를 오버라이딩해서 메소드를 구현 해야 한다. 
		 		- 추상 클래스는 객체화 할 수 없다. ( 객체생성 불가 ), 자식 클래스를 객체화 해서 타입으로는 적용 할 수 있다. 
		 		- 프로젝트를 설계시 메소드 이름을 프로그래머가 함부로 변경할 수 없도록 할 수 있다. ( PM 설계 )
		 		- 자식 클래스에서 구현하는 메소드를 오버라이딩해서 구현부를 만듬.
		 		- 메소드 이름을 함부로 변경할 수 없다. 		 	
		 		- 유지 보수를 쉽게 하는 프로그램을 만들때 사용. (  강결합 ==> 약결합 ) 
		 				 		 			 	
		*/

		// 1. 추상 클래스 (객체화 하지 못한다) : 추상 메소드를 포함하는 클래스 
//		A a = new A() ;		//불가
		
		// 2, 추상 클래스는 타입으로 지정이 가능 : 자식을 객체화 해서 부모 타입으로 지정
		A cat1 = new cat();				//cat1 : A / Cat
		A dog1 = new Dog();			//dog1 : A / Dog
		A egle1 = new Egle();			//egle1 : A / Egle
		
		// 3. 부모의 추상메소드를 실행하면 오버라이딩된 자식클래스에 메소드가 출력
		cat1.run();
		dog1.run();
		egle1.run();
		System.out.println("=========================");
		
		// 4. 배열에 넣고 출력(출력을 더욱 편리하게 하는 방법)
		A[] arr = new A[] { cat1, dog1, egle1 } ;
		
		// 5. for  문을 사용해서 배열의 각 방에 내용을 끄집어내서 출력
		for (int i=0 ; i<arr.length ; i++) {
			arr[i].run();
		}
		System.out.println("========================");
		
		// 6. Enhanced for 문을 사용해서 출력 ( 더욱 편리한 방법)
		for ( A k : arr ) {
			k.run();
		}
		
		
		
		
		
		
		
	}

}
