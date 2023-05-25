package Chapter14.ex03;

class A  {
	int a;
}
class B extends A {
	int b;
}
class C extends A {
	int c;
}

public class Ex01 {
	public static void main(String[] args) {
		
		//예외 1.
		A a1 = new B ()	;		
//		C c1 = (C) a1;		//예외 발생		ClassCastException
		//예외 2
		String [] arr = new String[] { "안녕" , "오늘", "날씨", "맑음" };
//		System.out.println(arr[4]);		//예외 발생		ArrayIndexOutOfBoundsException
		//예외 3
		String str = null;
//		System.out.println(str.charAt(1));	//예외 발생		NullPointerException
		
		System.out.println("===1. 방법으로 예외 처리(각 각 처리 ) ===");
		try {
			C c1 = (C) a1;
		} catch (ClassCastException e) {
			System.out.println(" 1. ClassCastException 예외 발생 ");
		}
		try {
			System.out.println(arr[4]);	
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" 1. ArrayIndexOutOfBoundsException 예외 발생 ");
		}
		try {
			System.out.println(str.charAt(1));
		} catch (NullPointerException e) {
			System.out.println(" 1. NullPointerException 예외 발생 ");
		}
		System.out.println(" 프로그램 종료");
		System.out.println();
		
		System.out.println("==2. 방법으로 예외 처리(여러 catch 로 예외 처리) ==");
		try {
			C c1 = (C) a1;
			System.out.println(arr[4]);	
			System.out.println(str.charAt(1));
		} catch (ClassCastException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(" 2. 세개의 예외를 하나의 블락으로 처리함. ");
		} 		
		System.out.println(" 프로그램 종료");
		System.out.println();
			
		
		System.out.println("==3. 방법으로 예외 처리(Exception으로 한꺼번에 처리 )==");
		try {
			C c1 = (C) a1;
			System.out.println(arr[4]);	
			System.out.println(str.charAt(1));
		} catch (Exception e) {
			System.out.println(" 3. 세개의 예외를 하나의 블락으로 처리함. ");
		} 		
		System.out.println(" 프로그램 종료");
		System.out.println();
		
		System.out.println("==4. 방법으로 예외 처리(catch 블락에서 세밀하게 처리하고 그 외는 Exception)==");
		try {
			C c1 = (C) a1;
			System.out.println(arr[4]);	
			System.out.println(str.charAt(1));
		} catch (ClassCastException e) {
			System.out.println(" 4. ClassCastException 예외 발생 ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" 4. ArrayIndexOutOfBoundsException 예외 발생 ");
		}catch (NullPointerException e) {
			System.out.println(" 4. NullPointerException 예외 발생 ");
		}catch (Exception e) {
			System.out.println(" 4. Exception 예외 발생 ");
		}
		System.out.println(" 프로그램 종료");
		System.out.println();



	}

}
