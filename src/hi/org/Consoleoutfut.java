package hi.org;
// 패키지 : 클래스파일을 저장될 폴더 구조


public class Consoleoutfut {
	public static void main(String[] args) {
		// main 메소드블락에서 프로그램 작성 
		//문자열 출력 : "" 처리 
		System.out.println("안녕하세요"); 
		System.out.println("오늘은"+" 날씨가 매우 맑습니다.");
		
		
		// 정수 출력 : ""없이 출력, + : 정수나 실수일때는 더하기 연산
		System.out.println(2+4);
		// 문자열 사이의 "+"는 연결을 뜻함.
		System.out.println("2"+"4");
		
		// 실수 출력 : ""없이 출력
		System.out.println(11.5+11.5);
		// 실수 + 문자 = 그냥 연결되서 나옴/
		System.out.println("11.5"+11.5+11.5);
		
		
		System.out.println("===============================================");
		//문자열 + 숫자 = 연결됨 
		System.out.println("문자열"+3+4+5);
		// 정수 + 정수 + 정수 + "문자" = 앞부분 연산
		System.out.println(3+4+5+6+" 문자열");
		
		
		// 변수 선언 : 자료형 str(변수명) = 초기값; string은 문자열을 저장하는변수
		String str = "안녕하세요";
		// -> 
		System.out.println(str);
		
		// 정수를 담는 자료형 변수: int
		// "="의 의미는 오른쪽의 값을 왼쪽에 넣어라는 뜻
		int a = 10;
		int b = 20;
		// ->
		// ""을 넣으면 변수가 아니게됨
		System.out.println(a);
		System.out.println(a+b);
		System.out.println("a"+b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
