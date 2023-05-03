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
		
		System.out.println("=======================");
		
		//2. system.out.print() <== 출력후 개행하지 않는다.
			System.out.print("안녕 ");
			System.out.print("하세요\n");
			
		//3. system.out.printf(); <== 자료형 포멧에 따라 출력을 할 수 있다.
			System.out.printf("%d\n", 30); // "%d"은 10진수로 출력
			// 문자열 내에서 "\"은 엔터, 
			System.out.printf("%o\n", 30); // "%o" 8진수로 출력
			System.out.printf("%x\n", 30); // "%x" 16진수로 출력
			
			System.out.printf("%s \n", "문자열 출력"); // %s 문자열을 가져올때 사용
			System.out.printf("%f \n", 5.8);//%f 실수를 가져올 때
			System.out.printf("%4.2f\n", 5.8 );//%4.2f : 전체 4자리 소숫점이하 2자리
			System.out.printf("%d 와 %4.2f 를 출력 합니다.", 4,5.8 );
			
			System.out.println("=======================");
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
