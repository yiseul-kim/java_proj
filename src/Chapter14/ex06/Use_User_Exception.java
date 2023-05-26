package Chapter14.ex06;

// 음수를 넣으면 예외를 강제 발생 : 일반 예외,  
class MinusException extends Exception {
	// 기본생성자
	MinusException () {	}
	// 예외의 메세지를 처리하는 생성자
	MinusException (String message ) {		// e.getMessage()
		super ( message );
	}	
}

// 100점 이상의 값을 넣으면 예외를 강제로 발생 : 일반 예외 
class OverException extends Exception {
	// 기본 생성자
	OverException () {}
	//예외의 메세지를 처리하는 생성자
	OverException (String message) {			//e.getMessage()
		super( message ) ;				
	}
}

// 사용자 정의 예외를 사용하는 클래스 생성 
class Aa {
	
	void checkScore (int score ) throws MinusException, OverException {
		if ( score < 0 ) {
			// MinusException 호출
			throw new MinusException("예외 발생 : 음수값은 입력이 불가합니다.  ");
			
		}else if ( score >100 ) {
			// OverException 호출
			throw new OverException("예외 발생 : 100점 이상은 입력이 불가합니다. ");
		}else {
			//정상호출
			System.out.println("정상적으로 값이 잘 입력 되었습니다. : " + score );
		}		
	}
}


public class Use_User_Exception {
	//메인메소드
	public static void main(String[] args) {
		 
		// 객체 생성
		Aa a1 = new Aa ()	;
		
		// 메소드 호출 : throws 미루었기 때문에 호출하는 쪽에서 예외를 처리 
		
		try {
			a1.checkScore(-20);
		} catch (MinusException | OverException e) {			
			System.out.println(e.getMessage());
		}
		System.out.println("시스템 정상 종료");

	}

}
