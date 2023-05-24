package Chapter12.ex02;

// 첫번째 ! 콘크리트 생성후 사용하는 방법 <<자주 사용시>>
abstract class A {		//추상 클래스
	// 추상 메소드
	abstract void cry();
}
class B extends A {
	@Override
	void cry() {
		System.out.println("B 구현된 메소드 출력");
	}	
}
// 두번째 ! 익명 클래스로 사용하는 방법 <<일회용 사용시 >>
abstract class C {
	abstract void cry();
}

abstract class D {
	abstract void run();
	abstract void eat();
}

public class Abstract_Class {

	public static void main(String[] args) {
		/*
		  추상 클래스 ( Abstract Class )
		  		- 추상 메소드를 포함한 클래스 abstract void abc();
		  		- 추상 클래스는 객체화 할 수 없다. 자식을 객체화 해서 타입으로는 지정 가능하다. 
		 		- 추상 클래스를 작동하는 방법 2가지
		 			1. 자식 클래스에서 상속을 통해서 추상 메소드를 구현한 클래스를 만들고 (콘크리트 클래스), 
		 				자식 클래스를 객체화해서 사용
		 				<< 자주 사용하는 경우 >>
		 				
		 			2. 콘크리트 클래스없이 익명 클래스를 만들어서 사용하는 방법,  
		 				<< 한번 사용하고 버리는 경우 >> , 안드로이드 폰 개발시 이벤트 처리할 때 많이 사용		
		 */
		
		// 1. 구현 클래스를 만들고 사용하는 방법 ( 콘크리트 클래스를 객체화해서 타입을 추상 클래스로 지정후 메소드 호출 )
		A a1 = new B () ; 
		a1.cry();
		
		System.out.println("===================");
		
		// 2. 익명 클래스를 생성해서 사용하는 방법
		C c1 = new C() {
			@Override
			void cry() {
				System.out.println("C 구현된 메소드 출력 ");
			}
		};
		c1.cry();
		
		D d1 = new D() {
		 @Override
		void run() {
			 System.out.println("D 클래스의 run () ");		 	
		}	
		 @Override
			void eat() {
			 System.out.println("D 클래스의 eat () ");
		}
		};

		d1.eat();
		d1.run();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
