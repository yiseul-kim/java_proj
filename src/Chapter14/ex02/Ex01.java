package Chapter14.ex02;

class A {
	
}
class B extends A {
	
}
class C extends A {
	
}

public class Ex01 {
	public static void main(String[] args) {
		/*
		 	 예외 처리
		*/
		int[] arr = new int[] { 1, 2, 3, 4, 5 } ;		
		A a1 = new B();
		
		try {
			System.out.println( arr[5] );			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutofBoundsException이 작동됨");
		}finally {
			System.out.println("== 프로그램 마지막 라인 ==");					
		}
		
		
		try {
			C c1 = (C) a1;			// 예외			
		} catch (ClassCastException e) {
			System.out.println("ClassCastException이 발생됨 ");
		}finally {
			System.out.println("== 프로그램 마지막 라인 ==");					
		}
		
		
		
		
	}
}
