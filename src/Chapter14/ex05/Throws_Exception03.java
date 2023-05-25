package Chapter14.ex05;

class Aaa {
	void abc () throws ClassNotFoundException {
		bcd();
	}
	void bcd () throws ClassNotFoundException {
		cde();
	}
	void cde () throws ClassNotFoundException {
		// DB 연결시 사용 : 일반 예외 : 반드시 예외 처리 (1. 자신이 직접 처리 , 2. throws로 미루기)
		Class cls = Class.forName("java.lang.Object1");		// 존재하지 않는 파일을 적어 예외 발생시킴
		System.out.println("존재하는 클래스 입니다. ");
		
	}
}

public class Throws_Exception03 {

	public static void main(String[] args)  {
		
		Aaa a1 = new Aaa ();
		
		// 해결되지 않은 문제이기 때문에 메인메소드에 미루면 문제 발생시 오류를 출력
		// so 이 부분에서 try / catch 블락을 만들어 줘야함. 
		
			try {
				a1.abc();			// 예외 처리 부분 
			} catch (ClassNotFoundException e) {
				System.out.println("예외가 발생됨 ==>");
				e.printStackTrace();		//디버깅 하는 것 : 문제의 정보를 출력 -> 오류 정보와 동일한 정보가 출력 BUT 정상 작동되는 중임!
			}		
				
		System.out.println("프로그램 정상 종료됨. ");
	}

}
