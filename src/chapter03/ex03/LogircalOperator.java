package chapter03.ex03;

public class LogircalOperator {

	public static void main(String[] args) {
		/*
		 논리 연산자 : 논리 연산한 결과를 true, false <== if, 에서 조건으로 처리됨
		 	- 논리 and 연산자(&&)  
		 	- 논리 or 연산자(||)  
		 	- 논리 XOR 연산자(^)  : 앞뒤가 같을때 false를 리턴, 앞뒤가 다를때 true를 리턴
		 	- 논리 NOT 연산자(!)  
		 */
		// 논리 and 연산자(&&)  <= 논리연산자가 연산한 결과는 true, false
		System.out.println(true && true); 	// true
		System.out.println(true && false); 	// false
		System.out.println(false && true); 	// false
		System.out.println(false && false);	// false
		System.out.println("========================");
		
		// 논리 or 연산자(||)  : 둘중 하나라도 true면 true
		System.out.println(true || true); 	// true
		System.out.println(true || false); 	// true
		System.out.println(false || true); 	// true
		System.out.println(false || false);	// false
		System.out.println("========================");
		
		// 논리 XOR 연산자(^)
		System.out.println(true ^ true); 	// false
		System.out.println(true ^ false); 	// true
		System.out.println(false ^ true); 	// true
		System.out.println(false ^ false);	// false
		System.out.println("========================");
		
		// 논리 not 연산자(!) : !true=false, !false=true
		System.out.println(!true); 	// false
		System.out.println(!false); 	// true
		System.out.println("========================");
		
		// 숏트 서킷이 발생 될 수 있다. 
			// -- 논리 연산에서 앞의 값으로 결과값을 유추할 수 있는 경우 뒤의 내용을 무시해서 처리하지 않는다.
		
		// && 연산에서 false 가 오면 뒤에는 어떤 값이 와도 false
		System.out.println(true && true);	// 쇼트 서킷이 발생 되지 않는다.
		System.out.println(false && true);	// 쇼트 서킷이 발생 된다, 앞의 값이 FALSE 이면 뒤에값은 확인하지 않아도 false
		
		System.out.println("========================");
		
		//예제 : AND 연산에서 쇼트 서킷이 발생되는 예제 
		int val1 = 3;
		System.out.println(true && ++val1 > 6); //뒤, val1의 입력값이 false이기 떄문에 앞이 true이면 출력됨, 
		System.out.println(false && ++val1 > 6); //뒤, val1의 입력값이 false이기 떄문에 앞이 false이면 출력안됨, 뒷 값은 확인x
		System.out.println(val1); 		//3  <==쇼트 서킷으로 3이 출력됨		
		
		System.out.println("========================");
		// || : or 연산에서 앞의 값이 true이면 쇼트 서킷이 발생됨
		System.out.println(true || false); // 쇼트 서킷이 발생됨
		System.out.println(false || true); // 쇼트 서킷이 발생 되지 않음

		// 쇼트 서킷을 방지하기 위한 방안 : 비트연산자를 사용한다.  &, |   <== 쇼트서킷을 발생시키지 않는 연산자
		
		//예제 : AND 연산에서 쇼트 서킷이 발생되는 예제 
		int val2 = 3;
		System.out.println(false & ++val2 > 6); 	// false 뒤에 값을 확인 : &
		
		System.out.println(val2); 		//4  <==쇼트 서킷 방지한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
