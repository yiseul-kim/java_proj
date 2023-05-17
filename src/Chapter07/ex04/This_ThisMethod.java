package Chapter07.ex04;

class A {
	//필드 : Heap 공간에 값이 저장이 됨, 객체를 생성(new) 후 Heap에 저장
	int m ; 
	int n ; 
	
	//메소드
	void init (int a, int b) {  // 지역변수(a,b,c)(lv) : 메소드 내부에서 선언된 변수   
		int c;
		c = 3;
		this.m = a;		//(생략 안했을 때) 생략 시 컴파일할 때 자동으로 등록함
		n = b;			//(생략했을 때) 
		
//		m=m;		// 내부변수 m이 외부변수 m으로 부터 값을 받을 때 사용 -> 변수가 동일하기 때문에 this 넣어주기
//		n=n;
		
		System.out.println("필드의 값 출력 : " + m +" , "+ n);
	}
	void work()	{
		init(2, 3);			//this 생략시 컴파일러가 자동으로 등록함
	}
}
public class This_ThisMethod {
	public static void main(String[] args) {
		/*
		 this 키워드 : 필드이름앞, 메소드 이름앞
		 			자기 자신의 객체를 의미.
		 			기본적으로 모두 생략되어 있음. 실행시 컴파일러가 자동으로 넣어줌.
		 			명시가 필요한 경우 : 생성자에서 인풋 이름, 받는 이름, 필드명 모두 동일할 때, 필드명에 this 키워드
		 this() 메소드 : 
		 	 생성자 내부에서만 사용됨.
		 	 반드시 생성자 내부에서 첫 번째 라인에 와야 한다. 
		 	 생성자 호출시 다른 생성자를 먼저 실행 하도록 한다. 
		 	 
		 */
		// 객체 생성
		A a = new A() ;
		
		a.work();
		
		
		
		
		
		
	}
}
