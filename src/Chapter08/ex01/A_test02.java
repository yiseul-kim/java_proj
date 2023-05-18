package Chapter08.ex01;

import Chapter08.ex02.A;

public class A_test02 {

	public static void main(String[] args) {
		// A클래스와 다른 패키지에 존재 : import / 클래스의 전체이름 : 패키지명.클래스명 

		// 1. 다른 패키지의 클래스를 전체 이름으로 사용
		
		Chapter08.ex02.A a1 = new Chapter08.ex02.A ();
		
				
		// 2. import 해서 사용
		A a2 = new A();
		
		// 접근 가능한 필드나, 메소드 : public 접근 제어자만 접근 가능
		System.out.println(a1.a);
//		System.out.println(a1.b);
//		System.out.println(a1.c);
//		System.out.println(a1.d);

		a1.abc();
//		a1.bcd();
//		a1.cde();
//		a1.def();
		
		

	}

}
