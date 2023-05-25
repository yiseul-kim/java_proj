package Chapter12.ex07;

interface A {
	
	//필드	<== public static final이 생략되어 있음.
	int a = 20;
	int b = 30;
	String c = "현대 자동차";
	
	//메소드 <== public abstract가 생략되어 있음. 	
	void abc () ;	// 2000년도에 구현된 메소드 : USB 1.0
	void bcd () ;	// 2005년도에 구현된 메소드 : USB 2.0
	
	// default 메소드 : 인터페이스 내부에서 구현 코드를 가지는 메소드 
//	void efg () ; 	// 부모 클래스에서 메소드를 추가하는 순간 오류발생(자식 클래스에 해당 메소드가 없기 때문에)
						// 앞에 default 넣어주면 ok
	default void cde () { 	// 2010년도에 구현된 메소드 : USB 3.0	 << 새로운 기능을 1000개의 클래스에 적용 하려고 한다. 
	 System.out.println("default - 2010년도에 USB 3.0을 구현한 메소드 "); 
	 } 		//default 를 앞에 달면 하위 구현된 클래스들에 새로운 기능을 구현할 수 있도록 해줌
			//1000개씩 안적어도 하위 클래스에 자동 적용됨
	
	// static 메소드 : 인터페이스 내부에서 구현 코드를 가지는 메소드 
	static void def () {
		System.out.println("static - 객체 생성없이 타입으로 바로 호출가능");
	}	
}

// 위의 인터페이스를 구현한 클래스가 1000개 있다.

class Aa implements A {
	@Override
	public void abc() {
		System.out.println("Aa- 2000년도에 USB 1.0을 구현한 메소드 ");		
	}
	@Override
	public void bcd() {
		System.out.println("Aa- 2005년도에 USB 2.0을 구현한 메소드 ");		
	}		
}

class Aaa implements A {
	@Override
	public void abc() {
		System.out.println("Aaa- 2000년도에 USB 1.0을 구현한 메소드 ");				
	}

	@Override
	public void bcd() {
		System.out.println("Aaa- 2005년도에 USB 2.0을 구현한 메소드 ");	
	}
	@Override		// default 메소드 오버라이딩 : 부모의 기능을 새로 정의해 사용
	public void cde() {
		System.out.println("Aaa- 부모의 default 메소드 오버라이딩 됨");
	}
}


public class Default_Method {
	public static void main(String[] args) {
		/*
			인터페이스의 특징 : 
					- 모든 필드 , 메소드는 public 접근제어자가 있어야한다. 
					- 모든 필드는 public static final이 생략됨
					- 모든 메소드는 public abstract이 생략됨
					- 인터페이스 내부에서 메소드는 선언만 되어야하고  구현부({})를 만들면 안됨. <== 자바 1.7
							: default / static <==인터페이스 내부에 구현부를 가지는 메소드 (자바 1.8버전에 추가)
			default : 메소드 앞에 붙이는 키 <== 인터페이스에서 구현부가 있는 메소드, 주의: 접근 제어자가 아니다. 
					- 인터페이스에서 구현된 모든 클래스에서 상속되어서 적용.
					- 새로운 기능을 하위에 모든 클래스에게 적용 할때 사용함.  오류없이 적용할때 사용
					- 오버라이딩도 가능함. 					
					
			static 메소드 : 인터페이스 내에서 메소드 앞에 붙임. 구현부가 있는 메소드 
					- 자식클래스의 객체를 생성하지 않고 인터페이스 이름으로 호출 가능한 메소드 
					
		*/				
		A b1 = new Aa();
		A b2 = new Aaa();
//		A.a = 50;		//final이므로 수정 불가함.
		
		A[] arr = new A[] { b1, b2};
		for(A K : arr) {
			K.abc();
			K.bcd();
			K.cde();
			
			//final 호출
			System.out.println();
			System.out.println(K.a);
			System.out.println(K.b);
			System.out.println(K.c);
			System.out.println();
		}
		
		//static 메소드 호출
		A.def();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
