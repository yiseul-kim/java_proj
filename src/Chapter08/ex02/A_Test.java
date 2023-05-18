package Chapter08.ex02;

public class A_Test {

	public static void main(String[] args) {
		// 동일한 패키지에 존재하는 클래스 
		
		
		//A클래스는 동일한 패키지에 존재하는 클래스 : import없이 접근 가능
		A a1 = new A() ;
		
		System.out.println(a1.a); 		// public
		System.out.println(a1.b); 		// protected
		System.out.println(a1.c); 		// default
//		System.out.println(a1.d); 		// private - 같은 클래스 내부에서만 접근 가능 << 접근불가

		//메소드 호출 
		a1.abc();  		// public                               
		a1.bcd();  		// protected                            
		a1.cde();  		// default                              
//		a1.def();  		// private - 같은 클래스 내부에서만 접근 가능 << 접근불가 
	}

}
