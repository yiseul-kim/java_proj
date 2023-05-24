package Chapter12.ex03;

//1. 정식 표현 : 코드가 길어짐. 
interface A {			// 필드, 메소드
	
	// 필드 
	public static final int a = 3;
	
	//  메소드
	public abstract void abc(); 
}

// 인터페이스의 구현되지 않는 메소드를 구현하는 클래스
class Aa implements A {

	@Override
	public void abc() {	
		System.out.println("A 인터페이스의 구현되지 않는 메소드를 구현한 메소드  abc() ");
	}	
}

//2. 약식 표현 : <<많이 사용>> 
interface D {
	int a = 3;		// public static final 이 생략
	void abc();		// public abstract 생략
}
class Dd implements D {
	@Override
	public void abc() {
		System.out.println("D 인터페이스의 구현되지 않는 메소드를 구현한 메소드 abc() ");
	}	
}
public class Interface01 {

	public static void main(String[] args) {
		/*
		 		인터페이스 (Interface) : 내부와 외부를 연결 시켜주는 접점, 콘센트(가전 제품 <==> 전기 ), 메뉴판 (손님 <==> 주방장 ) 
		 				API ( Application Programming Interface ) : API를 통해서 백엔드의 다양한 서비스를 받게 된다. 
		 				
		 				- 모든 필드/메소드는 public 접근 제어자가 적용된다. 
		 				
		 				- 모든 필드는 public static final 이 생략되어 있다.  <== interface의 필드의 값은 수정이 불가함. 
		 				- 모든 메소드는 public abstract 가 생략되어 있다. 	 <== 선언만 된 메소드
		 						단 예외가 있다. ( default, static 메소드는 예외 - JAVA1.8 부터 적용됨)
		 				- 인터페이스는 객체화 할 수 없다.  단 타입으로 지정은 가능하다. 
		 				- 인터페이스를 구현한 클래스는 여러 인터페이스를 구현 가능하다. 
		 				- 클래스는 단 하나의 부모만 상속 할 수 있다.  (다중 상속 X)	 extends
		 				- 클래스는 여러 인터페이스를 구현할 수 있다. (다중 상속 O)	 implements
		 				- 유지 보수를 쉽게 하기 위해서 Interface를 사용함. ( 강결합==>약결합(유지보수를 쉽게))
		 				- 인터페이스에 선언된 메소드를 오버라이딩해서 구현하도록 만듬. 
		 				- 인터페이스를 구현한 클래스는 오버라이딩된 메소드를 수정 할 수 없다.   							
		 					 							
		 */
		
		//1, 인터페이스는 객체화 할 수 없다. 
//		A a = new A();	//객체화 불가
		
		//2, 인터페이스를 구현한 클래스를 객체화 해서 타입으로 지정은 가능
		A a1 = new Aa();
		a1.abc(); 	// interface에 오버라이딩 된 메소드가 출력된다. 
		
		System.out.println("======================");
		//1. 인터페이스는 객체화 할 수 없다. 
//		B b1 = new B() ;
		
		//2, 인터페이스를 구현한 클래스를 객체화 해서 타입으로 지정은 가능
		D d2 = new Dd();
		d2.abc();
		System.out.println(d2.a);
		
		
		
		
		
		
		

	}

}
