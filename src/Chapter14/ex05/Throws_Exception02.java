package Chapter14.ex05;

// throws 는 계속 전가를 할 수 있다.  최종적으로 메인 메소드까지 미루기가능

class Aa {
	void abc () throws InterruptedException {
		bcd(); 		// bcd 호출
	}
	void bcd () throws InterruptedException {
		cde(); 		//cde 호출
	}
	void cde () throws InterruptedException {	// 호출하는 쪽으로 전가
		Thread.sleep(1000); 		// 시작!!! 1초 ! 예외 생성 
	}
}

public class Throws_Exception02 {
	public static void main(String[] args) {		//메인메소드까지 전가시키면 오류가 생겼을때 처리가 불가능
		// Aa 객체를 생성후 메소드 호출
		Aa a1 = new Aa () ; 
		
		
		// main 메소드로 가기 전까지 try catch로 예외 처리(아니면 오류 발생시 메인메소드에서 처리안됨 -> 오류 발생)
		try {
			a1.abc() ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
